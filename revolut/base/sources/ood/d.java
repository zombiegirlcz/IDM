package ood;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f227037c;
    public final String d;
    public final List e;
    public final boolean f;

    public d(List visitedCountries, String str, int i, String initiallyFocusedCountry, aim.e menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(visitedCountries, "visitedCountries");
        Intrinsics.checkNotNullParameter(initiallyFocusedCountry, "initiallyFocusedCountry");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f227035a = visitedCountries;
        this.f227036b = str;
        this.f227037c = i;
        this.d = initiallyFocusedCountry;
        this.e = menuItems;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f227035a, dVar.f227035a) && Intrinsics.f(this.f227036b, dVar.f227036b) && this.f227037c == dVar.f227037c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f227035a.hashCode() * 31;
        String str = this.f227036b;
        return Boolean.hashCode(this.f) + p.a.d(p.a.c(j6.a.b(this.f227037c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 961), 31, this.d), 31, this.e);
    }
}
