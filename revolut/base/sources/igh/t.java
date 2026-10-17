package igh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import jel.f0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f161219a;

    public t(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f161219a = dateProvider;
    }

    public static TextLocalisedClause a(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        switch (s.f161218a[f0Var.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_key_details_frequency_daily, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_key_details_frequency_weekly, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_key_details_frequency_bi_weekly, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_key_details_frequency_monthly, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_key_details_frequency_bi_monthly, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_key_details_frequency_semestral, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_key_details_frequency_quarterly, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.wealth_private_equity_fund_details_key_details_frequency_yearly, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
