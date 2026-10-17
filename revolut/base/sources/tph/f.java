package tph;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import uqh.z;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f273378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f273379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f273380c;

    public f() {
        this(null, null, null);
    }

    public static f a(f fVar, z zVar, Data data, Data data2, int i) {
        if ((i & 1) != 0) {
            zVar = fVar.f273378a;
        }
        if ((i & 2) != 0) {
            data = fVar.f273379b;
        }
        if ((i & 4) != 0) {
            data2 = fVar.f273380c;
        }
        fVar.getClass();
        return new f(zVar, data, data2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f273378a, fVar.f273378a) && Intrinsics.f(this.f273379b, fVar.f273379b) && Intrinsics.f(this.f273380c, fVar.f273380c);
    }

    public final int hashCode() {
        z zVar = this.f273378a;
        int iHashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        Data data = this.f273379b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f273380c;
        return iHashCode2 + (data2 != null ? data2.hashCode() : 0);
    }

    public f(z zVar, Data data, Data data2) {
        this.f273378a = zVar;
        this.f273379b = data;
        this.f273380c = data2;
    }
}
