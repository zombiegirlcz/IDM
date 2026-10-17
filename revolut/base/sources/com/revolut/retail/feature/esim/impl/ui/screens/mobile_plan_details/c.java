package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details;

import bjj.f;
import chj.d;
import cli.n;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationConfirmation;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_cancellation.EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$ModalStep;
import dej.t1;
import dej.z1;
import dfj.a1;
import dfj.c0;
import dfj.i1;
import dfj.k0;
import dfj.s3;
import dfj.v2;
import dfj.z0;
import hx7.e;
import ijj.u;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vgk.g;
import vjj.b0;
import vjj.d0;
import vjj.e0;
import vjj.j;
import vjj.r;
import vjj.s;
import vjj.v;
import vjj.y;
import vkm.j2;
import vkm.q;
import wli.x;
import yji.l;
import ynj.p;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements v {

    @NotNull
    public static final y Companion = new y();
    public final kdh.b A;
    public final sij.b B;
    public final f C;
    public final bjj.a D;
    public final u E;
    public final i90.b F;
    public final z0 G;
    public final vii.b H;
    public final cli.y I;
    public final com.revolut.kompot.navigable.vc.modal.a J;
    public final EsimMobilePlanDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f101207p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v2 f101208q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f101209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a f101210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0 f101211t;
    public final i1 u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final tij.x f101212w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s3 f101213x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c0 f101214y;
    public final p z;

    public c(n stateMapper, EsimMobilePlanDetailsScreenContract$InputData inputData, x deeplinkHandler, v2 esimProfilesInteractor, d esimInstallationControllerExtension, com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_esim_migration.a mobilePlanEsimMigrationControllerProvider, k0 esimInstallationStateInteractor, i1 esimPhoneNumberInteractor, gte.a featureToggleInteractor, tij.x esimUnfreezingDialogBuilder, s3 esimSubscriptionsInteractor, c0 esimGiftingInteractor, p esimPhoneNumberStateResolver, kdh.b deviceManagementInteractor, sij.b esimTransferControllerModelExtension, f subscriptionActivationControllerExtension, bjj.a subscriptionActivationConfirmationControllerProvider, u cancellationConfirmationControllerProvider, i90.b uuidUtils, z0 internalDeepLinkInteractor, dm0.d deviceIdProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationControllerExtension, "esimInstallationControllerExtension");
        Intrinsics.checkNotNullParameter(mobilePlanEsimMigrationControllerProvider, "mobilePlanEsimMigrationControllerProvider");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimPhoneNumberInteractor, "esimPhoneNumberInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(esimUnfreezingDialogBuilder, "esimUnfreezingDialogBuilder");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimGiftingInteractor, "esimGiftingInteractor");
        Intrinsics.checkNotNullParameter(esimPhoneNumberStateResolver, "esimPhoneNumberStateResolver");
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        Intrinsics.checkNotNullParameter(esimTransferControllerModelExtension, "esimTransferControllerModelExtension");
        Intrinsics.checkNotNullParameter(subscriptionActivationControllerExtension, "subscriptionActivationControllerExtension");
        Intrinsics.checkNotNullParameter(subscriptionActivationConfirmationControllerProvider, "subscriptionActivationConfirmationControllerProvider");
        Intrinsics.checkNotNullParameter(cancellationConfirmationControllerProvider, "cancellationConfirmationControllerProvider");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(internalDeepLinkInteractor, "internalDeepLinkInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.o = inputData;
        this.f101207p = deeplinkHandler;
        this.f101208q = esimProfilesInteractor;
        this.f101209r = esimInstallationControllerExtension;
        this.f101210s = mobilePlanEsimMigrationControllerProvider;
        this.f101211t = esimInstallationStateInteractor;
        this.u = esimPhoneNumberInteractor;
        this.v = featureToggleInteractor;
        this.f101212w = esimUnfreezingDialogBuilder;
        this.f101213x = esimSubscriptionsInteractor;
        this.f101214y = esimGiftingInteractor;
        this.z = esimPhoneNumberStateResolver;
        this.A = deviceManagementInteractor;
        this.B = esimTransferControllerModelExtension;
        this.C = subscriptionActivationControllerExtension;
        this.D = subscriptionActivationConfirmationControllerProvider;
        this.E = cancellationConfirmationControllerProvider;
        this.F = uuidUtils;
        this.G = internalDeepLinkInteractor;
        this.H = new vii.b();
        this.I = mra.d.b(this, new j(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), deviceIdProvider.b()), stateMapper, null, false, 12);
        this.J = e.a(this, new vh9.b(this, 5));
    }

    public static void L2(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanDetailsScreenModel", null, illegalStateException, h0Var);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, this.C.b3(), null, null, new e0(this, null), 3);
        l.a1(this, this.f101209r.Z2(), null, null, new b(this, null), 3);
        l.a1(this, q.Q(this.H, new b0(1, this, continuation)), null, null, new vjj.c0(1, this, continuation), 3);
        l.a1(this, rd0.e.b(this.A.j0(true, false)), null, null, new vjj.c0(6, this, continuation), 3);
        l.a1(this, this.B.Z2(), null, null, new d0(this, null), 3);
        if (!((jte.d) this.v).c(EsimApi$Toggles.EsimGifting.f100175c)) {
            H2(this.I, new g(28));
        } else {
            l.a1(this, this.f101214y.a(this.o.f101191a, w4l.h.f294642c), null, null, new vjj.c0(2, this, continuation), 3);
        }
    }

    public final void I2() {
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber;
        List list;
        Object next;
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions;
        cli.y yVar = this.I;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        List list2 = (List) ((j) j2Var.getValue()).d.getContent();
        EsimGiftRecipient esimGiftRecipient = null;
        EsimPhoneNumberSelections esimPhoneNumberSelections = list2 != null ? (EsimPhoneNumberSelections) zhm.d0.d0(list2) : null;
        EsimPhoneNumberPorting esimPhoneNumberPorting = (esimPhoneNumberSelections == null || (esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b) == null) ? null : esimPhoneNumberSelectionOptions.f100404a;
        t1 t1Var = (t1) ((j) j2Var2.getValue()).f289765a.getContent();
        if (t1Var == null || (list = t1Var.K) == null) {
            esimSubscriptionPhoneNumber = null;
        } else {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                this.z.getClass();
                if (p.b((EsimSubscriptionPhoneNumber) next)) {
                    break;
                }
            }
            esimSubscriptionPhoneNumber = (EsimSubscriptionPhoneNumber) next;
        }
        Optional optional = (Optional) ((j) j2Var2.getValue()).e.getContent();
        if (optional != null) {
            Intrinsics.checkNotNullParameter(optional, "<this>");
            esimGiftRecipient = (EsimGiftRecipient) optional.orElse(null);
        }
        if (esimPhoneNumberSelections == null || esimPhoneNumberPorting == null || esimSubscriptionPhoneNumber == null) {
            L2("Can't start phone number portability confirmation flow, porting is null");
        } else {
            C2(new vjj.q(this.o.f101191a, esimSubscriptionPhoneNumber.f100472c, esimPhoneNumberPorting, esimGiftRecipient));
        }
    }

    public final void J2() {
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions;
        cli.y yVar = this.I;
        List list = (List) ((j) ((j2) yVar.f22677a).getValue()).d.getContent();
        EsimGiftRecipient esimGiftRecipient = null;
        EsimPhoneNumberSelections esimPhoneNumberSelections = list != null ? (EsimPhoneNumberSelections) zhm.d0.d0(list) : null;
        EsimPhoneNumberPorting esimPhoneNumberPorting = (esimPhoneNumberSelections == null || (esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b) == null) ? null : esimPhoneNumberSelectionOptions.f100404a;
        Optional optional = (Optional) ((j) ((j2) yVar.f22677a).getValue()).e.getContent();
        if (optional != null) {
            Intrinsics.checkNotNullParameter(optional, "<this>");
            esimGiftRecipient = (EsimGiftRecipient) optional.orElse(null);
        }
        if (esimPhoneNumberSelections == null || esimPhoneNumberPorting == null) {
            L2("Can't start phone number portability flow, porting is null");
        } else {
            C2(new r(esimGiftRecipient, esimPhoneNumberPorting, esimPhoneNumberSelections, this.o.f101191a));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.J;
    }

    public final void K2(EsimProfile esimProfile) {
        h.v2(this.J, new EsimMobilePlanDetailsScreenContract$ModalStep.EsimInstallation(esimProfile), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void M2(EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) {
        EsimGiftRecipient esimGiftRecipient;
        z1 z1Var;
        String str = this.o.f101191a;
        cli.y yVar = this.I;
        Optional optional = (Optional) ((j) ((j2) yVar.f22677a).getValue()).e.getContent();
        String str2 = null;
        if (optional != null) {
            Intrinsics.checkNotNullParameter(optional, "<this>");
            esimGiftRecipient = (EsimGiftRecipient) optional.orElse(null);
        } else {
            esimGiftRecipient = null;
        }
        t1 t1Var = (t1) ((j) ((j2) yVar.f22677a).getValue()).f289765a.getContent();
        if (t1Var != null && (z1Var = t1Var.f113662s) != null) {
            str2 = z1Var.f113698b;
        }
        C2(new s(str, esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType, esimGiftRecipient, str2));
    }

    public final void N2(EsimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType) {
        z1 z1Var;
        t1 t1Var = (t1) ((j) ((j2) this.I.f22677a).getValue()).f289765a.getContent();
        EsimSubscriptionCancellationConfirmation esimSubscriptionCancellationConfirmation = (t1Var == null || (z1Var = t1Var.f113662s) == null) ? null : z1Var.e;
        if (esimSubscriptionCancellationConfirmation == null) {
            M2(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType);
        } else {
            h.v2(this.J, new EsimMobilePlanDetailsScreenContract$ModalStep.CancellationConfirmation(esimMobilePlanCancellationFlowContract$EsimMobilePlanCancellationType, esimSubscriptionCancellationConfirmation), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    public final void O2(EsimProfileEntry esimProfileEntry) {
        EsimProfile esimProfile;
        Object next;
        List list = (List) ((j) ((j2) this.I.f22677a).getValue()).f289766b.getContent();
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
            L2("Can't find eSIM profile to install");
            return;
        }
        if (((jte.d) this.v).c(EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c)) {
            K2(esimProfile);
            return;
        }
        String str = esimProfile.f100423a;
        EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
        this.f101209r.b3(str, esimProfileDetails != null ? esimProfileDetails.a() : null);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        b0 b0Var = new b0(3, this, continuation);
        vii.b bVar = this.H;
        l.b1(this, rd0.e.n(q.Q(bVar, b0Var), h0.f322473a), null, new vjj.c0(5, this, continuation), 3);
        l.b1(this, q.Q(bVar, new b0(2, this, continuation)), null, new vjj.c0(4, this, continuation), 3);
        int i = 0;
        l.b1(this, q.Q(bVar, new b0(i, this, continuation)), null, new vjj.c0(i, this, continuation), 3);
        l.b1(this, q.g(((a1) this.G).f113903a), null, new vjj.c0(3, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.I;
    }
}
