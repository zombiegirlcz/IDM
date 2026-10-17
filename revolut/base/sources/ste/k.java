package ste;

import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FacadeCardTopupFlowDescriptor$InputData f265565a;

    public k(FacadeCardTopupFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f265565a = inputData;
    }

    public final FacadeCardTopupFlowDescriptor$InputData b() {
        return this.f265565a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f265565a, ((k) obj2).f265565a);
    }

    public final int hashCode() {
        return this.f265565a.hashCode();
    }
}
