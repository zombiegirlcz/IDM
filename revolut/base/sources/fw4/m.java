package fw4;

import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u80.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f138583a;

    public m(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f138583a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f138573a;
        dj0.d dVar2 = domainState.f138574b;
        dj0.d dVar3 = domainState.f138573a;
        dj0.d dVar4 = domainState.f138575c;
        h hVar = new h((dVar.compareTo(dVar4) > 0 ? k.EXCEED_MAXIMUM : dVar3.compareTo(dVar2) < 0 ? k.BELOW_MINIMUM : null) == null);
        bw0.h hVar2 = new bw0.h(this.f138583a.e(dVar3), o.b(new u80.g(dVar3, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), (TextClause) null, true, (List) null, Boolean.TRUE, v.k(new bw0.d(6, new TextLocalisedClause(R$string.credit_common_min, u.c(sx4.f.b(3, null, null, dVar2)), null, 12), (Clause) null), new bw0.d(6, new TextLocalisedClause(R$string.credit_common_max, u.c(sx4.f.b(3, null, null, dVar4)), null, 12), (Clause) null)), false, false, false, false, bw0.e.SuggestionsElseCalculator, (Clause) null, false, 30612);
        k kVar = dVar3.compareTo(dVar4) > 0 ? k.EXCEED_MAXIMUM : dVar3.compareTo(dVar2) < 0 ? k.BELOW_MINIMUM : null;
        int i = kVar == null ? -1 : l.f138582a[kVar.ordinal()];
        TextLocalisedClause textLocalisedClause = i != 1 ? i != 2 ? null : new TextLocalisedClause(R$string.credit_card_statement_financing_edit_down_payment_error_maximum, u.c(sx4.f.b(3, null, null, dVar4)), null, 12) : new TextLocalisedClause(R$string.credit_card_statement_financing_edit_down_payment_error_minimum, u.c(sx4.f.b(3, null, null, dVar2)), null, 12);
        return new i(u.c(new CenteredAmountDelegate.Model("id_credit_card_down_payment_amount", null, hVar2, null, textLocalisedClause != null ? new bw0.m(textLocalisedClause, bw0.l.ERROR, new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 24) : null, null, null, true, false, dVar3.f115083b, null, 1386)), hVar);
    }
}
