package ib6;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f160092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f160093b;

    public c(boolean z, float f) {
        this.f160092a = z;
        this.f160093b = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f160092a == cVar.f160092a && Float.compare(this.f160093b, cVar.f160093b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f160093b) + (Boolean.hashCode(this.f160092a) * 31);
    }
}
