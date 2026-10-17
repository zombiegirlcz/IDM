package x33;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f302632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f302633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f302634c;
    public final j d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xi0.b f302635g;

    public b(d pocketsFiat, d pocketsCrypto, d pocketsPersonalVault, j selectedPaymentMethod, List selectedPocketIds, boolean z, xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(pocketsFiat, "pocketsFiat");
        Intrinsics.checkNotNullParameter(pocketsCrypto, "pocketsCrypto");
        Intrinsics.checkNotNullParameter(pocketsPersonalVault, "pocketsPersonalVault");
        Intrinsics.checkNotNullParameter(selectedPaymentMethod, "selectedPaymentMethod");
        Intrinsics.checkNotNullParameter(selectedPocketIds, "selectedPocketIds");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f302632a = pocketsFiat;
        this.f302633b = pocketsCrypto;
        this.f302634c = pocketsPersonalVault;
        this.d = selectedPaymentMethod;
        this.e = selectedPocketIds;
        this.f = z;
        this.f302635g = baseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f302632a, bVar.f302632a) && Intrinsics.f(this.f302633b, bVar.f302633b) && Intrinsics.f(this.f302634c, bVar.f302634c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && Intrinsics.f(this.f302635g, bVar.f302635g);
    }

    public final int hashCode() {
        return this.f302635g.hashCode() + j6.a.c(p.a.d((this.d.hashCode() + ((this.f302634c.hashCode() + ((this.f302633b.hashCode() + (this.f302632a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }
}
