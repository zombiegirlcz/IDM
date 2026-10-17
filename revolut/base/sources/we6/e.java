package we6;

import com.revolut.feature.external_accounts.api.navigation.BrazilInboundMandateConfirmationDescriptor$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BrazilInboundMandateConfirmationDescriptor$InputData f296635a;

    public e(BrazilInboundMandateConfirmationDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296635a = inputData;
    }

    public final BrazilInboundMandateConfirmationDescriptor$InputData b() {
        return this.f296635a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f296635a, ((e) obj2).f296635a);
    }

    public final int hashCode() {
        return this.f296635a.hashCode();
    }
}
