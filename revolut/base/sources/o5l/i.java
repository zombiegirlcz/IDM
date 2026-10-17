package o5l;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f222463c;
    public final h d;
    public final k e;
    public final p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f222464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f222465h;
    public final p i;

    public i(String title, String cardCode, String str, h cardBrandDesign, k kVar, p pricing, String str2, j jVar, p pVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        Intrinsics.checkNotNullParameter(cardBrandDesign, "cardBrandDesign");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.f222461a = title;
        this.f222462b = cardCode;
        this.f222463c = str;
        this.d = cardBrandDesign;
        this.e = kVar;
        this.f = pricing;
        this.f222464g = str2;
        this.f222465h = jVar;
        this.i = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f222461a, iVar.f222461a) && Intrinsics.f(this.f222462b, iVar.f222462b) && Intrinsics.f(this.f222463c, iVar.f222463c) && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f222464g, iVar.f222464g) && Intrinsics.f(this.f222465h, iVar.f222465h) && Intrinsics.f(this.i, iVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f222461a.hashCode() * 31, 31, this.f222462b);
        String str = this.f222463c;
        int iHashCode = (this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        k kVar = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31;
        String str2 = this.f222464g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        j jVar = this.f222465h;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        p pVar = this.i;
        return iHashCode4 + (pVar != null ? pVar.hashCode() : 0);
    }
}
