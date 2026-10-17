package jf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class n0 implements l1 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f173694c = {null, yhm.j.c(yhm.k.PUBLICATION, new ja3.b(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173696b;

    public /* synthetic */ n0(int i, String str, List list) {
        if (3 != (i & 3)) {
            qlm.j1.f(i0.f173681a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173695a = str;
        this.f173696b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f173695a, n0Var.f173695a) && Intrinsics.f(this.f173696b, n0Var.f173696b);
    }

    public final int hashCode() {
        return this.f173696b.hashCode() + (this.f173695a.hashCode() * 31);
    }
}
