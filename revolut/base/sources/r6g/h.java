package r6g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f251841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f251842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7g.d f251843c;

    public h(int i, List selectedChildren, m7g.d selectedCabinClass) {
        Intrinsics.checkNotNullParameter(selectedChildren, "selectedChildren");
        Intrinsics.checkNotNullParameter(selectedCabinClass, "selectedCabinClass");
        this.f251841a = i;
        this.f251842b = selectedChildren;
        this.f251843c = selectedCabinClass;
    }

    public static h a(h hVar, int i, List selectedChildren, m7g.d selectedCabinClass, int i2) {
        if ((i2 & 1) != 0) {
            i = hVar.f251841a;
        }
        if ((i2 & 2) != 0) {
            selectedChildren = hVar.f251842b;
        }
        if ((i2 & 4) != 0) {
            selectedCabinClass = hVar.f251843c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(selectedChildren, "selectedChildren");
        Intrinsics.checkNotNullParameter(selectedCabinClass, "selectedCabinClass");
        return new h(i, selectedChildren, selectedCabinClass);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f251841a == hVar.f251841a && Intrinsics.f(this.f251842b, hVar.f251842b) && this.f251843c == hVar.f251843c;
    }

    public final int hashCode() {
        return this.f251843c.hashCode() + p.a.d(Integer.hashCode(this.f251841a) * 31, 31, this.f251842b);
    }
}
