package z5f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f319622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f319623c;
    public final Double d;
    public final String e;
    public final f f;

    public g(String title, String subtitle, String description, Double d, String str, f indicators) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        this.f319621a = title;
        this.f319622b = subtitle;
        this.f319623c = description;
        this.d = d;
        this.e = str;
        this.f = indicators;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f319621a, gVar.f319621a) && Intrinsics.f(this.f319622b, gVar.f319622b) && Intrinsics.f(this.f319623c, gVar.f319623c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f319621a.hashCode() * 31, 31, this.f319622b), 31, this.f319623c);
        Double d = this.d;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.e;
        return this.f.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
