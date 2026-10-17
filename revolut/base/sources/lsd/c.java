package lsd;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f199672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f199673b;

    public c(Map icons, List subAccountsWithBaseCurrency) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(subAccountsWithBaseCurrency, "subAccountsWithBaseCurrency");
        this.f199672a = icons;
        this.f199673b = subAccountsWithBaseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f199672a.equals(cVar.f199672a) && Intrinsics.f(this.f199673b, cVar.f199673b);
    }

    public final int hashCode() {
        return this.f199673b.hashCode() + (this.f199672a.hashCode() * 31);
    }
}
