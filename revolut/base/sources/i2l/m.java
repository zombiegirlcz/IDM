package i2l;

import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.retail.feature.travel_status.impl.R$string;
import com.revolut.retail.feature.travel_status.impl.ui.screens.partner.TravelStatusPartnerScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import tof.a3;
import tof.ca;
import tof.q6;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelStatusPartnerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(TravelStatusPartnerScreen travelStatusPartnerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelStatusPartnerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a2l.y yVar;
        TextLocalisedClause textLocalisedClause;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        y yVarE3 = this.v.R2();
        String listId = model.f52613a;
        Object obj3 = model.i;
        m0 m0Var = (m0) yVarE3;
        cli.y yVar2 = m0Var.f158032y;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "travel_status_partner_rewards_external_link")) {
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str != null) {
                m0Var.J2(str);
            }
        } else if (Intrinsics.f(listId, "travel_status_partner_transactions_see_all") && (yVar = (a2l.y) ((q) ((j2) yVar2.f22677a).getValue()).f158038a.getContent()) != null) {
            z1l.e eVar = m0Var.f158027r;
            a2l.b bVar = yVar.f935a;
            String partnerName = bVar.f894b;
            String partnerIconUrl = bVar.d;
            List transactions = (List) ((q) ((j2) yVar2.f22677a).getValue()).f158039b.getContent();
            if (transactions == null) {
                transactions = zhm.f0.f322471a;
            }
            eVar.getClass();
            Intrinsics.checkNotNullParameter(partnerName, "partnerName");
            Intrinsics.checkNotNullParameter(partnerIconUrl, "partnerIconUrl");
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            TextClause textClause = new TextClause(partnerName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            if (transactions.isEmpty()) {
                textLocalisedClause = null;
            } else {
                xi0.b bVar2 = ((a3) zhm.d0.b0(transactions)).N1.f115083b;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : transactions) {
                    if (Intrinsics.f(((a3) obj4).N1.f115083b, bVar2)) {
                        arrayList.add(obj4);
                    }
                }
                Iterator it8 = arrayList.iterator();
                long j2 = 0;
                while (it8.hasNext()) {
                    j2 += ((a3) it8.next()).N1.f115082a;
                }
                textLocalisedClause = new TextLocalisedClause(R$string.travel_status_transaction_list_header_subtitle, zhm.u.c(new MoneyClause(new dj0.d(j2, bVar2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            }
            UrlImage urlImage = new UrlImage(partnerIconUrl, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
            List list = transactions;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((a3) it9.next()).f272579a);
            }
            m0Var.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) textClause, textLocalisedClause, urlImage, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new ca(zhm.d0.i1(arrayList2)), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65504)));
        }
        return Unit.f186387a;
    }
}
