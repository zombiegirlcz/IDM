package bka;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f16322b = {yhm.j.c(yhm.k.PUBLICATION, new bi2.g(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f16323a;

    public /* synthetic */ k0(int i, j0 j0Var) {
        if (1 == (i & 1)) {
            this.f16323a = j0Var;
        } else {
            j1.f(h0.f16317a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && this.f16323a == ((k0) obj2).f16323a;
    }

    public final int hashCode() {
        return this.f16323a.hashCode();
    }

    public k0(j0 theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f16323a = theme;
    }
}
