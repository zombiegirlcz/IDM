package com.revolut.sso.impl.ui.consent.app;

import bjl.p0;
import com.revolut.sso.api.app_consent.RevolutSsoAppConsentDestination;
import com.revolut.sso.impl.ui.consent.app.AppConsentFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import vil.f;
import xif.k;
import xjl.i;
import xll.d;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends zll.b implements xll.b {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RevolutSsoAppConsentDestination.InputData f106450q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f106451r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final xjl.d f106452s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final iql.a f106453t;
    public final i u;
    public final yki.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RevolutSsoAppConsentDestination.InputData inputData, f appConsentInteractor, xjl.d appConsentStatusInteractor, iql.a authenticationFlowFactory, p0 revolutSsoDependenciesProvider, i revolutSsoFlowConfigurationInteractor, g1 shotDialogDisplayer) {
        super(revolutSsoDependenciesProvider, shotDialogDisplayer);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(appConsentInteractor, "appConsentInteractor");
        Intrinsics.checkNotNullParameter(appConsentStatusInteractor, "appConsentStatusInteractor");
        Intrinsics.checkNotNullParameter(authenticationFlowFactory, "authenticationFlowFactory");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.f106450q = inputData;
        this.f106451r = appConsentInteractor;
        this.f106452s = appConsentStatusInteractor;
        this.f106453t = authenticationFlowFactory;
        this.u = revolutSsoFlowConfigurationInteractor;
        this.v = cp5.d.a(this, new AppConsentFlowContract$Step.Confirmation(inputData.f105822a), f0.f322471a, new k(this, 7));
    }

    @Override // yji.l
    public final void I1() {
        String id10 = this.f106450q.f105822a.f105894a;
        xjl.d dVar = this.f106452s;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        dVar.f306553a.f("challenge_in_progress", id10);
    }

    @Override // yji.l
    public final void K1() {
        this.f106452s.f306553a.remove("challenge_in_progress");
    }

    @Override // yki.j
    public final void M0() {
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}
