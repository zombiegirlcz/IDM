package bpe;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import com.revolut.feature.tax_residency.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        MoneyClause moneyClause = new MoneyClause(domainState.f17611a.f116289b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        f0 f0Var = f0.f322471a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.stamp_duty_pay_bottom_sheet_title, null, null, 14);
        StampDutyAccount stampDutyAccount = domainState.f17611a.f116288a;
        if (stampDutyAccount instanceof StampDutyAccount.Personal) {
            textLocalisedClause = new TextLocalisedClause(R$string.stamp_duty_pay_bottom_sheet_personal_subtitle, u.c(moneyClause), null, 12);
        } else if (stampDutyAccount instanceof StampDutyAccount.Joint) {
            textLocalisedClause = new TextLocalisedClause(R$string.stamp_duty_pay_bottom_sheet_joint_subtitle, u.c(moneyClause), null, 12);
        } else {
            if (!Intrinsics.f(stampDutyAccount, StampDutyAccount.Pro.f89993a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.stamp_duty_pay_bottom_sheet_freelancer_subtitle, u.c(moneyClause), null, 12);
        }
        List listK = v.k(textLocalisedClause, new TextLocalisedClause(R$string.stamp_duty_pay_bottom_sheet_subtitle_learn_more, null, new Click(30, (Integer) null, (Object) null, "FAQ_LINK", false), 10));
        m70.a.t(t0.f186434a);
        return new h(new lw0.a(textLocalisedClause2, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_stamp, null, null, 6)), null, false, 24), new TextLocalisedClause(R$string.stamp_duty_pay_bottom_sheet_cta_pay, u.c(moneyClause), null, 12), f0Var);
    }
}
