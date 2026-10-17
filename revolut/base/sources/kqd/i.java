package kqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.IncomeSorterDestinationCrossSell$PersonalJisaAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSorterDestinationCrossSell$PersonalJisaAccount f188382b;

    public i(IncomeSorterDestinationCrossSell$PersonalJisaAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f188382b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f188382b, ((i) obj2).f188382b);
    }

    public final int hashCode() {
        return this.f188382b.hashCode();
    }
}
