package androidx.glance.session;

import android.content.Context;
import androidx.compose.runtime.Recomposer;
import androidx.glance.EmittableWithChildren;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.youTransactor.uCube.rpc.Constants;
import fim.a;
import gim.c;
import gim.d;
import gim.i;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R \u0010\u000b\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Landroidx/glance/session/SessionManager;", "sessionManager", "Landroidx/glance/session/TimeoutOptions;", "timeouts", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Landroidx/glance/session/SessionManager;Landroidx/glance/session/TimeoutOptions;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/glance/session/TimerScope;", "Landroidx/work/ListenableWorker$Result;", "work", "(Landroidx/glance/session/TimerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/work/WorkerParameters;", "Landroidx/glance/session/SessionManager;", "Landroidx/glance/session/TimeoutOptions;", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineContext$annotations", "()V", "", "key", "Ljava/lang/String;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionWorker extends CoroutineWorker {

    @NotNull
    private final CoroutineDispatcher coroutineContext;

    @NotNull
    private final String key;

    @NotNull
    private final WorkerParameters params;

    @NotNull
    private final SessionManager sessionManager;

    @NotNull
    private final TimeoutOptions timeouts;

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.session.SessionWorker", f = "SessionWorker.kt", l = {87}, m = "doWork")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return SessionWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.session.SessionWorker$doWork$2", f = "SessionWorker.kt", l = {88}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "Landroidx/glance/session/TimerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<TimerScope, Continuation<? super ListenableWorker.Result>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$2$1, reason: invalid class name */
        @d(c = "androidx.glance.session.SessionWorker$doWork$2$1", f = "SessionWorker.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function1<Continuation<? super Unit>, Object> {
            final /* synthetic */ TimerScope $$this$withTimerOrNull;
            int label;
            final /* synthetic */ SessionWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TimerScope timerScope, SessionWorker sessionWorker, Continuation<? super AnonymousClass1> continuation) {
                super(1, continuation);
                this.$$this$withTimerOrNull = timerScope;
                this.this$0 = sessionWorker;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$$this$withTimerOrNull, this.this$0, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                this.$$this$withTimerOrNull.mo3582startTimerLRDsOJo(this.this$0.timeouts.getIdleTimeout());
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$2$2, reason: invalid class name and collision with other inner class name */
        @d(c = "androidx.glance.session.SessionWorker$doWork$2$2", f = "SessionWorker.kt", l = {95}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C00592 extends i implements Function1<Continuation<? super ListenableWorker.Result>, Object> {
            final /* synthetic */ TimerScope $$this$withTimerOrNull;
            int label;
            final /* synthetic */ SessionWorker this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00592(SessionWorker sessionWorker, TimerScope timerScope, Continuation<? super C00592> continuation) {
                super(1, continuation);
                this.this$0 = sessionWorker;
                this.$$this$withTimerOrNull = timerScope;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C00592(this.this$0, this.$$this$withTimerOrNull, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                SessionWorker sessionWorker = this.this$0;
                TimerScope timerScope = this.$$this$withTimerOrNull;
                this.label = 1;
                Object objWork = sessionWorker.work(timerScope, this);
                return objWork == aVar ? aVar : objWork;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super ListenableWorker.Result> continuation) {
                return ((C00592) create(continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = SessionWorker.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj2;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull TimerScope timerScope, Continuation<? super ListenableWorker.Result> continuation) {
            return ((AnonymousClass2) create(timerScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                return obj2;
            }
            o.b(obj2);
            TimerScope timerScope = (TimerScope) this.L$0;
            Context applicationContext = SessionWorker.this.getApplicationContext();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(timerScope, SessionWorker.this, null);
            C00592 c00592 = new C00592(SessionWorker.this, timerScope, null);
            this.label = 1;
            Object objObserveIdleEvents = IdleEventBroadcastReceiverKt.observeIdleEvents(applicationContext, anonymousClass1, c00592, this);
            return objObserveIdleEvents == aVar ? aVar : objObserveIdleEvents;
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$work$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.session.SessionWorker", f = "SessionWorker.kt", l = {155, Constants.EMVTag.TAG_9C_TRANSACTION_TYPE, 168}, m = "work")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19461 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C19461(Continuation<? super C19461> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.result = obj2;
            this.label |= Integer.MIN_VALUE;
            return SessionWorker.this.work(null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$work$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.session.SessionWorker$work$2", f = "SessionWorker.kt", l = {122}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19472 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Recomposer $recomposer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19472(Recomposer recomposer, Continuation<? super C19472> continuation) {
            super(2, continuation);
            this.$recomposer = recomposer;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new C19472(this.$recomposer, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                Recomposer recomposer = this.$recomposer;
                this.label = 1;
                if (recomposer.runRecomposeAndApplyChanges(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19472) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$work$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.session.SessionWorker$work$3", f = "SessionWorker.kt", l = {126}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Recomposer $recomposer;
        final /* synthetic */ EmittableWithChildren $root;
        final /* synthetic */ Session $session;
        final /* synthetic */ TimerScope $this_work;
        final /* synthetic */ MutableStateFlow $uiReady;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SessionWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Recomposer recomposer, Session session, MutableStateFlow mutableStateFlow, SessionWorker sessionWorker, EmittableWithChildren emittableWithChildren, TimerScope timerScope, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$recomposer = recomposer;
            this.$session = session;
            this.$uiReady = mutableStateFlow;
            this.this$0 = sessionWorker;
            this.$root = emittableWithChildren;
            this.$this_work = timerScope;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$recomposer, this.$session, this.$uiReady, this.this$0, this.$root, this.$this_work, continuation);
            anonymousClass3.L$0 = obj2;
            return anonymousClass3;
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                n0 n0Var = new n0();
                n0Var.f186428a = this.$recomposer.getChangeCount();
                StateFlow currentState = this.$recomposer.getCurrentState();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$session, this.$recomposer, n0Var, this.$uiReady, this.this$0, this.$root, this.$this_work, coroutineScope);
                this.label = 1;
                if (currentState.collect(anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$work$3$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "state", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ n0 $lastRecomposeCount;
            final /* synthetic */ Recomposer $recomposer;
            final /* synthetic */ EmittableWithChildren $root;
            final /* synthetic */ Session $session;
            final /* synthetic */ TimerScope $this_work;
            final /* synthetic */ MutableStateFlow $uiReady;
            final /* synthetic */ SessionWorker this$0;

            /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$work$3$1$WhenMappings */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Recomposer.State.values().length];
                    try {
                        iArr[Recomposer.State.Idle.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Recomposer.State.ShutDown.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public AnonymousClass1(Session session, Recomposer recomposer, n0 n0Var, MutableStateFlow mutableStateFlow, SessionWorker sessionWorker, EmittableWithChildren emittableWithChildren, TimerScope timerScope, CoroutineScope coroutineScope) {
                this.$session = session;
                this.$recomposer = recomposer;
                this.$lastRecomposeCount = n0Var;
                this.$uiReady = mutableStateFlow;
                this.this$0 = sessionWorker;
                this.$root = emittableWithChildren;
                this.$this_work = timerScope;
                this.$$this$launch = coroutineScope;
            }

            /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
            
                if (r9.emit(r2, r0) == r1) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(@org.jetbrains.annotations.NotNull androidx.compose.runtime.Recomposer.State r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                /*
                    Method dump skipped, instruction units count: 218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.AnonymousClass3.AnonymousClass1.emit(androidx.compose.runtime.Recomposer$State, kotlin.coroutines.Continuation):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                return emit((Recomposer.State) obj2, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$work$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @d(c = "androidx.glance.session.SessionWorker$work$4", f = "SessionWorker.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends i implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
            anonymousClass4.Z$0 = ((Boolean) obj2).booleanValue();
            return anonymousClass4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
            return invoke(((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return Boolean.valueOf(this.Z$0);
        }

        public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass4) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$work$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass5 extends u implements Function1<Object, Unit> {
        final /* synthetic */ InteractiveFrameClock $frameClock;
        final /* synthetic */ Session $session;
        final /* synthetic */ TimerScope $this_work;
        final /* synthetic */ SessionWorker this$0;

        /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$work$5$1, reason: invalid class name */
        @d(c = "androidx.glance.session.SessionWorker$work$5$1", f = "SessionWorker.kt", l = {161}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ InteractiveFrameClock $frameClock;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InteractiveFrameClock interactiveFrameClock, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$frameClock = interactiveFrameClock;
            }

            @Override // gim.a
            @NotNull
            public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
                return new AnonymousClass1(this.$frameClock, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(@NotNull Object obj2) {
                a aVar = a.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o.b(obj2);
                    InteractiveFrameClock interactiveFrameClock = this.$frameClock;
                    this.label = 1;
                    if (interactiveFrameClock.startInteractive(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(TimerScope timerScope, SessionWorker sessionWorker, Session session, InteractiveFrameClock interactiveFrameClock) {
            super(1);
            this.$this_work = timerScope;
            this.this$0 = sessionWorker;
            this.$session = session;
            this.$frameClock = interactiveFrameClock;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            m3576invoke(obj2);
            return Unit.f186387a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3576invoke(@NotNull Object obj2) {
            if (b.c(this.$this_work.mo3581getTimeLeftUwyO8pc(), this.this$0.timeouts.getAdditionalTime()) < 0) {
                this.$this_work.mo3580addTimeLRDsOJo(this.this$0.timeouts.getAdditionalTime());
            }
            e0.C(this.$this_work, null, null, new AnonymousClass1(this.$frameClock, null), 3);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, SessionManager sessionManager, TimeoutOptions timeoutOptions, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        CoroutineDispatcher coroutineDispatcher2;
        SessionManager glanceSessionManager = (i & 4) != 0 ? SessionManagerKt.getGlanceSessionManager() : sessionManager;
        TimeoutOptions timeoutOptions2 = (i & 8) != 0 ? new TimeoutOptions(0L, 0L, 0L, null, 15, null) : timeoutOptions;
        if ((i & 16) != 0) {
            p0 p0Var = p0.f264001a;
            coroutineDispatcher2 = zkm.o.f323119a;
        } else {
            coroutineDispatcher2 = coroutineDispatcher;
        }
        this(context, workerParameters, glanceSessionManager, timeoutOptions2, coroutineDispatcher2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017d, code lost:
    
        if (r3.join(r14) != r15) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object work(androidx.glance.session.TimerScope r18, kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r19) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.work(androidx.glance.session.TimerScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.glance.session.SessionWorker.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.glance.session.SessionWorker$doWork$1 r0 = (androidx.glance.session.SessionWorker.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.glance.session.SessionWorker$doWork$1 r0 = new androidx.glance.session.SessionWorker$doWork$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            androidx.glance.session.TimeoutOptions r6 = r5.timeouts
            androidx.glance.session.TimeSource r6 = r6.getTimeSource()
            androidx.glance.session.SessionWorker$doWork$2 r2 = new androidx.glance.session.SessionWorker$doWork$2
            r4 = 0
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r6 = androidx.glance.session.TimerScopeKt.withTimerOrNull(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            androidx.work.ListenableWorker$Result r6 = (androidx.work.ListenableWorker.Result) r6
            if (r6 != 0) goto L5e
            androidx.work.Data$Builder r6 = new androidx.work.Data$Builder
            r6.<init>()
            java.lang.String r0 = "TIMEOUT_EXIT_REASON"
            androidx.work.Data$Builder r6 = r6.putBoolean(r0, r3)
            androidx.work.Data r6 = r6.build()
            androidx.work.ListenableWorker$Result r6 = androidx.work.ListenableWorker.Result.success(r6)
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    @NotNull
    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    public SessionWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull SessionManager sessionManager, @NotNull TimeoutOptions timeoutOptions, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(context, workerParameters);
        this.params = workerParameters;
        this.sessionManager = sessionManager;
        this.timeouts = timeoutOptions;
        this.coroutineContext = coroutineDispatcher;
        String string = getInputData().getString(sessionManager.getKeyParam());
        if (string == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.key = string;
    }

    public SessionWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        this(context, workerParameters, SessionManagerKt.getGlanceSessionManager(), null, null, 24, null);
    }
}
