package com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow;

import bjl.p0;
import bjl.u;
import bjl.v;
import bjl.w;
import bjl.x;
import bjl.y;
import cjl.s;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.api.login.RevolutSsoApi$InputData$OperationBoundAuthentication;
import com.revolut.sso.api.login.RevolutSsoApi$Toggles;
import com.revolut.sso.impl.ui.auth.AuthenticationFlow;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlowContract$Step;
import d8l.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import pql.e;
import pql.f;
import pql.g;
import rqk.k;
import xjl.i;
import zhm.h0;
import zmg.c;
import zol.b;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {
    public final ReauthenticationWrapperFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rql.a f106693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0 f106694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f106695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final nkl.b f106696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f106697t;
    public final yki.i u;

    public a(ReauthenticationWrapperFlowContract$InputData inputData, rql.a ssoReauthenticationRepository, p0 revolutSsoDependenciesProvider, i revolutSsoFlowConfigurationInteractor, nkl.b revolutSsoFlowsFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ssoReauthenticationRepository, "ssoReauthenticationRepository");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        this.o = inputData;
        this.f106693p = ssoReauthenticationRepository;
        this.f106694q = revolutSsoDependenciesProvider;
        this.f106695r = revolutSsoFlowConfigurationInteractor;
        this.f106696s = revolutSsoFlowsFactory;
        this.f106697t = "";
        this.u = d.a(this, new zo2.h(this, 1));
    }

    public final AuthenticationFlow I2() {
        ReauthenticationWrapperFlowContract$InputData reauthenticationWrapperFlowContract$InputData = this.o;
        return djl.a.b(this.f106696s, new RevolutSsoApi$InputData$OperationBoundAuthentication(s.REGIONAL, reauthenticationWrapperFlowContract$InputData.f106690c, reauthenticationWrapperFlowContract$InputData.f106689b, 48), new c(this, 13));
    }

    public final void J2(y yVar) {
        boolean zF = Intrinsics.f(yVar, u.f16189a);
        ReauthenticationWrapperFlowContract$InputData reauthenticationWrapperFlowContract$InputData = this.o;
        rql.a aVar = this.f106693p;
        if (zF) {
            aVar.a(reauthenticationWrapperFlowContract$InputData.f106688a, e.f238815a);
            return;
        }
        boolean zF2 = Intrinsics.f(yVar, v.f16190a);
        f fVar = f.f238816a;
        if (zF2) {
            aVar.a(reauthenticationWrapperFlowContract$InputData.f106688a, fVar);
            return;
        }
        if (!Intrinsics.f(yVar, x.f16193a)) {
            if (!(yVar instanceof w)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.a(reauthenticationWrapperFlowContract$InputData.f106688a, new g(((w) yVar).f16191a, this.f106697t));
        } else {
            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Delegated success is not supported");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
            aVar.a(reauthenticationWrapperFlowContract$InputData.f106688a, fVar);
        }
    }

    @Override // yki.j
    public final void M0() {
        boolean zC = ((jte.d) ((k) this.f106694q).f).c(RevolutSsoApi$Toggles.SsoBottomSheetReauthentication.f105881c);
        yki.i iVar = this.u;
        if (zC) {
            h.z2(iVar, ReauthenticationWrapperFlowContract$Step.Modal.f106691a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            h.t2(this, iVar, ReauthenticationWrapperFlowContract$Step.Regular.f106692a, false, TransitionAnimation.FADE.f98392a, false, 8);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
