package j6d;

import aii.e;
import com.revolut.feature.shared.branding.api.destination.PaymentLinkAutoPreviewDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentLinkAutoPreviewDescriptor$InputData f171737a;

    public b(PaymentLinkAutoPreviewDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f171737a = inputData;
    }

    public final PaymentLinkAutoPreviewDescriptor$InputData b() {
        return this.f171737a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f171737a, ((b) obj2).f171737a);
    }

    public final int hashCode() {
        return this.f171737a.hashCode();
    }
}
