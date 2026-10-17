package tq4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273525b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f273524a = items;
        this.f273525b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f273524a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f273524a, fVar.f273524a) && this.f273525b == fVar.f273525b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273525b) + (this.f273524a.hashCode() * 31);
    }
}
