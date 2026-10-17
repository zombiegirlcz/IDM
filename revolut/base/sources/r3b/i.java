package r3b;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j, fsl.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f251241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f251242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f251243c;
    public final Data d;
    public final Data e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f251244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f251245h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f251246j;
    public final d1h.g k;

    public i(Data data, Data data2, Data data3, Data data4, Data data5, List list, Data maintenanceMarginWidgetState, boolean z, Data data6, Data data7, d1h.g gVar) {
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetState, "maintenanceMarginWidgetState");
        this.f251241a = data;
        this.f251242b = data2;
        this.f251243c = data3;
        this.d = data4;
        this.e = data5;
        this.f = list;
        this.f251244g = maintenanceMarginWidgetState;
        this.f251245h = z;
        this.i = data6;
        this.f251246j = data7;
        this.k = gVar;
    }

    public static i c(i iVar, Data data, Data data2, Data data3, Data data4, Data data5, List list, Data data6, Data data7, Data data8, d1h.g gVar, int i) {
        if ((i & 1) != 0) {
            data = iVar.f251241a;
        }
        Data data9 = data;
        if ((i & 2) != 0) {
            data2 = iVar.f251242b;
        }
        Data data10 = data2;
        if ((i & 4) != 0) {
            data3 = iVar.f251243c;
        }
        Data data11 = data3;
        Data data12 = (i & 8) != 0 ? iVar.d : data4;
        Data data13 = (i & 16) != 0 ? iVar.e : data5;
        List list2 = (i & 32) != 0 ? iVar.f : list;
        Data maintenanceMarginWidgetState = (i & 64) != 0 ? iVar.f251244g : data6;
        boolean z = iVar.f251245h;
        Data data14 = (i & 256) != 0 ? iVar.i : data7;
        Data data15 = (i & 512) != 0 ? iVar.f251246j : data8;
        d1h.g gVar2 = (i & 1024) != 0 ? iVar.k : gVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(maintenanceMarginWidgetState, "maintenanceMarginWidgetState");
        return new i(data9, data10, data11, data12, data13, list2, maintenanceMarginWidgetState, z, data14, data15, gVar2);
    }

    @Override // fsl.n
    /* JADX INFO: renamed from: J0 */
    public final Data getF89864r() {
        return this.e;
    }

    @Override // fsl.n
    /* JADX INFO: renamed from: a */
    public final Data getF89863q() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f251241a, iVar.f251241a) && Intrinsics.f(this.f251242b, iVar.f251242b) && Intrinsics.f(this.f251243c, iVar.f251243c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f251244g, iVar.f251244g) && this.f251245h == iVar.f251245h && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f251246j, iVar.f251246j) && Intrinsics.f(this.k, iVar.k);
    }

    public final int hashCode() {
        Data data = this.f251241a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f251242b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f251243c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.e;
        int iHashCode5 = (iHashCode4 + (data5 == null ? 0 : data5.hashCode())) * 31;
        List list = this.f;
        int iC = j6.a.c(kii.e.c(this.f251244g, (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.f251245h);
        Data data6 = this.i;
        int iHashCode6 = (iC + (data6 == null ? 0 : data6.hashCode())) * 31;
        Data data7 = this.f251246j;
        int iHashCode7 = (iHashCode6 + (data7 == null ? 0 : data7.hashCode())) * 31;
        d1h.g gVar = this.k;
        return iHashCode7 + (gVar != null ? gVar.hashCode() : 0);
    }
}
