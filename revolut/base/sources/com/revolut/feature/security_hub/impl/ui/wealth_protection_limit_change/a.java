package com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.api.models.WealthProtectionSuggestedAmount;
import g6e.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pnf.f;
import pth.m;
import pwc.b0;
import pwc.e0;
import pwc.g;
import pwc.p;
import pwc.u;
import pwc.v;
import pwc.z;
import qtc.k;
import qwc.e;
import r10.t;
import vkm.j2;
import vkm.v1;
import w39.b;
import w4l.j;
import wtc.c0;
import wtc.g0;
import wtc.j0;
import wtc.k0;
import wtc.u0;
import yji.l;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements p {

    @NotNull
    public static final u Companion = new u();
    public final k0 A;
    public final b B;
    public final buc.h C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final WealthProtectionLimitChangeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ptc.a f85783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f85784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f85785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u0 f85786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final elb.b f85787t;
    public final d u;
    public final g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zja.a f85788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f85789x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gte.a f85790y;
    public final c0 z;

    public a(n stateMapper, WealthProtectionLimitChangeScreenContract$InputData inputData, ptc.a wealthProtectionInteractor, w80.b amountFormatter, e wealthProtectionLimitChangeDialogFactory, u0 wealthProtectionFeatureChangeInteractor, elb.b savingsFeatureConfigInteractor, d subaccountInteractor, g0 streetModeInteractor, zja.a productArticleInteractor, t streetModeProductArticleProvider, gte.a featureToggleInteractor, c0 streetModeChangeInteractor, k0 streetModeWifiSuggestionBannerInteractor, b locationInteractor, buc.h trustedWifiLocationErrorDialogProvider) {
        WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthProtectionInteractor, "wealthProtectionInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(wealthProtectionLimitChangeDialogFactory, "wealthProtectionLimitChangeDialogFactory");
        Intrinsics.checkNotNullParameter(wealthProtectionFeatureChangeInteractor, "wealthProtectionFeatureChangeInteractor");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(streetModeProductArticleProvider, "streetModeProductArticleProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(streetModeChangeInteractor, "streetModeChangeInteractor");
        Intrinsics.checkNotNullParameter(streetModeWifiSuggestionBannerInteractor, "streetModeWifiSuggestionBannerInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(trustedWifiLocationErrorDialogProvider, "trustedWifiLocationErrorDialogProvider");
        this.o = inputData;
        this.f85783p = wealthProtectionInteractor;
        this.f85784q = amountFormatter;
        this.f85785r = wealthProtectionLimitChangeDialogFactory;
        this.f85786s = wealthProtectionFeatureChangeInteractor;
        this.f85787t = savingsFeatureConfigInteractor;
        this.u = subaccountInteractor;
        this.v = streetModeInteractor;
        this.f85788w = productArticleInteractor;
        this.f85789x = streetModeProductArticleProvider;
        this.f85790y = featureToggleInteractor;
        this.z = streetModeChangeInteractor;
        this.A = streetModeWifiSuggestionBannerInteractor;
        this.B = locationInteractor;
        this.C = trustedWifiLocationErrorDialogProvider;
        WealthProtectionFeatureState.Visible visible = inputData.f85776b;
        Boolean boolValueOf = null;
        dj0.d dVar = (!(visible instanceof WealthProtectionFeatureState.Visible.Disabled) || (wealthProtectionSuggestedAmount = ((WealthProtectionFeatureState.Visible.Disabled) visible).d) == null) ? null : wealthProtectionSuggestedAmount.f85453a;
        if (visible instanceof WealthProtectionFeatureState.Visible.Disabled) {
            WealthProtectionSuggestedAmount wealthProtectionSuggestedAmount2 = ((WealthProtectionFeatureState.Visible.Disabled) visible).d;
            boolValueOf = Boolean.valueOf((wealthProtectionSuggestedAmount2 != null ? wealthProtectionSuggestedAmount2.f85453a : null) != null);
        }
        this.D = mra.d.b(this, new g(visible, dVar, boolValueOf != null ? boolValueOf.booleanValue() : false, false, false, pwc.h.DEFAULT, null, null, false, null, f0.f322471a, false), stateMapper, null, false, 12);
        this.E = hx7.e.a(this, new pu4.d(this, 9));
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, this.f85787t.a(j.f294644c), null, null, new b0(this, null), 3);
        WealthProtectionLimitChangeScreenContract$InputData wealthProtectionLimitChangeScreenContract$InputData = this.o;
        if (wealthProtectionLimitChangeScreenContract$InputData.f85775a == k.TRANSFERS) {
            l.a1(this, this.v.e(), null, null, new z(this, null), 3);
        }
        int i = v.f240424a[wealthProtectionLimitChangeScreenContract$InputData.f85775a.ordinal()];
        if (i == 1) {
            l.a1(this, ((s6e.z) this.u).r(), null, null, new pwc.y(this, null), 3);
            return;
        }
        y yVar = this.D;
        if (i == 2) {
            H2(yVar, new pui.a(24));
        } else {
            if (i != 3) {
                return;
            }
            H2(yVar, new pui.a(25));
        }
    }

    public final boolean I2() {
        y yVar = this.D;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        return ((g) j2Var.getValue()).f240402c || ((g) j2Var2.getValue()).d || ((g) j2Var2.getValue()).e;
    }

    public final void J2(StreetModeInfo streetModeInfo, long j2) {
        y yVar = this.D;
        dj0.d dVar = ((g) ((j2) yVar.f22677a).getValue()).f240401b;
        if (dVar != null) {
            j2 = dVar.f115082a;
        }
        if (j2 < streetModeInfo.f85425c.f85426a) {
            H2(yVar, new pui.a(26));
            return;
        }
        H2(yVar, new pui.a(27));
        n2(new f(this, streetModeInfo, null, 23), new whi.b(6));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    public final void K2(String str) {
        y yVar = this.D;
        Data data = ((g) ((j2) yVar.f22677a).getValue()).f240404h;
        StreetModeInfo streetModeInfo = data != null ? (StreetModeInfo) c.I(data) : null;
        if (streetModeInfo == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        H2(yVar, new m(streetModeInfo, str, 4));
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.o.f85775a == k.TRANSFERS) {
            k0 k0Var = this.A;
            k0Var.getClass();
            l.b1(this, new v1(new j0(k0Var, null)), null, new e0(this, null), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
