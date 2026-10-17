package gei;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143307c;
    public final String d;
    public final List e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f143308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f143309h;

    public d(String title, String str, String str2, String str3, List buttons, g style, String str4) {
        String str5;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f143305a = title;
        this.f143306b = str;
        this.f143307c = str2;
        this.d = str3;
        this.e = buttons;
        this.f = style;
        this.f143308g = str4;
        c cVar = (c) d0.d0(buttons);
        if (cVar != null && (str5 = cVar.f143304b) != null) {
            str4 = str5;
        }
        this.f143309h = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f143305a, dVar.f143305a) && Intrinsics.f(this.f143306b, dVar.f143306b) && Intrinsics.f(this.f143307c, dVar.f143307c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f143308g, dVar.f143308g);
    }

    public final int hashCode() {
        int iHashCode = this.f143305a.hashCode() * 31;
        String str = this.f143306b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f143307c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (this.f.f143310a.hashCode() + p.a.d((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e)) * 31;
        String str4 = this.f143308g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
