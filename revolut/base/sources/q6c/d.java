package q6c;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f242527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f242528c;
    public final c d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f242529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f242530h;
    public final Long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f242531j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f242532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f242533m;

    public d(String name, long j2, Integer num, c cVar, ArrayList discounts, ArrayList taxes, long j3, Long l2, Long l3, List imageUrls, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        this.f242526a = name;
        this.f242527b = j2;
        this.f242528c = num;
        this.d = cVar;
        this.e = discounts;
        this.f = taxes;
        this.f242529g = j3;
        this.f242530h = l2;
        this.i = l3;
        this.f242531j = imageUrls;
        this.k = str;
        this.f242532l = str2;
        this.f242533m = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f242526a, dVar.f242526a) && this.f242527b == dVar.f242527b && Intrinsics.f(this.f242528c, dVar.f242528c) && this.d == dVar.d && this.e.equals(dVar.e) && this.f.equals(dVar.f) && this.f242529g == dVar.f242529g && Intrinsics.f(this.f242530h, dVar.f242530h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f242531j, dVar.f242531j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f242532l, dVar.f242532l) && Intrinsics.f(this.f242533m, dVar.f242533m);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f242526a.hashCode() * 31, 31, this.f242527b);
        Integer num = this.f242528c;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.d;
        int iC2 = a0.d.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31), 31), 31, this.f242529g);
        Long l2 = this.f242530h;
        int iHashCode2 = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.i;
        int iD = p.a.d((iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f242531j);
        String str = this.k;
        int iHashCode3 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f242532l;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f242533m;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
