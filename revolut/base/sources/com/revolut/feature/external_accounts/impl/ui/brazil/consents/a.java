package com.revolut.feature.external_accounts.impl.ui.brazil.consents;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b;
import kj6.f;
import kj6.g;
import kj6.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lf6.j;
import mra.d;
import og6.i;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements g {
    public final BrazilConsentsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f72561p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f72562q;

    public a(k stateMapper, BrazilConsentsScreenContract$InputData inputData, b openBankingBrazilInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(openBankingBrazilInteractor, "openBankingBrazilInteractor");
        this.o = inputData;
        this.f72561p = openBankingBrazilInteractor;
        this.f72562q = d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        BrazilConsentsScreenContract$InputData brazilConsentsScreenContract$InputData = this.o;
        String thirdPartyTitle = brazilConsentsScreenContract$InputData.f72552a;
        i consentType = brazilConsentsScreenContract$InputData.f72553b;
        b bVar = this.f72561p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar = (j) bVar.f72410a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        l.a1(this, new og6.d(nim.a.u(new o4a.b(consentType, thirdPartyTitle, continuation, 5), jVar.d.b(Unit.f186387a, loadingStrategy)), 0), null, null, new kae.d(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72562q;
    }
}
