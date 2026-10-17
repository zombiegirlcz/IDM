package dgc;

import com.revolut.feature.rewards.api.model.concierge.AdditionalInfoBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdditionalInfoBottomSheet f114624b;

    public e(String text, AdditionalInfoBottomSheet additionalInfoBottomSheet) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f114623a = text;
        this.f114624b = additionalInfoBottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f114623a, eVar.f114623a) && Intrinsics.f(this.f114624b, eVar.f114624b);
    }

    public final int hashCode() {
        int iHashCode = this.f114623a.hashCode() * 31;
        AdditionalInfoBottomSheet additionalInfoBottomSheet = this.f114624b;
        return iHashCode + (additionalInfoBottomSheet == null ? 0 : additionalInfoBottomSheet.hashCode());
    }
}
