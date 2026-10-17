package tcg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f269796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f269797b;

    public o(aim.e hints, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(hints, "hints");
        this.f269796a = items;
        this.f269797b = hints;
    }

    @Override // cli.p
    public final List c() {
        return this.f269796a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f269796a, oVar.f269796a) && Intrinsics.f(this.f269797b, oVar.f269797b);
    }

    public final int hashCode() {
        return this.f269797b.hashCode() + (this.f269796a.hashCode() * 31);
    }
}
