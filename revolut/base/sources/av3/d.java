package av3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f9892c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f9893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f9894h;

    public d(String title, String str, String str2, String image, String primaryButtonTitle, String str3, b bVar, c cVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(primaryButtonTitle, "primaryButtonTitle");
        this.f9890a = title;
        this.f9891b = str;
        this.f9892c = str2;
        this.d = image;
        this.e = primaryButtonTitle;
        this.f = str3;
        this.f9893g = bVar;
        this.f9894h = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f9890a, dVar.f9890a) && Intrinsics.f(this.f9891b, dVar.f9891b) && Intrinsics.f(this.f9892c, dVar.f9892c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f9893g, dVar.f9893g) && Intrinsics.f(this.f9894h, dVar.f9894h);
    }

    public final int hashCode() {
        int iHashCode = this.f9890a.hashCode() * 31;
        String str = this.f9891b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9892c;
        int iC = p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        String str3 = this.f;
        int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        b bVar = this.f9893g;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.f9894h;
        return iHashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }
}
