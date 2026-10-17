package hha;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class p0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f152331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f152332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f152333c;
    public final o d;
    public final ArrayList e;

    public p0(o0 user, m0 plan, k0 k0Var, o oVar, ArrayList discounts) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(discounts, "discounts");
        this.f152331a = user;
        this.f152332b = plan;
        this.f152333c = k0Var;
        this.d = oVar;
        this.e = discounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f152331a.equals(p0Var.f152331a) && this.f152332b.equals(p0Var.f152332b) && Intrinsics.f(this.f152333c, p0Var.f152333c) && Intrinsics.f(this.d, p0Var.d) && this.e.equals(p0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f152332b.hashCode() + (this.f152331a.hashCode() * 31)) * 31;
        k0 k0Var = this.f152333c;
        int iHashCode2 = (iHashCode + (k0Var == null ? 0 : Integer.hashCode(k0Var.f152319a))) * 31;
        o oVar = this.d;
        return this.e.hashCode() + ((iHashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31);
    }
}
