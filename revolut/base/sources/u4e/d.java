package u4e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f277321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f277322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f277323c;

    public d() {
        this(null, null, null);
    }

    public static d a(d dVar, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = dVar.f277321a;
        }
        if ((i & 2) != 0) {
            data2 = dVar.f277322b;
        }
        if ((i & 4) != 0) {
            data3 = dVar.f277323c;
        }
        dVar.getClass();
        return new d(data, data2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f277321a, dVar.f277321a) && Intrinsics.f(this.f277322b, dVar.f277322b) && Intrinsics.f(this.f277323c, dVar.f277323c);
    }

    public final int hashCode() {
        Data data = this.f277321a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f277322b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f277323c;
        return iHashCode2 + (data3 != null ? data3.hashCode() : 0);
    }

    public d(Data data, Data data2, Data data3) {
        this.f277321a = data;
        this.f277322b = data2;
        this.f277323c = data3;
    }
}
