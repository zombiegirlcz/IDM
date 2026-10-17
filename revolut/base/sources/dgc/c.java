package dgc;

import com.revolut.feature.rewards.api.model.concierge.AdditionalInfoBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdditionalInfoBottomSheet f114620b;

    public c(String text, AdditionalInfoBottomSheet additionalInfoBottomSheet) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f114619a = text;
        this.f114620b = additionalInfoBottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f114619a, cVar.f114619a) && Intrinsics.f(this.f114620b, cVar.f114620b);
    }

    public final int hashCode() {
        int iHashCode = this.f114619a.hashCode() * 31;
        AdditionalInfoBottomSheet additionalInfoBottomSheet = this.f114620b;
        return iHashCode + (additionalInfoBottomSheet == null ? 0 : additionalInfoBottomSheet.hashCode());
    }
}
