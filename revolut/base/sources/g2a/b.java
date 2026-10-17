package g2a;

import com.revolut.feature.payments.transfers.personalisation.api.navigation.TransfersPersonalisationInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransfersPersonalisationInputData f139953a;

    public b(TransfersPersonalisationInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f139953a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f139953a, ((b) obj2).f139953a);
    }

    public final int hashCode() {
        return this.f139953a.f79960a.hashCode();
    }
}
