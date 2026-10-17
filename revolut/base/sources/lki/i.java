package lki;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f196461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f196462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f196463c;

    public i(int i, float f, Float f4) {
        this.f196461a = i;
        this.f196462b = f;
        this.f196463c = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f196461a == iVar.f196461a && Float.compare(this.f196462b, iVar.f196462b) == 0 && Intrinsics.f(this.f196463c, iVar.f196463c);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f196462b, Integer.hashCode(this.f196461a) * 31, 31);
        Float f = this.f196463c;
        return iB + (f == null ? 0 : f.hashCode());
    }
}
