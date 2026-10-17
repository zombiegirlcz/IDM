package htj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();
    public static final Lazy[] e = {yhm.j.c(yhm.k.PUBLICATION, new ht1.e(9)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155429c;
    public final f0 d;

    public /* synthetic */ l0(int i, List list, String str, String str2, f0 f0Var) {
        if (15 != (i & 15)) {
            j1.f(j0.f155420a.getDescriptor(), i, 15);
            throw null;
        }
        this.f155427a = list;
        this.f155428b = str;
        this.f155429c = str2;
        this.d = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f155427a, l0Var.f155427a) && Intrinsics.f(this.f155428b, l0Var.f155428b) && Intrinsics.f(this.f155429c, l0Var.f155429c) && Intrinsics.f(this.d, l0Var.d);
    }

    public final int hashCode() {
        List list = this.f155427a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f155428b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f155429c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f0 f0Var = this.d;
        return iHashCode3 + (f0Var != null ? f0Var.hashCode() : 0);
    }

    public l0(ArrayList arrayList, String str, String str2, f0 f0Var) {
        this.f155427a = arrayList;
        this.f155428b = str;
        this.f155429c = str2;
        this.d = f0Var;
    }
}
