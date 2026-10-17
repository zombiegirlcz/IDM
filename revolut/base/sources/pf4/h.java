package pf4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cv3.k f235440a;

    public h() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f235440a, ((h) obj2).f235440a);
    }

    public final int hashCode() {
        cv3.k kVar = this.f235440a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public h(cv3.k kVar) {
        this.f235440a = kVar;
    }
}
