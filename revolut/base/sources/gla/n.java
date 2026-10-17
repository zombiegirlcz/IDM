package gla;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f144594c = {yhm.j.c(yhm.k.PUBLICATION, new k(0)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bla.c f144595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.k f144596b;

    public /* synthetic */ n(int i, bla.c cVar, jla.k kVar) {
        if (3 != (i & 3)) {
            j1.f(l.f144593a.getDescriptor(), i, 3);
            throw null;
        }
        this.f144595a = cVar;
        this.f144596b = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f144595a == nVar.f144595a && Intrinsics.f(this.f144596b, nVar.f144596b);
    }

    public final int hashCode() {
        int iHashCode = this.f144595a.hashCode() * 31;
        jla.k kVar = this.f144596b;
        return iHashCode + (kVar == null ? 0 : kVar.hashCode());
    }
}
