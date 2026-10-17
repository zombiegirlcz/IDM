package f12;

import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationNavigation$InputData f131164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f131165b;

    public b(ApmPaymentAuthorisationNavigation$InputData inputData, a extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f131164a = inputData;
        this.f131165b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f131164a, bVar.f131164a) && Intrinsics.f(this.f131165b, bVar.f131165b);
    }

    public final int hashCode() {
        return this.f131165b.hashCode() + (this.f131164a.hashCode() * 31);
    }
}
