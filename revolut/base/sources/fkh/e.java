package fkh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f135827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f135828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f135829c;
    public final Boolean d;

    public e() {
        this(null, null, null, null);
    }

    public static e a(e eVar, Data data, Data data2, Boolean bool, Boolean bool2, int i) {
        if ((i & 1) != 0) {
            data = eVar.f135827a;
        }
        if ((i & 2) != 0) {
            data2 = eVar.f135828b;
        }
        if ((i & 4) != 0) {
            bool = eVar.f135829c;
        }
        if ((i & 8) != 0) {
            bool2 = eVar.d;
        }
        eVar.getClass();
        return new e(data, data2, bool, bool2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f135827a, eVar.f135827a) && Intrinsics.f(this.f135828b, eVar.f135828b) && Intrinsics.f(this.f135829c, eVar.f135829c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        Data data = this.f135827a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f135828b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Boolean bool = this.f135829c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.d;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public e(Data data, Data data2, Boolean bool, Boolean bool2) {
        this.f135827a = data;
        this.f135828b = data2;
        this.f135829c = bool;
        this.d = bool2;
    }
}
