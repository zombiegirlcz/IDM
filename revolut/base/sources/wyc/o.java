package wyc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f301218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f301219b;

    public o(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f301218a = z;
        this.f301219b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f301219b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f301218a == oVar.f301218a && Intrinsics.f(this.f301219b, oVar.f301219b);
    }

    public final int hashCode() {
        return this.f301219b.hashCode() + (Boolean.hashCode(this.f301218a) * 31);
    }
}
