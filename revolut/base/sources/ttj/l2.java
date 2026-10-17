package ttj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l2 {

    @NotNull
    public static final k2 Companion = new k2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274366a;

    public /* synthetic */ l2(int i, int i2) {
        if (1 == (i & 1)) {
            this.f274366a = i2;
        } else {
            qlm.j1.f(j2.f274361a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l2) && this.f274366a == ((l2) obj2).f274366a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f274366a);
    }
}
