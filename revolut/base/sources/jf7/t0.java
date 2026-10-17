package jf7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class t0 implements l1 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f173711c = {null, yhm.j.c(yhm.k.PUBLICATION, new ja3.b(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f173712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f173713b;

    public /* synthetic */ t0(int i, List list, boolean z) {
        if (3 != (i & 3)) {
            qlm.j1.f(o0.f173700a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173712a = z;
        this.f173713b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return this.f173712a == t0Var.f173712a && Intrinsics.f(this.f173713b, t0Var.f173713b);
    }

    public final int hashCode() {
        return this.f173713b.hashCode() + (Boolean.hashCode(this.f173712a) * 31);
    }
}
