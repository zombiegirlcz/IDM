package y89;

import com.revolut.feature.onboarding.api.qes_terms.QesTermsFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QesTermsFlowInputData f311639a;

    public c(QesTermsFlowInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f311639a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f311639a, ((c) obj2).f311639a);
    }

    public final int hashCode() {
        return this.f311639a.hashCode();
    }
}
