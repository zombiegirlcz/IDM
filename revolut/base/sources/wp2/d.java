package wp2;

import cli.j;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwitchOutReview f299011a;

    public d(SwitchOutReview switchOutReview) {
        Intrinsics.checkNotNullParameter(switchOutReview, "switchOutReview");
        this.f299011a = switchOutReview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f299011a, ((d) obj2).f299011a);
    }

    public final int hashCode() {
        return this.f299011a.hashCode();
    }
}
