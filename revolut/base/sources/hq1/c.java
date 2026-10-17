package hq1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AllFormsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AllFormsScreen allFormsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = allFormsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.P.getValue();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.apm.bills.core.api.model.Bill");
        Bill bill = (Bill) obj3;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(bill, "bill");
        ((jq1.e) gVar.f154587p).Z2(bill, new f(gVar, 0));
        return Unit.f186387a;
    }
}
