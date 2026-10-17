package qjf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f246862a;

    public b(c cVar) {
        this.f246862a = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f246862a, ((b) obj2).f246862a);
    }

    public final int hashCode() {
        c cVar = this.f246862a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
