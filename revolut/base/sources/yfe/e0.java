package yfe;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class e0 extends h.c {

    @NotNull
    public static final c0 Companion = new c0();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new yfd.c(23))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f313250c;

    public /* synthetic */ e0(int i, d0 d0Var) {
        if (1 == (i & 1)) {
            this.f313250c = d0Var;
        } else {
            qlm.j1.f(b0.f313242a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && this.f313250c == ((e0) obj2).f313250c;
    }

    public final int hashCode() {
        return this.f313250c.hashCode();
    }

    public e0(d0 subtitleVariant) {
        Intrinsics.checkNotNullParameter(subtitleVariant, "subtitleVariant");
        this.f313250c = subtitleVariant;
    }
}
