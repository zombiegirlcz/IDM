package auc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f9710g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f9713c;
    public final List d;
    public final List e;
    public final List f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f9710g = new Lazy[]{null, null, null, yhm.j.c(kVar, new ar0.b(20)), yhm.j.c(kVar, new ar0.b(21)), yhm.j.c(kVar, new ar0.b(22))};
    }

    public /* synthetic */ d0(int i, boolean z, String str, g0 g0Var, List list, List list2, List list3) {
        if (63 != (i & 63)) {
            j1.f(b0.f9698a.getDescriptor(), i, 63);
            throw null;
        }
        this.f9711a = z;
        this.f9712b = str;
        this.f9713c = g0Var;
        this.d = list;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f9711a == d0Var.f9711a && Intrinsics.f(this.f9712b, d0Var.f9712b) && Intrinsics.f(this.f9713c, d0Var.f9713c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f9713c.hashCode() + p.a.c(Boolean.hashCode(this.f9711a) * 31, 31, this.f9712b)) * 31, 31, this.d);
        List list = this.e;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public d0(boolean z, String description, g0 minimumAmount, ArrayList trustedLocations, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(minimumAmount, "minimumAmount");
        Intrinsics.checkNotNullParameter(trustedLocations, "trustedLocations");
        this.f9711a = z;
        this.f9712b = description;
        this.f9713c = minimumAmount;
        this.d = trustedLocations;
        this.e = arrayList;
        this.f = arrayList2;
    }
}
