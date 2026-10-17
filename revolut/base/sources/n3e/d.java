package n3e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.g f211993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f211994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f211995c;

    public d() {
        this((lk0.g) null, (Data) null, 7);
    }

    public static d a(d dVar, lk0.g purchases, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            purchases = dVar.f211993a;
        }
        if ((i & 2) != 0) {
            data = dVar.f211994b;
        }
        if ((i & 4) != 0) {
            z = dVar.f211995c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        return new d(purchases, data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f211993a, dVar.f211993a) && Intrinsics.f(this.f211994b, dVar.f211994b) && this.f211995c == dVar.f211995c;
    }

    public final int hashCode() {
        int iHashCode = this.f211993a.f196174a.hashCode() * 31;
        Data data = this.f211994b;
        return Boolean.hashCode(this.f211995c) + ((iHashCode + (data == null ? 0 : data.hashCode())) * 31);
    }

    public d(lk0.g purchases, Data data, boolean z) {
        Intrinsics.checkNotNullParameter(purchases, "purchases");
        this.f211993a = purchases;
        this.f211994b = data;
        this.f211995c = z;
    }

    public d(lk0.g gVar, Data data, int i) {
        this((i & 1) != 0 ? new lk0.g(f0.f322471a) : gVar, (i & 2) != 0 ? null : data, false);
    }
}
