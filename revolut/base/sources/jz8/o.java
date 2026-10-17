package jz8;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179646c;
    public final u09.v d;
    public final DateTime e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f179647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f179648h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f179649j;

    public o(Integer num, String blogId, String title, String str, String str2, String str3, String str4, String str5, DateTime createdDate, u09.v productDomain) {
        Intrinsics.checkNotNullParameter(blogId, "blogId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(productDomain, "productDomain");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        this.f179644a = blogId;
        this.f179645b = title;
        this.f179646c = str;
        this.d = productDomain;
        this.e = createdDate;
        this.f = str2;
        this.f179647g = str3;
        this.f179648h = str4;
        this.i = str5;
        this.f179649j = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f179644a, oVar.f179644a) && Intrinsics.f(this.f179645b, oVar.f179645b) && Intrinsics.f(this.f179646c, oVar.f179646c) && this.d == oVar.d && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f179647g, oVar.f179647g) && Intrinsics.f(this.f179648h, oVar.f179648h) && Intrinsics.f(this.i, oVar.i) && Intrinsics.f(this.f179649j, oVar.f179649j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f179644a.hashCode() * 31, 31, this.f179645b);
        String str = this.f179646c;
        int iF = m72.b.f(this.e, (this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
        String str2 = this.f;
        int iHashCode = (iF + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f179647g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f179648h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f179649j;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }
}
