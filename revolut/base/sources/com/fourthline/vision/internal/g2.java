package com.fourthline.vision.internal;

import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator;
import com.fourthline.vision.internal.da;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class g2 implements tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentScannerConfig f36224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u f36225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7 f36226c;
    private final Function0 d;
    private final Function0 e;
    private final TimestampProvider f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LocationProvider f36227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q5 f36228h;
    private final v2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CoroutineScope f36229j;
    private final VisionDynamicStepsEvaluator k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final da.a f36230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f36231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36232n;
    private final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private rf f36233p;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g2(@org.jetbrains.annotations.NotNull com.fourthline.vision.document.DocumentScannerConfig r2, @org.jetbrains.annotations.NotNull com.fourthline.vision.internal.u r3, @org.jetbrains.annotations.NotNull com.fourthline.vision.internal.u7 r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<com.fourthline.vision.internal.od> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Rect> r6, @org.jetbrains.annotations.NotNull com.fourthline.core.internal.TimestampProvider r7, @org.jetbrains.annotations.NotNull com.fourthline.core.location.LocationProvider r8, @org.jetbrains.annotations.NotNull com.fourthline.vision.internal.q5 r9, @org.jetbrains.annotations.NotNull com.fourthline.vision.internal.v2 r10, @org.jetbrains.annotations.NotNull kotlinx.coroutines.CoroutineScope r11, com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator<com.fourthline.vision.document.DocumentScannerStep> r12) {
        /*
            r1 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "cameraEngine"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "isSteadyProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "screenSizeProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "detectionAreaProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "timestampProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "locationProvider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "stepFlowRepository"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "documentAnalyzer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "coroutineScope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r1.<init>()
            r1.f36224a = r2
            r1.f36225b = r3
            r1.f36226c = r4
            r1.d = r5
            r1.e = r6
            r1.f = r7
            r1.f36227g = r8
            r1.f36228h = r9
            r1.i = r10
            r1.f36229j = r11
            r1.k = r12
            com.fourthline.vision.internal.da r3 = com.fourthline.vision.internal.da.f36106a
            com.fourthline.core.DocumentType r4 = r2.getType()
            boolean r5 = r2.getIncludeAngledSteps()
            com.fourthline.core.VideoDuration r6 = r2.getVideoDuration()
            long r6 = r6.getDuration()
            if (r12 == 0) goto L67
            boolean r8 = r12.isDynamicStepsEnabled()
            r9 = 1
            if (r8 != r9) goto L67
            goto L68
        L67:
            r9 = 0
        L68:
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            com.fourthline.vision.internal.da$a r3 = r3.getRecordingPlan(r4, r5, r9, r6)
            r1.f36230l = r3
            com.fourthline.core.DocumentType r3 = r2.getType()
            boolean r2 = r2.getIncludeAngledSteps()
            java.util.List r2 = com.fourthline.vision.internal.u5.documentSteps(r3, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L8d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r2.next()
            com.fourthline.vision.document.DocumentScannerStep r4 = (com.fourthline.vision.document.DocumentScannerStep) r4
            com.fourthline.vision.internal.f5 r4 = r1.toDocumentVisionStep(r4)
            r3.add(r4)
            goto L8d
        La1:
            r1.f36231m = r3
            int r2 = r3.size()
            r1.o = r2
            int r2 = r1.f36232n
            java.lang.Object r2 = r3.get(r2)
            com.fourthline.vision.internal.rf r2 = (com.fourthline.vision.internal.rf) r2
            r1.f36233p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.g2.<init>(com.fourthline.vision.document.DocumentScannerConfig, com.fourthline.vision.internal.u, com.fourthline.vision.internal.u7, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.fourthline.core.internal.TimestampProvider, com.fourthline.core.location.LocationProvider, com.fourthline.vision.internal.q5, com.fourthline.vision.internal.v2, kotlinx.coroutines.CoroutineScope, com.fourthline.vision.document.internal.domain.step.VisionDynamicStepsEvaluator):void");
    }

    private final f5 toDocumentVisionStep(DocumentScannerStep documentScannerStep) {
        return new f5(documentScannerStep, this.f36224a, this.f36230l, this.f36225b, this.f36226c, this.d, this.e, this.f, this.f36227g, this.i, this.f36228h, this.f36229j);
    }

    @Override // com.fourthline.vision.internal.tf
    @NotNull
    public rf getCurrentStep() {
        return this.f36233p;
    }

    @Override // com.fourthline.vision.internal.tf
    public int getStepCount() {
        return this.o;
    }

    @Override // com.fourthline.vision.internal.tf
    public boolean hasNext() {
        VisionDynamicStepsEvaluator visionDynamicStepsEvaluator = this.k;
        return (visionDynamicStepsEvaluator == null || !visionDynamicStepsEvaluator.isScannerCompleted(getCurrentStep().getPublicStep())) && this.f36232n + 1 < this.f36231m.size();
    }

    @Override // com.fourthline.vision.internal.tf
    @NotNull
    public rf next() {
        if (!hasNext()) {
            throw new IllegalStateException("VisionStepManager.next() requested when there is no next item.");
        }
        int i = this.f36232n + 1;
        this.f36232n = i;
        Object obj2 = this.f36231m.get(i);
        this.f36233p = (f5) obj2;
        return (rf) obj2;
    }

    @Override // com.fourthline.vision.internal.tf
    public void resetAllSteps() {
        this.f36232n = 0;
        this.f36233p = (rf) this.f36231m.get(0);
    }

    @Override // com.fourthline.vision.internal.tf
    public void resetStep() {
        this.f36228h.removeResult(getCurrentStep());
        getCurrentStep().stop();
        getCurrentStep().start();
    }

    public /* synthetic */ g2(DocumentScannerConfig documentScannerConfig, u uVar, u7 u7Var, Function0 function0, Function0 function02, TimestampProvider timestampProvider, LocationProvider locationProvider, q5 q5Var, v2 v2Var, CoroutineScope coroutineScope, VisionDynamicStepsEvaluator visionDynamicStepsEvaluator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentScannerConfig, uVar, u7Var, function0, function02, timestampProvider, locationProvider, q5Var, v2Var, coroutineScope, (i & 1024) != 0 ? null : visionDynamicStepsEvaluator);
    }
}
