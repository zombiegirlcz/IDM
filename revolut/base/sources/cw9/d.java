package cw9;

import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import cqh.m;
import kotlin.jvm.internal.Intrinsics;
import vkm.v1;
import zjh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements zv9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f109572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f109573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r10.a f109574c;
    public final n8b.a d;

    public d(gte.a featureToggleInteractor, f paymentsProductCatalogueChecker, r10.a bankTransferToggleChecker, n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductCatalogueChecker, "paymentsProductCatalogueChecker");
        Intrinsics.checkNotNullParameter(bankTransferToggleChecker, "bankTransferToggleChecker");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f109572a = featureToggleInteractor;
        this.f109573b = paymentsProductCatalogueChecker;
        this.f109574c = bankTransferToggleChecker;
        this.d = countryInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f109572a).c(MoveMoneyFeatureApi$Toggles.CountryProfileAvailable.f97181c);
    }

    public final m b() {
        return new m(this.f109573b.A("TRANSFER.bank_transfer"), this, 3);
    }

    public final ae8.c c() {
        return this.f109573b.A("BILLS_AND_TAXES.group_bills");
    }

    public final ae8.c d() {
        return this.f109573b.A("TRANSFER.p2p");
    }

    public final ae8.c e() {
        return this.f109573b.A("TRANSFER.p2p");
    }

    public final ae8.c f() {
        return this.f109573b.A("TRANSFER.card");
    }

    public final v1 g() {
        return new v1(new cn0.d(this, null, 22));
    }

    public final v1 h(String str) {
        return new v1(new c(this, str, null));
    }
}
