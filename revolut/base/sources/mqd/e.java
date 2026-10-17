package mqd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.IncomeSorterDestinationCrossSell$PersonalJisaAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f207978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IncomeSorterDestinationCrossSell$PersonalJisaAccount f207979b;

    public e(hel.b bVar, IncomeSorterDestinationCrossSell$PersonalJisaAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f207978a = bVar;
        this.f207979b = account;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f207978a == eVar.f207978a && Intrinsics.f(this.f207979b, eVar.f207979b);
    }

    public final int hashCode() {
        hel.b bVar = this.f207978a;
        return this.f207979b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }
}
