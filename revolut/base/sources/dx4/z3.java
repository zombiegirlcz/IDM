package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4 f120866b;

    public z3(String text, a4 a4Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f120865a = text;
        this.f120866b = a4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f120865a, z3Var.f120865a) && Intrinsics.f(this.f120866b, z3Var.f120866b);
    }

    public final int hashCode() {
        int iHashCode = this.f120865a.hashCode() * 31;
        a4 a4Var = this.f120866b;
        return iHashCode + (a4Var == null ? 0 : a4Var.hashCode());
    }
}
