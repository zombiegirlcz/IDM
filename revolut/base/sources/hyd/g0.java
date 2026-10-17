package hyd;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new hul.c(22)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f156801c;
    public final r d;

    public /* synthetic */ g0(int i, String str, String str2, List list, r rVar) {
        if (5 != (i & 5)) {
            j1.f(e0.f156796a.getDescriptor(), i, 5);
            throw null;
        }
        this.f156799a = str;
        if ((i & 2) == 0) {
            this.f156800b = null;
        } else {
            this.f156800b = str2;
        }
        this.f156801c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = rVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f156799a, g0Var.f156799a) && Intrinsics.f(this.f156800b, g0Var.f156800b) && Intrinsics.f(this.f156801c, g0Var.f156801c) && Intrinsics.f(this.d, g0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f156799a.hashCode() * 31;
        String str = this.f156800b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f156801c);
        r rVar = this.d;
        return iD + (rVar != null ? rVar.hashCode() : 0);
    }
}
