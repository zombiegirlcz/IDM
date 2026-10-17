package com.revolut.camerakit.revolut.ui.flow.steps.camera;

import cli.n;
import cli.y;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import jv.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import py.d;
import sek.q;
import sx.b;
import sy.g;
import sy.j;
import sy.k;
import sy.z;
import te0.w;
import ty.i;
import vkm.j2;
import yji.l;
import yy.c;
import zy.f;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends h implements k {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final uy.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dv.a f50803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xv.h f50804q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vy.a f50805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f50806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f50807t;
    public final dz.a u;
    public final ty.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f50808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f50809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f50810y;
    public final y z;

    public a(uy.a dialogsMapper, dv.a cameraKitClient, xv.h detector, vy.a inputData, d cameraKitFlowStateHandler, c analyticsExtension, dz.a errorDialogMapper, ty.h signLanguageHintBottomSheetMapper, i spokenDigitsHintBottomSheetMapper, f activeLivenessLanguagePickerInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(dialogsMapper, "dialogsMapper");
        Intrinsics.checkNotNullParameter(cameraKitClient, "cameraKitClient");
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cameraKitFlowStateHandler, "cameraKitFlowStateHandler");
        Intrinsics.checkNotNullParameter(analyticsExtension, "analyticsExtension");
        Intrinsics.checkNotNullParameter(errorDialogMapper, "errorDialogMapper");
        Intrinsics.checkNotNullParameter(signLanguageHintBottomSheetMapper, "signLanguageHintBottomSheetMapper");
        Intrinsics.checkNotNullParameter(spokenDigitsHintBottomSheetMapper, "spokenDigitsHintBottomSheetMapper");
        Intrinsics.checkNotNullParameter(activeLivenessLanguagePickerInteractor, "activeLivenessLanguagePickerInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = dialogsMapper;
        this.f50803p = cameraKitClient;
        this.f50804q = detector;
        this.f50805r = inputData;
        this.f50806s = cameraKitFlowStateHandler;
        this.f50807t = analyticsExtension;
        this.u = errorDialogMapper;
        this.v = signLanguageHintBottomSheetMapper;
        this.f50808w = spokenDigitsHintBottomSheetMapper;
        this.f50809x = activeLivenessLanguagePickerInteractor;
        this.f50810y = w.y0(new sii.a(this, 10));
        this.z = mra.d.b(this, new sy.c(false, null, false, gv.a.f147001a, null, inputData.d.e), stateMapper, null, false, 12);
        this.A = e.a(this, new suf.a(this, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.camerakit.revolut.ui.flow.steps.camera.a r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof sy.a0
            if (r0 == 0) goto L13
            r0 = r5
            sy.a0 r0 = (sy.a0) r0
            int r1 = r0.f266532w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266532w = r1
            goto L18
        L13:
            sy.a0 r0 = new sy.a0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266532w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            dv.a r5 = r4.f50803p
            r0.f266532w = r3
            jv.r r5 = (jv.r) r5
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cli.y r5 = r4.z
            sx2.g r0 = new sx2.g
            r1 = 23
            r0.<init>(r1)
            r4.H2(r5, r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.camerakit.revolut.ui.flow.steps.camera.a.I2(com.revolut.camerakit.revolut.ui.flow.steps.camera.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        vy.a aVar = this.f50805r;
        if (aVar.d.e) {
            h.v2(this.A, CameraKitCameraScreenContract$ModalStep.SignLanguageHintBottomSheet.f50801a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        ((b) this.f50807t.f317737n).f(aVar.f293110g);
        Continuation continuation = null;
        l.a1(this, this.f50804q.a(), null, null, new q(this, continuation, 29), 3);
        l.a1(this, new vkm.y(new g2d.c(2, 20, continuation), ((r) this.f50803p).f178729s), null, null, new sy.y(this, null), 3);
        l.a1(this, vkm.q.g(this.f50806s.f240639a), null, null, new sx2.r(this, continuation, 1), 3);
    }

    public final void J2(j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof sy.f;
        y yVar = this.z;
        if (z) {
            sy.e eVar = (sy.e) ((j2) yVar.f22677a).getValue();
            if (eVar instanceof sy.c) {
                H2(yVar, new sy.w((sy.c) eVar, 0));
                return;
            } else {
                if (!(eVar instanceof sy.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        boolean z3 = event instanceof g;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.A;
        if (z3) {
            h.v2(aVar, !this.f50805r.d.f ? CameraKitCameraScreenContract$ModalStep.FrequentlyAskedQuestions.f50799a : ((sy.e) ((j2) yVar.f22677a).getValue()).d() ? CameraKitCameraScreenContract$ModalStep.SignLanguageHintBottomSheet.f50801a : CameraKitCameraScreenContract$ModalStep.SpokenDigitsHintBottomSheet.f50802a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (event instanceof sy.h) {
            h.v2(aVar, CameraKitCameraScreenContract$ModalStep.LanguageSelector.f50800a, ModalDestination.Style.POPUP.f98311a);
            return;
        }
        if (!(event instanceof sy.i)) {
            throw new NoWhenBranchMatchedException();
        }
        sy.e eVar2 = (sy.e) ((j2) yVar.f22677a).getValue();
        if (!(eVar2 instanceof sy.c)) {
            if (!(eVar2 instanceof sy.d)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        gv.d dVar = ((sy.c) eVar2).d;
        if (dVar instanceof gv.a) {
            return;
        }
        Continuation continuation = null;
        if (dVar instanceof gv.c) {
            n2(new z(this, continuation, 0), new whi.b(6));
        } else {
            if (!(dVar instanceof gv.b)) {
                throw new NoWhenBranchMatchedException();
            }
            n2(new z(this, continuation, 1), new whi.b(6));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
