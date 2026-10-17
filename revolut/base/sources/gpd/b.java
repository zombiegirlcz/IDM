package gpd;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f145436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f145437b;

    public b(Data data, i3 i3Var) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f145436a = data;
        this.f145437b = i3Var;
    }

    public static b a(b bVar, Data data, i3 i3Var, int i) {
        if ((i & 1) != 0) {
            data = bVar.f145436a;
        }
        if ((i & 2) != 0) {
            i3Var = bVar.f145437b;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        return new b(data, i3Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f145436a, bVar.f145436a) && Intrinsics.f(this.f145437b, bVar.f145437b);
    }

    public final int hashCode() {
        int iHashCode = this.f145436a.hashCode() * 31;
        i3 i3Var = this.f145437b;
        return iHashCode + (i3Var == null ? 0 : i3Var.hashCode());
    }
}
