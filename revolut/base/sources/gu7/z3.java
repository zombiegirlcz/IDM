package gu7;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z3 {

    @NotNull
    public static final r3 Companion = new r3();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new v1(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u3 f146877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f146878c;

    public /* synthetic */ z3(int i, String str, u3 u3Var, List list) {
        if (7 != (i & 7)) {
            qlm.j1.f(d3.f146729a.getDescriptor(), i, 7);
            throw null;
        }
        this.f146876a = str;
        this.f146877b = u3Var;
        this.f146878c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f146876a, z3Var.f146876a) && Intrinsics.f(this.f146877b, z3Var.f146877b) && Intrinsics.f(this.f146878c, z3Var.f146878c);
    }

    public final int hashCode() {
        int iHashCode = this.f146876a.hashCode() * 31;
        u3 u3Var = this.f146877b;
        return this.f146878c.hashCode() + ((iHashCode + (u3Var == null ? 0 : u3Var.hashCode())) * 31);
    }

    public z3(String title, u3 u3Var, List buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f146876a = title;
        this.f146877b = u3Var;
        this.f146878c = buttons;
    }
}
