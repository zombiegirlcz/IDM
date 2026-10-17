package s7g;

import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i0 {

    @NotNull
    public static final h0 Companion = new h0();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f260739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t7g.f f260740c;
    public final String d;
    public final int e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t7g.i f260741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t7g.i f260742h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f260743j;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        k = new Lazy[]{null, null, null, null, null, yhm.j.c(kVar, new s77.x(7)), null, null, null, yhm.j.c(kVar, new s77.x(8))};
    }

    public /* synthetic */ i0(int i, String str, z zVar, t7g.f fVar, String str2, int i2, List list, t7g.i iVar, t7g.i iVar2, Integer num, List list2) {
        if (219 != (i & Constants.TAG_KSL_ID)) {
            qlm.j1.f(g0.f260726a.getDescriptor(), i, Constants.TAG_KSL_ID);
            throw null;
        }
        this.f260738a = str;
        this.f260739b = zVar;
        if ((i & 4) == 0) {
            this.f260740c = null;
        } else {
            this.f260740c = fVar;
        }
        this.d = str2;
        this.e = i2;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        this.f260741g = iVar;
        this.f260742h = iVar2;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.f260743j = null;
        } else {
            this.f260743j = list2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f260738a, i0Var.f260738a) && Intrinsics.f(this.f260739b, i0Var.f260739b) && Intrinsics.f(this.f260740c, i0Var.f260740c) && Intrinsics.f(this.d, i0Var.d) && this.e == i0Var.e && Intrinsics.f(this.f, i0Var.f) && Intrinsics.f(this.f260741g, i0Var.f260741g) && Intrinsics.f(this.f260742h, i0Var.f260742h) && Intrinsics.f(this.i, i0Var.i) && Intrinsics.f(this.f260743j, i0Var.f260743j);
    }

    public final int hashCode() {
        int iHashCode = (this.f260739b.hashCode() + (this.f260738a.hashCode() * 31)) * 31;
        t7g.f fVar = this.f260740c;
        int iB = j6.a.b(this.e, p.a.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.d), 31);
        List list = this.f;
        int iHashCode2 = (this.f260742h.hashCode() + ((this.f260741g.hashCode() + ((iB + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        Integer num = this.i;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.f260743j;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }
}
