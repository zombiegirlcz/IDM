package p0h;

import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f231544a;

    public e() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f231544a == ((e) obj2).f231544a;
    }

    public final int hashCode() {
        z zVar = this.f231544a;
        return (zVar == null ? 0 : zVar.hashCode()) * 31;
    }

    public e(z zVar, int i) {
        this.f231544a = (i & 1) != 0 ? null : zVar;
    }
}
