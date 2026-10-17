package com.revolut.feature.tax_residency.impl.ui.sole;

import cli.g;
import cli.y;
import com.revolut.feature.tax_residency.impl.ui.sole.TaxResidencySoleScreenModel$ModalStep;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import fpe.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements fpe.h {
    public final tme.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f90150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f90151q;

    public b(TaxResidencySoleScreenContract$InputData inputData, k stateMapper, tme.b dialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = dialogProvider;
        this.f90150p = d.b(this, new fpe.d(inputData.f90147a), stateMapper, null, false, 12);
        this.f90151q = new com.revolut.kompot.navigable.vc.modal.a(this, new Function2() { // from class: com.revolut.feature.tax_residency.impl.ui.sole.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TaxResidencySoleScreenModel$ModalStep step = (TaxResidencySoleScreenModel$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, TaxResidencySoleScreenModel$ModalStep.WhatIsTaxResidency.f90148a)) {
                    throw new NoWhenBranchMatchedException();
                }
                b bVar = this.f90149a;
                tme.b bVar2 = bVar.o;
                wi0.b bVar3 = ((fpe.d) ((j2) bVar.f90150p.f22677a).getValue()).f137091a;
                tme.a aVar = tme.b.Companion;
                return new ActionsBottomSheetController(((dpe.a) bVar2).a(bVar3, null));
            }
        });
    }

    @Override // cli.z
    public final g getState() {
        return this.f90150p;
    }
}
