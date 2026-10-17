package jsl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f178251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f178253c;
    public final boolean d;
    public final Data e;
    public final Data f;

    public x() {
        this(0);
    }

    public static x a(x xVar, Data data, Data data2, Data data3, boolean z, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            data = xVar.f178251a;
        }
        Data data6 = data;
        if ((i & 2) != 0) {
            data2 = xVar.f178252b;
        }
        Data data7 = data2;
        if ((i & 4) != 0) {
            data3 = xVar.f178253c;
        }
        Data data8 = data3;
        if ((i & 8) != 0) {
            z = xVar.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            data4 = xVar.e;
        }
        Data data9 = data4;
        if ((i & 32) != 0) {
            data5 = xVar.f;
        }
        xVar.getClass();
        return new x(data6, data7, data8, data9, data5, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f178251a, xVar.f178251a) && Intrinsics.f(this.f178252b, xVar.f178252b) && Intrinsics.f(this.f178253c, xVar.f178253c) && this.d == xVar.d && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f);
    }

    public final int hashCode() {
        Data data = this.f178251a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f178252b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f178253c;
        int iC = j6.a.c((iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31, 31, this.d);
        Data data4 = this.e;
        int iHashCode3 = (iC + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.f;
        return iHashCode3 + (data5 != null ? data5.hashCode() : 0);
    }

    public /* synthetic */ x(int i) {
        this(null, null, null, null, null, false);
    }

    public x(Data data, Data data2, Data data3, Data data4, Data data5, boolean z) {
        this.f178251a = data;
        this.f178252b = data2;
        this.f178253c = data3;
        this.d = z;
        this.e = data4;
        this.f = data5;
    }
}
