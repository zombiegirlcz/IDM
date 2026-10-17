package bt9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f18463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18464b;

    public j(Data data, boolean z) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f18463a = data;
        this.f18464b = z;
    }

    public static j a(j jVar, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            data = jVar.f18463a;
        }
        if ((i & 2) != 0) {
            z = jVar.f18464b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new j(data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f18463a, jVar.f18463a) && this.f18464b == jVar.f18464b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18464b) + (this.f18463a.hashCode() * 31);
    }
}
