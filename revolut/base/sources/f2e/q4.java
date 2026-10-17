package f2e;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q4 {

    @NotNull
    public static final p4 Companion = new p4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f131699b;

    public /* synthetic */ q4(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qlm.j1.f(o4.f131682a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131698a = i2;
        this.f131699b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj2;
        return this.f131698a == q4Var.f131698a && this.f131699b == q4Var.f131699b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f131699b) + (Integer.hashCode(this.f131698a) * 31);
    }
}
