package y4f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x4f.a f310908a;

    public j(x4f.a section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f310908a = section;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f310908a == ((j) obj2).f310908a;
    }

    public final int hashCode() {
        return this.f310908a.hashCode();
    }
}
