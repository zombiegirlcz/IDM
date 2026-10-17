package fmg;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f136432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136433b;

    public /* synthetic */ j(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            j1.f(h.f136426a.getDescriptor(), i, 3);
            throw null;
        }
        this.f136432a = i2;
        this.f136433b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f136432a == jVar.f136432a && this.f136433b == jVar.f136433b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f136433b) + (Integer.hashCode(this.f136432a) * 31);
    }
}
