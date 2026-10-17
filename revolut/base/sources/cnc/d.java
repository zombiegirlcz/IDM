package cnc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f25386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f25387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f25388c;
    public final Data d;
    public final Data e;
    public final Data f;

    public d() {
        this(0);
    }

    public static d a(d dVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = dVar.f25386a;
        }
        Data data7 = data;
        if ((i & 2) != 0) {
            data2 = dVar.f25387b;
        }
        Data data8 = data2;
        if ((i & 4) != 0) {
            data3 = dVar.f25388c;
        }
        Data data9 = data3;
        if ((i & 8) != 0) {
            data4 = dVar.d;
        }
        Data data10 = data4;
        if ((i & 16) != 0) {
            data5 = dVar.e;
        }
        Data data11 = data5;
        if ((i & 32) != 0) {
            data6 = dVar.f;
        }
        dVar.getClass();
        return new d(data7, data8, data9, data10, data11, data6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f25386a, dVar.f25386a) && Intrinsics.f(this.f25387b, dVar.f25387b) && Intrinsics.f(this.f25388c, dVar.f25388c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        Data data = this.f25386a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f25387b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f25388c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.e;
        int iHashCode5 = (iHashCode4 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.f;
        return iHashCode5 + (data6 != null ? data6.hashCode() : 0);
    }

    public /* synthetic */ d(int i) {
        this(null, null, null, null, null, null);
    }

    public d(Data data, Data data2, Data data3, Data data4, Data data5, Data data6) {
        this.f25386a = data;
        this.f25387b = data2;
        this.f25388c = data3;
        this.d = data4;
        this.e = data5;
        this.f = data6;
    }
}
