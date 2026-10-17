package com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.OpenBankingBrPaymentsFlowContract$Step;
import fgj.g;
import fk6.f;
import hk6.k;
import kotlin.jvm.internal.Intrinsics;
import lk6.g0;
import nii.y0;
import oki.h;
import wj6.m;
import yji.l;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements fk6.b {
    public final com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f72708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final OpenBankingBrPaymentsFlowContract$InputData f72709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f72710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f72711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f72712t;

    public d(com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a openBankingBrazilInteractor, g0 paymentNotificationsModalProvider, OpenBankingBrPaymentsFlowContract$InputData inputData, m updatedLimitRelay, k updatedExpiryDateRelay) {
        Intrinsics.checkNotNullParameter(openBankingBrazilInteractor, "openBankingBrazilInteractor");
        Intrinsics.checkNotNullParameter(paymentNotificationsModalProvider, "paymentNotificationsModalProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(updatedLimitRelay, "updatedLimitRelay");
        Intrinsics.checkNotNullParameter(updatedExpiryDateRelay, "updatedExpiryDateRelay");
        this.o = openBankingBrazilInteractor;
        this.f72708p = paymentNotificationsModalProvider;
        this.f72709q = inputData;
        this.f72710r = updatedLimitRelay;
        this.f72711s = updatedExpiryDateRelay;
        g gVar = new g(this, 9);
        this.f72712t = cp5.d.a(this, OpenBankingBrPaymentsFlowContract$Step.PaymentAuthorization.f72699a, f0.f322471a, gVar);
    }

    public static final void I2(d dVar, String str, String str2) {
        l.a1(dVar, dVar.X1(new y0(null, new nii.g0(new TextLocalisedClause(R$string.open_banking_safe_redirect_back_redirecting_title, null, null, 14), new TextLocalisedClause(R$string.open_banking_safe_redirect_back_redirecting_description, u.c(str), null, 12), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, null, new f(dVar, str2, null), 3);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72712t;
    }
}
