package x73;

import b93.e;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.d;
import h73.c;
import h93.f0;
import koi.j;
import kotlin.jvm.internal.Intrinsics;
import r63.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements j63.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f303140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f303141b;

    public a(b retailSelectedCardUiConfigProvider, c juniorSelectedCardUiConfigProvider) {
        Intrinsics.checkNotNullParameter(retailSelectedCardUiConfigProvider, "retailSelectedCardUiConfigProvider");
        Intrinsics.checkNotNullParameter(juniorSelectedCardUiConfigProvider, "juniorSelectedCardUiConfigProvider");
        this.f303140a = retailSelectedCardUiConfigProvider;
        this.f303141b = juniorSelectedCardUiConfigProvider;
    }

    @Override // j63.a
    public final boolean a(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return i(card).a(card);
    }

    @Override // j63.a
    public final ParcelableDestination b(f0 card, d cardDesign, n63.b flowName, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return i(card).b(card, cardDesign, flowName, accountId);
    }

    @Override // j63.a
    public final NaviCommand c(f0 card, String str, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return i(card).c(card, str, accountId);
    }

    @Override // j63.a
    public final j d(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter("WARNING_PIN_ACTIVATION", "id");
        return i(card).d(card);
    }

    @Override // j63.a
    public final Clause e(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return i(card).e(card);
    }

    @Override // j63.a
    public final boolean f(f0 card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return i(card).f(card);
    }

    @Override // j63.a
    public final KompotDestination g(f0 card, AccountId accountId) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return i(card).g(card, accountId);
    }

    @Override // j63.a
    public final NaviCommand h(e cardType, AccountId accountId, String str) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return ((cardType == e.JUNIOR || cardType == e.JUNIOR_VIRTUAL) ? this.f303141b : this.f303140a).h(cardType, accountId, str);
    }

    public final j63.a i(f0 f0Var) {
        return (f0Var.b0() || f0Var.d0()) ? this.f303141b : this.f303140a;
    }
}
