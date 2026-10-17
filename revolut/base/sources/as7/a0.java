package as7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f8821g = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ar0.b(16)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8824c;
    public final g0 d;
    public final c e;
    public final c f;

    public /* synthetic */ a0(int i, String str, String str2, List list, g0 g0Var, c cVar, c cVar2) {
        if (63 != (i & 63)) {
            j1.f(y.f8876a.getDescriptor(), i, 63);
            throw null;
        }
        this.f8822a = str;
        this.f8823b = str2;
        this.f8824c = list;
        this.d = g0Var;
        this.e = cVar;
        this.f = cVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f8822a, a0Var.f8822a) && Intrinsics.f(this.f8823b, a0Var.f8823b) && Intrinsics.f(this.f8824c, a0Var.f8824c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f);
    }

    public final int hashCode() {
        String str = this.f8822a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8823b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f8824c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        g0 g0Var = this.d;
        int iHashCode4 = (iHashCode3 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        c cVar = this.e;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f;
        return iHashCode5 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public a0(String str, String str2, ArrayList arrayList, g0 g0Var, c cVar, c cVar2) {
        this.f8822a = str;
        this.f8823b = str2;
        this.f8824c = arrayList;
        this.d = g0Var;
        this.e = cVar;
        this.f = cVar2;
    }
}
