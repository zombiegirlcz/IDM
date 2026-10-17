package ub3;

import ip0.wy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wy f278728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f278729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy f278730c;
    public final a d;

    public b(wy primaryButton, a primaryButtonType, wy wyVar, a aVar) {
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(primaryButtonType, "primaryButtonType");
        this.f278728a = primaryButton;
        this.f278729b = primaryButtonType;
        this.f278730c = wyVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f278728a, bVar.f278728a) && this.f278729b == bVar.f278729b && Intrinsics.f(this.f278730c, bVar.f278730c) && this.d == bVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f278729b.hashCode() + (this.f278728a.hashCode() * 31)) * 31;
        wy wyVar = this.f278730c;
        int iHashCode2 = (iHashCode + (wyVar == null ? 0 : wyVar.hashCode())) * 31;
        a aVar = this.d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
