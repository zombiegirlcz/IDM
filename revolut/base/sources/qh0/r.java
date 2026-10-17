package qh0;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f246413c = {null, yhm.j.c(yhm.k.PUBLICATION, new d(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f246414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f246415b;

    public /* synthetic */ r(int i, int i2, j0 j0Var) {
        if (3 != (i & 3)) {
            j1.f(p.f246409a.getDescriptor(), i, 3);
            throw null;
        }
        this.f246414a = i2;
        this.f246415b = j0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f246414a == rVar.f246414a && this.f246415b == rVar.f246415b;
    }

    public final int hashCode() {
        return this.f246415b.hashCode() + (Integer.hashCode(this.f246414a) * 31);
    }

    public r(int i, j0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f246414a = i;
        this.f246415b = type;
    }
}
