package vn6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f290764b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290763a = items;
        this.f290764b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f290763a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f290763a, hVar.f290763a) && this.f290764b == hVar.f290764b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f290764b) + (this.f290763a.hashCode() * 31);
    }
}
