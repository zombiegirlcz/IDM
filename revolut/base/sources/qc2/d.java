package qc2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244521a;

    public d(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f244521a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f244521a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f244521a, ((d) obj2).f244521a);
    }

    public final int hashCode() {
        return this.f244521a.hashCode();
    }
}
