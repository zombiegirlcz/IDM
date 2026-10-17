package hi6;

import com.revolut.domain.models.openbanking.JointDataSharingConsentState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JointDataSharingConsentState f152522b;

    public m(List pockets, JointDataSharingConsentState jointDataSharingConsentState) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        this.f152521a = pockets;
        this.f152522b = jointDataSharingConsentState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f152521a, mVar.f152521a) && this.f152522b == mVar.f152522b;
    }

    public final int hashCode() {
        int iHashCode = this.f152521a.hashCode() * 31;
        JointDataSharingConsentState jointDataSharingConsentState = this.f152522b;
        return iHashCode + (jointDataSharingConsentState == null ? 0 : jointDataSharingConsentState.hashCode());
    }
}
