package mtl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f208911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f208912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f208913c;
    public final Data d;
    public final Data e;
    public final d1h.g f;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data data, Data data2, Data data3, Data data4, Data data5, d1h.g gVar, int i) {
        if ((i & 1) != 0) {
            data = aVar.f208911a;
        }
        Data data6 = data;
        if ((i & 2) != 0) {
            data2 = aVar.f208912b;
        }
        Data data7 = data2;
        if ((i & 4) != 0) {
            data3 = aVar.f208913c;
        }
        Data data8 = data3;
        if ((i & 8) != 0) {
            data4 = aVar.d;
        }
        Data data9 = data4;
        if ((i & 16) != 0) {
            data5 = aVar.e;
        }
        Data data10 = data5;
        if ((i & 32) != 0) {
            gVar = aVar.f;
        }
        aVar.getClass();
        return new a(data6, data7, data8, data9, data10, gVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f208911a, aVar.f208911a) && Intrinsics.f(this.f208912b, aVar.f208912b) && Intrinsics.f(this.f208913c, aVar.f208913c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        Data data = this.f208911a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f208912b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f208913c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.e;
        int iHashCode5 = (iHashCode4 + (data5 == null ? 0 : data5.hashCode())) * 31;
        d1h.g gVar = this.f;
        return iHashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }

    public /* synthetic */ a(int i) {
        this(null, null, null, null, null, null);
    }

    public a(Data data, Data data2, Data data3, Data data4, Data data5, d1h.g gVar) {
        this.f208911a = data;
        this.f208912b = data2;
        this.f208913c = data3;
        this.d = data4;
        this.e = data5;
        this.f = gVar;
    }
}
