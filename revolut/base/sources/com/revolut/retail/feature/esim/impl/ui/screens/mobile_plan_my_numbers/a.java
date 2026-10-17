package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$ModalStep;
import dej.t1;
import dfj.i1;
import dfj.q1;
import dfj.s3;
import hx7.e;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kj4.c;
import kjk.x;
import kkj.f;
import kkj.i;
import kkj.j;
import kkj.l;
import kkj.q;
import kkj.r;
import kotlin.jvm.internal.Intrinsics;
import nkj.d;
import oki.h;
import vii.b;
import vkm.j2;
import ynj.p;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements l {
    public final EsimMobilePlanMyNumbersScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s3 f101248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i1 f101249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f101250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f101251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final lkj.a f101252t;
    public final q1 u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f101253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f101254x;

    public a(EsimMobilePlanMyNumbersScreenContract$InputData inputData, n stateMapper, s3 esimSubscriptionsInteractor, i1 esimPhoneNumberInteractor, d shotDialogBuilder, p esimPhoneNumberStateResolver, lkj.a myNumbersControllersProvider, q1 esimPhoneNumberPortingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(esimSubscriptionsInteractor, "esimSubscriptionsInteractor");
        Intrinsics.checkNotNullParameter(esimPhoneNumberInteractor, "esimPhoneNumberInteractor");
        Intrinsics.checkNotNullParameter(shotDialogBuilder, "shotDialogBuilder");
        Intrinsics.checkNotNullParameter(esimPhoneNumberStateResolver, "esimPhoneNumberStateResolver");
        Intrinsics.checkNotNullParameter(myNumbersControllersProvider, "myNumbersControllersProvider");
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingInteractor, "esimPhoneNumberPortingInteractor");
        this.o = inputData;
        this.f101248p = esimSubscriptionsInteractor;
        this.f101249q = esimPhoneNumberInteractor;
        this.f101250r = shotDialogBuilder;
        this.f101251s = esimPhoneNumberStateResolver;
        this.f101252t = myNumbersControllersProvider;
        this.u = esimPhoneNumberPortingInteractor;
        this.v = new b();
        this.f101253w = mra.d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f101237b), stateMapper, null, false, 12);
        this.f101254x = e.a(this, new c(this, 5));
    }

    public static void J2(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanMyNumbersScreenModel", null, illegalStateException, h0Var);
    }

    public final void I2(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
        EsimPhoneNumberSelections esimPhoneNumberSelections;
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions;
        y yVar = this.f101253w;
        Optional optional = (Optional) ((f) ((j2) yVar.f22677a).getValue()).f185070a.getContent();
        EsimPhoneNumberPorting esimPhoneNumberPorting = null;
        if (optional != null) {
            Intrinsics.checkNotNullParameter(optional, "<this>");
            esimPhoneNumberSelections = (EsimPhoneNumberSelections) optional.orElse(null);
        } else {
            esimPhoneNumberSelections = null;
        }
        if (esimPhoneNumberSelections != null && (esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b) != null) {
            esimPhoneNumberPorting = esimPhoneNumberSelectionOptions.f100404a;
        }
        EsimGiftRecipient esimGiftRecipient = ((f) ((j2) yVar.f22677a).getValue()).f185072c;
        if (esimPhoneNumberSelections == null || esimPhoneNumberPorting == null) {
            J2("Can't start transfer phone number flow, porting is null");
        } else {
            C2(new i(this.o.f101236a, esimSubscriptionPhoneNumber.f100472c, esimPhoneNumberPorting, esimGiftRecipient));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f101254x;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void K2(Object obj2, String listId) {
        EsimPhoneNumberSelections esimPhoneNumberSelections;
        EsimPhoneNumberSelectionOptions esimPhoneNumberSelectionOptions;
        List list;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        y yVar = this.f101253w;
        EsimMobilePlanMyNumbersScreenContract$InputData esimMobilePlanMyNumbersScreenContract$InputData = this.o;
        EsimPhoneNumberPorting esimPhoneNumberPorting = null;
        Object obj3 = null;
        esimSubscriptionPhoneNumber = null;
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = null;
        esimPhoneNumberPorting = null;
        switch (iHashCode) {
            case -1438837918:
                if (listId.equals("ID_ACTION_TRANSFER_NUMBER_TO_REVOLUT")) {
                    Optional optional = (Optional) ((f) ((j2) yVar.f22677a).getValue()).f185070a.getContent();
                    if (optional != null) {
                        Intrinsics.checkNotNullParameter(optional, "<this>");
                        esimPhoneNumberSelections = (EsimPhoneNumberSelections) optional.orElse(null);
                    } else {
                        esimPhoneNumberSelections = null;
                    }
                    if (esimPhoneNumberSelections != null && (esimPhoneNumberSelectionOptions = esimPhoneNumberSelections.f100408b) != null) {
                        esimPhoneNumberPorting = esimPhoneNumberSelectionOptions.f100404a;
                    }
                    EsimGiftRecipient esimGiftRecipient = ((f) ((j2) yVar.f22677a).getValue()).f185072c;
                    if (esimPhoneNumberSelections == null || esimPhoneNumberPorting == null) {
                        J2("Can't start transfer phone number flow, porting is null");
                    } else {
                        C2(new j(esimGiftRecipient, esimPhoneNumberPorting, esimPhoneNumberSelections, esimMobilePlanMyNumbersScreenContract$InputData.f101236a));
                    }
                    break;
                }
                break;
            case -1146888351:
                if (listId.equals("ID_ACTION_CONFIRM_TRANSFER_NUMBER_TO_REVOLUT")) {
                    t1 t1Var = (t1) ((f) ((j2) yVar.f22677a).getValue()).f185071b.getContent();
                    if (t1Var != null && (list = t1Var.K) != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                Object next = it8.next();
                                this.f101251s.getClass();
                                if (p.b((EsimSubscriptionPhoneNumber) next)) {
                                    obj3 = next;
                                }
                            }
                        }
                        esimSubscriptionPhoneNumber = (EsimSubscriptionPhoneNumber) obj3;
                    }
                    if (esimSubscriptionPhoneNumber == null) {
                        J2("Can't confirm transfer, no eligible phone number found");
                    } else {
                        I2(esimSubscriptionPhoneNumber);
                    }
                    break;
                }
                break;
            case 766917884:
                if (listId.equals("ID_ACTION_ADD_NEW_PHONE_NUMBER")) {
                    C2(new kkj.h(esimMobilePlanMyNumbersScreenContract$InputData.f101236a));
                    break;
                }
                break;
            case 2056353250:
                if (listId.equals("ID_ACTION_TRACK_PORT_IN_PROGRESS") && (obj2 instanceof EsimPhoneNumberPortingProgress)) {
                    h.v2(this.f101254x, new EsimMobilePlanMyNumbersScreenContract$ModalStep.PortInStatus(null, (EsimPhoneNumberPortingProgress) obj2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        q qVar = new q(1, this, null);
        b bVar = this.v;
        wkm.l lVarQ = vkm.q.Q(bVar, qVar);
        h0 h0Var = h0.f322473a;
        yji.l.b1(this, rd0.e.n(lVarQ, h0Var), null, new r(1, this, null), 3);
        yji.l.b1(this, nim.a.v(rd0.e.n(vkm.q.Q(bVar, new q(0, this, null)), h0Var), new x(28)), null, new r(0, this, null), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f101253w;
    }
}
