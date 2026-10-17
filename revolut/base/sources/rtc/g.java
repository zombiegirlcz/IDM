package rtc;

import com.revolut.feature.security_hub.api.navigation.SecurityHubInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecurityHubInputData f257224a;

    public g(SecurityHubInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f257224a = inputData;
    }

    public final SecurityHubInputData b() {
        return this.f257224a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f257224a, ((g) obj2).f257224a);
    }

    public final int hashCode() {
        return this.f257224a.hashCode();
    }
}
