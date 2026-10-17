package vh2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f289270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f289271b;

    public c(Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f289270a = data;
        this.f289271b = z;
    }

    public static c a(c cVar, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            data = cVar.f289270a;
        }
        if ((i & 2) != 0) {
            z = cVar.f289271b;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new c(data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f289270a, cVar.f289270a) && this.f289271b == cVar.f289271b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f289271b) + (this.f289270a.hashCode() * 31);
    }
}
