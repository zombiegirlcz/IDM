package svi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265885c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f265886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f265887h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f265888j;
    public final g k;

    public c(String id10, String name, String terminal, String str, String str2, String airportName, String str3, String str4, List imagesUrls, ArrayList facilities, g openingHours) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(terminal, "terminal");
        Intrinsics.checkNotNullParameter(airportName, "airportName");
        Intrinsics.checkNotNullParameter(imagesUrls, "imagesUrls");
        Intrinsics.checkNotNullParameter(facilities, "facilities");
        Intrinsics.checkNotNullParameter(openingHours, "openingHours");
        this.f265883a = id10;
        this.f265884b = name;
        this.f265885c = terminal;
        this.d = str;
        this.e = str2;
        this.f = airportName;
        this.f265886g = str3;
        this.f265887h = str4;
        this.i = imagesUrls;
        this.f265888j = facilities;
        this.k = openingHours;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f265883a, cVar.f265883a) && Intrinsics.f(this.f265884b, cVar.f265884b) && Intrinsics.f(this.f265885c, cVar.f265885c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f265886g, cVar.f265886g) && Intrinsics.f(this.f265887h, cVar.f265887h) && Intrinsics.f(this.i, cVar.i) && this.f265888j.equals(cVar.f265888j) && this.k.equals(cVar.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f265883a.hashCode() * 31, 31, this.f265884b), 31, this.f265885c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC2 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        String str3 = this.f265886g;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f265887h;
        return this.k.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f265888j, p.a.d((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.i), 31);
    }
}
