package com.fourthline.vision.internal;

import androidx.compose.ui.geometry.Rect;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.internal.rd;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.compose.SelfieScannerEvent;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class sc implements rd, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f36879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f36881c;
    private final SelfieScannerConfig d;
    private final Function1 e;
    private final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final x1 f36882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g9 f36883h;
    private final TimestampProvider i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LocationProvider f36884j;
    private final tf k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final uc f36885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ad f36886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final le f36887n;
    private rd.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Job f36888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Job f36889q;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[me.values().length];
            try {
                iArr[me.f36579b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36892c;
        Object d;
        Object e;
        Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f36893g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f36894h;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            b bVar = sc.this.new b(continuation);
            bVar.f36894h = obj2;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 515
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.sc.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36895a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return sc.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36895a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f36895a = 1;
                if (skm.k0.b(60000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            sc.this.onTimeout();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36897a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return sc.this.new d(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36897a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f36897a = 1;
                if (skm.k0.b(30000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            sc.this.onTimeout();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class e extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36900b;
        int d;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36900b = obj2;
            this.d |= Integer.MIN_VALUE;
            return sc.this.startVideoRecording(null, this);
        }
    }

    public static final class f implements sf {

        public static final class a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f36903a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ sc f36904b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ rf f36905c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(sc scVar, rf rfVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f36904b = scVar;
                this.f36905c = rfVar;
            }

            @Override // gim.a
            public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
                return new a(this.f36904b, this.f36905c, continuation);
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f36903a;
                if (i == 0) {
                    yhm.o.b(obj2);
                    x1 x1Var = this.f36904b.f36882g;
                    v8 v8Var = new v8(this.f36904b.i.getCurrentTimestamp(), (SelfieScannerStep) this.f36905c.getPublicStep());
                    this.f36903a = 1;
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
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
            }
        }

        public f() {
        }

        @Override // com.fourthline.vision.internal.sf
        public /* bridge */ /* synthetic */ void onComplete(Object obj2, Object obj3, Map map) {
            onComplete((rf) obj2, (zc) obj3, (Map<String, ? extends Object>) map);
        }

        @Override // com.fourthline.vision.internal.sf
        public /* bridge */ /* synthetic */ Object onStartVideoRecordingRequired(Object obj2, me meVar, Continuation continuation) {
            return onStartVideoRecordingRequired((rf) obj2, meVar, (Continuation<? super Unit>) continuation);
        }

        @Override // com.fourthline.vision.internal.sf
        public /* bridge */ /* synthetic */ Object onStopVideoRecordingRequired(Object obj2, me meVar, Continuation continuation) {
            return onStopVideoRecordingRequired((rf) obj2, meVar, (Continuation<? super Unit>) continuation);
        }

        public void onComplete(rf step, zc result, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(step, "step");
            Intrinsics.checkNotNullParameter(result, "result");
            sc scVar = sc.this;
            skm.e0.C(scVar, null, null, new a(scVar, step, null), 3);
            sc.this.f36886m.onStepCompleted((SelfieScannerStep) step.getPublicStep(), map);
            sc.this.stopVisionStep(step);
            sc.this.proceedNextStep();
        }

        @Override // com.fourthline.vision.internal.sf
        public void onEvent(rf step, SelfieScannerEvent event) {
            Intrinsics.checkNotNullParameter(step, "step");
            Intrinsics.checkNotNullParameter(event, "event");
            if (!(event instanceof SelfieScannerEvent.OnFail)) {
                sc.this.e.invoke(event);
            } else {
                sc.this.stopVisionStep(step);
                sc.this.fail(step, ((SelfieScannerEvent.OnFail) event).getError());
            }
        }

        @Override // com.fourthline.vision.internal.sf
        public void onProcessingResult(rf step) {
            Intrinsics.checkNotNullParameter(step, "step");
            Objects.toString(step.getPublicStep());
            sc.this.stopVisionStep(step);
            sc.this.cancelTimeouts();
            sc.this.setState(rd.a.d.f36820a);
        }

        public Object onStartVideoRecordingRequired(rf rfVar, me meVar, Continuation<? super Unit> continuation) {
            Objects.toString(meVar);
            Object objStartVideoRecording = sc.this.startVideoRecording(meVar, continuation);
            return objStartVideoRecording == fim.a.COROUTINE_SUSPENDED ? objStartVideoRecording : Unit.f186387a;
        }

        public Object onStopVideoRecordingRequired(rf rfVar, me meVar, Continuation<? super Unit> continuation) {
            Objects.toString(meVar);
            Object objStopRecordingVideoAtStepLevel = sc.this.stopRecordingVideoAtStepLevel(meVar, continuation);
            return objStopRecordingVideoAtStepLevel == fim.a.COROUTINE_SUSPENDED ? objStopRecordingVideoAtStepLevel : Unit.f186387a;
        }
    }

    public static final class g extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36906a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return sc.this.new g(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36906a;
            if (i == 0) {
                yhm.o.b(obj2);
                g9 g9Var = sc.this.f36883h;
                this.f36906a = 1;
                if (g9Var.cancel(this) == aVar) {
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
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class h extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36909b;
        int d;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36909b = obj2;
            this.d |= Integer.MIN_VALUE;
            return sc.this.stopRecordingVideoAtStepLevel(null, this);
        }
    }

    public static final class i extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36911a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return sc.this.new i(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36911a;
            if (i == 0) {
                yhm.o.b(obj2);
                x1 x1Var = sc.this.f36882g;
                y8 y8Var = new y8(sc.this.i.getCurrentTimestamp());
                this.f36911a = 1;
                if (x1Var.consume(y8Var, this) == aVar) {
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
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public sc(@NotNull Function0<od> screenSize, @NotNull Function0<Rect> detectionArea, @NotNull SelfieScannerConfig config, @NotNull Function1<? super SelfieScannerEvent, Unit> callback, @NotNull u cameraEngine, @NotNull x1 metaDataConsumer, @NotNull g9 motionDataManager, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull tf stepManager, @NotNull uc stepFlowRepository, @NotNull ad analytics, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(detectionArea, "detectionArea");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(metaDataConsumer, "metaDataConsumer");
        Intrinsics.checkNotNullParameter(motionDataManager, "motionDataManager");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(stepManager, "stepManager");
        Intrinsics.checkNotNullParameter(stepFlowRepository, "stepFlowRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36879a = coroutineScope;
        this.f36880b = screenSize;
        this.f36881c = detectionArea;
        this.d = config;
        this.e = callback;
        this.f = cameraEngine;
        this.f36882g = metaDataConsumer;
        this.f36883h = motionDataManager;
        this.i = timestampProvider;
        this.f36884j = locationProvider;
        this.k = stepManager;
        this.f36885l = stepFlowRepository;
        this.f36886m = analytics;
        int i2 = 9;
        this.f36887n = new le(cameraEngine, config.getRecordingType(), this, new dg(this, i2), new eg(this, i2));
        this.o = rd.a.d.f36820a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeouts() {
        Job job2 = this.f36888p;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.f36889q;
        if (job3 != null) {
            job3.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fail(rf rfVar, SelfieScannerError selfieScannerError) {
        rd.a state = getState();
        if (!(state instanceof rd.a.d) && !(state instanceof rd.a.C0336a)) {
            if (!(state instanceof rd.a.b) && !(state instanceof rd.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            setState(rd.a.c.f36819a);
            cancelTimeouts();
            this.e.invoke(new SelfieScannerEvent.OnFail(selfieScannerError));
            this.f36886m.onFail((SelfieScannerStep) rfVar.getPublicStep(), selfieScannerError, null);
        }
    }

    private final void onAllStepsCompleted() {
        cancelTimeouts();
        setState(rd.a.b.f36818a);
        skm.e0.C(this, null, null, new b(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimeout() {
        fail(this.k.getCurrentStep(), SelfieScannerError.TIMEOUT);
        Job job2 = this.f36888p;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.f36889q;
        if (job3 != null) {
            job3.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void proceedNextStep() {
        if (this.k.hasNext()) {
            startVisionStep(this.k.next());
        } else {
            onAllStepsCompleted();
        }
    }

    private final void resetScannerTimeout() {
        Job job2 = this.f36888p;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36888p = skm.e0.C(this, null, null, new c(null), 3);
    }

    private final void resetStepTimeout() {
        Job job2 = this.f36889q;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36889q = skm.e0.C(this, null, null, new d(null), 3);
    }

    private final void resetSteps() {
        cancelTimeouts();
        this.k.resetAllSteps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startVideoRecording(com.fourthline.vision.internal.me r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.fourthline.vision.internal.sc.e
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.vision.internal.sc$e r0 = (com.fourthline.vision.internal.sc.e) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.sc$e r0 = new com.fourthline.vision.internal.sc$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f36900b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f36899a
            com.fourthline.vision.internal.me r7 = (com.fourthline.vision.internal.me) r7
            yhm.o.b(r8)
            goto L4e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            com.fourthline.vision.internal.x1 r8 = r6.f36882g
            com.fourthline.vision.internal.x8 r2 = new com.fourthline.vision.internal.x8
            com.fourthline.core.internal.TimestampProvider r4 = r6.i
            long r4 = r4.getCurrentTimestamp()
            r2.<init>(r4)
            r0.f36899a = r7
            r0.d = r3
            java.lang.Object r8 = r8.consume(r2, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            com.fourthline.vision.internal.le r8 = r6.f36887n
            int[] r0 = com.fourthline.vision.internal.sc.a.$EnumSwitchMapping$0
            int r1 = r7.ordinal()
            r0 = r0[r1]
            if (r0 != r3) goto L66
            com.fourthline.core.VideoDuration$CUSTOM r0 = new com.fourthline.core.VideoDuration$CUSTOM
            r1 = 5000(0x1388, double:2.4703E-320)
            r0.<init>(r1)
            long r0 = r0.getDuration()
            goto L71
        L66:
            com.fourthline.core.VideoDuration$CUSTOM r0 = new com.fourthline.core.VideoDuration$CUSTOM
            r1 = 20000(0x4e20, double:9.8813E-320)
            r0.<init>(r1)
            long r0 = r0.getDuration()
        L71:
            r8.startRecording(r7, r0)
            com.fourthline.vision.internal.g9 r7 = r6.f36883h
            r7.start()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.sc.startVideoRecording(com.fourthline.vision.internal.me, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void startVisionStep(rf rfVar) {
        setState(rd.a.C0336a.f36817a);
        this.e.invoke(new SelfieScannerEvent.OnStepUpdate((SelfieScannerStep) rfVar.getPublicStep()));
        this.f36886m.onStepUpdate((SelfieScannerStep) rfVar.getPublicStep());
        resetStepTimeout();
        rfVar.setCallback(new f());
        rfVar.start();
        this.f.setAnalyzer(rfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopRecordingVideoAtStepLevel(com.fourthline.vision.internal.me r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.fourthline.vision.internal.sc.h
            if (r0 == 0) goto L13
            r0 = r9
            com.fourthline.vision.internal.sc$h r0 = (com.fourthline.vision.internal.sc.h) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.vision.internal.sc$h r0 = new com.fourthline.vision.internal.sc$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36909b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.f36908a
            com.fourthline.vision.internal.me r8 = (com.fourthline.vision.internal.me) r8
            yhm.o.b(r9)
            goto L43
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            com.fourthline.vision.internal.le r9 = r7.f36887n
            r0.f36908a = r8
            r0.d = r3
            java.lang.Object r9 = r9.stopRecording(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            com.fourthline.vision.internal.le$b r9 = (com.fourthline.vision.internal.le.b) r9
            if (r9 == 0) goto L79
            com.fourthline.vision.internal.me r0 = r9.getVideoType()
            if (r8 == r0) goto L56
            com.fourthline.vision.internal.ad r0 = r7.f36886m
            com.fourthline.vision.internal.me r1 = r9.getVideoType()
            r0.onVideoTypeMismatch(r8, r1)
        L56:
            java.util.Objects.toString(r8)
            com.fourthline.vision.internal.uc r0 = r7.f36885l
            com.fourthline.core.VideoRecording r1 = new com.fourthline.core.VideoRecording
            android.net.Uri r9 = r9.getUri()
            java.lang.String r9 = r9.toString()
            java.net.URI r2 = java.net.URI.create(r9)
            java.lang.String r9 = "create(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r9)
            com.fourthline.core.VideoDuration$DEFAULT r3 = com.fourthline.core.VideoDuration.DEFAULT.INSTANCE
            r5 = 4
            r6 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r0.addVideoRecording(r8, r1)
        L79:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.sc.stopRecordingVideoAtStepLevel(com.fourthline.vision.internal.me, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopVisionStep(rf rfVar) {
        rfVar.stop();
        this.f.setAnalyzer(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit videoRecorderManager$lambda$0(sc scVar) throws Throwable {
        skm.e0.E(kotlin.coroutines.g.f186406a, scVar.new i(null));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit videoRecorderManager$lambda$1(sc scVar, me videoType) {
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        if (a.$EnumSwitchMapping$0[videoType.ordinal()] != 1) {
            scVar.fail(scVar.k.getCurrentStep(), SelfieScannerError.RECORDING_FAILED);
        }
        return Unit.f186387a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36879a.getF74819h();
    }

    @Override // com.fourthline.vision.internal.rd
    public fa getRecognizedBounds() {
        return this.f36885l.getRecognizedBounds();
    }

    @Override // com.fourthline.vision.internal.rd
    @NotNull
    public rd.a getState() {
        return this.o;
    }

    @Override // com.fourthline.vision.internal.rd
    public void moveToNextStep() {
        proceedNextStep();
    }

    @Override // com.fourthline.vision.internal.rd
    public void resetCurrentStep() {
    }

    @Override // com.fourthline.vision.internal.rd
    public void restart() {
        this.f36886m.onReset();
        setState(rd.a.d.f36820a);
        cancelTimeouts();
        start();
    }

    public void setState(@NotNull rd.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.o = aVar;
    }

    @Override // com.fourthline.vision.internal.rd
    public void start() {
        resetScannerTimeout();
        resetSteps();
        this.f36886m.onStart();
        startVisionStep(this.k.getCurrentStep());
    }

    @Override // com.fourthline.vision.internal.rd
    public void stop() {
        skm.e0.C(this, null, null, new g(null), 3);
        if (getState() instanceof rd.a.C0336a) {
            fail(this.k.getCurrentStep(), SelfieScannerError.SCANNER_INTERRUPTED);
        }
    }

    @Override // com.fourthline.vision.internal.rd
    public void takeSnapshot() {
    }
}
