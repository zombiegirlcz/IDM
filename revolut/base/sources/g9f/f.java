package g9f;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f141554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f141555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f141556c;
    public final List d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{yhm.j.c(kVar, new g53.e(15)), yhm.j.c(kVar, new g53.e(16)), null, yhm.j.c(kVar, new g53.e(17))};
    }

    public /* synthetic */ f(int i, g gVar, n0 n0Var, t tVar, List list) {
        if (15 != (i & 15)) {
            j1.f(d.f141550a.getDescriptor(), i, 15);
            throw null;
        }
        this.f141554a = gVar;
        this.f141555b = n0Var;
        this.f141556c = tVar;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f141554a == fVar.f141554a && this.f141555b == fVar.f141555b && Intrinsics.f(this.f141556c, fVar.f141556c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f141556c.hashCode() + ((this.f141555b.hashCode() + (this.f141554a.hashCode() * 31)) * 31)) * 31);
    }

    public f(g direction, n0 transferType, t transferRequestCreateBrokerData, ArrayList positions) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(transferRequestCreateBrokerData, "transferRequestCreateBrokerData");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f141554a = direction;
        this.f141555b = transferType;
        this.f141556c = transferRequestCreateBrokerData;
        this.d = positions;
    }
}
