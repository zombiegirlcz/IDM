package k50;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f181032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f181033c;
    public final boolean d;
    public final v0 e;
    public final AnimationRequest f;

    public b1() {
        this(0);
    }

    public static b1 a(b1 b1Var, List list, Clause clause, List list2, v0 v0Var, int i) {
        if ((i & 1) != 0) {
            list = b1Var.f181031a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            clause = b1Var.f181032b;
        }
        Clause clause2 = clause;
        if ((i & 4) != 0) {
            list2 = b1Var.f181033c;
        }
        List list4 = list2;
        boolean z = (i & 8) != 0 ? b1Var.d : true;
        if ((i & 16) != 0) {
            v0Var = b1Var.e;
        }
        b1Var.getClass();
        return new b1(list3, clause2, list4, z, v0Var);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f181031a, b1Var.f181031a) && Intrinsics.f(this.f181032b, b1Var.f181032b) && Intrinsics.f(this.f181033c, b1Var.f181033c) && this.d == b1Var.d && this.e == b1Var.e;
    }

    public final int hashCode() {
        List list = this.f181031a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Clause clause = this.f181032b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        List list2 = this.f181033c;
        int iC = j6.a.c((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.d);
        v0 v0Var = this.e;
        return iC + (v0Var != null ? v0Var.hashCode() : 0);
    }

    public /* synthetic */ b1(int i) {
        this(null, null, null, false, null);
    }

    public b1(List list, Clause clause, List list2, boolean z, v0 v0Var) {
        this.f181031a = list;
        this.f181032b = clause;
        this.f181033c = list2;
        this.d = z;
        this.e = v0Var;
        this.f = new AnimationRequest(false);
    }
}
