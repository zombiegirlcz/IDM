package yj7;

import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CFACInsuranceDetails f314427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f314428b;

    public e(CFACInsuranceDetails insuranceDetails, List expenses) {
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        this.f314427a = insuranceDetails;
        this.f314428b = expenses;
    }

    public static e a(e eVar, List expenses) {
        CFACInsuranceDetails insuranceDetails = eVar.f314427a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        return new e(insuranceDetails, expenses);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f314427a, eVar.f314427a) && Intrinsics.f(this.f314428b, eVar.f314428b);
    }

    public final int hashCode() {
        return this.f314428b.hashCode() + (this.f314427a.hashCode() * 31);
    }
}
