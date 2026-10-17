package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class k0 extends h.c {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f313277c;

    public /* synthetic */ k0(int i, Double d) {
        if (1 == (i & 1)) {
            this.f313277c = d;
        } else {
            qlm.j1.f(i0.f313267a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f313277c, ((k0) obj2).f313277c);
    }

    public final int hashCode() {
        Double d = this.f313277c;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public k0(Double d) {
        this.f313277c = d;
    }
}
