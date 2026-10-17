package sxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qxd.a f266431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f266432b;

    public i(dj0.d dVar, qxd.a editMode) {
        Intrinsics.checkNotNullParameter(editMode, "editMode");
        this.f266431a = editMode;
        this.f266432b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f266431a == iVar.f266431a && Intrinsics.f(this.f266432b, iVar.f266432b);
    }

    public final int hashCode() {
        int iHashCode = this.f266431a.hashCode() * 31;
        dj0.d dVar = this.f266432b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
