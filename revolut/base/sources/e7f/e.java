package e7f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f123319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f123320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f123321c;
    public final Data d;

    public e() {
        this(null, null, null, null);
    }

    public static e a(e eVar, Data data, Data data2, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = eVar.f123319a;
        }
        if ((i & 2) != 0) {
            data2 = eVar.f123320b;
        }
        if ((i & 4) != 0) {
            data3 = eVar.f123321c;
        }
        if ((i & 8) != 0) {
            data4 = eVar.d;
        }
        eVar.getClass();
        return new e(data, data2, data3, data4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f123319a, eVar.f123319a) && Intrinsics.f(this.f123320b, eVar.f123320b) && Intrinsics.f(this.f123321c, eVar.f123321c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        Data data = this.f123319a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f123320b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f123321c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        return iHashCode3 + (data4 != null ? data4.hashCode() : 0);
    }

    public e(Data data, Data data2, Data data3, Data data4) {
        this.f123319a = data;
        this.f123320b = data2;
        this.f123321c = data3;
        this.d = data4;
    }
}
