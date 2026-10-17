package bnh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAccount.Robo f17217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17218b;

    public u(WealthAccount.Robo account, ArrayList portfolios) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        this.f17217a = account;
        this.f17218b = portfolios;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f17217a.equals(uVar.f17217a) && this.f17218b.equals(uVar.f17218b);
    }

    public final int hashCode() {
        return this.f17218b.hashCode() + (this.f17217a.hashCode() * 31);
    }
}
