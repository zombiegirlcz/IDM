package ov5;

import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SplitAccountsItemGroup f229960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SplitAccountsItemGroup f229961b;

    public a(SplitAccountsItemGroup fiat, SplitAccountsItemGroup crypto) {
        Intrinsics.checkNotNullParameter(fiat, "fiat");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        this.f229960a = fiat;
        this.f229961b = crypto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f229960a, aVar.f229960a) && Intrinsics.f(this.f229961b, aVar.f229961b);
    }

    public final int hashCode() {
        return this.f229961b.hashCode() + (this.f229960a.hashCode() * 31);
    }
}
