package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ca implements da {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f209639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f209640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f209641c;

    public ca(int i, float f, Float f4) {
        this.f209639a = i;
        this.f209640b = f;
        this.f209641c = f4;
    }

    @Override // mx0.da
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj2;
        return this.f209639a == caVar.f209639a && Float.compare(this.f209640b, caVar.f209640b) == 0 && Intrinsics.f(this.f209641c, caVar.f209641c);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f209640b, j6.a.b(this.f209639a, Boolean.hashCode(false) * 31, 31), 31);
        Float f = this.f209641c;
        return iB + (f != null ? f.hashCode() : 0);
    }
}
