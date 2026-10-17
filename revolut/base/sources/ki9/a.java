package ki9;

import hi9.k;
import hi9.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f184187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f184188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f184189c;

    public a(k plan, ArrayList repayments, l planPreferences) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(repayments, "repayments");
        Intrinsics.checkNotNullParameter(planPreferences, "planPreferences");
        this.f184187a = plan;
        this.f184188b = repayments;
        this.f184189c = planPreferences;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f184187a, aVar.f184187a) && Intrinsics.f(this.f184188b, aVar.f184188b) && Intrinsics.f(this.f184189c, aVar.f184189c);
    }

    public final int hashCode() {
        return this.f184189c.hashCode() + p.a.d(this.f184187a.hashCode() * 31, 31, this.f184188b);
    }
}
