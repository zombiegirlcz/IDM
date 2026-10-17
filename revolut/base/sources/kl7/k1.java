package kl7;

import com.revolut.feature.insurance_car.impl.data.model.FurtherAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FurtherAction f185349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f185350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1 f185351c;
    public final String d;

    public k1(FurtherAction furtherAction, List plans, j1 status, String str) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f185349a = furtherAction;
        this.f185350b = plans;
        this.f185351c = status;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f185349a, k1Var.f185349a) && Intrinsics.f(this.f185350b, k1Var.f185350b) && this.f185351c == k1Var.f185351c && Intrinsics.f(this.d, k1Var.d);
    }

    public final int hashCode() {
        FurtherAction furtherAction = this.f185349a;
        int iHashCode = (this.f185351c.hashCode() + p.a.d((furtherAction == null ? 0 : furtherAction.hashCode()) * 31, 31, this.f185350b)) * 31;
        String str = this.d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
