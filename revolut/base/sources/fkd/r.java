package fkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r implements w0 {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f135789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f135790b;

    public /* synthetic */ r(int i, v0 v0Var, o oVar) {
        if (3 != (i & 3)) {
            j1.f(g.f135764a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135789a = v0Var;
        this.f135790b = oVar;
    }

    @Override // fkd.w0
    public final v0 H() {
        return this.f135789a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f135789a, rVar.f135789a) && Intrinsics.f(this.f135790b, rVar.f135790b);
    }

    public final int hashCode() {
        return this.f135790b.hashCode() + (this.f135789a.hashCode() * 31);
    }
}
