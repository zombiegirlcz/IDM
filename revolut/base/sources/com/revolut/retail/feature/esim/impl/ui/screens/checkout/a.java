package com.revolut.retail.feature.esim.impl.ui.screens.checkout;

import bej.b;
import bej.m;
import bej.o;
import chj.c0;
import chj.d;
import cli.n;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimContractMetadata;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$ModalStep;
import dej.j1;
import dej.r1;
import dej.t3;
import dfj.k0;
import dfj.l;
import dfj.s3;
import dfj.v2;
import dfj.w;
import do3.f;
import do3.s;
import hng.g;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nyb.k;
import oki.h;
import unj.c;
import unj.j;
import vkm.j2;
import vkm.q;
import wli.x;
import zgj.d0;
import zgj.e0;
import zgj.f0;
import zgj.g0;
import zgj.j0;
import zgj.r;
import zgj.t;
import zgj.y;
import zh9.u0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements y {
    public final k A;
    public final b B;
    public final m C;
    public final j D;
    public final l61.a E;
    public final ugc.a F;
    public final ugc.a G;
    public final cli.y H;
    public final vii.b I;
    public final com.revolut.kompot.navigable.vc.modal.a J;
    public final i90.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EsimCheckoutScreenContract$InputData f100920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f100921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f100922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s3 f100923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f100924t;
    public final c u;
    public final k0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f100925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c0 f100926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f100927y;
    public final gte.a z;

    public a(i90.b uuidUtils, EsimCheckoutScreenContract$InputData inputData, n stateMapper, w dataPlansInteractor, o esimUserPocketInteractor, s3 esimSubscriptionsInteractor, l esimConfigurationInteractor, c countryPickerControllerMapper, k0 esimInstallationStateInteractor, d esimInstallationControllerExtension, c0 subscriptionPurchaseControllerExtension, x deeplinkHandler, gte.a featureToggleInteractor, k revPointsInteractor, b esimCheckoutInteractor, m esimStatementsInteractor, j esimStatementsDialogBuilder, l61.a userCompanyInteractor, ugc.a selectedUserProfileCountryProvider, v2 esimProfilesInteractor, ugc.a giftRecipientNameResolver) {
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dataPlansInteractor, "dataPlansInteractor");
        Intrinsics.checkNotNullParameter(esimUserPocketInteractor, "esimUserPocketInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimConfigurationInteractor, "esimConfigurationInteractor");
        Intrinsics.checkNotNullParameter(countryPickerControllerMapper, "countryPickerControllerMapper");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationControllerExtension, "esimInstallationControllerExtension");
        Intrinsics.checkNotNullParameter(subscriptionPurchaseControllerExtension, "subscriptionPurchaseControllerExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(esimCheckoutInteractor, "esimCheckoutInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsInteractor, "esimStatementsInteractor");
        Intrinsics.checkNotNullParameter(esimStatementsDialogBuilder, "esimStatementsDialogBuilder");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(selectedUserProfileCountryProvider, "selectedUserProfileCountryProvider");
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        this.o = uuidUtils;
        this.f100920p = inputData;
        this.f100921q = dataPlansInteractor;
        this.f100922r = esimUserPocketInteractor;
        this.f100923s = esimSubscriptionsInteractor;
        this.f100924t = esimConfigurationInteractor;
        this.u = countryPickerControllerMapper;
        this.v = esimInstallationStateInteractor;
        this.f100925w = esimInstallationControllerExtension;
        this.f100926x = subscriptionPurchaseControllerExtension;
        this.f100927y = deeplinkHandler;
        this.z = featureToggleInteractor;
        this.A = revPointsInteractor;
        this.B = esimCheckoutInteractor;
        this.C = esimStatementsInteractor;
        this.D = esimStatementsDialogBuilder;
        this.E = userCompanyInteractor;
        this.F = selectedUserProfileCountryProvider;
        this.G = giftRecipientNameResolver;
        this.H = mra.d.b(this, new r(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), wp5.y.u(uuidUtils, "toString(...)"), h0.f322473a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null), stateMapper, new j0(), false, 8);
        this.I = new vii.b();
        this.J = e.a(this, new zba.a(this, 17));
    }

    @Override // yji.l
    public final void I1() {
        Flow oVar;
        Continuation continuation = null;
        g0 g0Var = new g0(2, this, continuation);
        vii.b bVar = this.I;
        yji.l.a1(this, q.Q(bVar, g0Var), null, null, new f0(5, this, continuation), 3);
        yji.l.a1(this, q.Q(bVar, new g0(0, this, continuation)), null, null, new f0(3, this, continuation), 3);
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.y("EsimCheckoutScreenModel", "loadUserCompanyTillFinish", rd0.e.b(g.b(((ang.b) this.E).f7765a))), null, null, new f0(9, this, continuation), 3);
        ugc.a aVar = this.F;
        r10.q qVar = (r10.q) aVar.f279998b;
        if (qVar.E()) {
            r10.q qVar2 = (r10.q) aVar.f279998b;
            f fVar = f.BANKING;
            oVar = new ax9.o(yh5.b.d(r10.q.m0(qVar2, fVar, u.c(s.ACTIVE), 4), r10.q.k0(qVar, fVar)), 26);
        } else {
            oVar = new go.g(null, 2);
        }
        yji.l.a1(this, oVar, null, null, new f0(8, this, continuation), 3);
        yji.l.a1(this, this.f100926x.d3(), null, null, new f0(14, this, continuation), 3);
        yji.l.a1(this, this.f100925w.Z2(), null, null, new f0(13, this, continuation), 3);
        zg6.c cVar = new zg6.c(9);
        cli.y yVar = this.H;
        yji.l.a1(this, nim.a.v(u0.m(yVar.B(cVar), q.Q(bVar, new g0(1, this, continuation))), new zg6.c(10)), null, null, new f0(4, this, continuation), 3);
        yji.l.a1(this, c8g.a.D(xam.a.h(new f0(0, this, continuation), yVar.B(new zg6.c(3)))), null, null, new f0(1, this, continuation), 3);
        EsimApi$Toggles.EsimRevPoint esimRevPoint = EsimApi$Toggles.EsimRevPoint.f100183c;
        gte.a aVar2 = this.z;
        if (((jte.d) aVar2).c(esimRevPoint)) {
            yji.l.a1(this, q.Q(bVar, new g0(3, this, continuation)), null, null, new f0(7, this, continuation), 3);
        }
        if (((jte.d) aVar2).c(esimRevPoint)) {
            yji.l.a1(this, nim.a.v(c8g.a.D(yVar.B(new zg6.c(5))), new zg6.c(6)), null, null, new f0(6, this, continuation), 3);
        } else {
            H2(yVar, new zg6.c(4));
        }
        yji.l.a1(this, xam.a.h(new f0(11, this, continuation), xam.a.h(new f0(10, this, continuation), c8g.a.D(yVar.B(new zg6.c(11))))), null, null, new f0(12, this, continuation), 3);
    }

    public final void I2(dj0.d dVar) {
        if (!((jte.d) this.z).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c)) {
            C2(new t(dVar));
            return;
        }
        h.v2(this.J, new EsimCheckoutScreenContract$ModalStep.RevPayPocketSelection(dVar), ModalDestination.Style.POPUP.f98311a);
    }

    public final void J2(Object obj2) {
        int i = 25;
        Continuation continuation = null;
        if (!(obj2 instanceof EsimDescriptorValue.Action)) {
            if (obj2 instanceof EsimDescriptorValue.Link) {
                A1(new zah.f(this, ((EsimDescriptorValue.Link) obj2).f100253a, continuation, 6), new yi5.b(i));
                return;
            }
            return;
        }
        Enum r56 = ((EsimDescriptorValue.Action) obj2).f100252a;
        if (!(r56 instanceof t3)) {
            r56 = null;
        }
        t3 t3Var = (t3) r56;
        if (t3Var == null) {
            return;
        }
        if (d0.f322150a[t3Var.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        dej.a aVar = (dej.a) ((r) ((j2) this.H.f22677a).getValue()).f322180l.getContent();
        if (aVar != null) {
            A1(new e0(this, aVar.f, aVar.f113472b, null), new yi5.b(i));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimCheckoutScreenModel", "Contract summary clicked but terms not found", null, h0Var);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.J;
    }

    public final void K2(r1 r1Var, EsimDataPlan esimDataPlan, boolean z, j1 j1Var, dj0.d dVar, EsimDataPlanOfferInfo esimDataPlanOfferInfo, EsimContractMetadata esimContractMetadata, String str, String str2, dej.c cVar) {
        cli.y yVar = this.H;
        if (str != null && str2 != null) {
            this.f100926x.b3(new dej.k(esimDataPlan.f100212a, str, r1Var, dVar, j1Var, z, esimContractMetadata, str2, ((r) ((j2) yVar.f22677a).getValue()).f), esimDataPlan);
            return;
        }
        String str3 = esimDataPlan.f100212a;
        dej.m mVar = esimDataPlan.f100214c;
        this.f100926x.e3(null, r1Var, str3, ((r) ((j2) yVar.f22677a).getValue()).f, esimDataPlanOfferInfo, mVar, z, j1Var, null, dVar, esimContractMetadata, (l71.d) ((r) ((j2) yVar.f22677a).getValue()).f322181m.getContent(), null, cVar, this.f100920p.f100909c);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.H;
    }
}
