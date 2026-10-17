package rgf;

import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f254148a;

    public d0(kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f254148a = wealthAccountHeaderUiMapper;
    }

    public static String a(NonProductAccountFilter nonProductAccountFilter) {
        if (Intrinsics.f(nonProductAccountFilter, NonProductAccountFilter.Crypto.f89715a)) {
            return "crypto_filter_row";
        }
        if (!(nonProductAccountFilter instanceof NonProductAccountFilter.Invest)) {
            throw new NoWhenBranchMatchedException();
        }
        NonProductAccountFilter.Invest invest = (NonProductAccountFilter.Invest) nonProductAccountFilter;
        if (invest.equals(NonProductAccountFilter.Invest.Securities.f89724a)) {
            return "invest_filter_row_securities";
        }
        if (invest.equals(NonProductAccountFilter.Invest.JointSecurities.f89720a)) {
            return "invest_filter_row_joint_securities";
        }
        if (invest.equals(NonProductAccountFilter.Invest.Cfd.f89716a)) {
            return "invest_filter_row_cfd";
        }
        if (invest.equals(NonProductAccountFilter.Invest.Commodities.f89717a)) {
            return "invest_filter_row_commodities";
        }
        if (invest.equals(NonProductAccountFilter.Invest.Robo.f89723a)) {
            return "invest_filter_row_robo";
        }
        if (invest.equals(NonProductAccountFilter.Invest.Isa.f89719a)) {
            return "invest_filter_row_isa";
        }
        if (invest.equals(NonProductAccountFilter.Invest.Pea.f89721a)) {
            return "invest_filter_row_pea";
        }
        if (invest.equals(NonProductAccountFilter.Invest.PersonalJisa.f89722a)) {
            return "invest_filter_row_personal_jisa";
        }
        if (!(invest instanceof NonProductAccountFilter.Invest.CustodianJisa)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((NonProductAccountFilter.Invest.CustodianJisa) nonProductAccountFilter).f89718a;
        if (str == null) {
            str = "";
        }
        return "invest_filter_row_custodian_jisa_".concat(str);
    }

    public static n2l.j b(NonProductAccountFilter.Invest invest) {
        if (invest.equals(NonProductAccountFilter.Invest.Securities.f89724a)) {
            return n2l.i.f211591a;
        }
        if (invest.equals(NonProductAccountFilter.Invest.JointSecurities.f89720a)) {
            return n2l.e.f211587a;
        }
        if (invest.equals(NonProductAccountFilter.Invest.Cfd.f89716a)) {
            return n2l.a.f211583a;
        }
        if (invest.equals(NonProductAccountFilter.Invest.Commodities.f89717a)) {
            return n2l.b.f211584a;
        }
        if (invest.equals(NonProductAccountFilter.Invest.Robo.f89723a)) {
            return n2l.h.f211590a;
        }
        if (invest.equals(NonProductAccountFilter.Invest.Isa.f89719a)) {
            return n2l.d.f211586a;
        }
        if (invest.equals(NonProductAccountFilter.Invest.Pea.f89721a)) {
            return n2l.f.f211588a;
        }
        if (invest.equals(NonProductAccountFilter.Invest.PersonalJisa.f89722a)) {
            return n2l.g.f211589a;
        }
        if (invest instanceof NonProductAccountFilter.Invest.CustodianJisa) {
            return new n2l.c(((NonProductAccountFilter.Invest.CustodianJisa) invest).f89718a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
