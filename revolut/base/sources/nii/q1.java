package nii;

import com.revolut.core.ui_kit.utils.ParcelableViewTarget;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.status.StatusSheetController;
import ix0.b2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class q1 extends tji.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aii.o f216208c;
    public StatusSheetController d;
    public StatusSheetController e;

    public q1(aii.o eventDispatcher) {
        Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
        this.f216208c = eventDispatcher;
    }

    @Override // tji.i
    public final boolean a(tji.l dialogModel) {
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        return dialogModel instanceof y0;
    }

    @Override // tji.i
    public final void b() {
        this.e = null;
        StatusSheetController statusSheetController = this.d;
        if (statusSheetController == null) {
            return;
        }
        this.d = null;
        this.f216208c.M0(new aii.c(statusSheetController));
        dii.m mVar = statusSheetController.O;
        mVar.C2(new fii.b(null, new k1(hb9.b.l(((fii.a) ((j2) mVar.f115073p.f22677a).getValue()).f135423a))));
    }

    @Override // tji.i
    public final void e() {
        super.e();
        b();
    }

    @Override // tji.i
    public final void i(tji.l lVar) {
        y0 dialogModel = (y0) lVar;
        Intrinsics.checkNotNullParameter(dialogModel, "dialogModel");
        m0 m0Var = dialogModel.f216244b;
        if (!m0Var.f()) {
            b();
        }
        StatusSheetController statusSheetController = this.d;
        fii.g newInputData = new fii.g(m0Var);
        if (statusSheetController != null) {
            Intrinsics.checkNotNullParameter(newInputData, "inputData");
            dii.m mVar = statusSheetController.O;
            mVar.getClass();
            Intrinsics.checkNotNullParameter(newInputData, "newInputData");
            cli.y yVar = mVar.f115073p;
            mVar.H2(yVar, new fca.d(newInputData, 23));
            fii.g gVar = ((fii.a) ((j2) yVar.f22677a).getValue()).f135423a;
            return;
        }
        StatusSheetController statusSheetController2 = new StatusSheetController(newInputData);
        nc1.j block = new nc1.j(statusSheetController2, this, 11);
        Intrinsics.checkNotNullParameter(block, "block");
        statusSheetController2.H = block;
        this.e = null;
        this.d = statusSheetController2;
        statusSheetController2.l2(new ni1.a(this, statusSheetController2, 3));
        boolean z = m0Var instanceof v;
        ModalDestination.Style contextualAlert = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (z) {
            b2 b2Var = ((v) m0Var).f;
            if (b2Var instanceof ParcelableViewTarget) {
                contextualAlert = new ModalDestination.Style.ContextualAlert((ParcelableViewTarget) b2Var);
            }
        } else if (!(m0Var instanceof t) && !(m0Var instanceof z) && !(m0Var instanceof e0) && !(m0Var instanceof g0) && !(m0Var instanceof j0) && !(m0Var instanceof l0) && !(m0Var instanceof b0) && !(m0Var instanceof c0)) {
            throw new NoWhenBranchMatchedException();
        }
        knm.b.j(this.f216208c, new com.revolut.kompot.common.b(statusSheetController2, contextualAlert, dialogModel.f216245c));
    }
}
