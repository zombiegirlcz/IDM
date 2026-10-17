package ru5;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements jki.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f257414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f257415b;

    public i(boolean z, boolean z3) {
        this.f257414a = z;
        this.f257415b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f257414a == iVar.f257414a && this.f257415b == iVar.f257415b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257415b) + (Boolean.hashCode(this.f257414a) * 31);
    }
}
