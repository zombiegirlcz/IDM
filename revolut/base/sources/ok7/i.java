package ok7;

import jki.o;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f225922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225923b;

    public i(boolean z, boolean z3) {
        this.f225922a = z;
        this.f225923b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f225922a == iVar.f225922a && this.f225923b == iVar.f225923b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225923b) + (Boolean.hashCode(this.f225922a) * 31);
    }
}
