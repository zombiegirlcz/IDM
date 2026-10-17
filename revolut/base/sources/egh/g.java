package egh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f125649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f125650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f125651c;
    public final Data d;
    public final Data e;
    public final Data f;

    public static final class a {
        private a() {
        }
    }

    public g() {
        this(null, null, null, null, null, null);
    }

    public static g a(g gVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = gVar.f125649a;
        }
        Data data7 = data;
        if ((i & 2) != 0) {
            data2 = gVar.f125650b;
        }
        Data data8 = data2;
        if ((i & 4) != 0) {
            data3 = gVar.f125651c;
        }
        Data data9 = data3;
        if ((i & 8) != 0) {
            data4 = gVar.d;
        }
        Data data10 = data4;
        if ((i & 16) != 0) {
            data5 = gVar.e;
        }
        Data data11 = data5;
        if ((i & 32) != 0) {
            data6 = gVar.f;
        }
        gVar.getClass();
        return new g(data7, data8, data9, data10, data11, data6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f125649a, gVar.f125649a) && Intrinsics.f(this.f125650b, gVar.f125650b) && Intrinsics.f(this.f125651c, gVar.f125651c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        Data data = this.f125649a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f125650b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f125651c;
        int iHashCode3 = (iHashCode2 + (data3 == null ? 0 : data3.hashCode())) * 31;
        Data data4 = this.d;
        int iHashCode4 = (iHashCode3 + (data4 == null ? 0 : data4.hashCode())) * 31;
        Data data5 = this.e;
        int iHashCode5 = (iHashCode4 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.f;
        return iHashCode5 + (data6 != null ? data6.hashCode() : 0);
    }

    public g(Data data, Data data2, Data data3, Data data4, Data data5, Data data6) {
        this.f125649a = data;
        this.f125650b = data2;
        this.f125651c = data3;
        this.d = data4;
        this.e = data5;
        this.f = data6;
    }
}
