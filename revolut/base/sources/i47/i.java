package i47;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f158290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f158291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f158292c;
    public final int d;
    public final int e;
    public final int f;

    public i(Set selectedCategories, Set selectedCurrencies, LinkedHashSet excludedTransactionIds, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        this.f158290a = selectedCategories;
        this.f158291b = selectedCurrencies;
        this.f158292c = excludedTransactionIds;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f158290a, iVar.f158290a) && Intrinsics.f(this.f158291b, iVar.f158291b) && this.f158292c.equals(iVar.f158292c) && this.d == iVar.d && this.e == iVar.e && this.f == iVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.b(this.e, j6.a.b(this.d, (this.f158292c.hashCode() + p.a.f(this.f158290a.hashCode() * 31, 31, this.f158291b)) * 31, 31), 31);
    }
}
