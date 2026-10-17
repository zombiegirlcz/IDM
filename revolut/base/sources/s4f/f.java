package s4f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f259849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f259850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259851c;
    public final Data d;
    public final Data e;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data data, Data data2, String str, Data data3, Data data4, int i) {
        if ((i & 1) != 0) {
            data = fVar.f259849a;
        }
        Data data5 = data;
        fVar.getClass();
        if ((i & 4) != 0) {
            data2 = fVar.f259850b;
        }
        Data data6 = data2;
        if ((i & 8) != 0) {
            str = fVar.f259851c;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            data3 = fVar.d;
        }
        Data data7 = data3;
        if ((i & 32) != 0) {
            data4 = fVar.e;
        }
        fVar.getClass();
        return new f(data5, data6, data7, data4, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f259849a, fVar.f259849a) && Intrinsics.f(this.f259850b, fVar.f259850b) && Intrinsics.f(this.f259851c, fVar.f259851c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        Data data = this.f259849a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 961;
        Data data2 = this.f259850b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        String str = this.f259851c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Data data3 = this.d;
        int iHashCode4 = (iHashCode3 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.e;
        return iHashCode4 + (data4 != null ? data4.hashCode() : 0);
    }

    public /* synthetic */ f(int i) {
        this(null, null, null, null, null);
    }

    public f(Data data, Data data2, Data data3, Data data4, String str) {
        this.f259849a = data;
        this.f259850b = data2;
        this.f259851c = str;
        this.d = data3;
        this.e = data4;
    }
}
