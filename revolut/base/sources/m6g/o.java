package m6g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f203103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f203104b;

    public o(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203103a = items;
        this.f203104b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f203103a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f203103a, oVar.f203103a) && this.f203104b == oVar.f203104b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203104b) + (this.f203103a.hashCode() * 31);
    }
}
