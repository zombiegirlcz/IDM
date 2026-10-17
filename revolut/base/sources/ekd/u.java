package ekd;

import kotlin.Lazy;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class u {

    @NotNull
    public static final s Companion = new s();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new egb.m0(26)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f127023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f127024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f127025c;

    public /* synthetic */ u(int i, t tVar, double d5, double d6) {
        if (7 != (i & 7)) {
            j1.f(r.f127022a.getDescriptor(), i, 7);
            throw null;
        }
        this.f127023a = tVar;
        this.f127024b = d5;
        this.f127025c = d6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f127023a == uVar.f127023a && Double.compare(this.f127024b, uVar.f127024b) == 0 && Double.compare(this.f127025c, uVar.f127025c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f127025c) + m72.b.c(this.f127023a.hashCode() * 31, this.f127024b, 31);
    }
}
