package il9;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new p(0)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f162198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f162199c;
    public final o d;

    public /* synthetic */ s(int i, String str, x xVar, v vVar, o oVar) {
        if (3 != (i & 3)) {
            j1.f(q.f162196a.getDescriptor(), i, 3);
            throw null;
        }
        this.f162197a = str;
        this.f162198b = xVar;
        if ((i & 4) == 0) {
            this.f162199c = null;
        } else {
            this.f162199c = vVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = oVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f162197a, sVar.f162197a) && this.f162198b == sVar.f162198b && Intrinsics.f(this.f162199c, sVar.f162199c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f162198b.hashCode() + (this.f162197a.hashCode() * 31)) * 31;
        v vVar = this.f162199c;
        int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.f162202a.hashCode())) * 31;
        o oVar = this.d;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }
}
