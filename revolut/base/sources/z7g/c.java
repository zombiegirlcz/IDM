package z7g;

import ip0.v7;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] i = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new z1i.a(20)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f319968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f319969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f319970c;
    public final jo3.a d;
    public final jo3.a e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f319971g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f319972h;

    public /* synthetic */ c(int i2, jo3.a aVar, l lVar, f fVar, jo3.a aVar2, jo3.a aVar3, List list, o oVar, d0 d0Var) {
        if (21 != (i2 & 21)) {
            j1.f(a.f319962a.getDescriptor(), i2, 21);
            throw null;
        }
        this.f319968a = aVar;
        if ((i2 & 2) == 0) {
            this.f319969b = null;
        } else {
            this.f319969b = lVar;
        }
        this.f319970c = fVar;
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = aVar2;
        }
        this.e = aVar3;
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i2 & 64) == 0) {
            this.f319971g = null;
        } else {
            this.f319971g = oVar;
        }
        if ((i2 & 128) == 0) {
            this.f319972h = null;
        } else {
            this.f319972h = d0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f319968a, cVar.f319968a) && Intrinsics.f(this.f319969b, cVar.f319969b) && Intrinsics.f(this.f319970c, cVar.f319970c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f319971g, cVar.f319971g) && Intrinsics.f(this.f319972h, cVar.f319972h);
    }

    public final int hashCode() {
        int iHashCode = this.f319968a.hashCode() * 31;
        l lVar = this.f319969b;
        int iHashCode2 = (this.f319970c.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31;
        jo3.a aVar = this.d;
        int iJ = v7.j(this.e, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31);
        List list = this.f;
        int iHashCode3 = (iJ + (list == null ? 0 : list.hashCode())) * 31;
        o oVar = this.f319971g;
        int iHashCode4 = (iHashCode3 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        d0 d0Var = this.f319972h;
        return iHashCode4 + (d0Var != null ? d0Var.hashCode() : 0);
    }
}
