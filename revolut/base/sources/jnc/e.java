package jnc;

import com.revolut.data.model.Data;
import jlc.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f176684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f176685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f176686c;
    public final Data d;
    public final Data e;

    public e() {
        this(0);
    }

    public static e a(e eVar, r rVar, Data data, Data data2, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            rVar = eVar.f176684a;
        }
        r rVar2 = rVar;
        if ((i & 2) != 0) {
            data = eVar.f176685b;
        }
        Data data5 = data;
        eVar.getClass();
        if ((i & 8) != 0) {
            data2 = eVar.f176686c;
        }
        Data data6 = data2;
        if ((i & 16) != 0) {
            data3 = eVar.d;
        }
        Data data7 = data3;
        if ((i & 32) != 0) {
            data4 = eVar.e;
        }
        eVar.getClass();
        return new e(rVar2, data5, data6, data7, data4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f176684a, eVar.f176684a) && Intrinsics.f(this.f176685b, eVar.f176685b) && Intrinsics.f(this.f176686c, eVar.f176686c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        r rVar = this.f176684a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        Data data = this.f176685b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 961;
        Data data2 = this.f176686c;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.d;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.e;
        return iHashCode4 + (data4 != null ? data4.hashCode() : 0);
    }

    public /* synthetic */ e(int i) {
        this(null, null, null, null, null);
    }

    public e(r rVar, Data data, Data data2, Data data3, Data data4) {
        this.f176684a = rVar;
        this.f176685b = data;
        this.f176686c = data2;
        this.d = data3;
        this.e = data4;
    }
}
