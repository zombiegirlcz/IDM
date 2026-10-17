package pne;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f237706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f237707b;

    public /* synthetic */ c(int i, dj0.d dVar, dj0.d dVar2) {
        if (3 != (i & 3)) {
            j1.f(a.f237704a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237706a = dVar;
        this.f237707b = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f237706a, cVar.f237706a) && Intrinsics.f(this.f237707b, cVar.f237707b);
    }

    public final int hashCode() {
        int iHashCode = this.f237706a.hashCode() * 31;
        dj0.d dVar = this.f237707b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public c(dj0.d individual, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(individual, "individual");
        this.f237706a = individual;
        this.f237707b = dVar;
    }
}
