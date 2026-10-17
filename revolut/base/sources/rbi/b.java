package rbi;

import aii.e;
import com.revolut.feature_retail_user_declarations.occupation.OccupationChooserFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OccupationChooserFlowInputData f253119a;

    public b(OccupationChooserFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f253119a = inputData;
    }

    public final OccupationChooserFlowInputData b() {
        return this.f253119a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f253119a, ((b) obj2).f253119a);
    }

    public final int hashCode() {
        return this.f253119a.hashCode();
    }
}
