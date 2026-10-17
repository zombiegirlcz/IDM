package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t1 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f120773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1 f120774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o1 f120775c;
    public final String d;
    public final r1 e;

    public t1(p1 buttonsPosition, o1 primaryAction, o1 o1Var, String str, r1 r1Var) {
        Intrinsics.checkNotNullParameter(buttonsPosition, "buttonsPosition");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        this.f120773a = buttonsPosition;
        this.f120774b = primaryAction;
        this.f120775c = o1Var;
        this.d = str;
        this.e = r1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj2;
        return this.f120773a == t1Var.f120773a && Intrinsics.f(this.f120774b, t1Var.f120774b) && Intrinsics.f(this.f120775c, t1Var.f120775c) && Intrinsics.f(this.d, t1Var.d) && Intrinsics.f(this.e, t1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f120774b.hashCode() + (this.f120773a.hashCode() * 31)) * 31;
        o1 o1Var = this.f120775c;
        int iHashCode2 = (iHashCode + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        r1 r1Var = this.e;
        return iHashCode3 + (r1Var != null ? r1Var.hashCode() : 0);
    }
}
