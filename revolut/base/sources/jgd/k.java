package jgd;

import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedConverterItem f173973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173974b;

    public k(SharedConverterItem item, String newAmount) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(newAmount, "newAmount");
        this.f173973a = item;
        this.f173974b = newAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f173973a, kVar.f173973a) && Intrinsics.f(this.f173974b, kVar.f173974b);
    }

    public final int hashCode() {
        return this.f173974b.hashCode() + (this.f173973a.hashCode() * 31);
    }
}
