package v42;

import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6 f285929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6 f285930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f285931c;
    public final n6 d;
    public final Clause e;

    public a(n6 submitButton, n6 n6Var, n6 n6Var2, n6 n6Var3, Clause clause) {
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.f285929a = submitButton;
        this.f285930b = n6Var;
        this.f285931c = n6Var2;
        this.d = n6Var3;
        this.e = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f285929a, aVar.f285929a) && Intrinsics.f(this.f285930b, aVar.f285930b) && Intrinsics.f(this.f285931c, aVar.f285931c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f285929a.hashCode() * 31;
        n6 n6Var = this.f285930b;
        int iHashCode2 = (iHashCode + (n6Var == null ? 0 : n6Var.hashCode())) * 31;
        n6 n6Var2 = this.f285931c;
        int iHashCode3 = (iHashCode2 + (n6Var2 == null ? 0 : n6Var2.hashCode())) * 31;
        n6 n6Var3 = this.d;
        int iHashCode4 = (iHashCode3 + (n6Var3 == null ? 0 : n6Var3.hashCode())) * 31;
        Clause clause = this.e;
        return iHashCode4 + (clause != null ? clause.hashCode() : 0);
    }
}
