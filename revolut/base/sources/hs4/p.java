package hs4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreenContract$InstalmentFilter;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cm4.f f155001a;

    public p(cm4.f instalmentItemMapper) {
        Intrinsics.checkNotNullParameter(instalmentItemMapper, "instalmentItemMapper");
        this.f155001a = instalmentItemMapper;
    }

    public static TextLocalisedClause a(CreditCardInstalmentsScreenContract$InstalmentFilter creditCardInstalmentsScreenContract$InstalmentFilter) {
        if (creditCardInstalmentsScreenContract$InstalmentFilter instanceof CreditCardInstalmentsScreenContract$InstalmentFilter.Current) {
            return new TextLocalisedClause(R$string.credit_card_instalment_plan_list_title_active, null, null, 14);
        }
        if (creditCardInstalmentsScreenContract$InstalmentFilter instanceof CreditCardInstalmentsScreenContract$InstalmentFilter.Past) {
            return new TextLocalisedClause(R$string.credit_card_instalment_plan_list_title_past_plans, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f154987a, new l(this, domainState), new hfb.d(18, domainState, this), new hb4.n(this, domainState, 15));
    }
}
