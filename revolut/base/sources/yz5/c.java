package yz5;

import aii.e;
import com.revolut.feature.customer_present.tips.api.navigation.CustomerPresentTipsFlowDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomerPresentTipsFlowDescriptor$InputData f318040a;

    public c(CustomerPresentTipsFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f318040a = inputData;
    }

    public final CustomerPresentTipsFlowDescriptor$InputData b() {
        return this.f318040a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f318040a, ((c) obj2).f318040a);
    }

    public final int hashCode() {
        return this.f318040a.hashCode();
    }
}
