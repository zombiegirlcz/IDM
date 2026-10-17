package l7g;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f192583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f192584b;

    public a0(ArrayList active, ArrayList inactive) {
        Intrinsics.checkNotNullParameter(active, "active");
        Intrinsics.checkNotNullParameter(inactive, "inactive");
        this.f192583a = active;
        this.f192584b = inactive;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f192583a.equals(a0Var.f192583a) && this.f192584b.equals(a0Var.f192584b);
    }

    public final int hashCode() {
        return this.f192584b.hashCode() + (this.f192583a.hashCode() * 31);
    }
}
