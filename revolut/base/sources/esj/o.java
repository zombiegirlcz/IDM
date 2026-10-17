package esj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f128977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f128978b;

    public o(Data setOverallBudgetData, boolean z) {
        Intrinsics.checkNotNullParameter(setOverallBudgetData, "setOverallBudgetData");
        this.f128977a = setOverallBudgetData;
        this.f128978b = z;
    }

    public static o a(o oVar, Data setOverallBudgetData) {
        boolean z = oVar.f128978b;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(setOverallBudgetData, "setOverallBudgetData");
        return new o(setOverallBudgetData, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f128977a, oVar.f128977a) && this.f128978b == oVar.f128978b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f128978b) + (this.f128977a.hashCode() * 31);
    }
}
