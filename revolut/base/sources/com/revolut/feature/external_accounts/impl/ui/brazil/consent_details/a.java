package com.revolut.feature.external_accounts.impl.ui.brazil.consent_details;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.b;
import ij6.f;
import ij6.g;
import ij6.i;
import ij6.k;
import kotlin.jvm.internal.Intrinsics;
import lf6.j;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements g {

    @NotNull
    public static final i Companion = new i();
    public final BrazilConsentDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a f72550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f72551q;

    public a(k stateMapper, BrazilConsentDetailsScreenContract$InputData inputData, com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.a openBankingBrazilInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(openBankingBrazilInteractor, "openBankingBrazilInteractor");
        this.o = inputData;
        this.f72550p = openBankingBrazilInteractor;
        this.f72551q = d.b(this, new f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        String consentId = this.o.f72541a;
        b bVar = (b) this.f72550p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar = (j) bVar.f72410a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, jVar.f.b(consentId, loadingStrategy), null, null, new ibg.g(this, null, 10), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f72551q;
    }
}
