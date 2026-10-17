package o92;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f223065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f223066b;

    public g(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f223065a = items;
        this.f223066b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f223065a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f223065a, gVar.f223065a) && this.f223066b == gVar.f223066b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223066b) + (this.f223065a.hashCode() * 31);
    }
}
