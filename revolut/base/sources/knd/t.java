package knd;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.database.models.transactioncategory.mapper.CustomTransactionCategoryMapperKt;
import com.revolut.data.network.models.budgeting.CustomCategoryDto;
import com.revolut.data.network.services.TransactionCategoriesService;
import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f186132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f186133c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f186131a = i;
        this.f186132b = obj2;
        this.f186133c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj0.d totalBalance;
        dj0.d dVar;
        dj0.d dVar2;
        List listC;
        switch (this.f186131a) {
            case 0:
                AnalyticsSpendingPeriod$Interval interval = (AnalyticsSpendingPeriod$Interval) obj2;
                Intrinsics.checkNotNullParameter(interval, "interval");
                return v.a((v) this.d, (m) this.e, (i) this.f, ((p) this.f186132b).b(), interval, (l) ((Map) this.f186133c).get(interval));
            case 1:
                String str = ((WalletId) obj2).f66106a;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-nonNullWalletId$0");
                le3.b0 b0Var = (le3.b0) this.f186132b;
                g31.h hVar = b0Var.d;
                String id10 = (String) this.f186133c;
                String name = (String) this.d;
                CategoryImage icon = (CategoryImage) this.e;
                CategoryColor color = (CategoryColor) this.f;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(color, "color");
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                TransactionCategoriesService transactionCategoriesService = hVar.f140179a;
                String strH = u1.h(icon, CustomTransactionCategoryMapperKt.getTransactionCategoryImageMapper());
                if (strH == null) {
                    strH = "";
                }
                String strH2 = u1.h(color, CustomTransactionCategoryMapperKt.getTransactionCategoryColorMapper());
                pfm.a aVarE = transactionCategoriesService.updateCategory(id10, new CustomCategoryDto(id10, name, strH, strH2 != null ? strH2 : ""), str).e(new pfm.n(new g31.d(hVar, color, icon, str, id10, name), 1));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                pfm.r rVarG0 = te0.w.g0(aVarE);
                String id11 = (String) this.f186133c;
                g31.h hVar2 = b0Var.d;
                Intrinsics.checkNotNullParameter(id11, "id");
                ufm.i iVar = new ufm.i(te0.w.i0(hVar2.f140180b.getById(id11)), new g1i.i0(8, new g1k.k(25)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return rVarG0.f(iVar);
            default:
                List exchangeRates = (List) obj2;
                xi0.b bVar = (xi0.b) this.f186133c;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                List creditCards = (List) this.f186132b;
                osd.b bVar2 = null;
                if (creditCards.isEmpty()) {
                    totalBalance = new dj0.d(0L, bVar);
                } else {
                    dj0.d.Companion.getClass();
                    dj0.d dVarO = dj0.d.e;
                    int i = 0;
                    for (Object obj3 : creditCards) {
                        int i2 = i + 1;
                        if (i < 0) {
                            zhm.v.s();
                            throw null;
                        }
                        if (i == 0) {
                            CreditCard creditCard = (CreditCard) obj3;
                            int i3 = osd.d.f229316a[creditCard.u.ordinal()];
                            if (i3 == 1) {
                                dVar2 = new dj0.d(0L, bVar);
                            } else {
                                if (i3 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar2 = creditCard.f69794c;
                            }
                            dVarO = uc0.b.j(dVar2, exchangeRates, bVar);
                        } else {
                            CreditCard creditCard2 = (CreditCard) obj3;
                            int i5 = osd.d.f229316a[creditCard2.u.ordinal()];
                            if (i5 == 1) {
                                dVar = new dj0.d(0L, bVar);
                            } else {
                                if (i5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                dVar = creditCard2.f69794c;
                            }
                            dVarO = pyd.c.O(dVarO, uc0.b.j(dVar, exchangeRates, bVar));
                        }
                        i = i2;
                    }
                    totalBalance = pyd.c.i0(dVarO);
                }
                em4.a aVar = (em4.a) zhm.d0.d0((List) this.d);
                amd.b bVar3 = amd.b.CREDIT_CARDS;
                osd.a aVar2 = ((osd.e) this.e).e;
                wi0.b countryCode = ((cl4.a) this.f).f24930c;
                Intrinsics.checkNotNullParameter(creditCards, "creditCards");
                Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                amd.e eVar = amd.e.CREDIT_CARDS;
                List list = creditCards;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    CreditCard creditCard3 = (CreditCard) it8.next();
                    cm4.g gVarC = ((vt4.g) aVar2.f229313a).c(creditCard3, countryCode);
                    bVar2 = null;
                    arrayList.add(new amd.f(gVarC.f25125b, gVarC.f25126c, sx4.f.b(3, null, null, creditCard3.f69794c), new TextLocalisedClause(R$string.credit_card_amount_to_repay, null, null, 14), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit_card, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal), gVarC.d, new amd.p(creditCard3.f69792a), 128));
                    it8 = it8;
                    aVar2 = aVar2;
                }
                if (aVar == null || (listC = zhm.u.c(new amd.g(aVar.f127602a, aVar.f127604c, aVar.d, aVar.f, new amd.c0(amd.b.CREDIT_CARDS, NetWorthAccount.Personal.f87455a), new AnalyticsContext(aVar.e)))) == null) {
                    listC = zhm.f0.f322471a;
                }
                amd.j jVar = new amd.j(bVar3, zhm.u.c(new amd.d(eVar, arrayList, listC, totalBalance)), null, false, aVar != null ? new osd.b(aVar) : bVar2, 12);
                return mra.d.x(jVar) ? jVar : bVar2;
        }
    }
}
