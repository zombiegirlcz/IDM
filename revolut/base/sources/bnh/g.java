package bnh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.Robo f17183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17184b;

    public g(WealthAccount.Robo account, ArrayList portfolios) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        this.f17183a = account;
        this.f17184b = portfolios;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f17183a.equals(gVar.f17183a) && this.f17184b.equals(gVar.f17184b);
    }

    public final int hashCode() {
        return this.f17184b.hashCode() + (this.f17183a.hashCode() * 31);
    }
}
