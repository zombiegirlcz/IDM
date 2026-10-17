package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class o {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f124629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f124630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f124631c;
    public final n d;

    public /* synthetic */ o(int i, b2 b2Var, Boolean bool, h hVar, n nVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(a.f124480a.getDescriptor(), i, 15);
            throw null;
        }
        this.f124629a = b2Var;
        this.f124630b = bool;
        this.f124631c = hVar;
        this.d = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f124629a, oVar.f124629a) && Intrinsics.f(this.f124630b, oVar.f124630b) && Intrinsics.f(this.f124631c, oVar.f124631c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        b2 b2Var = this.f124629a;
        int iHashCode = (b2Var == null ? 0 : b2Var.hashCode()) * 31;
        Boolean bool = this.f124630b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        h hVar = this.f124631c;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        n nVar = this.d;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }

    public o(b2 b2Var, Boolean bool, h hVar, n nVar) {
        this.f124629a = b2Var;
        this.f124630b = bool;
        this.f124631c = hVar;
        this.d = nVar;
    }
}
