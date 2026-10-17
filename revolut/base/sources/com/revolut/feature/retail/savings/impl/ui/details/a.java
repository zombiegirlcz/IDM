package com.revolut.feature.retail.savings.impl.ui.details;

import bpb.d;
import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import g48.r0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mre.c;
import oki.h;
import ou5.b;
import qee.s;
import r10.r;
import rnb.w;
import skb.f;
import vkm.j2;
import vlb.e;
import w4l.j;
import wli.x;
import xif.k;
import xob.n;
import xob.t;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements n {
    public final b A;
    public final x B;
    public final r C;
    public final wme.a D;
    public final elb.b E;
    public final pab.a F;
    public final e G;
    public final ugc.a H;
    public final fkg.a I;
    public final com.revolut.kompot.navigable.vc.modal.a J;
    public final y K;
    public final SavingsDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f83367p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ijb.a f83368q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f83369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f83370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f83371t;
    public final c u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f83372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f80.a f83373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final tkb.a f83374y;
    public final r0 z;

    public a(s stateMapper, SavingsDetailsScreenContract$InputData inputData, w savingsVaultInteractor, ijb.a savingsProductInteractor, j60.a bottomDialogExtension, f productInfoSheetsDelegate, gte.a featureToggleInteractor, c termsNavigationFactory, ang.f userInteractor, d nextInterestPaymentStateProvider, f80.a uriHelper, tkb.a protectionSchemeControllerModelExtension, r0 jointAccountInteractor, b juniorProfilesDataInteractor, x deeplinkHandler, r infoSheetDeeplinkHandler, wme.a taxExemptionAvailabilityInteractor, elb.b savingsConfigInteractor, pab.a juniorVaultInteractor, e revampAvailabilityProvider, ugc.a savingsChallengeInteractor, fkg.a savingsUpgradesInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(productInfoSheetsDelegate, "productInfoSheetsDelegate");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(nextInterestPaymentStateProvider, "nextInterestPaymentStateProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(protectionSchemeControllerModelExtension, "protectionSchemeControllerModelExtension");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        Intrinsics.checkNotNullParameter(juniorProfilesDataInteractor, "juniorProfilesDataInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(infoSheetDeeplinkHandler, "infoSheetDeeplinkHandler");
        Intrinsics.checkNotNullParameter(taxExemptionAvailabilityInteractor, "taxExemptionAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(savingsConfigInteractor, "savingsConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorVaultInteractor, "juniorVaultInteractor");
        Intrinsics.checkNotNullParameter(revampAvailabilityProvider, "revampAvailabilityProvider");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(savingsUpgradesInteractor, "savingsUpgradesInteractor");
        this.o = inputData;
        this.f83367p = savingsVaultInteractor;
        this.f83368q = savingsProductInteractor;
        this.f83369r = bottomDialogExtension;
        this.f83370s = productInfoSheetsDelegate;
        this.f83371t = featureToggleInteractor;
        this.u = termsNavigationFactory;
        this.v = userInteractor;
        this.f83372w = nextInterestPaymentStateProvider;
        this.f83373x = uriHelper;
        this.f83374y = protectionSchemeControllerModelExtension;
        this.z = jointAccountInteractor;
        this.A = juniorProfilesDataInteractor;
        this.B = deeplinkHandler;
        this.C = infoSheetDeeplinkHandler;
        this.D = taxExemptionAvailabilityInteractor;
        this.E = savingsConfigInteractor;
        this.F = juniorVaultInteractor;
        this.G = revampAvailabilityProvider;
        this.H = savingsChallengeInteractor;
        this.I = savingsUpgradesInteractor;
        this.J = hx7.e.a(this, new k(this, 15));
        this.K = mra.d.b(this, new xob.f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, xam.a.h(new t(this, continuation, 1), this.f83367p.c(this.o.f83365a, j.f294644c)), null, null, new t(this, continuation, 2), 3);
    }

    public final void I2(String str) {
        l2(new xnl.f(this, str, null, 1), new yi5.b(26));
    }

    public final xob.e J2() {
        Object content = ((xob.f) ((j2) this.K.f22677a).getValue()).f307768a.getContent();
        if (content != null) {
            return (xob.e) content;
        }
        throw new IllegalStateException("Illegal state ContentData should not be null");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.J;
    }

    @Override // cli.z
    public final g getState() {
        return this.K;
    }
}
