package ynd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnd.g f315458a;

    public j(rnd.g gVar) {
        this.f315458a = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f315458a, ((j) obj2).f315458a);
    }

    public final int hashCode() {
        rnd.g gVar = this.f315458a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }
}
