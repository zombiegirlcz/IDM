package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class x2 {

    @NotNull
    public static final w2 Companion = new w2();
    public static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(17)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f295066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f295067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l2 f295068c;

    public /* synthetic */ x2(int i, a3 a3Var, List list, l2 l2Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(v2.f295046a.getDescriptor(), i, 7);
            throw null;
        }
        this.f295066a = a3Var;
        this.f295067b = list;
        this.f295068c = l2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj2;
        return Intrinsics.f(this.f295066a, x2Var.f295066a) && Intrinsics.f(this.f295067b, x2Var.f295067b) && Intrinsics.f(this.f295068c, x2Var.f295068c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f295066a.hashCode() * 31, 31, this.f295067b);
        l2 l2Var = this.f295068c;
        return iD + (l2Var == null ? 0 : l2Var.hashCode());
    }

    public x2(a3 card, ArrayList benefitList, l2 l2Var) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(benefitList, "benefitList");
        this.f295066a = card;
        this.f295067b = benefitList;
        this.f295068c = l2Var;
    }
}
