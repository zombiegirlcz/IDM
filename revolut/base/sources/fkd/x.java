package fkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class x implements w0 {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f135802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f135803b;

    public /* synthetic */ x(int i, v0 v0Var, w wVar) {
        if (3 != (i & 3)) {
            j1.f(s.f135793a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135802a = v0Var;
        this.f135803b = wVar;
    }

    @Override // fkd.w0
    public final v0 H() {
        return this.f135802a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f135802a, xVar.f135802a) && Intrinsics.f(this.f135803b, xVar.f135803b);
    }

    public final int hashCode() {
        return this.f135803b.hashCode() + (this.f135802a.hashCode() * 31);
    }
}
