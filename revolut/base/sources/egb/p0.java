package egb;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f125608c = {null, yhm.j.c(yhm.k.PUBLICATION, new m0(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f125610b;

    public /* synthetic */ p0(Map map, String str, int i) {
        if (3 != (i & 3)) {
            j1.f(n0.f125606a.getDescriptor(), i, 3);
            throw null;
        }
        this.f125609a = str;
        this.f125610b = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f125609a, p0Var.f125609a) && Intrinsics.f(this.f125610b, p0Var.f125610b);
    }

    public final int hashCode() {
        return this.f125610b.hashCode() + (this.f125609a.hashCode() * 31);
    }
}
