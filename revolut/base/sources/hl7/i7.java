package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class i7 {

    @NotNull
    public static final h7 Companion = new h7();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c4 f153149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153150c;
    public final List d;
    public final String e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, yhm.j.c(kVar, new q0(17)), yhm.j.c(kVar, new q0(18)), null};
    }

    public /* synthetic */ i7(int i, String str, c4 c4Var, List list, List list2, String str2) {
        if (31 != (i & 31)) {
            qlm.j1.f(g7.f153119a.getDescriptor(), i, 31);
            throw null;
        }
        this.f153148a = str;
        this.f153149b = c4Var;
        this.f153150c = list;
        this.d = list2;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj2;
        return Intrinsics.f(this.f153148a, i7Var.f153148a) && Intrinsics.f(this.f153149b, i7Var.f153149b) && Intrinsics.f(this.f153150c, i7Var.f153150c) && Intrinsics.f(this.d, i7Var.d) && Intrinsics.f(this.e, i7Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f153148a.hashCode() * 31;
        c4 c4Var = this.f153149b;
        int iHashCode2 = (iHashCode + (c4Var == null ? 0 : c4Var.f153047a.hashCode())) * 31;
        List list = this.f153150c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }
}
