package ot5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto_investments.api.model.CombinedPocketsBalance;
import kotlin.jvm.internal.Intrinsics;
import qv0.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f229547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f229548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CombinedPocketsBalance f229549c;

    public c(RowDelegate.Model baseItem, RowDelegate.Model model, CombinedPocketsBalance combinedPocketsBalance) {
        Intrinsics.checkNotNullParameter(baseItem, "baseItem");
        Intrinsics.checkNotNullParameter(combinedPocketsBalance, "combinedPocketsBalance");
        this.f229547a = baseItem;
        this.f229548b = model;
        this.f229549c = combinedPocketsBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f229547a.equals(cVar.f229547a) && Intrinsics.f(this.f229548b, cVar.f229548b) && this.f229549c.equals(cVar.f229549c);
    }

    public final int hashCode() {
        int iHashCode = this.f229547a.hashCode() * 31;
        l lVar = this.f229548b;
        return this.f229549c.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31);
    }
}
