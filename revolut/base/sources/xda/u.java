package xda;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f304363c = {yhm.j.c(yhm.k.PUBLICATION, new x5a.d(28)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f304365b;

    public /* synthetic */ u(int i, List list, c0 c0Var) {
        if (3 != (i & 3)) {
            j1.f(s.f304361a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304364a = list;
        this.f304365b = c0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f304364a, uVar.f304364a) && Intrinsics.f(this.f304365b, uVar.f304365b);
    }

    public final int hashCode() {
        return this.f304365b.hashCode() + (this.f304364a.hashCode() * 31);
    }
}
