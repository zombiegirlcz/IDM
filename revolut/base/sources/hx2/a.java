package hx2;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import grl.k9;
import h93.j0;
import h93.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi3.h f156353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c93.e f156354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f156355c;
    public final l0 d;
    public final AccountId e;
    public final e93.l0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f156356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AnalyticsProduct f156357h;
    public final m i;

    public a(pi3.h hVar, c93.e cardType, j0 productType, l0 subProductType, AccountId accountId, AnalyticsProduct automaticEventProduct, m mVar, int i) {
        accountId = (i & 16) != 0 ? AccountId.Personal.f51414a : accountId;
        e93.l0 virtualCardLabelType = e93.l0.DEFAULT;
        if ((i & 4096) != 0) {
            k9 k9Var = k9.Cards;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            automaticEventProduct = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        }
        mVar = (i & 262144) != 0 ? null : mVar;
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f156353a = hVar;
        this.f156354b = cardType;
        this.f156355c = productType;
        this.d = subProductType;
        this.e = accountId;
        this.f = virtualCardLabelType;
        this.f156356g = true;
        this.f156357h = automaticEventProduct;
        this.i = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f156353a, aVar.f156353a) && this.f156354b == aVar.f156354b && this.f156355c == aVar.f156355c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && this.f == aVar.f && this.f156356g == aVar.f156356g && Intrinsics.f(this.f156357h, aVar.f156357h) && this.i == aVar.i;
    }

    public final int hashCode() {
        pi3.h hVar = this.f156353a;
        int iA = h30.l.a(j6.a.c(j6.a.c((this.f.hashCode() + h30.l.b(this.e, (this.d.hashCode() + ((this.f156355c.hashCode() + ((this.f156354b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31)) * 31, 29791)) * 31, 31, false), 29791, this.f156356g), 887503681, this.f156357h);
        m mVar = this.i;
        return iA + (mVar != null ? mVar.hashCode() : 0);
    }
}
