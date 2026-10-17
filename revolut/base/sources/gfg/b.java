package gfg;

import lk0.f;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143406a;

    public b(int i) {
        this.f143406a = i;
    }

    @Override // lk0.f
    public final int a() {
        return 20;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f143406a == ((b) obj2).f143406a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f143406a) + (Integer.hashCode(20) * 31);
    }
}
