package di3;

import com.revolut.feature.checkout.models.PreorderPlanResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PreorderPlanResult f114872a;

    public a(PreorderPlanResult preorderPlanResult) {
        Intrinsics.checkNotNullParameter(preorderPlanResult, "preorderPlanResult");
        this.f114872a = preorderPlanResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f114872a, ((a) obj2).f114872a);
    }

    public final int hashCode() {
        return this.f114872a.hashCode();
    }
}
