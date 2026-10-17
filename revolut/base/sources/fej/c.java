package fej;

import com.revolut.retail.feature.esim.api.navigation.EsimInstallationFlowDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimInstallationFlowDescriptor$InputData f134637a;

    public c(EsimInstallationFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f134637a = inputData;
    }

    public final EsimInstallationFlowDescriptor$InputData b() {
        return this.f134637a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f134637a, ((c) obj2).f134637a);
    }

    public final int hashCode() {
        return this.f134637a.hashCode();
    }
}
