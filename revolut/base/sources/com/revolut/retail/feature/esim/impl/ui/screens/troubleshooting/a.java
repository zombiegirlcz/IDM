package com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.impl.ui.flows.troubleshooting.EsimConnectivityTroubleshootingFlowContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.EsimConnectivityTroubleshootingScreenContract$ModalStep;
import dfj.p;
import dfj.u;
import ehj.d;
import ip0.v7;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nfj.e1;
import nfj.m1;
import oki.h;
import rhl.b;
import rnj.c;
import rnj.e;
import rnj.g;
import rnj.j;
import unj.i;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements e {
    public final u o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f101481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f101482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final chj.d f101483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f101484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final EsimConnectivityTroubleshootingFlowContract$InputData f101485t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Flow f101486w;

    public a(n stateMapper, u troubleshootingInteractor, i resetProfileDialogBuilder, d esimInstallationUrlBuilder, chj.d esimInstallationExtension, gte.a featureToggleInteractor, EsimConnectivityTroubleshootingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(troubleshootingInteractor, "troubleshootingInteractor");
        Intrinsics.checkNotNullParameter(resetProfileDialogBuilder, "resetProfileDialogBuilder");
        Intrinsics.checkNotNullParameter(esimInstallationUrlBuilder, "esimInstallationUrlBuilder");
        Intrinsics.checkNotNullParameter(esimInstallationExtension, "esimInstallationExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = troubleshootingInteractor;
        this.f101481p = resetProfileDialogBuilder;
        this.f101482q = esimInstallationUrlBuilder;
        this.f101483r = esimInstallationExtension;
        this.f101484s = featureToggleInteractor;
        this.f101485t = inputData;
        y yVarB = mra.d.b(this, new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), p.f114062a), stateMapper, null, false, 12);
        this.u = yVarB;
        this.v = hx7.e.a(this, new rl8.d(this, 4));
        this.f101486w = v7.w(yVarB.B(new g(this, 0)));
    }

    public static void J2(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimConnectivityTroubleshootingScreenModel", null, illegalStateException, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        int i = 1;
        u uVar = this.o;
        Continuation continuation = null;
        rnj.h hVar = new rnj.h(i, uVar, continuation);
        Flow flow = this.f101486w;
        l.a1(this, q.Q(flow, hVar), null, null, new rnj.i(this, continuation, i), 3);
        String str = this.f101485t.f100897a;
        dfj.n nVar = u.Companion;
        uVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        m1 m1Var = (m1) uVar.f114115b;
        m1Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, m1Var.f214991h.b(new e1(str), loadingStrategy), null, null, new rnj.i(this, continuation, 2), 3);
        int i2 = 0;
        l.a1(this, q.Q(flow, new rnj.h(i2, uVar, continuation)), null, null, new rnj.i(this, continuation, i2), 3);
        l.a1(this, this.f101483r.Z2(), null, null, new j(this, null), 3);
    }

    public final void I2(EsimProfile esimProfile, boolean z) {
        if (((jte.d) this.f101484s).c(EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c)) {
            h.v2(this.v, new EsimConnectivityTroubleshootingScreenContract$ModalStep.EsimInstallation(esimProfile, z), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (z) {
            EsimInstructionType.INSTANCE.getClass();
            K2("INSTALLATION");
            return;
        }
        EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
        String esimActivationCode = esimProfileDetails != null ? esimProfileDetails.f100434b : null;
        this.f101482q.getClass();
        String strA = d.a(esimProfile);
        if (esimActivationCode == null && strA == null) {
            J2("Can't install eSIM: both activation code and installation URL are missing");
            return;
        }
        String esimProfileId = esimProfile.f100423a;
        if (esimActivationCode == null) {
            esimActivationCode = "";
        }
        chj.d dVar = this.f101483r;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
        Intrinsics.checkNotNullParameter(esimActivationCode, "esimActivationCode");
        dVar.b3(esimProfileId, strA != null ? new EsimProfileDetails.InstallationType.InstallationLink(strA) : new EsimProfileDetails.InstallationType.ActivationCode(esimActivationCode));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final void K2(String str) {
        String str2;
        EsimProfile esimProfile = (EsimProfile) ((c) ((j2) this.u.f22677a).getValue()).f255702a.getContent();
        if (esimProfile == null || (str2 = esimProfile.f100423a) == null) {
            str2 = this.f101485t.f100897a;
        }
        C2(new rnj.d(str, str2));
    }

    public final void L2() {
        String str;
        EsimProfile esimProfile = (EsimProfile) ((c) ((j2) this.u.f22677a).getValue()).f255702a.getContent();
        if (esimProfile == null || (str = esimProfile.f100423a) == null) {
            J2("Triggered reset but profile was not found");
        } else {
            l2(new b(this, str, null, 4), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
