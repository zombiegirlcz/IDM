package com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount;

import bw0.h;
import bw0.l;
import bw0.m;
import cli.n;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$ValidationResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lxe.d;
import lxe.j;
import org.jetbrains.annotations.NotNull;
import u80.e;
import u80.g;
import u80.o;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f90773a;

    public b(o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f90773a = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        m mVar;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        dj0.d dVar = domainState.f200559a;
        CheckoutCustomAmountScreenContract$ValidationResult checkoutCustomAmountScreenContract$ValidationResult = domainState.f200560b;
        h hVar = new h(this.f90773a.e(dVar), o.b(new g(dVar, e.UNSIGNED, u80.b.SYMBOL, 8)).toString(), null, true, ehe.n.w(11), Boolean.TRUE, false, false, null, null, null, null, 32708);
        CheckoutCustomAmountScreenContract$ValidationResult.Valid valid = CheckoutCustomAmountScreenContract$ValidationResult.Valid.f90768a;
        if (checkoutCustomAmountScreenContract$ValidationResult == null) {
            mVar = new m(null, l.LOADING, null, false, null, 29);
        } else {
            if (checkoutCustomAmountScreenContract$ValidationResult instanceof CheckoutCustomAmountScreenContract$ValidationResult.MoreThanMaximum) {
                textLocalisedClause = new TextLocalisedClause(R$string.checkout_top_up_custom_amount_validation_max_error, u.c(new MoneyClause(((CheckoutCustomAmountScreenContract$ValidationResult.MoreThanMaximum) checkoutCustomAmountScreenContract$ValidationResult).f90767a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
            } else {
                if (!checkoutCustomAmountScreenContract$ValidationResult.equals(CheckoutCustomAmountScreenContract$ValidationResult.ZeroAmount.f90769a) && !checkoutCustomAmountScreenContract$ValidationResult.equals(valid)) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = null;
            }
            mVar = textLocalisedClause != null ? new m(textLocalisedClause, l.ERROR, null, false, null, 28) : null;
        }
        return new lxe.g(u.c(new CenteredAmountDelegate.Model("CHECKOUT_AMOUNT_LIST_ID", null, hVar, null, mVar, null, null, false, false, dVar.f115083b, null, 1514)), Intrinsics.f(checkoutCustomAmountScreenContract$ValidationResult, valid));
    }
}
