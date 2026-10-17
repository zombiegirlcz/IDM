package od9;

import kotlin.jvm.internal.Intrinsics;
import til.l;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f224334a;

    public f() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f224334a, ((f) obj2).f224334a);
    }

    public final int hashCode() {
        l lVar = this.f224334a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public f(l lVar) {
        this.f224334a = lVar;
    }
}
