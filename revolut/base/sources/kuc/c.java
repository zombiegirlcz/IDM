package kuc;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f189768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f189769b;

    public c(boolean z, boolean z3) {
        this.f189768a = z;
        this.f189769b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f189768a == cVar.f189768a && this.f189769b == cVar.f189769b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189769b) + (Boolean.hashCode(this.f189768a) * 31);
    }
}
