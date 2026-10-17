package koe;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.tax_residency.impl.screens.list.TaxResidencyListScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxResidencyListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TaxResidencyListScreen taxResidencyListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxResidencyListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.tax_residency.impl.screens.list.a aVar2 = (com.revolut.feature.tax_residency.impl.screens.list.a) nVarR2;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.C2(new i((List) zi0.c.I(((h) ((j2) aVar2.f90097w.f22677a).getValue()).f186315b)));
        return Unit.f186387a;
    }
}
