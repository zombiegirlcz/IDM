package fci;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f133813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f133814b;

    public t0(Data catalog, List selectedPurposes) {
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        this.f133813a = catalog;
        this.f133814b = selectedPurposes;
    }

    public static t0 a(t0 t0Var, Data catalog, List selectedPurposes, int i) {
        if ((i & 1) != 0) {
            catalog = t0Var.f133813a;
        }
        if ((i & 2) != 0) {
            selectedPurposes = t0Var.f133814b;
        }
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        return new t0(catalog, selectedPurposes);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f133813a, t0Var.f133813a) && Intrinsics.f(this.f133814b, t0Var.f133814b);
    }

    public final int hashCode() {
        return this.f133814b.hashCode() + (this.f133813a.hashCode() * 31);
    }
}
