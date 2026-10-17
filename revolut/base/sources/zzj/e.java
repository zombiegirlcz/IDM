package zzj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f326763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f326764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326765c;
    public final String d;
    public final String e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f326766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f326767h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f326768j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f326769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f326770m;

    public e(String id10, String assetType, String title, String imageUrl, String str, DateTime publishedDate, String source, Integer num, boolean z, List relatedSymbols, List relatedCurrencies, List list, List list2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(publishedDate, "publishedDate");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(relatedSymbols, "relatedSymbols");
        Intrinsics.checkNotNullParameter(relatedCurrencies, "relatedCurrencies");
        this.f326763a = id10;
        this.f326764b = assetType;
        this.f326765c = title;
        this.d = imageUrl;
        this.e = str;
        this.f = publishedDate;
        this.f326766g = source;
        this.f326767h = num;
        this.i = z;
        this.f326768j = relatedSymbols;
        this.k = relatedCurrencies;
        this.f326769l = list;
        this.f326770m = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f326763a, eVar.f326763a) && Intrinsics.f(this.f326764b, eVar.f326764b) && Intrinsics.f(this.f326765c, eVar.f326765c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f326766g, eVar.f326766g) && Intrinsics.f(this.f326767h, eVar.f326767h) && this.i == eVar.i && Intrinsics.f(this.f326768j, eVar.f326768j) && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f326769l, eVar.f326769l) && Intrinsics.f(this.f326770m, eVar.f326770m);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f326763a.hashCode() * 31, 31, this.f326764b), 31, this.f326765c), 31, this.d);
        String str = this.e;
        int iC2 = p.a.c(m72.b.f(this.f, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f326766g);
        Integer num = this.f326767h;
        int iD = p.a.d(p.a.d(j6.a.c((iC2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.i), 31, this.f326768j), 31, this.k);
        List list = this.f326769l;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f326770m;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
