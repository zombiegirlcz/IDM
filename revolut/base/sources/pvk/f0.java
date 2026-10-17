package pvk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f240279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2h.d f240280b;

    public f0(ArrayList items, n2h.d footerState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f240279a = items;
        this.f240280b = footerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f240279a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f240279a.equals(f0Var.f240279a) && this.f240280b.equals(f0Var.f240280b);
    }

    public final int hashCode() {
        return this.f240280b.hashCode() + (this.f240279a.hashCode() * 31);
    }
}
