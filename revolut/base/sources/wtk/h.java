package wtk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f300013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f300014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fuk.h f300015c;
    public final Data d;

    public h() {
        this(null, null, null, null);
    }

    public static h a(h hVar, Data data, Data data2, fuk.h hVar2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = hVar.f300013a;
        }
        if ((i & 2) != 0) {
            data2 = hVar.f300014b;
        }
        if ((i & 4) != 0) {
            hVar2 = hVar.f300015c;
        }
        if ((i & 8) != 0) {
            data3 = hVar.d;
        }
        hVar.getClass();
        return new h(data, data2, hVar2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f300013a, hVar.f300013a) && Intrinsics.f(this.f300014b, hVar.f300014b) && Intrinsics.f(this.f300015c, hVar.f300015c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        Data data = this.f300013a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f300014b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        fuk.h hVar = this.f300015c;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        Data data3 = this.d;
        return iHashCode3 + (data3 != null ? data3.hashCode() : 0);
    }

    public h(Data data, Data data2, fuk.h hVar, Data data3) {
        this.f300013a = data;
        this.f300014b = data2;
        this.f300015c = hVar;
        this.d = data3;
    }
}
