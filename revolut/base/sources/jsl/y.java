package jsl;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f178254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f178256c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f178257g;

    public y() {
        this(0);
    }

    public static y a(y yVar, Data data, Data data2, o oVar, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = yVar.f178254a;
        }
        Data data7 = data;
        if ((i & 2) != 0) {
            data2 = yVar.f178255b;
        }
        Data data8 = data2;
        if ((i & 4) != 0) {
            oVar = yVar.f178256c;
        }
        o cancelActionState = oVar;
        if ((i & 8) != 0) {
            data3 = yVar.d;
        }
        Data data9 = data3;
        if ((i & 16) != 0) {
            data4 = yVar.e;
        }
        Data data10 = data4;
        if ((i & 32) != 0) {
            data5 = yVar.f;
        }
        Data data11 = data5;
        if ((i & 64) != 0) {
            data6 = yVar.f178257g;
        }
        yVar.getClass();
        Intrinsics.checkNotNullParameter(cancelActionState, "cancelActionState");
        return new y(data7, data8, cancelActionState, data9, data10, data11, data6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f178254a, yVar.f178254a) && Intrinsics.f(this.f178255b, yVar.f178255b) && Intrinsics.f(this.f178256c, yVar.f178256c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f178257g, yVar.f178257g);
    }

    public final int hashCode() {
        Data data = this.f178254a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f178255b;
        int iHashCode2 = (this.f178256c.hashCode() + ((iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31)) * 31;
        Data data3 = this.d;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.e;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.f;
        int iHashCode5 = (iHashCode4 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.f178257g;
        return iHashCode5 + (data6 != null ? data6.hashCode() : 0);
    }

    public y(Data data, Data data2, o cancelActionState, Data data3, Data data4, Data data5, Data data6) {
        Intrinsics.checkNotNullParameter(cancelActionState, "cancelActionState");
        this.f178254a = data;
        this.f178255b = data2;
        this.f178256c = cancelActionState;
        this.d = data3;
        this.e = data4;
        this.f = data5;
        this.f178257g = data6;
    }

    public /* synthetic */ y(int i) {
        this(null, null, m.f178223a, null, null, null, null);
    }
}
