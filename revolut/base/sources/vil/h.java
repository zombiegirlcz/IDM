package vil;

import com.revolut.sso.api.app_consent.SsoQrConsentInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SsoQrConsentInputData f289613a;

    public h(SsoQrConsentInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f289613a = inputData;
    }

    public final SsoQrConsentInputData b() {
        return this.f289613a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f289613a, ((h) obj2).f289613a);
    }

    public final int hashCode() {
        return this.f289613a.hashCode();
    }
}
