package zp2;

import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SwitchOutReview f324163a;

    public d(SwitchOutReview switchOutReview) {
        Intrinsics.checkNotNullParameter(switchOutReview, "switchOutReview");
        this.f324163a = switchOutReview;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f324163a, ((d) obj2).f324163a);
    }

    public final int hashCode() {
        return this.f324163a.hashCode();
    }
}
