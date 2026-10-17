package vkh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f289946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1h.g f289947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f289948c;
    public final Data d;

    public i() {
        this(null, null, null, null);
    }

    public static i a(i iVar, Data data, d1h.g gVar, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = iVar.f289946a;
        }
        if ((i & 2) != 0) {
            gVar = iVar.f289947b;
        }
        if ((i & 4) != 0) {
            data2 = iVar.f289948c;
        }
        if ((i & 8) != 0) {
            data3 = iVar.d;
        }
        iVar.getClass();
        return new i(data, gVar, data2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f289946a, iVar.f289946a) && Intrinsics.f(this.f289947b, iVar.f289947b) && Intrinsics.f(this.f289948c, iVar.f289948c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        Data data = this.f289946a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        d1h.g gVar = this.f289947b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Data data2 = this.f289948c;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.d;
        return iHashCode3 + (data3 != null ? data3.hashCode() : 0);
    }

    public i(Data data, d1h.g gVar, Data data2, Data data3) {
        this.f289946a = data;
        this.f289947b = gVar;
        this.f289948c = data2;
        this.d = data3;
    }
}
