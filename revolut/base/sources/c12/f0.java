package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTerms$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRegistrationTerms$InputData f20328a;

    public f0(ApmRegistrationTerms$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f20328a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f0) && Intrinsics.f(this.f20328a, ((f0) obj2).f20328a);
    }

    public final int hashCode() {
        return this.f20328a.hashCode();
    }
}
