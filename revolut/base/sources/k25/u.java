package k25;

import au.c0;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardBeDrivenInfoSection;
import com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardNewHomeHeaderContent;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import dp4.c1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jsl.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.time.b;
import kotlinx.coroutines.flow.Flow;
import om4.l0;
import om4.l3;
import om4.m3;
import om4.m4;
import om4.q4;
import om4.s3;
import om4.v0;
import om4.x2;
import om4.y3;
import org.jetbrains.annotations.NotNull;
import sfe.z;
import skm.p0;
import yhm.m;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements a {

    @NotNull
    public static final b Companion = new b();
    public static final TransactionContext u = new TransactionContext(new Priority.HIGH("Transactions widget [CreditCardProductContract]"), null, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.n f180348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.q f180349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m25.l f180350c;
    public final al4.p d;
    public final al4.u e;
    public final al4.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final al4.j f180351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f180352h;
    public final ang.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g25.p f180353j;
    public final o25.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final aw4.b f180354l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final om4.w f180355m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m4 f180356n;
    public final v0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ssi.o f180357p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f180358q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kpj.f f180359r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mce.a f180360s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final js7.f f180361t;

    public u(al4.n creditCardInteractor, al4.q creditCardProductInteractor, m25.l creditCardAccountMapper, p96.a creditCardSectionsMapper, al4.p creditCardProductFeatureTogglesInteractor, al4.u securedCreditCardProductFeatureTogglesInteractor, al4.c creditBuilderCardProductFeatureTogglesInteractor, al4.j creditCardEntryPointDetailsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, ang.f userInteractor, g25.p creditApplicationAccountMapper, o25.i creditEmptyStateAccountDataSource, aw4.b creditCardStatementDetailsInteractor, om4.w creditCardBoletoInteractor, w creditCardTransactionFilterProvider, m4 familyCreditCardWalletInteractor, v0 creditCardHomeScreenHeaderContentInteractor, ssi.o transactionsWidgetUiModel, gte.a featureToggleInteractor, kpj.f creditCardToDoSectionsMapper, mce.a recurringPaymentFilterProvider, js7.f creditInsuranceInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardAccountMapper, "creditCardAccountMapper");
        Intrinsics.checkNotNullParameter(creditCardSectionsMapper, "creditCardSectionsMapper");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(securedCreditCardProductFeatureTogglesInteractor, "securedCreditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditBuilderCardProductFeatureTogglesInteractor, "creditBuilderCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationAccountMapper, "creditApplicationAccountMapper");
        Intrinsics.checkNotNullParameter(creditEmptyStateAccountDataSource, "creditEmptyStateAccountDataSource");
        Intrinsics.checkNotNullParameter(creditCardStatementDetailsInteractor, "creditCardStatementDetailsInteractor");
        Intrinsics.checkNotNullParameter(creditCardBoletoInteractor, "creditCardBoletoInteractor");
        Intrinsics.checkNotNullParameter(creditCardTransactionFilterProvider, "creditCardTransactionFilterProvider");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        Intrinsics.checkNotNullParameter(creditCardHomeScreenHeaderContentInteractor, "creditCardHomeScreenHeaderContentInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardToDoSectionsMapper, "creditCardToDoSectionsMapper");
        Intrinsics.checkNotNullParameter(recurringPaymentFilterProvider, "recurringPaymentFilterProvider");
        Intrinsics.checkNotNullParameter(creditInsuranceInteractor, "creditInsuranceInteractor");
        this.f180348a = creditCardInteractor;
        this.f180349b = creditCardProductInteractor;
        this.f180350c = creditCardAccountMapper;
        this.d = creditCardProductFeatureTogglesInteractor;
        this.e = securedCreditCardProductFeatureTogglesInteractor;
        this.f = creditBuilderCardProductFeatureTogglesInteractor;
        this.f180351g = creditCardEntryPointDetailsInteractor;
        this.f180352h = transactionsInteractor;
        this.i = userInteractor;
        this.f180353j = creditApplicationAccountMapper;
        this.k = creditEmptyStateAccountDataSource;
        this.f180354l = creditCardStatementDetailsInteractor;
        this.f180355m = creditCardBoletoInteractor;
        this.f180356n = familyCreditCardWalletInteractor;
        this.o = creditCardHomeScreenHeaderContentInteractor;
        this.f180357p = transactionsWidgetUiModel;
        this.f180358q = featureToggleInteractor;
        this.f180359r = creditCardToDoSectionsMapper;
        this.f180360s = recurringPaymentFilterProvider;
        this.f180361t = creditInsuranceInteractor;
    }

    public static /* synthetic */ x15.m r(u uVar, CreditCard creditCard, ll4.o oVar, yw4.l lVar, wi0.b bVar, f0 f0Var) {
        od0.i.Companion.getClass();
        return uVar.q(creditCard, null, false, oVar, AdditionalCardholdersState.NotAvailable.f69812a, lVar, bVar, f0Var, xr7.d.f308290a, od0.i.f224256b);
    }

    @Override // pfe.b
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.v(vkm.q.R(nim.a.v(((y3) this.f180349b).f(accountId.f89729a, w4l.j.f294644c), new k1g.n(4)), new hr4.b(3, 6, null)), new k1.a(this, accountId, 4));
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Continuation continuation = null;
        wkm.l lVarQ = vkm.q.Q(b(accountId), new jy6.l(continuation, this, 3));
        Intrinsics.checkNotNullParameter(p0.f264001a, "<this>");
        return new ie7.h(yh5.b.d(vkm.q.C(lVarQ, oji.e.f225788b), new ie7.h(rd0.e.n(vkm.q.q(xam.a.h(new t0(this, continuation, 22), ((x2) this.f180348a).h(accountId.f89729a, w4l.h.f294642c))), h0.f322473a), this, 23)), this, 24);
    }

    @Override // a35.i
    public final Flow e(List products, List applicationAccounts) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(applicationAccounts, "applicationAccounts");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : products) {
            if (obj2 instanceof x15.o) {
                arrayList.add(obj2);
            }
        }
        return rd0.e.n(vkm.q.Q(new go.g(d0.d0(arrayList), 2), new o(null, applicationAccounts, this, 0)), h0.f322473a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.tab.accounts.models.ProductAccountId r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k25.u.f(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        HomeFeedWidgetContext.CreditCard.Companion companion = HomeFeedWidgetContext.CreditCard.INSTANCE;
        String str = productAccountId.f89729a;
        companion.getClass();
        return new z(HomeFeedWidgetContext.CreditCard.Companion.a(str));
    }

    @Override // a35.i
    public final vkm.f k(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        cxe.u uVarP = n14.k.p(rd0.e.e(xam.a.h(new c0(continuation, this, loadingStrategy, 13), ((qx4.f) this.d).j()), h0.f322473a, new i23.c(3, 14, continuation)), new k1g.n(12));
        Data data = new Data(x15.i.f302276a, null, false, 6, null);
        b.Companion companion = kotlin.time.b.INSTANCE;
        return zi0.c.M(uVarP, data, kotlin.time.c.h(1000L, pkm.e.MILLISECONDS), "CreditCardProduct");
    }

    @Override // a35.i
    public final Flow l() {
        return ((qx4.f) this.d).j();
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) throws Throwable {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        if (!(payload instanceof CreditAccountType.CreditCard)) {
            payload = null;
        }
        CreditAccountType.CreditCard creditCard = (CreditAccountType.CreditCard) payload;
        if (creditCard == null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                String str = accountId.f89729a;
                ProductAccountId.Payload payload2 = accountId.f89730b;
                throw new IllegalStateException("accountId id=" + str + " payloadType=" + (payload2 != null ? payload2.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.CreditCard.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                creditCard = null;
            }
        }
        if (creditCard == null) {
            return new go.g(new Data(null, null, false, 7, null), 2);
        }
        Flow flowQ = vkm.q.q(rd0.e.n(xam.a.h(new q(creditCard, this, null), vkm.q.q(((y3) this.f180349b).f(creditCard.f70624b, w4l.i.f294643c))), h0.f322473a));
        Data data = new Data(null, null, true, 3, null);
        b.Companion companion3 = kotlin.time.b.INSTANCE;
        return zi0.c.M(flowQ, data, kotlin.time.c.h(1000L, pkm.e.MILLISECONDS), "CreditCardProduct");
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) throws Throwable {
        String str;
        ProductAccountId.Payload payload = productAccountId.f89730b;
        if (!(payload instanceof CreditAccountType.CreditCard)) {
            payload = null;
        }
        CreditAccountType.CreditCard creditCard = (CreditAccountType.CreditCard) payload;
        if (creditCard == null) {
            try {
                m.Companion companion = yhm.m.INSTANCE;
                String str2 = productAccountId.f89729a;
                ProductAccountId.Payload payload2 = productAccountId.f89730b;
                throw new IllegalStateException("accountId id=" + str2 + " payloadType=" + (payload2 != null ? payload2.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.CreditCard.class) + " payload");
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(yhm.o.a(th10));
                if (thA != null) {
                    hx7.e.n(thA);
                }
                creditCard = null;
            }
        }
        if (creditCard == null || (str = creditCard.f70624b) == null) {
            return null;
        }
        return new SlotContext(akd.s.CREDIT_CARD, y0.b(str));
    }

    public final akg.n o() {
        return nim.a.v(this.i.j(w4l.h.f294642c), h.f);
    }

    public final cxe.u p(String facilityId, w4l.k loadingStrategy) {
        Flow flowI;
        v0 v0Var = this.o;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (((jte.d) v0Var.f226720c).c(CreditCardApi$Toggles$CreditCardNewHomeHeaderContent.f68686c)) {
            flowI = boh.f.e(v0Var.f226719b.a(facilityId, w4l.j.f294644c), new l0(v0Var, 1, facilityId, loadingStrategy));
        } else {
            od0.i.Companion.getClass();
            flowI = zi0.c.i(od0.i.f224256b);
        }
        return n14.k.p(flowI, new k1g.n(11));
    }

    public final x15.m q(CreditCard creditCard, CreditCardAutopayPayments creditCardAutopayPayments, boolean z, ll4.o oVar, AdditionalCardholdersState additionalCardholdersState, yw4.l lVar, wi0.b bVar, List list, xr7.f fVar, od0.i iVar) {
        String str = creditCard.f69792a;
        String str2 = creditCard.f69793b;
        xw4.a aVar = creditCard.i;
        return new x15.m(str, str2, aVar == xw4.a.OVERDUE ? creditCard.f69795g : aVar == xw4.a.LIMIT_EXCEEDED ? creditCard.e : creditCard.f69794c.f115082a > 0 ? new dj0.d(0L, creditCard.d.f115083b) : null, creditCard.i, creditCard.d, creditCard.f69794c, creditCardAutopayPayments, creditCard, creditCard.o, z, creditCard.f69804s, oVar, additionalCardholdersState, lVar, creditCard.f69808y, bVar, list, iVar, fVar, ((jte.d) this.f180358q).c(CreditCardApi$Toggles$CreditCardBeDrivenInfoSection.f68676c));
    }

    public final Flow s() {
        yoj.c cVar;
        Set cardTypesToCheck = d0.i1(yw4.h.a());
        x2 x2Var = (x2) this.f180348a;
        Intrinsics.checkNotNullParameter(cardTypesToCheck, "cardTypesToCheck");
        Flow flowE = ((y3) x2Var.f226747c).e(w4l.j.f294644c, true);
        Set<yw4.h> set = cardTypesToCheck;
        ArrayList arrayList = new ArrayList(zhm.w.t(set, 10));
        for (yw4.h cardType : set) {
            s3 s3Var = (s3) x2Var.f226748g;
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            xoj.a aVar = s3Var.f;
            int i = m3.f226639a[cardType.ordinal()];
            if (i == 1 || i == 2) {
                cVar = yoj.c.CREDIT_CARD_APPLICATION;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar = yoj.c.CREDIT_CARD_PREMIUM;
            }
            arrayList.add(nim.a.v(rd0.e.b(nim.a.w(((cpj.b) aVar).k(cVar, yoj.d.DISABLED), new l3(0))), new ok7.c(cardType, 11)));
        }
        return n14.k.s(rd0.e.n(vkm.q.q(nim.a.u(new n((Continuation) null, this), u0.m(u0.i(nim.a.v(u0.m(flowE, nim.a.v(u0.k(arrayList), new om4.o0(23))), new om4.o0(22)), ((s3) this.f180351g).r(), ((om4.b) this.d).m()), u0.m(((q4) this.e).m(), ((om4.b) this.f).m())))), h0.f322473a), x15.k.f302279a);
    }

    public final Flow t(List list, w4l.k loadingStrategy) {
        if (list.isEmpty()) {
            return zi0.c.i(r0.g());
        }
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (String facilityId : list2) {
            x2 x2Var = (x2) this.f180348a;
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            c1 c1Var = x2Var.f226745a;
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            arrayList.add(n14.k.p(nim.a.v(c1Var.v.b(new cp4.h0(facilityId), loadingStrategy), new jb8.a(facilityId, 19)), new jb8.a(facilityId, 20)));
        }
        return nim.a.v(u0.k(arrayList), new k1g.n(6));
    }
}
