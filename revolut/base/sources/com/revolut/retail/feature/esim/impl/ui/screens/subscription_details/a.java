package com.revolut.retail.feature.esim.impl.ui.screens.subscription_details;

import bej.f;
import bnj.m;
import chj.d;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$ModalStep;
import dcl.m0;
import dej.t1;
import dfj.a1;
import dfj.b2;
import dfj.c0;
import dfj.k0;
import dfj.s3;
import dfj.u;
import dfj.v2;
import dfj.w;
import dfj.z0;
import hx7.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kdh.b;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import unj.c;
import unj.j;
import vkm.j2;
import vkm.q;
import vkm.z1;
import w4l.i;
import wli.x;
import yji.l;
import zh9.u0;
import zhm.h0;
import zmj.e0;
import zmj.j0;
import zmj.n0;
import zmj.o0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements e0 {
    public final u A;
    public final b B;
    public final c0 C;
    public final d D;
    public final com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a E;
    public final cnj.a F;
    public final x G;
    public final z0 H;
    public final z1 I;
    public final y J;
    public final vii.b K;
    public final com.revolut.kompot.navigable.vc.modal.a L;
    public final EsimSubscriptionDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f101427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s3 f101428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k0 f101429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f101430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f101431t;
    public final f u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final cej.b f101432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final bej.m f101433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j f101434y;
    public final v2 z;

    public a(i90.b uuidUtils, EsimSubscriptionDetailsScreenContract$InputData inputData, n stateMapper, w dataPlansInteractor, s3 subscriptionsInteractor, k0 esimInstallationStateInteractor, c countryPickerControllerMapper, m dialogMapper, f esimPlanOffersInteractor, gte.a featureToggleInteractor, cej.b mobilePlansFeatureAvailabilityInteractor, bej.m esimStatementsInteractor, j esimStatementsDialogBuilder, v2 esimProfilesInteractor, u connectivityTroubleshootingInteractor, b deviceManagementInteractor, c0 giftingInteractor, d esimInstallationControllerExtension, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a mobilePlanEsimMigrationControllerProvider, cnj.a esimDetailsReferenceControllerProvider, x deeplinkHandler, z0 internalDeepLinkInteractor, dm0.d deviceIdProvider) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dataPlansInteractor, "dataPlansInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsInteractor, "subscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(countryPickerControllerMapper, "countryPickerControllerMapper");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(esimPlanOffersInteractor, "esimPlanOffersInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsInteractor, "esimStatementsInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsDialogBuilder, "esimStatementsDialogBuilder");
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(connectivityTroubleshootingInteractor, "connectivityTroubleshootingInteractor");
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        Intrinsics.checkNotNullParameter(giftingInteractor, "giftingInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationControllerExtension, "esimInstallationControllerExtension");
        Intrinsics.checkNotNullParameter(mobilePlanEsimMigrationControllerProvider, "mobilePlanEsimMigrationControllerProvider");
        Intrinsics.checkNotNullParameter(esimDetailsReferenceControllerProvider, "esimDetailsReferenceControllerProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.o = inputData;
        this.f101427p = dataPlansInteractor;
        this.f101428q = subscriptionsInteractor;
        this.f101429r = esimInstallationStateInteractor;
        this.f101430s = countryPickerControllerMapper;
        this.f101431t = dialogMapper;
        this.u = esimPlanOffersInteractor;
        this.v = featureToggleInteractor;
        this.f101432w = mobilePlansFeatureAvailabilityInteractor;
        this.f101433x = esimStatementsInteractor;
        this.f101434y = esimStatementsDialogBuilder;
        this.z = esimProfilesInteractor;
        this.A = connectivityTroubleshootingInteractor;
        this.B = deviceManagementInteractor;
        this.C = giftingInteractor;
        this.D = esimInstallationControllerExtension;
        this.E = mobilePlanEsimMigrationControllerProvider;
        this.F = esimDetailsReferenceControllerProvider;
        this.G = deeplinkHandler;
        this.H = internalDeepLinkInteractor;
        this.I = q.a(0, 1, ukm.f.DROP_OLDEST);
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        Data data6 = new Data(null, null, true, 3, null);
        Data data7 = new Data(null, null, true, 3, null);
        Data data8 = new Data(null, null, true, 3, null);
        Data data9 = new Data(null, null, true, 3, null);
        this.J = mra.d.b(this, new zmj.n(data, data2, data3, data4, data5, false, data6, new Data(null, null, true, 3, null), wp5.y.u(uuidUtils, "toString(...)"), deviceIdProvider.b(), data7, data8, new Data(null, null, true, 3, null), data9), stateMapper, new o0(), false, 8);
        this.K = new vii.b();
        this.L = e.a(this, new zba.a(this, 25));
    }

    public static EsimProfileEntry I2(zmj.n nVar) {
        t1 t1Var = (t1) nVar.f323568a.getContent();
        if (t1Var != null) {
            return t1Var.e;
        }
        return null;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        j0 j0Var = new j0(0, this, continuation);
        vii.b bVar = this.K;
        l.a1(this, q.Q(bVar, j0Var), null, null, new zmj.k0(0, this, continuation), 3);
        l.a1(this, this.D.Z2(), null, null, new zah.f(this, continuation, 20), 3);
        l.a1(this, q.Q(bVar, new j0(2, this, continuation)), null, null, new zmj.k0(6, this, continuation), 3);
        if (((efj.d) this.f101432w).a()) {
            l.a1(this, rd0.e.n(this.z.h(), h0.f322473a), null, null, new zmj.k0(9, this, continuation), 3);
        } else {
            H2(this.J, new zmb.c(11));
        }
        l.a1(this, q.Q(bVar, new j0(4, this, continuation)), null, null, new zmj.k0(10, this, continuation), 3);
        l.a1(this, q.Q(bVar, new j0(3, this, continuation)), null, null, new zmj.k0(7, this, continuation), 3);
    }

    public final void J2(EsimProfileEntry esimProfileEntry) {
        EsimProfile esimProfile;
        Object next;
        List list = (List) ((zmj.n) ((j2) this.J.f22677a).getValue()).k.getContent();
        if (list != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (Intrinsics.f(((EsimProfile) next).f100423a, esimProfileEntry.f100440a)) {
                        break;
                    }
                }
            }
            esimProfile = (EsimProfile) next;
        } else {
            esimProfile = null;
        }
        if (esimProfile == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Can't find esim profile to install");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimSubscriptionDetailsScreenModel", null, illegalStateException, h0Var);
            return;
        }
        if (((jte.d) this.v).c(EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c)) {
            h.v2(this.L, new EsimSubscriptionDetailsScreenContract$ModalStep.EsimInstallation(esimProfile), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        String str = esimProfile.f100423a;
        EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
        this.D.b3(str, esimProfileDetails != null ? esimProfileDetails.a() : null);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.L;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.K, new j0(1, this, continuation)), null, new zmj.k0(2, this, continuation), 3);
        String subscriptionId = this.o.f101418a;
        b2 b2Var = (b2) this.u;
        b2Var.getClass();
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        s3 s3Var = b2Var.f113917c;
        w4l.h hVar = w4l.h.f294642c;
        l.b1(this, nim.a.v(u0.m(s3Var.a(subscriptionId, hVar), boh.f.e(rd0.e.b(b2Var.f113916b.q()), new m0(b2Var, hVar, 16))), new dee.x(18)), null, new zmj.k0(4, this, continuation), 3);
        l.b1(this, this.f101429r.b(i.f294643c), null, new zmj.k0(3, this, continuation), 3);
        l.b1(this, com.google.crypto.tink.shaded.protobuf.t1.d(this.I, 250L), null, new n0(this, continuation, 0), 3);
        boolean zC = ((jte.d) this.v).c(EsimApi$Toggles.EsimConnectivityTroubleshooting.f100172c);
        y yVar = this.J;
        if (zC) {
            l.b1(this, boh.f.e(q.q(nim.a.v(yVar.B(new zmb.c(9)), new zmb.c(10))), new zmj.h0(this, 1)), null, new zmj.k0(5, this, continuation), 3);
        } else {
            H2(yVar, new zmb.c(8));
        }
        l.b1(this, q.g(((a1) this.H).f113903a), null, new zmj.k0(8, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.J;
    }
}
