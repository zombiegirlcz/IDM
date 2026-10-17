package cj1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24576c;

    public a(String text, String country, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f24574a = text;
        this.f24575b = country;
        this.f24576c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f24574a, aVar.f24574a) && Intrinsics.f(this.f24575b, aVar.f24575b) && Intrinsics.f(this.f24576c, aVar.f24576c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f24574a.hashCode() * 31, 961, this.f24575b);
        String str = this.f24576c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
