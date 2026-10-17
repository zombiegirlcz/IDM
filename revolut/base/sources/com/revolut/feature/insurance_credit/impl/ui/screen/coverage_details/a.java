package com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import com.revolut.feature.insurance_credit.impl.data.model.BottomSheet;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_details.CoverageDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ft7.b;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import qc0.e1;
import qt7.f;
import wli.x;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements f {
    public final CoverageDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f75829p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f75830q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f75831r;

    public a(n stateMapper, CoverageDetailsScreenContract$InputData inputData, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f75829p = deeplinkHandler;
        this.f75830q = d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f75831r = e.a(this, new qsk.d(1));
    }

    public final void I2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj2 instanceof BottomSheet) {
            h.v2(this.f75831r, new CoverageDetailsScreenContract$ModalStep.CoverageDetails((BottomSheet) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj2 instanceof b) {
            n2(new e1(this, ((b) obj2).f137959b, null, 24), new whi.b(6));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f75831r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f75830q;
    }
}
