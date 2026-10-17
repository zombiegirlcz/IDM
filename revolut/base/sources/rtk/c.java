package rtk;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f257299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f257300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f257301c;
    public final Data d;

    public c() {
        this(null, null, null, null);
    }

    public static c a(c cVar, Data data, Data data2, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = cVar.f257299a;
        }
        if ((i & 2) != 0) {
            data2 = cVar.f257300b;
        }
        if ((i & 4) != 0) {
            data3 = cVar.f257301c;
        }
        if ((i & 8) != 0) {
            data4 = cVar.d;
        }
        cVar.getClass();
        return new c(data, data2, data3, data4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f257299a, cVar.f257299a) && Intrinsics.f(this.f257300b, cVar.f257300b) && Intrinsics.f(this.f257301c, cVar.f257301c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        Data data = this.f257299a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f257300b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f257301c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        return iHashCode3 + (data4 != null ? data4.hashCode() : 0);
    }

    public c(Data data, Data data2, Data data3, Data data4) {
        this.f257299a = data;
        this.f257300b = data2;
        this.f257301c = data3;
        this.d = data4;
    }
}
