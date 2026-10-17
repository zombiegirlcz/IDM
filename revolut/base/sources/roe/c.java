package roe;

import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$DomainDataItem;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TaxNumberInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TaxNumberInputScreen taxNumberInputScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = taxNumberInputScreen;
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
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TaxNumberInputScreen taxNumberInputScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.tax_residency.impl.screens.tin.c) taxNumberInputScreen.i3()).u2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tax_residency.impl.screens.tin.c cVar = (com.revolut.feature.tax_residency.impl.screens.tin.c) taxNumberInputScreen.i3();
                TaxNumberInputScreenContract$InputData taxNumberInputScreenContract$InputData = cVar.f90134p;
                wi0.b bVar = taxNumberInputScreenContract$InputData.f90123b.f323500a;
                String str = ((com.revolut.feature.tax_residency.impl.screens.tin.a) cVar.t2()).f90129b.f90117b;
                String str2 = taxNumberInputScreenContract$InputData.f90123b.a().f;
                TaxNumberInputScreenContract$DomainDataItem.Postcode postcode = ((com.revolut.feature.tax_residency.impl.screens.tin.a) cVar.t2()).f90130c;
                String str3 = postcode != null ? postcode.f90110a : null;
                TaxNumberInputScreenContract$DomainDataItem.TaxRegime taxRegime = ((com.revolut.feature.tax_residency.impl.screens.tin.a) cVar.t2()).d;
                cVar.v2(new h(new zme.f(bVar, str, str2, false, str3, taxRegime != null ? taxRegime.f90114b : null, 8)));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.tax_residency.impl.screens.tin.c) taxNumberInputScreen.i3()).A2();
                break;
        }
        return Unit.f186387a;
    }
}
