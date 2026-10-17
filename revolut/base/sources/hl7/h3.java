package hl7;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h3 {

    @NotNull
    public static final g3 Companion = new g3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153126b;

    public h3(int i, int i2) {
        this.f153125a = i;
        this.f153126b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return this.f153125a == h3Var.f153125a && this.f153126b == h3Var.f153126b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f153126b) + (Integer.hashCode(this.f153125a) * 31);
    }

    public /* synthetic */ h3(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qlm.j1.f(f3.f153096a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153125a = i2;
        this.f153126b = i3;
    }
}
