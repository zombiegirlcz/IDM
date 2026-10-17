package fkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f implements w0 {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f135760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f135761b;

    public /* synthetic */ f(int i, v0 v0Var, e eVar) {
        if (3 != (i & 3)) {
            j1.f(a.f135747a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135760a = v0Var;
        this.f135761b = eVar;
    }

    @Override // fkd.w0
    public final v0 H() {
        return this.f135760a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f135760a, fVar.f135760a) && Intrinsics.f(this.f135761b, fVar.f135761b);
    }

    public final int hashCode() {
        return this.f135761b.hashCode() + (this.f135760a.hashCode() * 31);
    }
}
