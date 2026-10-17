package jsl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f178246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f178248c;
    public final Data d;
    public final boolean e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f178249g;

    public w() {
        this(0);
    }

    public static w a(w wVar, Data data, Data data2, Data data3, Data data4, boolean z, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = wVar.f178246a;
        }
        Data data7 = data;
        if ((i & 2) != 0) {
            data2 = wVar.f178247b;
        }
        Data data8 = data2;
        if ((i & 4) != 0) {
            data3 = wVar.f178248c;
        }
        Data data9 = data3;
        if ((i & 8) != 0) {
            data4 = wVar.d;
        }
        Data data10 = data4;
        if ((i & 16) != 0) {
            z = wVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            data5 = wVar.f;
        }
        Data data11 = data5;
        if ((i & 64) != 0) {
            data6 = wVar.f178249g;
        }
        wVar.getClass();
        return new w(data7, data8, data9, data10, data11, data6, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f178246a, wVar.f178246a) && Intrinsics.f(this.f178247b, wVar.f178247b) && Intrinsics.f(this.f178248c, wVar.f178248c) && Intrinsics.f(this.d, wVar.d) && this.e == wVar.e && Intrinsics.f(this.f, wVar.f) && Intrinsics.f(this.f178249g, wVar.f178249g);
    }

    public final int hashCode() {
        Data data = this.f178246a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f178247b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f178248c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        int iC = j6.a.c((iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31, 31, this.e);
        Data data5 = this.f;
        int iHashCode4 = (iC + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.f178249g;
        return iHashCode4 + (data6 != null ? data6.hashCode() : 0);
    }

    public /* synthetic */ w(int i) {
        this(null, null, null, null, null, null, false);
    }

    public w(Data data, Data data2, Data data3, Data data4, Data data5, Data data6, boolean z) {
        this.f178246a = data;
        this.f178247b = data2;
        this.f178248c = data3;
        this.d = data4;
        this.e = z;
        this.f = data5;
        this.f178249g = data6;
    }
}
