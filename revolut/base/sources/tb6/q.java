package tb6;

import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharityTransactionsParams f269492a;

    public q(CharityTransactionsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f269492a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f269492a, ((q) obj2).f269492a);
    }

    public final int hashCode() {
        return this.f269492a.hashCode();
    }
}
