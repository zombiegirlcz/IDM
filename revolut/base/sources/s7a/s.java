package s7a;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f260632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f260633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f260634c;

    public s(Clause title, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f260632a = title;
        this.f260633b = clause;
        this.f260634c = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f260632a, sVar.f260632a) && Intrinsics.f(this.f260633b, sVar.f260633b) && Intrinsics.f(this.f260634c, sVar.f260634c);
    }

    public final int hashCode() {
        int iHashCode = this.f260632a.hashCode() * 31;
        Clause clause = this.f260633b;
        int iC = j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 961, 31, false);
        Clause clause2 = this.f260634c;
        return iC + (clause2 != null ? clause2.hashCode() : 0);
    }
}
