package com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import io3.l;
import j2c.n;
import j45.e;
import j45.f;
import j45.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import m2j.j;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements f {
    public final AccountSelectorV2$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f70301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b45.h f70302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f70303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wx4.b f70304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f70305t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(AccountSelectorV2$InputData inputData, j balancesInteractor, b45.h loanAutopayInteractor, ang.f userInteractor, wx4.b creditProductArticleChecker, o mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(loanAutopayInteractor, "loanAutopayInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditProductArticleChecker, "creditProductArticleChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f70301p = balancesInteractor;
        this.f70302q = loanAutopayInteractor;
        this.f70303r = userInteractor;
        this.f70304s = creditProductArticleChecker;
        this.f70305t = d.b(this, new e(new Data(null, null, true, 3, null), inputData.f70284a), mapper, null, false, 12);
        this.u = hx7.e.a(this, new n(this, 5));
    }

    @Override // yji.l
    public final void I1() {
        I2();
    }

    public final void I2() {
        k1j.d dVar = k1j.d.RETAIL;
        l lVar = l.CURRENT;
        k1j.a[] elements = {k1j.a.POCKETS, k1j.a.JOINT_ACCOUNT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        yji.l.a1(this, rd0.e.b(this.f70301p.e(new BalancesInteractor$InputData(dVar, lVar, kotlin.collections.d.y0(elements), this.o.f70285b, null, null, null, null, 240), null)), null, null, new iug.j(this, (Continuation) null, 21), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f70305t;
    }
}
