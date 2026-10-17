package rfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f253772c;

    public n(String collapsed, String reordering, String hiddenDiscovery) {
        Intrinsics.checkNotNullParameter(collapsed, "collapsed");
        Intrinsics.checkNotNullParameter("ACCOUNT_SWITCHER_FAVOURITES", "favourites");
        Intrinsics.checkNotNullParameter(reordering, "reordering");
        Intrinsics.checkNotNullParameter(hiddenDiscovery, "hiddenDiscovery");
        this.f253770a = collapsed;
        this.f253771b = reordering;
        this.f253772c = hiddenDiscovery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f253770a.equals(nVar.f253770a) && this.f253771b.equals(nVar.f253771b) && this.f253772c.equals(nVar.f253772c);
    }

    public final int hashCode() {
        return this.f253772c.hashCode() + p.a.c(((this.f253770a.hashCode() * 31) - 387599402) * 31, 31, this.f253771b);
    }
}
