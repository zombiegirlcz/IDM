package o45;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f222091a;

    public p0(int i) {
        this.f222091a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p0) && this.f222091a == ((p0) obj2).f222091a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f222091a);
    }

    public /* synthetic */ p0(int i, int i2) {
        if (1 == (i & 1)) {
            this.f222091a = i2;
        } else {
            qlm.j1.f(n0.f222084a.getDescriptor(), i, 1);
            throw null;
        }
    }
}
