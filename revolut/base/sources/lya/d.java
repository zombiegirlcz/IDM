package lya;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f200770a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f200770a, ((d) obj2).f200770a);
    }

    public final int hashCode() {
        c cVar = this.f200770a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public d(c cVar) {
        this.f200770a = cVar;
    }
}
