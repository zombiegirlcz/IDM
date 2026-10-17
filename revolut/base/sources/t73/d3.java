package t73;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.cc;
import tof.i7;
import tof.ib;
import tof.m9;
import tof.u9;
import tof.w8;
import tof.y6;
import tof.z9;

/* JADX INFO: loaded from: classes21.dex */
public final class d3 {

    @NotNull
    public static final a3 Companion = new a3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardsCarouselScreenContract$InputData f268441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l63.a f268442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r10.a f268443c;
    public final k63.a d;
    public final sh3.a e;
    public final fk3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mt8.d f268444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final al4.p f268445h;
    public final xh9.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ti9.h f268446j;
    public final com.revolut.domain.interactors.transactions.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nhf.a f268447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ha3.f f268448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xua.a f268449n;
    public final wsg.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l93.f f268450p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n6e.b f268451q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k63.a f268452r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g48.r0 f268453s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f268454t;
    public final ihm.f u;
    public final ihm.f v;

    public d3(CardsCarouselScreenContract$InputData inputData, l63.a cardsContentInteractor, r10.a disposablePlaceholderInteractor, k63.a baseCardScreenUiConfigProvider, sh3.a checkoutInteractor, fk3.a configurationInteractor, mt8.d kycInteractor, al4.p creditCardProductFeatureTogglesInteractor, xh9.a payLaterInteractor, ti9.h payLaterProductFeatureTogglesInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, nhf.a unitedWalletInteractor, ha3.f cardsConfigInteractor, xua.a recurringPaymentInteractor, wsg.n walletInteractor, l93.f revolutCardsInteractor, n6e.b pocketSubaccountsProvider, k63.a configurationProvider, g48.r0 jointAccountsInteractor, f cardSubscriptionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsContentInteractor, "cardsContentInteractor");
        Intrinsics.checkNotNullParameter(disposablePlaceholderInteractor, "disposablePlaceholderInteractor");
        Intrinsics.checkNotNullParameter(baseCardScreenUiConfigProvider, "baseCardScreenUiConfigProvider");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterProductFeatureTogglesInteractor, "payLaterProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(cardsConfigInteractor, "cardsConfigInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(pocketSubaccountsProvider, "pocketSubaccountsProvider");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(cardSubscriptionsInteractor, "cardSubscriptionsInteractor");
        this.f268441a = inputData;
        this.f268442b = cardsContentInteractor;
        this.f268443c = disposablePlaceholderInteractor;
        this.d = baseCardScreenUiConfigProvider;
        this.e = checkoutInteractor;
        this.f = configurationInteractor;
        this.f268444g = kycInteractor;
        this.f268445h = creditCardProductFeatureTogglesInteractor;
        this.i = payLaterInteractor;
        this.f268446j = payLaterProductFeatureTogglesInteractor;
        this.k = transactionsInteractor;
        this.f268447l = unitedWalletInteractor;
        this.f268448m = cardsConfigInteractor;
        this.f268449n = recurringPaymentInteractor;
        this.o = walletInteractor;
        this.f268450p = revolutCardsInteractor;
        this.f268451q = pocketSubaccountsProvider;
        this.f268452r = configurationProvider;
        this.f268453s = jointAccountsInteractor;
        this.f268454t = cardSubscriptionsInteractor;
        this.u = v0.a.d("create(...)");
        this.v = v0.a.d("create(...)");
    }

    public static i7 b(h93.f0 f0Var, AccountId.Joint joint) {
        if (f0Var.e) {
            return new cc(zhm.v.k(y6.REV_PAYMENT, y6.REV_PAYMENT_REFUND));
        }
        if (f0Var.d) {
            i7.c cVar = i7.Companion;
            i7[] i7VarArr = {i7.e.f272811a, new m9(f0Var.M()), new w8(f0Var.C()), new u9(false), new z9(joint != null ? joint.f51412a : null)};
            cVar.getClass();
            return i7.c.a(i7VarArr);
        }
        i7.c cVar2 = i7.Companion;
        i7[] i7VarArr2 = {new ib(f0Var.f150110a), new u9(false)};
        cVar2.getClass();
        return i7.c.a(i7VarArr2);
    }

    public final pfm.z a(h93.f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        efm.d0 d0VarFirstOrError = m70.a.g(((yua.q) this.f268449n).p(card.f150110a, true), null, new t5e.j(3), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return ue0.e.F(d0VarFirstOrError, zhm.f0.f322471a);
    }

    public final efm.r c() {
        if (!Intrinsics.f(this.f268441a.f65408c, AccountId.Personal.f51414a) || !this.f268452r.c()) {
            od0.i.Companion.getClass();
            return zi0.c.j(od0.i.f224256b);
        }
        efm.r map = rd0.e.c(this.f268453s.c(), kotlin.coroutines.g.f186406a).map(new z2(new y2(7), 3));
        Intrinsics.h(map);
        return map;
    }
}
