package y19;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f310329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310330c;
    public final dj0.d d;
    public final String e;

    public a(dj0.d moneySaved, String title, String subtitle, String icon, String product) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(moneySaved, "moneySaved");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f310328a = title;
        this.f310329b = subtitle;
        this.f310330c = icon;
        this.d = moneySaved;
        this.e = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f310328a, aVar.f310328a) && Intrinsics.f(this.f310329b, aVar.f310329b) && Intrinsics.f(this.f310330c, aVar.f310330c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(p.a.c(p.a.c(this.f310328a.hashCode() * 31, 31, this.f310329b), 31, this.f310330c), 31, this.d);
    }
}
