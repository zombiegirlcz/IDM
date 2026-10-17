package kqd;

import com.revolut.feature.vaults.common.SavingAccountType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingAccountType f188383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f188384c;

    public j(SavingAccountType savingAccountType, Set pendingSelectedDestinationIds) {
        Intrinsics.checkNotNullParameter(savingAccountType, "savingAccountType");
        Intrinsics.checkNotNullParameter(pendingSelectedDestinationIds, "pendingSelectedDestinationIds");
        this.f188383b = savingAccountType;
        this.f188384c = pendingSelectedDestinationIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f188383b, jVar.f188383b) && Intrinsics.f(this.f188384c, jVar.f188384c);
    }

    public final int hashCode() {
        return this.f188384c.hashCode() + (this.f188383b.hashCode() * 31);
    }
}
