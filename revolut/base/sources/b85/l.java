package b85;

import b1c.p;
import c55.l0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m35.q;
import m35.r;
import q35.e0;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f13111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c45.b f13112c;

    public l(q loanTransactionCategoryIconMapper, r loanUiContentMapper, c45.b sepaAccountMapper) {
        Intrinsics.checkNotNullParameter(loanTransactionCategoryIconMapper, "loanTransactionCategoryIconMapper");
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        Intrinsics.checkNotNullParameter(sepaAccountMapper, "sepaAccountMapper");
        this.f13110a = loanTransactionCategoryIconMapper;
        this.f13111b = loanUiContentMapper;
        this.f13112c = sepaAccountMapper;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.time.LocalDateTime] */
    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e0 e0Var = domainState.f13097b;
        b95.a aVar = domainState.f13096a.f70144a.o;
        MoneyClause moneyClauseB = sx4.f.b(3, null, null, e0Var.d.l());
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.loan_management_repayment_mortgage, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        ?? localDateTime = e0Var.f241806c.toLocalDateTime();
        Intrinsics.checkNotNullExpressionValue(localDateTime, "toLocalDateTime(...)");
        return new i(new h(moneyClauseB, textLocalisedClause, sx4.a.a(oi0.d.c0(localDateTime), new TimeClause.Format.Pretty(0)), ((l0) this.f13110a).a(aVar)), (List) iii.c.f(domainState.d, new b73.h(13), new b6d.a(9), new p(this, domainState, 2)));
    }
}
