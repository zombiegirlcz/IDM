package g62;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f140816b;

    public d(Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f140815a = data;
        this.f140816b = z;
    }

    public static d a(d dVar, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            data = dVar.f140815a;
        }
        if ((i & 2) != 0) {
            z = dVar.f140816b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new d(data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f140815a, dVar.f140815a) && this.f140816b == dVar.f140816b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140816b) + (this.f140815a.hashCode() * 31);
    }
}
