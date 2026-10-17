package al4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6141a;

    public f(List entryPoints) {
        Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
        this.f6141a = entryPoints;
    }

    @Override // qx4.h
    public final int a() {
        return this.f6141a.size();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f6141a, ((f) obj2).f6141a);
    }

    public final int hashCode() {
        return this.f6141a.hashCode();
    }
}
