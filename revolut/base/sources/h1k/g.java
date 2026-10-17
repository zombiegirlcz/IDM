package h1k;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthNewsCategory f148592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f148593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f148594c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f148595g;

    public g(WealthNewsCategory category, boolean z, Data data, Data data2, Data data3, Data data4, Data data5) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f148592a = category;
        this.f148593b = z;
        this.f148594c = data;
        this.d = data2;
        this.e = data3;
        this.f = data4;
        this.f148595g = data5;
    }

    public static g a(g gVar, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        WealthNewsCategory category = gVar.f148592a;
        boolean z = gVar.f148593b;
        if ((i & 4) != 0) {
            data = gVar.f148594c;
        }
        Data data6 = data;
        if ((i & 8) != 0) {
            data2 = gVar.d;
        }
        Data data7 = data2;
        if ((i & 16) != 0) {
            data3 = gVar.e;
        }
        Data data8 = data3;
        if ((i & 32) != 0) {
            data4 = gVar.f;
        }
        Data data9 = data4;
        if ((i & 64) != 0) {
            data5 = gVar.f148595g;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        return new g(category, z, data6, data7, data8, data9, data5);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f148592a, gVar.f148592a) && this.f148593b == gVar.f148593b && Intrinsics.f(this.f148594c, gVar.f148594c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f148595g, gVar.f148595g);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f148592a.hashCode() * 31, 31, this.f148593b);
        Data data = this.f148594c;
        int iHashCode = (iC + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.d;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.e;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.f;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.f148595g;
        return iHashCode4 + (data5 != null ? data5.hashCode() : 0);
    }
}
