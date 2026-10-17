package ckd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f24815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f24816b;

    public /* synthetic */ o(int i, n nVar, e eVar) {
        if (3 != (i & 3)) {
            j1.f(a.f24800a.getDescriptor(), i, 3);
            throw null;
        }
        this.f24815a = nVar;
        this.f24816b = eVar;
    }

    public final n a() {
        return this.f24815a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f24815a, oVar.f24815a) && Intrinsics.f(this.f24816b, oVar.f24816b);
    }

    public final int hashCode() {
        return this.f24816b.hashCode() + (this.f24815a.hashCode() * 31);
    }
}
