package lzi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f201004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f201005b;

    public t(v id10, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f201004a = id10;
        this.f201005b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f201004a == tVar.f201004a && this.f201005b == tVar.f201005b;
    }

    @Override // lzi.u
    public final v getId() {
        return this.f201004a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201005b) + (this.f201004a.hashCode() * 31);
    }
}
