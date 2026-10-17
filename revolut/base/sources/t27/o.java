package t27;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f267438b;

    public o(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f267437a = items;
        this.f267438b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f267437a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f267437a, oVar.f267437a) && this.f267438b == oVar.f267438b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f267438b) + (this.f267437a.hashCode() * 31);
    }
}
