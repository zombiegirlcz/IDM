package xdb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f304393a;

    public g(c cVar) {
        this.f304393a = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f304393a, ((g) obj2).f304393a);
    }

    public final int hashCode() {
        c cVar = this.f304393a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
