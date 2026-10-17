package jtd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f178485a;

    public n(hha.d dVar) {
        this.f178485a = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f178485a, ((n) obj2).f178485a);
    }

    public final int hashCode() {
        hha.d dVar = this.f178485a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
