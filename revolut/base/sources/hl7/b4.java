package hl7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b4 {

    @NotNull
    public static final a4 Companion = new a4();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new q0(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f153033c;
    public final l1 d;

    public /* synthetic */ b4(int i, String str, String str2, List list, l1 l1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(z3.f153391a.getDescriptor(), i, 15);
            throw null;
        }
        this.f153031a = str;
        this.f153032b = str2;
        this.f153033c = list;
        this.d = l1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f153031a, b4Var.f153031a) && Intrinsics.f(this.f153032b, b4Var.f153032b) && Intrinsics.f(this.f153033c, b4Var.f153033c) && Intrinsics.f(this.d, b4Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f153031a.hashCode() * 31;
        String str = this.f153032b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f153033c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        l1 l1Var = this.d;
        return iHashCode3 + (l1Var != null ? l1Var.hashCode() : 0);
    }
}
