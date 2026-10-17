package yvh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f317183a;

    public i(j jVar) {
        this.f317183a = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f317183a, ((i) obj2).f317183a);
    }

    public final int hashCode() {
        j jVar = this.f317183a;
        if (jVar == null) {
            return 0;
        }
        return jVar.hashCode();
    }
}
