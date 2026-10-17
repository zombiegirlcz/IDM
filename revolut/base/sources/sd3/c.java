package sd3;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import sd3.h;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackTransactionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CashbackTransactionsScreen cashbackTransactionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackTransactionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        uc3.d dVar;
        ActionsView.Item action = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar = (g) this.v.V.getValue();
        Intrinsics.h(action);
        l lVar = (l) gVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        j60.a aVar2 = lVar.f261822s;
        o oVar = lVar.f261821r;
        h hVar = ((f) lVar.t2()).f261813c;
        boolean z = hVar instanceof i;
        h.a aVar3 = h.a.f261814a;
        if (z) {
            dVar = ((i) hVar).f261815a;
        } else {
            if (!Intrinsics.f(hVar, aVar3)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = null;
        }
        ArrayList<uc3.d> availableSourceTypes = ((f) lVar.t2()).f261812b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(availableSourceTypes, "availableSourceTypes");
        SingleChoiceDelegate.Model model = new SingleChoiceDelegate.Model("ID_ALL_SOURCES", new TextLocalisedClause(R$string.cashback_transactions_filter_all_sources, null, null, 14), dVar == null, null, aVar3, YearClass.CLASS_2008);
        ArrayList arrayList = new ArrayList(w.t(availableSourceTypes, 10));
        for (uc3.d dVar2 : availableSourceTypes) {
            arrayList.add(new SingleChoiceDelegate.Model(dVar2.name(), z92.f.n(dVar2), dVar2 == dVar, null, new i(dVar2), YearClass.CLASS_2008));
        }
        List listQ = i2b.a.q(model, arrayList);
        yp0.b.k(listQ, 0, 0, 0, 0, 31);
        aVar2.x(new y(listQ, new t(new TextLocalisedClause(R$string.cashback_transactions_filter_source_filter, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
        return Unit.f186387a;
    }
}
