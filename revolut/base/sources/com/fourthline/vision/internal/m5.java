package com.fourthline.vision.internal;

import androidx.compose.ui.geometry.Rect;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.compose.DocumentScannerEvent;
import com.fourthline.vision.internal.rd;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
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
public final class m5 implements rd, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f36520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f36521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DocumentScannerConfig f36522c;
    private final Function1 d;
    private final Function0 e;
    private final x1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g9 f36523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimestampProvider f36524h;
    private final LocationProvider i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final u7 f36525j;
    private final d6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final tf f36526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final q5 f36527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final le f36528n;
    private rd.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Job f36529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Job f36530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Job f36531r;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Integer.valueOf(((DocumentScannerStep) ((rf) ((Map.Entry) obj2).getKey()).getPublicStep()).getIndex()), Integer.valueOf(((DocumentScannerStep) ((rf) ((Map.Entry) obj3).getKey()).getPublicStep()).getIndex()));
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36533b;
        int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36533b = obj2;
            this.d |= Integer.MIN_VALUE;
            return m5.this.finishScanner(this);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36535a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return m5.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36535a;
            if (i == 0) {
                yhm.o.b(obj2);
                m5 m5Var = m5.this;
                this.f36535a = 1;
                if (m5Var.finishScanner(this) == aVar) {
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
        int f36537a;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return m5.this.new d(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36537a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f36537a = 1;
                if (skm.k0.b(60000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            m5.this.timeout();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36539a;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return m5.this.new e(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36539a;
            if (i == 0) {
                yhm.o.b(obj2);
                this.f36539a = 1;
                if (skm.k0.b(40000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            m5.this.timeout();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class f extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36541a;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return m5.this.new f(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36541a;
            if (i == 0) {
                yhm.o.b(obj2);
                long millis = TimeUnit.SECONDS.toMillis(m5.this.f36522c.getAutoDetectStepDuration());
                this.f36541a = 1;
                if (skm.k0.b(millis, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            m5.this.switchToManualMode();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class g extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f36543a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f36545c;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36543a = obj2;
            this.f36545c |= Integer.MIN_VALUE;
            return m5.this.startVideoRecording(this);
        }
    }

    public static final class h implements sf {
        public h() {
        }

        @Override // com.fourthline.vision.internal.sf
        public /* bridge */ /* synthetic */ void onComplete(Object obj2, Object obj3, Map map) {
            onComplete((rf) obj2, (c6) obj3, (Map<String, ? extends Object>) map);
        }

        @Override // com.fourthline.vision.internal.sf
        public /* bridge */ /* synthetic */ Object onStartVideoRecordingRequired(Object obj2, me meVar, Continuation continuation) {
            return onStartVideoRecordingRequired((rf) obj2, meVar, (Continuation<? super Unit>) continuation);
        }

        @Override // com.fourthline.vision.internal.sf
        public /* bridge */ /* synthetic */ Object onStopVideoRecordingRequired(Object obj2, me meVar, Continuation continuation) {
            return onStopVideoRecordingRequired((rf) obj2, meVar, (Continuation<? super Unit>) continuation);
        }

        public void onComplete(rf step, c6 result, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(step, "step");
            Intrinsics.checkNotNullParameter(result, "result");
            Objects.toString(step.getPublicStep());
            m5.this.d.invoke(new DocumentScannerEvent.OnStepSuccess(result.getScannerStepResult()));
            Object publicStep = step.getPublicStep();
            rd.a state = m5.this.getState();
            Objects.toString(publicStep);
            Objects.toString(state);
            m5.this.k.onStepSuccess((DocumentScannerStep) step.getPublicStep(), result.getScannerStepResult());
            m5.this.stopVisionStep(step);
        }

        @Override // com.fourthline.vision.internal.sf
        public void onEvent(rf step, DocumentScannerEvent event) {
            Intrinsics.checkNotNullParameter(step, "step");
            Intrinsics.checkNotNullParameter(event, "event");
            if (!(event instanceof DocumentScannerEvent.OnFail)) {
                m5.this.d.invoke(event);
            } else {
                m5.this.stopVisionStep(step);
                m5.fail$default(m5.this, step, ((DocumentScannerEvent.OnFail) event).getError(), null, 4, null);
            }
        }

        @Override // com.fourthline.vision.internal.sf
        public void onProcessingResult(rf step) {
            Intrinsics.checkNotNullParameter(step, "step");
            Objects.toString(step.getPublicStep());
            m5.this.stopVisionStep(step);
            m5.this.cancelTimeouts();
            m5.this.setState(rd.a.d.f36820a);
        }

        public Object onStartVideoRecordingRequired(rf rfVar, me meVar, Continuation<? super Unit> continuation) {
            Object objStartVideoRecording = m5.this.startVideoRecording(continuation);
            return objStartVideoRecording == fim.a.COROUTINE_SUSPENDED ? objStartVideoRecording : Unit.f186387a;
        }

        public Object onStopVideoRecordingRequired(rf rfVar, me meVar, Continuation<? super Unit> continuation) {
            return Unit.f186387a;
        }
    }

    public static final class i extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36547a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return m5.this.new i(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36547a;
            if (i == 0) {
                yhm.o.b(obj2);
                g9 g9Var = m5.this.f36523g;
                this.f36547a = 1;
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
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class j extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36549a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ rf f36551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(rf rfVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f36551c = rfVar;
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return m5.this.new j(this.f36551c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f36549a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            m5.this.k.onTakeSnapshot((DocumentScannerStep) this.f36551c.getPublicStep());
            this.f36551c.takePicture();
            return Unit.f186387a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public static final class k extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36552a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // gim.a
        public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
            return m5.this.new k(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f36552a;
            if (i == 0) {
                yhm.o.b(obj2);
                x1 x1Var = m5.this.f;
                y8 y8Var = new y8(m5.this.f36524h.getCurrentTimestamp());
                this.f36552a = 1;
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
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public m5(@NotNull u cameraEngine, @NotNull DocumentScannerConfig config, @NotNull Function1<? super DocumentScannerEvent, Unit> callback, @NotNull Function0<Rect> detectionArea, @NotNull x1 metaDataConsumer, @NotNull g9 motionDataManager, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull u7 isSteadyProvider, @NotNull d6 analytics, @NotNull tf stepManager, @NotNull q5 stepFlowRepository, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(cameraEngine, "cameraEngine");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(detectionArea, "detectionArea");
        Intrinsics.checkNotNullParameter(metaDataConsumer, "metaDataConsumer");
        Intrinsics.checkNotNullParameter(motionDataManager, "motionDataManager");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(isSteadyProvider, "isSteadyProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(stepManager, "stepManager");
        Intrinsics.checkNotNullParameter(stepFlowRepository, "stepFlowRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f36520a = coroutineScope;
        this.f36521b = cameraEngine;
        this.f36522c = config;
        this.d = callback;
        this.e = detectionArea;
        this.f = metaDataConsumer;
        this.f36523g = motionDataManager;
        this.f36524h = timestampProvider;
        this.i = locationProvider;
        this.f36525j = isSteadyProvider;
        this.k = analytics;
        this.f36526l = stepManager;
        this.f36527m = stepFlowRepository;
        this.f36528n = new le(cameraEngine, config.getRecordingType(), this, new dg(this, 6), new eg(this, 5));
        this.o = rd.a.d.f36820a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeouts() {
        Job job2 = this.f36529p;
        if (job2 != null) {
            job2.f(null);
        }
        Job job3 = this.f36530q;
        if (job3 != null) {
            job3.f(null);
        }
        Job job4 = this.f36531r;
        if (job4 != null) {
            job4.f(null);
        }
    }

    private final void fail(rf rfVar, DocumentScannerError documentScannerError, Throwable th10) {
        Objects.toString(documentScannerError);
        rd.a state = getState();
        if (!(state instanceof rd.a.d) && !(state instanceof rd.a.C0336a)) {
            if (!(state instanceof rd.a.b) && !(state instanceof rd.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            setState(rd.a.c.f36819a);
            cancelTimeouts();
            this.d.invoke(new DocumentScannerEvent.OnFail(documentScannerError));
            this.k.onFail((DocumentScannerStep) this.f36526l.getCurrentStep().getPublicStep(), documentScannerError, th10);
        }
    }

    public static /* synthetic */ void fail$default(m5 m5Var, rf rfVar, DocumentScannerError documentScannerError, Throwable th10, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            th10 = null;
        }
        m5Var.fail(rfVar, documentScannerError, th10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a A[LOOP:0: B:43:0x0104->B:45:0x010a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.fourthline.core.mrz.MrzInfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finishScanner(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.m5.finishScanner(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void proceedNextStep() {
        if (this.f36526l.hasNext()) {
            startVisionStep(this.f36526l.next());
        } else {
            skm.e0.C(this, null, null, new c(null), 3);
        }
    }

    private final void resetScannerTimeout() {
        Job job2 = this.f36529p;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36529p = skm.e0.C(this, null, null, new d(null), 3);
    }

    private final void resetStepTimeout() {
        Job job2 = this.f36530q;
        if (job2 != null) {
            job2.f(null);
        }
        this.f36530q = skm.e0.C(this, null, null, new e(null), 3);
        Job job3 = this.f36531r;
        if (job3 != null) {
            job3.f(null);
        }
        if (((DocumentScannerStep) this.f36526l.getCurrentStep().getPublicStep()).isAutoDetectAvailable()) {
            this.f36531r = skm.e0.C(this, null, null, new f(null), 3);
        }
    }

    private final void resetSteps() {
        cancelTimeouts();
        this.f36526l.resetAllSteps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startVideoRecording(kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.fourthline.vision.internal.m5.g
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.vision.internal.m5$g r0 = (com.fourthline.vision.internal.m5.g) r0
            int r1 = r0.f36545c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36545c = r1
            goto L18
        L13:
            com.fourthline.vision.internal.m5$g r0 = new com.fourthline.vision.internal.m5$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36543a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f36545c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            com.fourthline.vision.internal.x1 r7 = r6.f
            com.fourthline.vision.internal.x8 r2 = new com.fourthline.vision.internal.x8
            com.fourthline.core.internal.TimestampProvider r4 = r6.f36524h
            long r4 = r4.getCurrentTimestamp()
            r2.<init>(r4)
            r0.f36545c = r3
            java.lang.Object r7 = r7.consume(r2, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            com.fourthline.vision.internal.le r7 = r6.f36528n
            com.fourthline.vision.internal.me r0 = com.fourthline.vision.internal.me.f36578a
            com.fourthline.vision.document.DocumentScannerConfig r1 = r6.f36522c
            com.fourthline.core.VideoDuration r1 = r1.getVideoDuration()
            long r1 = r1.getDuration()
            r7.startRecording(r0, r1)
            com.fourthline.vision.internal.g9 r7 = r6.f36523g
            r7.start()
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.m5.startVideoRecording(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void startVisionStep(rf rfVar) {
        setState(rd.a.C0336a.f36817a);
        this.d.invoke(new DocumentScannerEvent.OnStepUpdate((DocumentScannerStep) rfVar.getPublicStep()));
        this.k.onStepUpdate((DocumentScannerStep) rfVar.getPublicStep());
        resetStepTimeout();
        rfVar.setCallback(new h());
        rfVar.start();
        this.f36521b.setAnalyzer(rfVar);
    }

    private final void stepFail(DocumentScannerStepError documentScannerStepError) {
        setState(rd.a.d.f36820a);
        this.d.invoke(new DocumentScannerEvent.OnStepFail(documentScannerStepError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopVisionStep(rf rfVar) {
        rfVar.stop();
        this.f36521b.setAnalyzer(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchToManualMode() {
        rf currentStep = this.f36526l.getCurrentStep();
        if (((DocumentScannerStep) currentStep.getPublicStep()).getIndex() >= this.f36526l.getStepCount() || !((DocumentScannerStep) currentStep.getPublicStep()).isAutoDetectAvailable()) {
            return;
        }
        this.d.invoke(new DocumentScannerEvent.OnStepUpdate(DocumentScannerStep.copy$default((DocumentScannerStep) currentStep.getPublicStep(), 0, null, false, false, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void timeout() {
        fail$default(this, this.f36526l.getCurrentStep(), DocumentScannerError.TIMEOUT, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit videoRecorderManager$lambda$0(m5 m5Var) throws Throwable {
        skm.e0.E(kotlin.coroutines.g.f186406a, m5Var.new k(null));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit videoRecorderManager$lambda$1(m5 m5Var, me meVar) {
        Intrinsics.checkNotNullParameter(meVar, "<unused var>");
        fail$default(m5Var, m5Var.f36526l.getCurrentStep(), DocumentScannerError.RECORDING_FAILED, null, 4, null);
        return Unit.f186387a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f36520a.getF74819h();
    }

    @Override // com.fourthline.vision.internal.rd
    public fa getRecognizedBounds() {
        return this.f36527m.getRecognizedBounds();
    }

    @Override // com.fourthline.vision.internal.rd
    @NotNull
    public rd.a getState() {
        return this.o;
    }

    @Override // com.fourthline.vision.internal.rd
    public void moveToNextStep() {
        DocumentScannerStep documentScannerStep = (DocumentScannerStep) this.f36526l.getCurrentStep().getPublicStep();
        Objects.toString(getState());
        Objects.toString(documentScannerStep);
        rd.a state = getState();
        if (state instanceof rd.a.C0336a) {
            stepFail(DocumentScannerStepError.MOVE_TO_NEXT_STEP_NOT_ALLOWED);
            return;
        }
        if (state instanceof rd.a.d) {
            Objects.toString(documentScannerStep);
            this.k.onMoveToNextStep();
            proceedNextStep();
        } else if (!(state instanceof rd.a.b) && !(state instanceof rd.a.c)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.fourthline.vision.internal.rd
    public void resetCurrentStep() {
        rd.a state = getState();
        if ((state instanceof rd.a.C0336a) || (state instanceof rd.a.b) || (state instanceof rd.a.c)) {
            stepFail(DocumentScannerStepError.RESET_CURRENT_STEP_NOT_ALLOWED);
        } else {
            if (!(state instanceof rd.a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            rf currentStep = this.f36526l.getCurrentStep();
            this.k.onResetCurrentStep((DocumentScannerStep) currentStep.getPublicStep());
            this.f36527m.removeResult(currentStep);
            startVisionStep(currentStep);
        }
    }

    @Override // com.fourthline.vision.internal.rd
    public void restart() {
        this.k.onReset();
        setState(rd.a.d.f36820a);
        this.f36527m.clearResults();
        this.f36526l.resetAllSteps();
        start();
    }

    public void setState(@NotNull rd.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.o = aVar;
    }

    @Override // com.fourthline.vision.internal.rd
    public void start() {
        rd.a state = getState();
        if (!(state instanceof rd.a.d)) {
            if (!(state instanceof rd.a.C0336a) && !(state instanceof rd.a.b) && !(state instanceof rd.a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        this.k.onStart();
        this.f36525j.start();
        this.d.invoke(new DocumentScannerEvent.OnStepsCountUpdate(this.f36526l.getStepCount()));
        resetScannerTimeout();
        startVisionStep(this.f36526l.getCurrentStep());
    }

    @Override // com.fourthline.vision.internal.rd
    public void stop() {
        skm.e0.C(this, null, null, new i(null), 3);
        if (getState() instanceof rd.a.C0336a) {
            fail$default(this, this.f36526l.getCurrentStep(), DocumentScannerError.SCANNER_INTERRUPTED, null, 4, null);
        }
    }

    @Override // com.fourthline.vision.internal.rd
    public void takeSnapshot() {
        rf currentStep = this.f36526l.getCurrentStep();
        rd.a state = getState();
        if ((state instanceof rd.a.d) || (state instanceof rd.a.b) || (state instanceof rd.a.c)) {
            Objects.toString(getState());
        } else {
            if (!(state instanceof rd.a.C0336a)) {
                throw new NoWhenBranchMatchedException();
            }
            cancelTimeouts();
            setState(rd.a.d.f36820a);
            skm.e0.C(this, null, null, new j(currentStep, null), 3);
        }
    }
}
