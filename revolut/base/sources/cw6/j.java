package cw6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f109549b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109548a = items;
        this.f109549b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f109548a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f109548a, jVar.f109548a) && this.f109549b == jVar.f109549b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109549b) + (this.f109548a.hashCode() * 31);
    }
}
