package veh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f288321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f288322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f288323c;

    public e() {
        this(null, null, null);
    }

    public static e a(e eVar, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = eVar.f288321a;
        }
        if ((i & 2) != 0) {
            data2 = eVar.f288322b;
        }
        if ((i & 4) != 0) {
            data3 = eVar.f288323c;
        }
        eVar.getClass();
        return new e(data, data2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f288321a, eVar.f288321a) && Intrinsics.f(this.f288322b, eVar.f288322b) && Intrinsics.f(this.f288323c, eVar.f288323c);
    }

    public final int hashCode() {
        Data data = this.f288321a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f288322b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f288323c;
        return iHashCode2 + (data3 != null ? data3.hashCode() : 0);
    }

    public e(Data data, Data data2, Data data3) {
        this.f288321a = data;
        this.f288322b = data2;
        this.f288323c = data3;
    }
}
