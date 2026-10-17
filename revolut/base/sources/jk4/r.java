package jk4;

import ajd.t;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$UiConfig;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.f3;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f175088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputAmountScreenContract$InputData f175089b;

    public r(w80.b amountFormatter, u80.o moneyPrefixFormatter, InputAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f175088a = amountFormatter;
        this.f175089b = inputData;
    }

    public static CompositeClause a(TextLocalisedClause textLocalisedClause, dj0.d dVar) {
        Clause[] elements = {textLocalisedClause, dVar != null ? sx4.f.b(3, null, null, dVar) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Clause textLocalisedClause;
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        l lVar = new l(new TextLocalisedClause(R$string.credit_topup_screen_header, null, null, 14));
        Data data = domainState.f175070a;
        dj0.d dVar = domainState.f175071b;
        ArrayList arrayList = domainState.f175072c;
        boolean z = domainState.d;
        String strE = this.f175088a.e(dVar);
        String string = u80.o.b(new u80.g(dVar, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        long j2 = dVar.f115082a;
        List listC = u.c(new CenteredAmountDelegate.Model("id-fixed-auto-pay-amount", null, new bw0.h(strE, string, (TextClause) null, j2 > 0, (List) null, Boolean.TRUE, (List) arrayList, false, false, false, false, (bw0.e) null, (Clause) null, false, 32660), (f3) iii.c.f(data, new jj3.a(13), new q(z), new t(dVar, this, z)), new bw0.m(new TextLocalisedClause(R$string.credit_card_auto_pay_custom_amount_input_info, null, null, 14), bw0.l.INFO, null, false, null, 28), null, null, true, false, dVar.f115083b, null, 1378));
        InputAmountScreenContract$InputData inputAmountScreenContract$InputData = this.f175089b;
        SetAmountFlowContract$UiConfig.InputAmount inputAmount = inputAmountScreenContract$InputData.e;
        if (inputAmount == null || (textLocalisedClause = inputAmount.f68596a) == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.credit_card_auto_pay_amount_input_footer_text, null, null, 14);
        }
        return new m(lVar, listC, textLocalisedClause, new k(inputAmountScreenContract$InputData.f68603a ? new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14) : new TextLocalisedClause(R$string.credit_common_confirm, null, null, 14), j2 > 0));
    }
}
