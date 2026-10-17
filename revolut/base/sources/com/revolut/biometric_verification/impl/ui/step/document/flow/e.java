package com.revolut.biometric_verification.impl.ui.step.document.flow;

import a83.c0;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentPage;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import hcj.o;
import ht.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.z1;
import zhm.d0;
import zhm.f0;
import zr.l;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends h implements ht.b {

    @NotNull
    public static final g Companion = new g();
    public final kt.c A;
    public final qki.d B;
    public final z1 C;
    public final Object D;
    public final yki.a E;
    public final tt.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f61.a f50587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f50588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zr.e f50589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final py.d f50590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f50591t;
    public final BiometricVerificationDocumentStepFlowContract$InputData u;
    public final sr.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final tt.b f50592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x7a.d f50593x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kt.g f50594y;
    public final kt.b z;

    public e(tt.c biometricVerificationDocumentStepDialogMapper, f61.a biometricVerificationDocumentStepResultMapper, l biometricVerificationMediaManager, zr.e flowStateHandler, py.d cameraKitFlowStateHandler, a documentFlowStepProvider, BiometricVerificationDocumentStepFlowContract$InputData inputData, sr.a visionResourcesInteractor, tt.b cameraInputDataProvider, x7a.d pickerControllerInteractor, kt.g nfcStepCreator, kt.b manualDocumentSelectionStepCreator, kt.c manualSelectionCameraStepBuilder) {
        Intrinsics.checkNotNullParameter(biometricVerificationDocumentStepDialogMapper, "biometricVerificationDocumentStepDialogMapper");
        Intrinsics.checkNotNullParameter(biometricVerificationDocumentStepResultMapper, "biometricVerificationDocumentStepResultMapper");
        Intrinsics.checkNotNullParameter(biometricVerificationMediaManager, "biometricVerificationMediaManager");
        Intrinsics.checkNotNullParameter(flowStateHandler, "flowStateHandler");
        Intrinsics.checkNotNullParameter(cameraKitFlowStateHandler, "cameraKitFlowStateHandler");
        Intrinsics.checkNotNullParameter(documentFlowStepProvider, "documentFlowStepProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(visionResourcesInteractor, "visionResourcesInteractor");
        Intrinsics.checkNotNullParameter(cameraInputDataProvider, "cameraInputDataProvider");
        Intrinsics.checkNotNullParameter(pickerControllerInteractor, "pickerControllerInteractor");
        Intrinsics.checkNotNullParameter(nfcStepCreator, "nfcStepCreator");
        Intrinsics.checkNotNullParameter(manualDocumentSelectionStepCreator, "manualDocumentSelectionStepCreator");
        Intrinsics.checkNotNullParameter(manualSelectionCameraStepBuilder, "manualSelectionCameraStepBuilder");
        this.o = biometricVerificationDocumentStepDialogMapper;
        this.f50587p = biometricVerificationDocumentStepResultMapper;
        this.f50588q = biometricVerificationMediaManager;
        this.f50589r = flowStateHandler;
        this.f50590s = cameraKitFlowStateHandler;
        this.f50591t = documentFlowStepProvider;
        this.u = inputData;
        this.v = visionResourcesInteractor;
        this.f50592w = cameraInputDataProvider;
        this.f50593x = pickerControllerInteractor;
        this.f50594y = nfcStepCreator;
        this.z = manualDocumentSelectionStepCreator;
        this.A = manualSelectionCameraStepBuilder;
        f0 f0Var = f0.f322471a;
        this.B = hx7.e.b(this, new BiometricVerificationDocumentStepFlowContract$State(f0Var));
        this.C = q.b(0, 2, f.DROP_OLDEST);
        Lazy lazyY0 = w.y0(new hq1.f(this, 5));
        this.D = lazyY0;
        this.E = cp5.d.a(this, (BiometricVerificationDocumentStepFlowContract$Step) lazyY0.getValue(), f0Var, new hfb.d(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, q.g(this.f50589r.f324506a), null, null, new c(this, null), 3);
    }

    public final void I2(String str) {
        qki.d dVar = this.B;
        ArrayList arrayListF1 = d0.f1(((BiometricVerificationDocumentStepFlowContract$State) ((j2) dVar.f22677a).getValue()).f50548a);
        if (!arrayListF1.contains(str)) {
            arrayListF1.add(str);
        }
        H2(dVar, new c0(25, arrayListF1));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J2(com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step.Camera r19, com.revolut.camerakit.validators.mrz.MrzDocument$Standard r20) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.ui.step.document.flow.e.J2(com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step$Camera, com.revolut.camerakit.validators.mrz.MrzDocument$Standard):void");
    }

    public final void K2(BiometricVerificationDocument biometricVerificationDocument, List list) {
        if (list.isEmpty()) {
            C2(new nq.d0(biometricVerificationDocument, ((BiometricVerificationDocumentStepFlowContract$State) ((j2) this.B.f22677a).getValue()).f50548a));
            return;
        }
        ArrayList arrayListF1 = d0.f1(list);
        BiometricVerificationDocumentStepFlowContract$Step.Camera camera = new BiometricVerificationDocumentStepFlowContract$Step.Camera(biometricVerificationDocument, (BiometricVerificationDocumentPage) arrayListF1.remove(0), arrayListF1, true);
        h.t2(this, this.E, camera, !(r1.d() instanceof BiometricVerificationDocumentStepFlowContract$Step.Camera), null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L2(com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step.Camera r26) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.biometric_verification.impl.ui.step.document.flow.e.L2(com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step$Camera):void");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.C, new o(continuation, this, 11)), null, new hp2.d(this, continuation, 6), 3);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.B;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.E;
    }
}
