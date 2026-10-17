package k19;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f180143c = {null, yhm.j.c(yhm.k.PUBLICATION, new k16.d(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f180145b;

    public /* synthetic */ a0(int i, String str, z zVar) {
        if (3 != (i & 3)) {
            j1.f(x.f180173a.getDescriptor(), i, 3);
            throw null;
        }
        this.f180144a = str;
        this.f180145b = zVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f180144a, a0Var.f180144a) && this.f180145b == a0Var.f180145b;
    }

    public final int hashCode() {
        return this.f180145b.hashCode() + (this.f180144a.hashCode() * 31);
    }
}
