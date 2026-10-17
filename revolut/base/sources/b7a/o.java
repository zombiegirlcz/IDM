package b7a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12986b;

    public o(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f12985a = items;
        this.f12986b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f12985a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f12985a, oVar.f12985a) && this.f12986b == oVar.f12986b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12986b) + (this.f12985a.hashCode() * 31);
    }
}
