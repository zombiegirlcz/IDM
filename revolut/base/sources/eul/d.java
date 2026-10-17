package eul;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_add_to_googlepay.impl.AddCardToGooglePayActivity;
import com.revolut.feature.credit.card.impl.ui.statement.CreditCardStatementScreen;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreenContract$CancellationModel;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import ip0.s7;
import java.time.LocalDate;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ll4.c0;
import mx0.f3;
import mx0.h3;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129633a;

    public /* synthetic */ d(int i) {
        this.f129633a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CreditCardStatementFinancingDetailsScreenContract$CancellationModel creditCardStatementFinancingDetailsScreenContract$CancellationModel = null;
        switch (this.f129633a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return null;
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                bw0.m.Companion.getClass();
                return bw0.k.a();
            case 2:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new f3(null, null, null, false, h3.LOADING, false);
            case 3:
                Amount it11 = (Amount) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new MoneyClause.Format.Defaults(null, null, true, false, 11);
            case 4:
                Amount it12 = (Amount) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new MoneyClause.Format.Defaults(null, null, true, false, 11);
            case 5:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return h3.ACTIVE;
            case 6:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return null;
            case 7:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.FALSE;
            case 8:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return null;
            case 9:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return null;
            case 10:
                ((Throwable) obj2).getMessage();
                return Unit.f186387a;
            case 11:
                g6 it18 = (g6) obj2;
                KProperty[] kPropertyArr = CreditCardStatementScreen.j0;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f54199a;
            case 12:
                ev4.g updateState = (ev4.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ev4.g.a(updateState, cl4.p.PRINTABLE, null, 2);
            case 13:
                ev4.g updateState2 = (ev4.g) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return ev4.g.a(updateState2, cl4.p.SPREADSHEET, null, 2);
            case 14:
                List statements = (List) obj2;
                Intrinsics.checkNotNullParameter(statements, "statements");
                return (statements.size() <= 1 || !((c0) d0.b0(statements)).f196508a.isAfter(((c0) d0.m0(statements)).f196508a)) ? statements : d0.I0(statements);
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new ev4.k(ev4.r.b(), (List) getDefaultLoadingItems.invoke(), null, new ev4.i(null, false, false));
            case 16:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return do3.q.y(user);
            case 17:
                Function0 defaultItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return new ev7.g((List) defaultItems.invoke());
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                qv0.k kVar = qv0.k.Middle;
                return zhm.v.k(new s7("ID_LOADING_ITEM_1", 0, 0, 0, 0, false, kVar, 62), new s7("ID_LOADING_ITEM_2", 0, 0, 0, 0, false, kVar, 62), new s7("ID_LOADING_ITEM_3", 0, 0, 0, 0, false, kVar, 62));
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new lw0.a(new TextLocalisedClause(R$string.asft_time_slot_header_title, null, null, 14), null, null, null, false, 30);
            case 20:
                PromptMarketingContentDelegate.Model it19 = (PromptMarketingContentDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = AddCardToGooglePayActivity.f64445v0;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Unit.f186387a;
            case 21:
                PromptMarketingContentDelegate.Model it20 = (PromptMarketingContentDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = AddCardToGooglePayActivity.f64445v0;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Unit.f186387a;
            case 22:
                PromptMarketingContentDelegate.Model it21 = (PromptMarketingContentDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = AddCardToGooglePayActivity.f64445v0;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.f53082a;
            case 23:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                wi0.b bVar = (wi0.b) pair.f186385a;
                List list = ((e7l.f) pair.f186386b).K0;
                return Boolean.valueOf(list != null ? list.contains(bVar) : false);
            case 24:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                ql4.d0 d0Var = (ql4.d0) rVar.f314201a;
                ll4.u uVar = (ll4.u) rVar.f314202b;
                wi0.b bVar2 = (wi0.b) rVar.f314203c;
                if (d0Var.f247102b == ql4.t.ACTIVE && d0Var.f247111q) {
                    dj0.d dVarO = pyd.c.O(pyd.c.H(d0Var.f247106j, d0Var.f247105h), d0Var.i);
                    dj0.d dVar = d0Var.i;
                    dj0.d dVar2 = d0Var.f247105h;
                    LocalDate localDate = oi0.d.d0(uVar.k).toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                    LocalDate localDate2 = oi0.d.d0(uVar.f196538g).toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
                    creditCardStatementFinancingDetailsScreenContract$CancellationModel = new CreditCardStatementFinancingDetailsScreenContract$CancellationModel(dVarO, dVar, dVar2, d0Var.f, localDate, localDate2, bVar2);
                }
                return new ew4.g(d0Var, creditCardStatementFinancingDetailsScreenContract$CancellationModel);
            case 25:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 26:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems3.invoke();
            case 27:
                m1c.x revPointsAccount = (m1c.x) obj2;
                Intrinsics.checkNotNullParameter(revPointsAccount, "revPointsAccount");
                return new ewh.l(revPointsAccount);
            case 28:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new ewh.m((RoboPortfolioInfo) pair2.f186385a, (del.b) pair2.f186386b);
            default:
                hel.a it22 = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.e;
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f129633a = i;
    }
}
