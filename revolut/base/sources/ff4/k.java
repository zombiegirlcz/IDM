package ff4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f134726a;

    public k() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f134726a, ((k) obj2).f134726a);
    }

    public final int hashCode() {
        j jVar = this.f134726a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }

    public k(j jVar) {
        this.f134726a = jVar;
    }
}
