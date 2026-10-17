package koe;

import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreen;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TaxResidencyListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TaxResidencyListScreen taxResidencyListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = taxResidencyListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TaxResidencyListScreen taxResidencyListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.tax_residency.impl.screens.list.a) taxResidencyListScreen.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tax_residency.impl.screens.list.a aVar3 = (com.revolut.feature.tax_residency.impl.screens.list.a) taxResidencyListScreen.R2();
                oki.h.v2(aVar3.f90098x, new TaxResidencyListScreenContract$ModalStep.WhatIsTaxResidency((wi0.b) zi0.c.I(((h) ((j2) aVar3.f90097w.f22677a).getValue()).f186314a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tax_residency.impl.screens.list.a aVar5 = (com.revolut.feature.tax_residency.impl.screens.list.a) taxResidencyListScreen.R2();
                aVar5.C2(new k((List) zi0.c.I(((h) ((j2) aVar5.f90097w.f22677a).getValue()).f186315b)));
                break;
        }
        return Unit.f186387a;
    }
}
