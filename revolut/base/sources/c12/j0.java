package c12;

import com.revolut.feature.apm.core.ui.api.navigation.ApmRegistrationTermsScope$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmRegistrationTermsScope$InputData f20335a;

    public j0(ApmRegistrationTermsScope$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f20335a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f20335a, ((j0) obj2).f20335a);
    }

    public final int hashCode() {
        return this.f20335a.f62275a.hashCode();
    }
}
