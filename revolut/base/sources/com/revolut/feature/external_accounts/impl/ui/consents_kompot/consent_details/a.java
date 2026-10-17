package com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details;

import cli.n;
import cli.y;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import java.util.List;
import klf.l1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ll6.f;
import ll6.g;
import ll6.i;
import mra.d;
import oki.h;
import rd0.e;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements g {
    public final ConsentDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fi6.h f72775p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r10.a f72776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f72777r;

    public a(n stateMapper, ConsentDetailsScreenContract$InputData inputData, fi6.h accountsProvider, r10.a accountsExchangeRatesProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountsProvider, "accountsProvider");
        Intrinsics.checkNotNullParameter(accountsExchangeRatesProvider, "accountsExchangeRatesProvider");
        this.o = inputData;
        this.f72775p = accountsProvider;
        this.f72776q = accountsExchangeRatesProvider;
        this.f72777r = d.b(this, new f(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        OpenBankingConsent openBankingConsent = this.o.f72772b;
        if (openBankingConsent instanceof OpenBankingConsent.Australia) {
            OpenBankingConsent.Australia australia = (OpenBankingConsent.Australia) openBankingConsent;
            List authorizedAccountsIds = australia.i;
            List authorizedLoansIds = australia.f60380j;
            fi6.h hVar = this.f72775p;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(authorizedAccountsIds, "authorizedAccountsIds");
            Intrinsics.checkNotNullParameter(authorizedLoansIds, "authorizedLoansIds");
            l.a1(this, e.e(q.H(new i(this, (Continuation) null, 0), e.b(hVar.d(authorizedAccountsIds, authorizedLoansIds, true, true))), h0.f322473a, new l1(3, 16, null)), null, null, new le8.d(this, (Continuation) null, 15), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72777r;
    }
}
