package ro2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f255815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f255816b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255815a = items;
        this.f255816b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f255815a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f255815a, jVar.f255815a) && this.f255816b == jVar.f255816b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255816b) + (this.f255815a.hashCode() * 31);
    }
}
