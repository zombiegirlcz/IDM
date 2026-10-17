package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f143703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f143704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f143705c;
    public final a1 d;
    public final PlansDashboardLayout$Button e;

    public b1(z0 z0Var, ArrayList benefits, f1 f1Var, a1 a1Var, PlansDashboardLayout$Button plansDashboardLayout$Button) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        this.f143703a = z0Var;
        this.f143704b = benefits;
        this.f143705c = f1Var;
        this.d = a1Var;
        this.e = plansDashboardLayout$Button;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f143703a, b1Var.f143703a) && this.f143704b.equals(b1Var.f143704b) && Intrinsics.f(this.f143705c, b1Var.f143705c) && this.d == b1Var.d && Intrinsics.f(this.e, b1Var.e);
    }

    public final int hashCode() {
        z0 z0Var = this.f143703a;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f143704b, (z0Var == null ? 0 : z0Var.hashCode()) * 31, 31);
        f1 f1Var = this.f143705c;
        int iHashCode = (iB + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        a1 a1Var = this.d;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        PlansDashboardLayout$Button plansDashboardLayout$Button = this.e;
        return iHashCode2 + (plansDashboardLayout$Button != null ? plansDashboardLayout$Button.hashCode() : 0);
    }
}
