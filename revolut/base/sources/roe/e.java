package roe;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.tax_residency.impl.screens.tin.TaxNumberInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxNumberInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TaxNumberInputScreen taxNumberInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxNumberInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarI3 = this.v.T2();
        String listId = model.f52613a;
        com.revolut.feature.tax_residency.impl.screens.tin.c cVar = (com.revolut.feature.tax_residency.impl.screens.tin.c) kVarI3;
        cVar.getClass();
        j60.a aVar2 = cVar.f90138t;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "SKIP_TIN_LARGE_BUTTON_PRIMARY")) {
            j60.a.v(aVar2, false, null, 3);
            cVar.v2(i.f255984a);
        } else if (Intrinsics.f(listId, "SKIP_TIN_LARGE_BUTTON_SECONDARY")) {
            j60.a.v(aVar2, false, null, 3);
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
