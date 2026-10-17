package kw1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f190203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f190204b;

    public f(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f190203a = items;
        this.f190204b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f190203a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f190203a, fVar.f190203a) && this.f190204b == fVar.f190204b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f190204b) + (this.f190203a.hashCode() * 31);
    }
}
