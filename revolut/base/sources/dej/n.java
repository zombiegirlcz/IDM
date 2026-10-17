package dej;

import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113594c;
    public final v d;
    public final String e;
    public final EsimHyperText f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f113595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f113596h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f113597j;
    public final long k;

    public n(String id10, String str, String str2, v severity, String title, EsimHyperText subtitle, o oVar, u uVar, boolean z, String str3, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(severity, "severity");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f113592a = id10;
        this.f113593b = str;
        this.f113594c = str2;
        this.d = severity;
        this.e = title;
        this.f = subtitle;
        this.f113595g = oVar;
        this.f113596h = uVar;
        this.i = z;
        this.f113597j = str3;
        this.k = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f113592a, nVar.f113592a) && Intrinsics.f(this.f113593b, nVar.f113593b) && Intrinsics.f(this.f113594c, nVar.f113594c) && this.d == nVar.d && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f113595g, nVar.f113595g) && Intrinsics.f(this.f113596h, nVar.f113596h) && this.i == nVar.i && Intrinsics.f(this.f113597j, nVar.f113597j) && this.k == nVar.k;
    }

    public final int hashCode() {
        int iHashCode = this.f113592a.hashCode() * 31;
        String str = this.f113593b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f113594c;
        int iHashCode3 = (this.f.hashCode() + p.a.c((this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.e)) * 31;
        o oVar = this.f113595g;
        int iHashCode4 = (iHashCode3 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        u uVar = this.f113596h;
        int iC = j6.a.c((iHashCode4 + (uVar == null ? 0 : uVar.hashCode())) * 31, 31, this.i);
        String str3 = this.f113597j;
        return Long.hashCode(this.k) + ((iC + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
