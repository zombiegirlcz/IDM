package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason;

import ang.f;
import chj.d;
import cli.g;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$ModalStep;
import dej.e3;
import dej.i0;
import dej.j0;
import dej.l0;
import dej.m0;
import dej.n0;
import dej.o0;
import dej.p0;
import dej.t1;
import dfj.k0;
import dfj.l;
import dfj.s3;
import dfj.y;
import hx7.e;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nk4.o;
import nnj.j;
import nnj.k;
import nnj.m;
import nnj.n;
import nnj.s;
import nnj.t;
import oki.h;
import vkm.j2;
import vkm.q;
import w4l.i;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements n {
    public final EsimRefundReasonScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f101468p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f101469q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s3 f101470r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k0 f101471s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f101472t;
    public final l u;
    public final gte.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f101473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f101474x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101475y;

    public c(cli.n stateMapper, EsimRefundReasonScreenContract$InputData inputData, f userInteractor, y esimFeedbackInteractor, s3 esimSubscriptionsInteractor, k0 esimInstallationStateInteractor, d esimInstallationControllerModelExtension, l esimConfigurationInteractor, gte.a featureToggleInteractor) {
        j iVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(esimFeedbackInteractor, "esimFeedbackInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationStateInteractor, "esimInstallationStateInteractor");
        Intrinsics.checkNotNullParameter(esimInstallationControllerModelExtension, "esimInstallationControllerModelExtension");
        Intrinsics.checkNotNullParameter(esimConfigurationInteractor, "esimConfigurationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f101468p = userInteractor;
        this.f101469q = esimFeedbackInteractor;
        this.f101470r = esimSubscriptionsInteractor;
        this.f101471s = esimInstallationStateInteractor;
        this.f101472t = esimInstallationControllerModelExtension;
        this.u = esimConfigurationInteractor;
        this.v = featureToggleInteractor;
        this.f101473w = new vii.b(i.f294643c);
        Data data = new Data(null, null, true, 3, null);
        if (inputData instanceof EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription) {
            iVar = new nnj.h(e3.NOT_ABLE_TO_INSTALL_ESIM);
        } else {
            if (!(inputData instanceof EsimRefundReasonScreenContract$InputData.CancelMobilePlan)) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = new nnj.i(p0.NOT_ABLE_TO_INSTALL_ESIM);
        }
        this.f101474x = mra.d.b(this, new k(data, iVar, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f101475y = e.a(this, new o(this, 7));
    }

    public static void J2(String str) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimRefundReasonScreenModel", str, null, h0Var);
    }

    public static void K2(String str, String str2, String str3, o0 o0Var) {
        String str4;
        if (o0Var instanceof i0) {
            str4 = "Installed";
        } else if (o0Var instanceof l0) {
            str4 = "Preparing";
        } else if (o0Var instanceof dej.h0) {
            str4 = "Available";
        } else if (o0Var instanceof j0) {
            str4 = "OtherDevice";
        } else if (o0Var instanceof dej.k0) {
            str4 = "OtherOwner";
        } else if (o0Var instanceof n0) {
            str4 = "Unsupported";
        } else {
            if (o0Var != null) {
                throw new NoWhenBranchMatchedException();
            }
            str4 = null;
        }
        Pair[] elements = {new Pair("selectedReason", str3), new Pair("subscriptionId", str2), new Pair("installationState", String.valueOf(str4))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimRefundReasonScreenModel", "Can not handle eSIM installation / activation reason: ".concat(str), null, setY0);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f101468p.j(w4l.h.f294642c), null, null, new t(3, this, null), 3);
        s sVar = new s(0, this, continuation);
        vii.b bVar = this.f101473w;
        yji.l.a1(this, prk.o.w("EsimRefundReasonScreenModel", "observeEsimInstallationStates", q.Q(bVar, sVar)), null, null, new t(0, this, null), 3);
        yji.l.a1(this, this.f101472t.Z2(), null, null, new b(this, null), 3);
        yji.l.a1(this, prk.o.w("EsimRefundReasonScreenModel", "observeManualInstallationStateTillFinish", q.Q(bVar, new s(2, this, continuation))), null, null, new t(2, this, null), 3);
        yji.l.a1(this, prk.o.w("EsimRefundReasonScreenModel", "observeEsimSubscriptionsTillFinish", q.Q(bVar, new s(1, this, continuation))), null, null, new t(1, this, null), 3);
    }

    public final void I2(String str, String str2) {
        t1 subscription;
        o0 o0Var;
        List list;
        Object next;
        Object next2;
        cli.y yVar = this.f101474x;
        List list2 = (List) ((k) ((j2) yVar.f22677a).getValue()).e.getContent();
        if (list2 != null) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it8.next();
                    if (Intrinsics.f(((t1) next2).f113650a, str2)) {
                        break;
                    }
                }
            }
            subscription = (t1) next2;
        } else {
            subscription = null;
        }
        if (subscription == null || (list = (List) ((k) ((j2) yVar.f22677a).getValue()).f.getContent()) == null) {
            o0Var = null;
        } else {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            String profileId = subscription.e.f100440a;
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(profileId, "profileId");
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it9.next();
                    if (Intrinsics.f(((o0) next).a().f100423a, profileId)) {
                        break;
                    }
                }
            }
            o0Var = (o0) next;
        }
        if (subscription == null) {
            K2("selected subscription is null", str2, str, o0Var);
            L2();
            return;
        }
        if (o0Var == null) {
            K2("installation state is null", str2, str, null);
            L2();
            return;
        }
        if (subscription.e.f != null) {
            L2();
            return;
        }
        boolean z = o0Var instanceof i0;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f101475y;
        if (z) {
            h.v2(aVar, EsimRefundReasonScreenContract$ModalStep.EsimAlreadyInstalled.f101463a, bottom_dialog);
            return;
        }
        if (o0Var instanceof dej.h0) {
            h.v2(aVar, new EsimRefundReasonScreenContract$ModalStep.EsimInstallConfirmation(((dej.h0) o0Var).f113546a), bottom_dialog);
        } else {
            if (!(o0Var instanceof m0)) {
                throw new NoWhenBranchMatchedException();
            }
            K2("installation is not available", str2, str, (m0) o0Var);
            L2();
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101475y;
    }

    public final void L2() {
        cli.y yVar = this.f101474x;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        j jVar = ((k) j2Var.getValue()).f217693b;
        if (jVar instanceof nnj.h) {
            C2(new m(((nnj.h) jVar).f217690a, ((k) j2Var2.getValue()).f217694c));
            return;
        }
        if (!(jVar instanceof nnj.i)) {
            throw new NoWhenBranchMatchedException();
        }
        p0 p0Var = ((nnj.i) jVar).f217691a;
        do3.n nVar = (do3.n) ((k) j2Var2.getValue()).f217692a.getContent();
        String str = nVar != null ? nVar.f116410c : null;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            J2("User data hasn't being loaded before cancellation is requested.");
        }
        C2(new nnj.l(p0Var, str, ((k) j2Var2.getValue()).f217694c));
    }

    public final void M2(String str) {
        h.v2(this.f101475y, new EsimRefundReasonScreenContract$ModalStep.Instructions(str), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // cli.z
    public final g getState() {
        return this.f101474x;
    }
}
