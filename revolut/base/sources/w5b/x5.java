package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class x5 {

    @NotNull
    public static final w5 Companion = new w5();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f295070g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f295073c;
    public final List d;
    public final u5 e;
    public final u5 f;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f295070g = new Lazy[]{null, null, yhm.j.c(kVar, new w56.a(28)), yhm.j.c(kVar, new w56.a(29)), null, null};
    }

    public /* synthetic */ x5(int i, String str, String str2, List list, List list2, u5 u5Var, u5 u5Var2) {
        if (1 != (i & 1)) {
            qlm.j1.f(v5.f295049a.getDescriptor(), i, 1);
            throw null;
        }
        this.f295071a = str;
        if ((i & 2) == 0) {
            this.f295072b = null;
        } else {
            this.f295072b = str2;
        }
        if ((i & 4) == 0) {
            this.f295073c = null;
        } else {
            this.f295073c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = u5Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = u5Var2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj2;
        return Intrinsics.f(this.f295071a, x5Var.f295071a) && Intrinsics.f(this.f295072b, x5Var.f295072b) && Intrinsics.f(this.f295073c, x5Var.f295073c) && Intrinsics.f(this.d, x5Var.d) && Intrinsics.f(this.e, x5Var.e) && Intrinsics.f(this.f, x5Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f295071a.hashCode() * 31;
        String str = this.f295072b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f295073c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        u5 u5Var = this.e;
        int iHashCode5 = (iHashCode4 + (u5Var == null ? 0 : u5Var.hashCode())) * 31;
        u5 u5Var2 = this.f;
        return iHashCode5 + (u5Var2 != null ? u5Var2.hashCode() : 0);
    }

    public x5(String title, String str, ArrayList arrayList, ArrayList arrayList2, u5 u5Var, u5 u5Var2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295071a = title;
        this.f295072b = str;
        this.f295073c = arrayList;
        this.d = arrayList2;
        this.e = u5Var;
        this.f = u5Var2;
    }
}
