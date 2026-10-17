package ul4;

import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f280883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f280884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason f280885c;
    public final Integer d;

    public a(int i, ArrayList dueDateSelections, CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason, Integer num) {
        Intrinsics.checkNotNullParameter(dueDateSelections, "dueDateSelections");
        this.f280883a = i;
        this.f280884b = dueDateSelections;
        this.f280885c = creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f280883a == aVar.f280883a && this.f280884b.equals(aVar.f280884b) && Intrinsics.f(this.f280885c, aVar.f280885c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f280884b, Integer.hashCode(this.f280883a) * 31, 31);
        CreditCardSettings$RepaymentPreferenceSettings$IneligibilityReason creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason = this.f280885c;
        int iHashCode = (iB + (creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason == null ? 0 : creditCardSettings$RepaymentPreferenceSettings$IneligibilityReason.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
