package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ti0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f166526c;
    public final String d;

    public ti0(boolean z, boolean z3, Clause clause, String str) {
        this.f166524a = z;
        this.f166525b = z3;
        this.f166526c = clause;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ti0)) {
            return false;
        }
        ti0 ti0Var = (ti0) obj2;
        return this.f166524a == ti0Var.f166524a && this.f166525b == ti0Var.f166525b && Intrinsics.f(this.f166526c, ti0Var.f166526c) && Intrinsics.f(this.d, ti0Var.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f166524a) * 31, 31, this.f166525b);
        Clause clause = this.f166526c;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
