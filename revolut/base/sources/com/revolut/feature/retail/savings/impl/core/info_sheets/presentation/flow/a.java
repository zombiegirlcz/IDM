package com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow;

import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.InfoSheetFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import d8l.d;
import ghl.c;
import glb.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final InfoSheetFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ccd.a f83216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f83217q;

    public a(InfoSheetFlowContract$InputData inputData, ccd.a infoSheetsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(infoSheetsInteractor, "infoSheetsInteractor");
        this.o = inputData;
        this.f83216p = infoSheetsInteractor;
        this.f83217q = d.a(this, new c(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f83213b) {
            n2(new glb.c(this, null), new whi.b(6));
        }
    }

    @Override // yki.j
    public final void M0() {
        FlowStep flowStep = Intrinsics.f(d0.z0(this.o.f83212a.f86508a, ":", "modal"), "bottom_sheet") ? InfoSheetFlowContract$Step.BottomSheet.f83214a : InfoSheetFlowContract$Step.ModalSheet.f83215a;
        boolean z = flowStep instanceof InfoSheetFlowContract$Step.BottomSheet;
        i iVar = this.f83217q;
        if (z) {
            h.w2(iVar, flowStep, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            if (!(flowStep instanceof InfoSheetFlowContract$Step.ModalSheet)) {
                throw new NoWhenBranchMatchedException();
            }
            h.w2(iVar, flowStep, ModalDestination.Style.POPUP.f98311a);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83217q;
    }
}
