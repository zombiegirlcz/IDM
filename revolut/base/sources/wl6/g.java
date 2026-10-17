package wl6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f298440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f298441c;

    public g(String str, String str2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298439a = str;
        this.f298440b = str2;
        this.f298441c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f298441c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f298439a, gVar.f298439a) && Intrinsics.f(this.f298440b, gVar.f298440b) && Intrinsics.f(this.f298441c, gVar.f298441c);
    }

    public final int hashCode() {
        String str = this.f298439a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f298440b;
        return this.f298441c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
