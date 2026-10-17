package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.internal.ra;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class gf implements ja, t1, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ka f36252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o8 f36253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g9 f36254c;
    private final wd d;
    private final x1 e;
    private final x1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimestampProvider f36255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LocationProvider f36256h;
    private final CoroutineContext i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Job f36257j;
    private boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f36258l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36259m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f36260n;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36263c;
        int d;
        int e;
        int f;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return gf.this.new a(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instruction units count: 245
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.gf.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36265a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ud f36267c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ud udVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f36267c = udVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return gf.this.new b(this.f36267c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36265a;
            if (i == 0) {
                yhm.o.b(obj2);
                x1 x1Var = gf.this.e;
                v8 v8Var = new v8(gf.this.f36255g.getCurrentTimestamp(), this.f36267c);
                this.f36265a = 1;
                if (x1Var.consume(v8Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36268a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return gf.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36268a;
            if (i == 0) {
                yhm.o.b(obj2);
                x1 x1Var = gf.this.e;
                u8 u8Var = new u8(gf.this.f36255g.getCurrentTimestamp());
                this.f36268a = 1;
                if (x1Var.consume(u8Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36270a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ sd f36272c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(sd sdVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f36272c = sdVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return gf.this.new d(this.f36272c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36270a;
            if (i == 0) {
                yhm.o.b(obj2);
                x1 x1Var = gf.this.e;
                w8 w8Var = new w8(this.f36272c, gf.this.f36255g.getCurrentTimestamp());
                this.f36270a = 1;
                if (x1Var.consume(w8Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36273a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return gf.this.new e(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        
            if (r6.tryReturnResult(r5) != r0) goto L20;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r5.f36273a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r6)
                goto L4a
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                yhm.o.b(r6)
                goto L3f
            L1c:
                yhm.o.b(r6)
                com.fourthline.vision.internal.gf r6 = com.fourthline.vision.internal.gf.this
                boolean r6 = r6.isCompleted()
                if (r6 != 0) goto L4a
                com.fourthline.vision.internal.gf r6 = com.fourthline.vision.internal.gf.this
                r6.setCompleted(r3)
                com.fourthline.vision.internal.gf r6 = com.fourthline.vision.internal.gf.this
                boolean r6 = com.fourthline.vision.internal.gf.access$getShouldDelayVideoStop(r6)
                if (r6 == 0) goto L3f
                r5.f36273a = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = skm.k0.b(r3, r5)
                if (r6 != r0) goto L3f
                goto L49
            L3f:
                com.fourthline.vision.internal.gf r6 = com.fourthline.vision.internal.gf.this
                r5.f36273a = r2
                java.lang.Object r6 = com.fourthline.vision.internal.gf.access$tryReturnResult(r6, r5)
                if (r6 != r0) goto L4a
            L49:
                return r0
            L4a:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.gf.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class f extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36277c;
        int d;
        int e;
        int f;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return gf.this.new f(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            gf gfVar;
            int i;
            int i2;
            gf gfVar2;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i3 = this.f;
            if (i3 == 0) {
                yhm.o.b(obj2);
                Try<Unit> tryStart = gf.this.getMediaRecorderManager().start();
                gfVar = gf.this;
                if (tryStart instanceof Try.Failure) {
                    ((Try.Failure) tryStart).getException();
                    gfVar.onScannerResult(TryKt.failure(new ra.a(pa.i, null, 2, null)));
                    return Unit.f186387a;
                }
                if (!(tryStart instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                gfVar.f36254c.start();
                x1 x1Var = gfVar.e;
                x8 x8Var = new x8(gfVar.f36255g.getCurrentTimestamp());
                this.f36275a = null;
                this.f36276b = gfVar;
                this.f36277c = null;
                i = 0;
                this.d = 0;
                this.e = 0;
                this.f = 1;
                if (x1Var.consume(x8Var, this) != aVar) {
                    i2 = 0;
                }
                return aVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gfVar2 = (gf) this.f36276b;
                yhm.o.b(obj2);
                gfVar2.getScannerCallback().onStepsSizeUpdate(gfVar2.getStepsCount());
                gfVar2.d.start();
                return Unit.f186387a;
            }
            int i5 = this.e;
            i2 = this.d;
            gf gfVar3 = (gf) this.f36276b;
            yhm.o.b(obj2);
            i = i5;
            gfVar = gfVar3;
            this.f36275a = null;
            this.f36276b = gfVar;
            this.f36277c = null;
            this.d = i2;
            this.e = i;
            this.f = 2;
            if (skm.k0.b(1000L, this) != aVar) {
                gfVar2 = gfVar;
                gfVar2.getScannerCallback().onStepsSizeUpdate(gfVar2.getStepsCount());
                gfVar2.d.start();
                return Unit.f186387a;
            }
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class g extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36279a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return gf.this.new g(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (r5.cancel(r4) == r0) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r4.f36279a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r5)
                goto L3d
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                yhm.o.b(r5)
                goto L2e
            L1c:
                yhm.o.b(r5)
                com.fourthline.vision.internal.gf r5 = com.fourthline.vision.internal.gf.this
                com.fourthline.vision.internal.o8 r5 = r5.getMediaRecorderManager()
                r4.f36279a = r3
                java.lang.Object r5 = r5.cancel(r4)
                if (r5 != r0) goto L2e
                goto L3c
            L2e:
                com.fourthline.vision.internal.gf r5 = com.fourthline.vision.internal.gf.this
                com.fourthline.vision.internal.g9 r5 = com.fourthline.vision.internal.gf.access$getMotionDataManager$p(r5)
                r4.f36279a = r2
                java.lang.Object r5 = r5.cancel(r4)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                kotlin.Unit r5 = kotlin.Unit.f186387a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.gf.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class h extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36281a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return gf.this.new h(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        
            if (r8.consume(r1, r7) == r0) goto L20;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r7.f36281a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                yhm.o.b(r8)     // Catch: java.lang.Throwable -> L10
                goto L72
            L10:
                r8 = move-exception
                goto L56
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                yhm.o.b(r8)     // Catch: java.lang.Throwable -> L10
                goto L45
            L1e:
                yhm.o.b(r8)
                com.fourthline.vision.internal.gf r8 = com.fourthline.vision.internal.gf.this     // Catch: java.lang.Throwable -> L10
                com.fourthline.vision.internal.x1 r8 = com.fourthline.vision.internal.gf.access$getMetadataConsumer$p(r8)     // Catch: java.lang.Throwable -> L10
                com.fourthline.vision.internal.t8 r1 = new com.fourthline.vision.internal.t8     // Catch: java.lang.Throwable -> L10
                com.fourthline.vision.internal.gf r4 = com.fourthline.vision.internal.gf.this     // Catch: java.lang.Throwable -> L10
                com.fourthline.vision.internal.sd r4 = r4.getStepConfig()     // Catch: java.lang.Throwable -> L10
                com.fourthline.vision.internal.gf r5 = com.fourthline.vision.internal.gf.this     // Catch: java.lang.Throwable -> L10
                com.fourthline.core.internal.TimestampProvider r5 = com.fourthline.vision.internal.gf.access$getTimestampProvider$p(r5)     // Catch: java.lang.Throwable -> L10
                long r5 = r5.getCurrentTimestamp()     // Catch: java.lang.Throwable -> L10
                r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L10
                r7.f36281a = r2     // Catch: java.lang.Throwable -> L10
                java.lang.Object r8 = r8.consume(r1, r7)     // Catch: java.lang.Throwable -> L10
                if (r8 != r0) goto L45
                goto L55
            L45:
                com.fourthline.vision.internal.gf r8 = com.fourthline.vision.internal.gf.this     // Catch: java.lang.Throwable -> L10
                com.fourthline.vision.internal.x1 r8 = com.fourthline.vision.internal.gf.access$getTriggerConsumer$p(r8)     // Catch: java.lang.Throwable -> L10
                kotlin.Unit r1 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L10
                r7.f36281a = r3     // Catch: java.lang.Throwable -> L10
                java.lang.Object r8 = r8.consume(r1, r7)     // Catch: java.lang.Throwable -> L10
                if (r8 != r0) goto L72
            L55:
                return r0
            L56:
                com.fourthline.vision.internal.gf r0 = com.fourthline.vision.internal.gf.this
                com.fourthline.vision.internal.ka r0 = r0.getScannerCallback()
                boolean r1 = r8 instanceof com.fourthline.vision.internal.ra
                if (r1 == 0) goto L63
                com.fourthline.vision.internal.ra r8 = (com.fourthline.vision.internal.ra) r8
                goto L6b
            L63:
                com.fourthline.vision.internal.ra$a r8 = new com.fourthline.vision.internal.ra$a
                com.fourthline.vision.internal.pa r1 = com.fourthline.vision.internal.pa.f36695a
                r2 = 0
                r8.<init>(r1, r2, r3, r2)
            L6b:
                com.fourthline.core.internal.Try r8 = com.fourthline.core.internal.TryKt.failure(r8)
                r0.onStepResult(r8)
            L72:
                kotlin.Unit r8 = kotlin.Unit.f186387a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.gf.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class i extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36284b;
        int d;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36284b = obj2;
            this.d |= Integer.MIN_VALUE;
            return gf.this.tryReturnResult(this);
        }
    }

    public gf(@NotNull ka scannerCallback, @NotNull o8 mediaRecorderManager, @NotNull g9 motionDataManager, @NotNull wd stepsAdapter, @NotNull x1 metadataConsumer, @NotNull x1 triggerConsumer, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(scannerCallback, "scannerCallback");
        Intrinsics.checkNotNullParameter(mediaRecorderManager, "mediaRecorderManager");
        Intrinsics.checkNotNullParameter(motionDataManager, "motionDataManager");
        Intrinsics.checkNotNullParameter(stepsAdapter, "stepsAdapter");
        Intrinsics.checkNotNullParameter(metadataConsumer, "metadataConsumer");
        Intrinsics.checkNotNullParameter(triggerConsumer, "triggerConsumer");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f36252a = scannerCallback;
        this.f36253b = mediaRecorderManager;
        this.f36254c = motionDataManager;
        this.d = stepsAdapter;
        this.e = metadataConsumer;
        this.f = triggerConsumer;
        this.f36255g = timestampProvider;
        this.f36256h = locationProvider;
        this.i = coroutineContext;
        this.f36258l = new ArrayList();
        setup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldDelayVideoStop() {
        return getStepConfig().getShouldDelayVideo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScannerResult(Try<ua> r2) {
        getScannerCallback().onScannerResult(r2);
    }

    private final void setup() {
        wd wdVar = this.d;
        if (wdVar.getClass().isAnonymousClass()) {
            String name = wdVar.getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = wdVar.getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        wdVar.setStepResultListener(new qg(this, 1));
        wdVar.setStepListener(new qg(this, 2));
        wdVar.setOnCompletedListener(new dg(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setup$lambda$0$0(gf gfVar, Try r4) {
        Intrinsics.checkNotNullParameter(r4, "<this>");
        TryKt.handleSuccess(r4, new qg(gfVar, 0));
        skm.e0.C(gfVar, null, null, gfVar.new c(null), 3);
        gfVar.getScannerCallback().onStepResult(r4);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job setup$lambda$0$0$0(gf gfVar, ud it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        gfVar.f36258l.add(it8);
        return skm.e0.C(gfVar, null, null, gfVar.new b(it8, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setup$lambda$0$1(gf gfVar, sd sdVar) {
        Intrinsics.checkNotNullParameter(sdVar, "<this>");
        skm.e0.C(gfVar, null, null, gfVar.new d(sdVar, null), 3);
        gfVar.getScannerCallback().onStepUpdate(sdVar.getStepType());
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setup$lambda$0$2(gf gfVar) {
        skm.e0.C(gfVar, null, null, gfVar.new e(null), 3);
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopProcessingJob() {
        Job job2 = this.f36257j;
        if (job2 != null) {
            job2.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryReturnResult(kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.gf.tryReturnResult(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.i;
    }

    @Override // com.fourthline.vision.internal.ja
    @NotNull
    public o8 getMediaRecorderManager() {
        return this.f36253b;
    }

    @Override // com.fourthline.vision.internal.ja
    @NotNull
    public ka getScannerCallback() {
        return this.f36252a;
    }

    @Override // com.fourthline.vision.internal.ja
    @NotNull
    public sd getStepConfig() {
        return this.d.getStepConfig();
    }

    @Override // com.fourthline.vision.internal.ja
    public int getStepsCount() {
        return this.d.getStepsCount();
    }

    @Override // com.fourthline.vision.internal.t1
    public boolean isCompleted() {
        return this.f36259m;
    }

    @Override // com.fourthline.vision.internal.ja
    public boolean isRunning() {
        return this.f36260n;
    }

    @Override // com.fourthline.vision.internal.ja
    public void moveToNextStep() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (!isRunning() || this.k) {
            return;
        }
        getScannerCallback().onMoveToNextStep();
        this.d.moveToNext();
    }

    @Override // com.fourthline.vision.internal.ja
    public void resetCurrentStep() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (!isRunning() || this.k) {
            return;
        }
        getScannerCallback().onResetCurrentStep(getStepConfig().getStepType());
        this.d.resetCurrentStep();
    }

    @Override // com.fourthline.vision.internal.ja
    public void resetScanner() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        this.k = false;
        setRunning(true);
        setCompleted(false);
        skm.e0.C(this, null, null, new a(null), 3);
    }

    public void setCompleted(boolean z) {
        this.f36259m = z;
    }

    public void setRunning(boolean z) {
        this.f36260n = z;
    }

    public void setScannerCallback(@NotNull ka kaVar) {
        Intrinsics.checkNotNullParameter(kaVar, "<set-?>");
        this.f36252a = kaVar;
    }

    @Override // com.fourthline.vision.internal.ja, com.fourthline.vision.internal.pd
    public void start() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (isRunning()) {
            return;
        }
        setRunning(true);
        LocationProvider.requestLocation$default(this.f36256h, null, null, 3, null);
        if (isCompleted() && this.k) {
            return;
        }
        getScannerCallback().onStart();
        skm.e0.C(this, null, null, new f(null), 3);
    }

    @Override // com.fourthline.vision.internal.ja, com.fourthline.vision.internal.pd
    public void stop() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (!isCompleted()) {
            this.k = true;
            onScannerResult(TryKt.failure(ra.e.f36778b));
        }
        setCompleted(true);
        stopProcessingJob();
        skm.e0.C(this, null, null, new g(null), 3);
        this.d.stop();
        this.f36256h.cancelLocationRequest();
        setRunning(false);
    }

    @Override // com.fourthline.vision.internal.ja
    public void takeSnapshot() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            if (simpleName.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
            }
        }
        if (!isRunning() || this.k) {
            return;
        }
        getScannerCallback().onTakeSnapshot();
        stopProcessingJob();
        this.f36257j = skm.e0.C(this, null, null, new h(null), 3);
    }
}
