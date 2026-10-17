package qih;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f246719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f246720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthDisclaimersContract$Disclaimer$Investment.TransferBalancePicker f246721c;
    public final hel.b d;
    public final TradingAccount e;

    public f(TextLocalisedClause selectorTitle, TextLocalisedClause explanationTitle, WealthDisclaimersContract$Disclaimer$Investment.TransferBalancePicker disclaimersData, hel.b tradingContext, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(selectorTitle, "selectorTitle");
        Intrinsics.checkNotNullParameter(explanationTitle, "explanationTitle");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        this.f246719a = selectorTitle;
        this.f246720b = explanationTitle;
        this.f246721c = disclaimersData;
        this.d = tradingContext;
        this.e = tradingAccount;
    }

    public final WealthDisclaimersContract$Disclaimer$Investment b() {
        return this.f246721c;
    }

    public final Clause c() {
        return this.f246720b;
    }

    public final Clause d() {
        return this.f246719a;
    }

    public final TradingAccount e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f246719a.equals(fVar.f246719a) && this.f246720b.equals(fVar.f246720b) && this.f246721c.equals(fVar.f246721c) && this.d == fVar.d && Intrinsics.f(this.e, fVar.e);
    }

    public final hel.b f() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f246721c.hashCode() + t61.a.a(this.f246719a.hashCode() * 31, 31, this.f246720b)) * 31)) * 31);
    }
}
