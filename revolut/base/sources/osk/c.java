package osk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f229341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f229342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f229343c;
    public final Data d;

    public c() {
        this(null, null, null, null);
    }

    public static c a(c cVar, hel.b bVar, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            bVar = cVar.f229341a;
        }
        if ((i & 2) != 0) {
            data = cVar.f229342b;
        }
        if ((i & 4) != 0) {
            data2 = cVar.f229343c;
        }
        if ((i & 8) != 0) {
            data3 = cVar.d;
        }
        cVar.getClass();
        return new c(bVar, data, data2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f229341a == cVar.f229341a && Intrinsics.f(this.f229342b, cVar.f229342b) && Intrinsics.f(this.f229343c, cVar.f229343c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        hel.b bVar = this.f229341a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Data data = this.f229342b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        Data data2 = this.f229343c;
        int iHashCode3 = (iHashCode2 + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.d;
        return iHashCode3 + (data3 != null ? data3.hashCode() : 0);
    }

    public c(hel.b bVar, Data data, Data data2, Data data3) {
        this.f229341a = bVar;
        this.f229342b = data;
        this.f229343c = data2;
        this.d = data3;
    }
}
