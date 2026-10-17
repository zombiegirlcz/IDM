package q50;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f242226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242228c;

    public /* synthetic */ h0(int i, String str, String str2, Instant instant) {
        if (3 != (i & 3)) {
            j1.f(f0.f242224a.getDescriptor(), i, 3);
            throw null;
        }
        this.f242226a = instant;
        this.f242227b = str;
        if ((i & 4) == 0) {
            this.f242228c = null;
        } else {
            this.f242228c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f242226a, h0Var.f242226a) && Intrinsics.f(this.f242227b, h0Var.f242227b) && Intrinsics.f(this.f242228c, h0Var.f242228c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f242226a.hashCode() * 31, 31, this.f242227b);
        String str = this.f242228c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
