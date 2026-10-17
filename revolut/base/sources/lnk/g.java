package lnk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qha.g f197296a;

    public g(qha.g gVar) {
        this.f197296a = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f197296a, ((g) obj2).f197296a);
    }

    public final int hashCode() {
        qha.g gVar = this.f197296a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }
}
