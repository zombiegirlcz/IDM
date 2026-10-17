package uqh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f282183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f282184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f282185c;
    public final Data d;
    public final ScreenerSortingOptions e;
    public final ScreenerSortingOptions f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f282186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f282187h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f282188j;

    public z() {
        this(null, 1023);
    }

    public static z a(z zVar, t tVar, Data data, Data data2, Data data3, ScreenerSortingOptions screenerSortingOptions, ScreenerSortingOptions screenerSortingOptions2, boolean z, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            tVar = zVar.f282183a;
        }
        t tVar2 = tVar;
        if ((i & 2) != 0) {
            data = zVar.f282184b;
        }
        Data data7 = data;
        if ((i & 4) != 0) {
            data2 = zVar.f282185c;
        }
        Data data8 = data2;
        if ((i & 8) != 0) {
            data3 = zVar.d;
        }
        Data data9 = data3;
        ScreenerSortingOptions screenerSortingOptions3 = (i & 16) != 0 ? zVar.e : screenerSortingOptions;
        ScreenerSortingOptions screenerSortingOptions4 = (i & 32) != 0 ? zVar.f : screenerSortingOptions2;
        boolean z3 = (i & 64) != 0 ? zVar.f282186g : z;
        Data data10 = (i & 128) != 0 ? zVar.f282187h : data4;
        Data data11 = (i & 256) != 0 ? zVar.i : data5;
        Data data12 = (i & 512) != 0 ? zVar.f282188j : data6;
        zVar.getClass();
        return new z(tVar2, data7, data8, data9, screenerSortingOptions3, screenerSortingOptions4, z3, data10, data11, data12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f282183a, zVar.f282183a) && Intrinsics.f(this.f282184b, zVar.f282184b) && Intrinsics.f(this.f282185c, zVar.f282185c) && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e) && Intrinsics.f(this.f, zVar.f) && this.f282186g == zVar.f282186g && Intrinsics.f(this.f282187h, zVar.f282187h) && Intrinsics.f(this.i, zVar.i) && Intrinsics.f(this.f282188j, zVar.f282188j);
    }

    public final int hashCode() {
        t tVar = this.f282183a;
        int iHashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
        Data data = this.f282184b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f282185c;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.d;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        ScreenerSortingOptions screenerSortingOptions = this.e;
        int iHashCode5 = (iHashCode4 + (screenerSortingOptions == null ? 0 : screenerSortingOptions.hashCode())) * 31;
        ScreenerSortingOptions screenerSortingOptions2 = this.f;
        int iC = j6.a.c((iHashCode5 + (screenerSortingOptions2 == null ? 0 : screenerSortingOptions2.hashCode())) * 31, 31, this.f282186g);
        Data data4 = this.f282187h;
        int iHashCode6 = (iC + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.i;
        int iHashCode7 = (iHashCode6 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.f282188j;
        return iHashCode7 + (data6 != null ? data6.hashCode() : 0);
    }

    public /* synthetic */ z(t tVar, int i) {
        this((i & 1) != 0 ? null : tVar, null, null, null, null, null, true, null, null, null);
    }

    public z(t tVar, Data data, Data data2, Data data3, ScreenerSortingOptions screenerSortingOptions, ScreenerSortingOptions screenerSortingOptions2, boolean z, Data data4, Data data5, Data data6) {
        this.f282183a = tVar;
        this.f282184b = data;
        this.f282185c = data2;
        this.d = data3;
        this.e = screenerSortingOptions;
        this.f = screenerSortingOptions2;
        this.f282186g = z;
        this.f282187h = data4;
        this.i = data5;
        this.f282188j = data6;
    }
}
