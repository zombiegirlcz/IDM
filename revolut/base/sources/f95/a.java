package f95;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f132821a;

    public a(g gVar) {
        this.f132821a = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f132821a, ((a) obj2).f132821a);
    }

    public final int hashCode() {
        g gVar = this.f132821a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }
}
