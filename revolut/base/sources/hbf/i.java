package hbf;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f150664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f150665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f150666c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public i() {
        this(0);
    }

    public static i a(i iVar, Data data, Data data2, Data data3, List list, boolean z, boolean z3, int i) {
        if ((i & 1) != 0) {
            data = iVar.f150664a;
        }
        Data data4 = data;
        if ((i & 2) != 0) {
            data2 = iVar.f150665b;
        }
        Data data5 = data2;
        if ((i & 4) != 0) {
            data3 = iVar.f150666c;
        }
        Data data6 = data3;
        if ((i & 8) != 0) {
            list = iVar.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            z = iVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z3 = iVar.f;
        }
        iVar.getClass();
        return new i(data4, data5, data6, list2, z4, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f150664a, iVar.f150664a) && Intrinsics.f(this.f150665b, iVar.f150665b) && Intrinsics.f(this.f150666c, iVar.f150666c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && this.f == iVar.f;
    }

    public final int hashCode() {
        Data data = this.f150664a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f150665b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f150666c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        List list = this.d;
        return Boolean.hashCode(this.f) + j6.a.c((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31, 31, this.e);
    }

    public /* synthetic */ i(int i) {
        this(null, null, null, null, false, true);
    }

    public i(Data data, Data data2, Data data3, List list, boolean z, boolean z3) {
        this.f150664a = data;
        this.f150665b = data2;
        this.f150666c = data3;
        this.d = list;
        this.e = z;
        this.f = z3;
    }
}
