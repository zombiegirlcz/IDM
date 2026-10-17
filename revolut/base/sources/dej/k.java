package dej;

import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f113576c;
    public final dj0.d d;
    public final j1 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimContractMetadata f113577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f113578h;
    public final String i;

    public k(String mobilePlanId, String subscriptionId, r1 pocketSelection, dj0.d price, j1 j1Var, boolean z, EsimContractMetadata contractMetadata, String changeToken, String idempotencyKey) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(pocketSelection, "pocketSelection");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(contractMetadata, "contractMetadata");
        Intrinsics.checkNotNullParameter(changeToken, "changeToken");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f113574a = mobilePlanId;
        this.f113575b = subscriptionId;
        this.f113576c = pocketSelection;
        this.d = price;
        this.e = j1Var;
        this.f = z;
        this.f113577g = contractMetadata;
        this.f113578h = changeToken;
        this.i = idempotencyKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f113574a, kVar.f113574a) && Intrinsics.f(this.f113575b, kVar.f113575b) && Intrinsics.f(this.f113576c, kVar.f113576c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f && Intrinsics.f(this.f113577g, kVar.f113577g) && Intrinsics.f(this.f113578h, kVar.f113578h) && Intrinsics.f(this.i, kVar.i);
    }

    public final int hashCode() {
        int iC = v7.c((this.f113576c.hashCode() + p.a.c(this.f113574a.hashCode() * 31, 31, this.f113575b)) * 31, 31, this.d);
        j1 j1Var = this.e;
        return this.i.hashCode() + p.a.c((this.f113577g.hashCode() + j6.a.c((iC + (j1Var == null ? 0 : j1Var.hashCode())) * 31, 31, this.f)) * 31, 31, this.f113578h);
    }
}
