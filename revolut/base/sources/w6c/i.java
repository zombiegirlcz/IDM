package w6c;

import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayWithAnyControllerDescriptor$InputData f295418a;

    public i(PayWithAnyControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f295418a = inputData;
    }

    public final PayWithAnyControllerDescriptor$InputData b() {
        return this.f295418a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f295418a, ((i) obj2).f295418a);
    }

    public final int hashCode() {
        return this.f295418a.hashCode();
    }
}
