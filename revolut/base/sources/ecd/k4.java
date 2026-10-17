package ecd;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class k4 {

    @NotNull
    public static final d4 Companion = new d4();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f124600g = {yhm.j.c(yhm.k.PUBLICATION, new ebl.a(17)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3 f124602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3 f124603c;
    public final r3 d;
    public final b4 e;
    public final String f;

    public /* synthetic */ k4(int i, List list, v3 v3Var, v3 v3Var2, r3 r3Var, b4 b4Var, String str) {
        if (63 != (i & 63)) {
            qlm.j1.f(c4.f124506a.getDescriptor(), i, 63);
            throw null;
        }
        this.f124601a = list;
        this.f124602b = v3Var;
        this.f124603c = v3Var2;
        this.d = r3Var;
        this.e = b4Var;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.f124601a, k4Var.f124601a) && Intrinsics.f(this.f124602b, k4Var.f124602b) && Intrinsics.f(this.f124603c, k4Var.f124603c) && Intrinsics.f(this.d, k4Var.d) && Intrinsics.f(this.e, k4Var.e) && Intrinsics.f(this.f, k4Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f124602b.hashCode() + (this.f124601a.hashCode() * 31)) * 31;
        v3 v3Var = this.f124603c;
        int iHashCode2 = (iHashCode + (v3Var == null ? 0 : v3Var.hashCode())) * 31;
        r3 r3Var = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (r3Var == null ? 0 : r3Var.hashCode())) * 31)) * 31;
        String str = this.f;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public k4(ArrayList rates, v3 primary, v3 v3Var, r3 r3Var, b4 explanation, String str) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f124601a = rates;
        this.f124602b = primary;
        this.f124603c = v3Var;
        this.d = r3Var;
        this.e = explanation;
        this.f = str;
    }
}
