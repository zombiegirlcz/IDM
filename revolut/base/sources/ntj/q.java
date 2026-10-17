package ntj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f219111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f219112b;

    public q(int i, int i2) {
        this.f219111a = i;
        this.f219112b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f219111a == qVar.f219111a && this.f219112b == qVar.f219112b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219112b) + (Integer.hashCode(this.f219111a) * 31);
    }

    public /* synthetic */ q(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            qlm.j1.f(o.f219107a.getDescriptor(), i, 3);
            throw null;
        }
        this.f219111a = i2;
        this.f219112b = i3;
    }
}
