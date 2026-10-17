package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f304366c = {null, yhm.j.c(yhm.k.PUBLICATION, new z(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304368b;

    public /* synthetic */ u0(int i, String str, List list) {
        if (3 != (i & 3)) {
            j1.f(s0.f304362a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304367a = str;
        this.f304368b = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f304367a, u0Var.f304367a) && Intrinsics.f(this.f304368b, u0Var.f304368b);
    }

    public final int hashCode() {
        return this.f304368b.hashCode() + (this.f304367a.hashCode() * 31);
    }
}
