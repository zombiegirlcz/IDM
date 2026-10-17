package nbl;

import aii.e;
import com.revolut.shared.feature.user_declarations.api.flows.tracking.TrackingConsentInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackingConsentInputData.Workflow f214091a;

    public a(TrackingConsentInputData.Workflow inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f214091a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f214091a.equals(((a) obj2).f214091a);
    }

    public final int hashCode() {
        return this.f214091a.f105032a.hashCode();
    }
}
