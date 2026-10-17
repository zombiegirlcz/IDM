package t7h;

import ip0.v7;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new t73.h(13))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f268705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f268706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f268707c;

    public /* synthetic */ n(int i, jo3.a aVar, jo3.a aVar2, f fVar) {
        if (3 != (i & 3)) {
            j1.f(l.f268704a.getDescriptor(), i, 3);
            throw null;
        }
        this.f268705a = aVar;
        this.f268706b = aVar2;
        if ((i & 4) == 0) {
            this.f268707c = null;
        } else {
            this.f268707c = fVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f268705a, nVar.f268705a) && Intrinsics.f(this.f268706b, nVar.f268706b) && this.f268707c == nVar.f268707c;
    }

    public final int hashCode() {
        int iJ = v7.j(this.f268706b, this.f268705a.hashCode() * 31, 31);
        f fVar = this.f268707c;
        return iJ + (fVar == null ? 0 : fVar.hashCode());
    }
}
