package d0j;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f110390b;

    public e0(String title, ArrayList criteria) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(criteria, "criteria");
        this.f110389a = title;
        this.f110390b = criteria;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f110389a, e0Var.f110389a) && this.f110390b.equals(e0Var.f110390b);
    }

    public final int hashCode() {
        return this.f110390b.hashCode() + (this.f110389a.hashCode() * 31);
    }
}
