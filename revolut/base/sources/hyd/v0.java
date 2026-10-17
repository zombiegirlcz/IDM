package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new hul.c(25)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f156837c;
    public final l d;
    public final u e;

    public /* synthetic */ v0(int i, String str, String str2, List list, l lVar, u uVar) {
        if (3 != (i & 3)) {
            j1.f(t0.f156831a.getDescriptor(), i, 3);
            throw null;
        }
        this.f156835a = str;
        this.f156836b = str2;
        if ((i & 4) == 0) {
            this.f156837c = null;
        } else {
            this.f156837c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = lVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = uVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f156835a, v0Var.f156835a) && Intrinsics.f(this.f156836b, v0Var.f156836b) && Intrinsics.f(this.f156837c, v0Var.f156837c) && Intrinsics.f(this.d, v0Var.d) && Intrinsics.f(this.e, v0Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f156835a.hashCode() * 31, 31, this.f156836b);
        List list = this.f156837c;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        l lVar = this.d;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        u uVar = this.e;
        return iHashCode2 + (uVar != null ? uVar.f156833a.hashCode() : 0);
    }
}
