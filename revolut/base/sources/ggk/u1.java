package ggk;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class u1 {

    @NotNull
    public static final t1 Companion = new t1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143784b;

    public u1(int i, int i2) {
        this.f143783a = i;
        this.f143784b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return this.f143783a == u1Var.f143783a && this.f143784b == u1Var.f143784b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f143784b) + (Integer.hashCode(this.f143783a) * 31);
    }

    public /* synthetic */ u1(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qlm.j1.f(s1.f143778a.getDescriptor(), i, 3);
            throw null;
        }
        this.f143783a = i2;
        this.f143784b = i3;
    }
}
