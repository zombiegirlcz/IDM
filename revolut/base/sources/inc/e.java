package inc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f162774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f162775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final doc.j f162776c;
    public final boolean d;
    public final Data e;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data data, Data data2, doc.j jVar, boolean z, Data data3, int i) {
        if ((i & 1) != 0) {
            data = eVar.f162774a;
        }
        Data data4 = data;
        if ((i & 2) != 0) {
            data2 = eVar.f162775b;
        }
        Data data5 = data2;
        if ((i & 4) != 0) {
            jVar = eVar.f162776c;
        }
        doc.j jVar2 = jVar;
        if ((i & 8) != 0) {
            z = eVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            data3 = eVar.e;
        }
        eVar.getClass();
        return new e(data4, data5, jVar2, z3, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f162774a, eVar.f162774a) && Intrinsics.f(this.f162775b, eVar.f162775b) && Intrinsics.f(this.f162776c, eVar.f162776c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        Data data = this.f162774a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f162775b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        doc.j jVar = this.f162776c;
        int iC = j6.a.c((iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.d);
        Data data3 = this.e;
        return iC + (data3 != null ? data3.hashCode() : 0);
    }

    public /* synthetic */ e(int i) {
        this(null, null, null, false, null);
    }

    public e(Data data, Data data2, doc.j jVar, boolean z, Data data3) {
        this.f162774a = data;
        this.f162775b = data2;
        this.f162776c = jVar;
        this.d = z;
        this.e = data3;
    }
}
