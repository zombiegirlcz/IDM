package androidx.glance.session;

import androidx.compose.runtime.BroadcastFrameClock;
import androidx.compose.runtime.MonotonicFrameClock;
import fim.a;
import fim.h;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import skm.e0;
import skm.h2;
import skm.l;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u000fJ-\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/glance/session/InteractiveFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "", "baselineHz", "interactiveHz", "", "interactiveTimeoutMs", "Lkotlin/Function0;", "nanoTime", "<init>", "(Lkotlinx/coroutines/CoroutineScope;IIJLkotlin/jvm/functions/Function0;)V", "", "onNewAwaiters", "()V", "now", "sendFrame", "(J)V", "startInteractive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopInteractive", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "I", "J", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/runtime/BroadcastFrameClock;", "frameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "", "lock", "Ljava/lang/Object;", "currentHz", "lastFrame", "Lkotlinx/coroutines/CancellableContinuation;", "interactiveCoroutine", "Lkotlinx/coroutines/CancellableContinuation;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InteractiveFrameClock implements MonotonicFrameClock {
    private final int baselineHz;
    private int currentHz;

    @NotNull
    private final BroadcastFrameClock frameClock;
    private CancellableContinuation interactiveCoroutine;
    private final int interactiveHz;
    private final long interactiveTimeoutMs;
    private long lastFrame;

    @NotNull
    private final Object lock;

    @NotNull
    private final Function0<Long> nanoTime;

    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: androidx.glance.session.InteractiveFrameClock$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return Long.valueOf(System.nanoTime());
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.InteractiveFrameClock$onNewAwaiters$2, reason: invalid class name */
    @d(c = "androidx.glance.session.InteractiveFrameClock$onNewAwaiters$2", f = "InteractiveFrameClock.kt", l = {116, LDSFile.EF_SOD_TAG}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ n0 $minPeriod;
        final /* synthetic */ long $now;
        final /* synthetic */ n0 $period;
        int label;
        final /* synthetic */ InteractiveFrameClock this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(n0 n0Var, n0 n0Var2, InteractiveFrameClock interactiveFrameClock, long j2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$period = n0Var;
            this.$minPeriod = n0Var2;
            this.this$0 = interactiveFrameClock;
            this.$now = j2;
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$period, this.$minPeriod, this.this$0, this.$now, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        
            if (do3.q.J(r8) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            if (skm.k0.b((r6 - r4) / 1000000, r8) == r0) goto L18;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r9)
                goto L4a
            L10:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L18:
                yhm.o.b(r9)
                goto L34
            L1c:
                yhm.o.b(r9)
                kotlin.jvm.internal.n0 r9 = r8.$period
                long r4 = r9.f186428a
                kotlin.jvm.internal.n0 r9 = r8.$minPeriod
                long r6 = r9.f186428a
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 < 0) goto L3c
                r8.label = r3
                java.lang.Object r9 = do3.q.J(r8)
                if (r9 != r0) goto L34
                goto L49
            L34:
                androidx.glance.session.InteractiveFrameClock r9 = r8.this$0
                long r0 = r8.$now
                androidx.glance.session.InteractiveFrameClock.access$sendFrame(r9, r0)
                goto L5d
            L3c:
                long r6 = r6 - r4
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r6 = r6 / r3
                r8.label = r2
                java.lang.Object r9 = skm.k0.b(r6, r8)
                if (r9 != r0) goto L4a
            L49:
                return r0
            L4a:
                androidx.glance.session.InteractiveFrameClock r9 = r8.this$0
                kotlin.jvm.functions.Function0 r0 = androidx.glance.session.InteractiveFrameClock.access$getNanoTime$p(r9)
                java.lang.Object r0 = r0.invoke()
                java.lang.Number r0 = (java.lang.Number) r0
                long r0 = r0.longValue()
                androidx.glance.session.InteractiveFrameClock.access$sendFrame(r9, r0)
            L5d:
                kotlin.Unit r9 = kotlin.Unit.f186387a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.InteractiveFrameClock.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.InteractiveFrameClock$startInteractive$2, reason: invalid class name and case insensitive filesystem */
    @d(c = "androidx.glance.session.InteractiveFrameClock$startInteractive$2", f = "InteractiveFrameClock.kt", l = {136}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C19442 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C19442(Continuation<? super C19442> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        @NotNull
        public final Continuation<Unit> create(Object obj2, @NotNull Continuation<?> continuation) {
            return InteractiveFrameClock.this.new C19442(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                o.b(obj2);
                InteractiveFrameClock.this.stopInteractive();
                InteractiveFrameClock interactiveFrameClock = InteractiveFrameClock.this;
                this.L$0 = interactiveFrameClock;
                this.label = 1;
                l lVar = new l(1, h.b(this));
                lVar.u();
                synchronized (interactiveFrameClock.lock) {
                    interactiveFrameClock.currentHz = interactiveFrameClock.interactiveHz;
                    interactiveFrameClock.interactiveCoroutine = lVar;
                    Unit unit = Unit.f186387a;
                }
                lVar.r(new InteractiveFrameClock$startInteractive$2$1$2(interactiveFrameClock));
                Object objT = lVar.t();
                if (objT == aVar) {
                    Intrinsics.checkNotNullParameter(this, "frame");
                }
                if (objT == aVar) {
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
            return ((C19442) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public InteractiveFrameClock(@NotNull CoroutineScope coroutineScope, int i, int i2, long j2, @NotNull Function0<Long> function0) {
        this.scope = coroutineScope;
        this.baselineHz = i;
        this.interactiveHz = i2;
        this.interactiveTimeoutMs = j2;
        this.nanoTime = function0;
        this.frameClock = new BroadcastFrameClock(new InteractiveFrameClock$frameClock$1(this));
        this.lock = new Object();
        this.currentHz = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onNewAwaiters() {
        long jLongValue = ((Number) this.nanoTime.invoke()).longValue();
        n0 n0Var = new n0();
        n0 n0Var2 = new n0();
        synchronized (this.lock) {
            n0Var.f186428a = jLongValue - this.lastFrame;
            n0Var2.f186428a = 1000000000 / ((long) this.currentHz);
            Unit unit = Unit.f186387a;
        }
        e0.C(this.scope, null, null, new AnonymousClass2(n0Var, n0Var2, this, jLongValue, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFrame(long now) {
        this.frameClock.sendFrame(now);
        synchronized (this.lock) {
            this.lastFrame = now;
            Unit unit = Unit.f186387a;
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r2, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull f fVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull f fVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final Object startInteractive(@NotNull Continuation<? super Unit> continuation) {
        return h2.d(this.interactiveTimeoutMs, new C19442(null), continuation);
    }

    public final void stopInteractive() {
        synchronized (this.lock) {
            CancellableContinuation cancellableContinuation = this.interactiveCoroutine;
            if (cancellableContinuation != null) {
                cancellableContinuation.a(null);
            }
        }
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        return this.frameClock.withFrameNanos(function1, continuation);
    }

    public /* synthetic */ InteractiveFrameClock(CoroutineScope coroutineScope, int i, int i2, long j2, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i3 & 2) != 0 ? 5 : i, (i3 & 4) != 0 ? 20 : i2, (i3 & 8) != 0 ? 5000L : j2, (i3 & 16) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}
