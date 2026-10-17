package i6j;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f159018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f159019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f159020c;
    public final Data d;
    public final Data e;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            data = fVar.f159018a;
        }
        Data data6 = data;
        if ((i & 2) != 0) {
            data2 = fVar.f159019b;
        }
        Data data7 = data2;
        if ((i & 4) != 0) {
            data3 = fVar.f159020c;
        }
        Data data8 = data3;
        if ((i & 8) != 0) {
            data4 = fVar.d;
        }
        Data data9 = data4;
        if ((i & 16) != 0) {
            data5 = fVar.e;
        }
        fVar.getClass();
        return new f(data6, data7, data8, data9, data5);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f159018a, fVar.f159018a) && Intrinsics.f(this.f159019b, fVar.f159019b) && Intrinsics.f(this.f159020c, fVar.f159020c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        Data data = this.f159018a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f159019b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f159020c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.e;
        return iHashCode4 + (data5 != null ? data5.hashCode() : 0);
    }

    public /* synthetic */ f(int i) {
        this(null, null, null, null, null);
    }

    public f(Data data, Data data2, Data data3, Data data4, Data data5) {
        this.f159018a = data;
        this.f159019b = data2;
        this.f159020c = data3;
        this.d = data4;
        this.e = data5;
    }
}
