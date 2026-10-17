package ahe;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSpaceIdentifier f5054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pie.v f5055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5056c;
    public final List d;
    public final int e;
    public final boolean f;

    public x0(ProductSpaceIdentifier space, pie.v subspace, ArrayList subSpaceItems, List originalItems, int i, boolean z) {
        Intrinsics.checkNotNullParameter(space, "space");
        Intrinsics.checkNotNullParameter(subspace, "subspace");
        Intrinsics.checkNotNullParameter(subSpaceItems, "subSpaceItems");
        Intrinsics.checkNotNullParameter(originalItems, "originalItems");
        this.f5054a = space;
        this.f5055b = subspace;
        this.f5056c = subSpaceItems;
        this.d = originalItems;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f5054a, x0Var.f5054a) && this.f5055b == x0Var.f5055b && this.f5056c.equals(x0Var.f5056c) && Intrinsics.f(this.d, x0Var.d) && this.e == x0Var.e && this.f == x0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.b(this.e, p.a.d(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f5056c, (this.f5055b.hashCode() + (this.f5054a.hashCode() * 31)) * 31, 31), 31, this.d), 31);
    }
}
