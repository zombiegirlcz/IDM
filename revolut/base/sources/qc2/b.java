package qc2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f244516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f244517b;

    public b(Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f244516a = data;
        this.f244517b = z;
    }

    public static b a(b bVar, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            data = bVar.f244516a;
        }
        if ((i & 2) != 0) {
            z = bVar.f244517b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new b(data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f244516a, bVar.f244516a) && this.f244517b == bVar.f244517b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f244517b) + (this.f244516a.hashCode() * 31);
    }
}
