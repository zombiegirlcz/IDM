package rya;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f258267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f258268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f258269c;

    /* JADX WARN: Illegal instructions before constructor call */
    public b() {
        Data data = null;
        this(7, data, data, data);
    }

    public static b a(b bVar, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = bVar.f258267a;
        }
        if ((i & 2) != 0) {
            data2 = bVar.f258268b;
        }
        if ((i & 4) != 0) {
            data3 = bVar.f258269c;
        }
        bVar.getClass();
        return new b(data, data2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f258267a, bVar.f258267a) && Intrinsics.f(this.f258268b, bVar.f258268b) && Intrinsics.f(this.f258269c, bVar.f258269c);
    }

    public final int hashCode() {
        Data data = this.f258267a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f258268b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f258269c;
        return iHashCode2 + (data3 != null ? data3.hashCode() : 0);
    }

    public /* synthetic */ b(int i, Data data, Data data2, Data data3) {
        this((i & 1) != 0 ? null : data, (i & 2) != 0 ? null : data2, (i & 4) != 0 ? null : data3);
    }

    public b(Data data, Data data2, Data data3) {
        this.f258267a = data;
        this.f258268b = data2;
        this.f258269c = data3;
    }
}
