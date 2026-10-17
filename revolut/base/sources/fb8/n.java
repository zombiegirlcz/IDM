package fb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p98.a f133517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f133518c;

    public /* synthetic */ n(int i, String str, p98.a aVar, q qVar) {
        if (3 != (i & 3)) {
            j1.f(l.f133515a.getDescriptor(), i, 3);
            throw null;
        }
        this.f133516a = str;
        this.f133517b = aVar;
        if ((i & 4) == 0) {
            this.f133518c = null;
        } else {
            this.f133518c = qVar;
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
        return Intrinsics.f(this.f133516a, nVar.f133516a) && this.f133517b == nVar.f133517b && Intrinsics.f(this.f133518c, nVar.f133518c);
    }

    public final int hashCode() {
        int iHashCode = (this.f133517b.hashCode() + (this.f133516a.hashCode() * 31)) * 31;
        q qVar = this.f133518c;
        return iHashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public n(String id10, p98.a state, q qVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f133516a = id10;
        this.f133517b = state;
        this.f133518c = qVar;
    }
}
