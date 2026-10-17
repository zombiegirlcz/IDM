package zh9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {
    private l() {
    }

    public static m a(wi0.b facilityCountryCode) {
        Intrinsics.checkNotNullParameter(facilityCountryCode, "facilityCountryCode");
        wi0.b.Companion.getClass();
        return Intrinsics.f(facilityCountryCode, wi0.b.L0) ? new m(false, true, false) : new m(true, false, true);
    }
}
