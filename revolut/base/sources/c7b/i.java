package c7b;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f21895a;

    public i(Data planDashboardData) {
        Intrinsics.checkNotNullParameter(planDashboardData, "planDashboardData");
        this.f21895a = planDashboardData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f21895a, ((i) obj2).f21895a);
    }

    public final int hashCode() {
        return this.f21895a.hashCode();
    }
}
