package w5b;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class y3 {

    @NotNull
    public static final x3 Companion = new x3();
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(21)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f295084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b4 f295085c;
    public final Boolean d;

    public /* synthetic */ y3(int i, String str, List list, b4 b4Var, Boolean bool) {
        if (15 != (i & 15)) {
            qlm.j1.f(w3.f295055a.getDescriptor(), i, 15);
            throw null;
        }
        this.f295083a = str;
        this.f295084b = list;
        this.f295085c = b4Var;
        this.d = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f295083a, y3Var.f295083a) && Intrinsics.f(this.f295084b, y3Var.f295084b) && Intrinsics.f(this.f295085c, y3Var.f295085c) && Intrinsics.f(this.d, y3Var.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f295083a.hashCode() * 31, 31, this.f295084b);
        b4 b4Var = this.f295085c;
        int iHashCode = (iD + (b4Var == null ? 0 : b4Var.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public y3(String sectionTitle, ArrayList challenges, b4 b4Var, Boolean bool) {
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Intrinsics.checkNotNullParameter(challenges, "challenges");
        this.f295083a = sectionTitle;
        this.f295084b = challenges;
        this.f295085c = b4Var;
        this.d = bool;
    }
}
