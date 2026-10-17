package oi4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225440b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f225439a = items;
        this.f225440b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f225439a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f225439a, jVar.f225439a) && this.f225440b == jVar.f225440b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225440b) + (this.f225439a.hashCode() * 31);
    }
}
