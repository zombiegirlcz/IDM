package com.revolut.feature.external_accounts.impl.ui.brazil.linked_accounts;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b;
import kk8.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lf6.j;
import mra.d;
import oki.h;
import yji.l;
import zfd.s;
import zj6.g;
import zj6.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements zj6.h {
    public final BrazilLinkedAccountsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a f72648p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f72649q;

    public a(k stateMapper, BrazilLinkedAccountsScreenContract$InputData inputData, com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a openBankingBrazilInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(openBankingBrazilInteractor, "openBankingBrazilInteractor");
        this.o = inputData;
        this.f72648p = openBankingBrazilInteractor;
        this.f72649q = d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String thirdPartyTitle = this.o.f72642a;
        b bVar = (b) this.f72648p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar = (j) bVar.f72410a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, new og6.d(nim.a.u(new n(1, thirdPartyTitle, null), jVar.e.b(Unit.f186387a, loadingStrategy)), 1), null, null, new s(this, (Continuation) null, 8), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72649q;
    }
}
