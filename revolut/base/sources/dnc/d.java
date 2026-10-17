package dnc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f116257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f116258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f116259c;
    public final Data d;
    public final Data e;
    public final ilc.a f;

    public d(l lVar, Data data, Data data2, Data data3, Data data4, ilc.a aVar) {
        this.f116257a = lVar;
        this.f116258b = data;
        this.f116259c = data2;
        this.d = data3;
        this.e = data4;
        this.f = aVar;
    }

    public static d a(d dVar, l lVar, Data data, Data data2, Data data3, Data data4, ilc.a aVar, int i) {
        if ((i & 1) != 0) {
            lVar = dVar.f116257a;
        }
        l lVar2 = lVar;
        if ((i & 2) != 0) {
            data = dVar.f116258b;
        }
        Data data5 = data;
        if ((i & 4) != 0) {
            data2 = dVar.f116259c;
        }
        Data data6 = data2;
        if ((i & 8) != 0) {
            data3 = dVar.d;
        }
        Data data7 = data3;
        if ((i & 16) != 0) {
            data4 = dVar.e;
        }
        Data data8 = data4;
        if ((i & 32) != 0) {
            aVar = dVar.f;
        }
        dVar.getClass();
        return new d(lVar2, data5, data6, data7, data8, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f116257a == dVar.f116257a && Intrinsics.f(this.f116258b, dVar.f116258b) && Intrinsics.f(this.f116259c, dVar.f116259c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f;
    }

    public final int hashCode() {
        l lVar = this.f116257a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        Data data = this.f116258b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f116259c;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.d;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.e;
        int iHashCode5 = (iHashCode4 + (data4 == null ? 0 : data4.hashCode())) * 31;
        ilc.a aVar = this.f;
        return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }
}
