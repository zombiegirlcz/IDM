package gq1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormsListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FormsListScreen formsListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.Q.getValue();
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.apm.bills.core.api.model.Bill");
        Bill bill = (Bill) obj3;
        l lVar = (l) iVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(bill, "bill");
        ((jq1.e) lVar.f145515p).Z2(bill, new k(lVar, 0));
        return Unit.f186387a;
    }
}
