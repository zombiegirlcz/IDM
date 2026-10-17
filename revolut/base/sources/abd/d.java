package abd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2940c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2941g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2942h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f2943j;
    public final Integer k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f2944l;

    public d(String id10, long j2, String state, String product, String title, Long l2, String str, String str2, String paymentLink, Integer num, Integer num2, List customFieldDefinitions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paymentLink, "paymentLink");
        Intrinsics.checkNotNullParameter(customFieldDefinitions, "customFieldDefinitions");
        this.f2938a = id10;
        this.f2939b = j2;
        this.f2940c = state;
        this.d = product;
        this.e = title;
        this.f = l2;
        this.f2941g = str;
        this.f2942h = str2;
        this.i = paymentLink;
        this.f2943j = num;
        this.k = num2;
        this.f2944l = customFieldDefinitions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f2938a, dVar.f2938a) && this.f2939b == dVar.f2939b && Intrinsics.f(this.f2940c, dVar.f2940c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f2941g, dVar.f2941g) && Intrinsics.f(this.f2942h, dVar.f2942h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f2943j, dVar.f2943j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f2944l, dVar.f2944l);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(a0.d.c(this.f2938a.hashCode() * 31, 31, this.f2939b), 31, this.f2940c), 31, this.d), 31, this.e);
        Long l2 = this.f;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f2941g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2942h;
        int iC2 = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i);
        Integer num = this.f2943j;
        int iHashCode3 = (iC2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        return this.f2944l.hashCode() + ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
