package ici;

import com.revolut.feature_retail_user_declarations.risk_assessment.flow.RiskAssessmentFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RiskAssessmentFlowInputData f160289a;

    public a(RiskAssessmentFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f160289a = inputData;
    }

    public final RiskAssessmentFlowInputData b() {
        return this.f160289a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f160289a, ((a) obj2).f160289a);
    }

    public final int hashCode() {
        return this.f160289a.hashCode();
    }
}
