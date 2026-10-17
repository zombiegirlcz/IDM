package com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer;

import com.revolut.feature.external_accounts.impl.ui.japan.easy_bank_transfer.JapanEasyBankTransferFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import xif.k;
import xm6.b;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final JapanEasyBankTransferFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oe6.a f72957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f72958q;

    public a(JapanEasyBankTransferFlowContract$InputData inputData, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.o = inputData;
        this.f72957p = externalInstitutionsInteractor;
        this.f72958q = d.a(this, new k(this, 9));
    }

    @Override // yki.j
    public final void M0() {
        h.u2(this, this.f72958q, new JapanEasyBankTransferFlowContract$Step.Consent(this.o.f72952a), null, 6);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f72958q;
    }
}
