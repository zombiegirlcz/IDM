package com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase;

import al4.n;
import ang.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.concurrent.CancellationException;
import jid.z;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lt4.d;
import oki.h;
import om4.r1;
import om4.x2;
import qv0.p;
import vkm.j2;
import vkm.q0;
import vt4.b;
import w4l.j;
import yhm.m;
import yhm.o;
import yji.l;
import yr4.g;
import zh9.u0;
import zhm.h0;
import zi0.c;
import zr4.a0;
import zr4.b0;
import zr4.i;
import zr4.k;
import zr4.m;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements m {
    public final InstalmentDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.m f69375p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f69376q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f69377r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f69378s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f69379t;
    public final f15.a u;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f69380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final pak.h f69381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f69382y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(InstalmentDetailsScreenContract$InputData inputData, al4.m creditCardInstalmentInteractor, n creditCardInteractor, z creditCardInstalmentTransactionsInteractor, g instalmentDetailsDialogMapper, b creditCardDialogMapper, f15.a getCreditHelpExtension, f userInteractor, d creditCardDialogModelMapper, pak.h documentViewerDestinationMapper, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardInstalmentTransactionsInteractor, "creditCardInstalmentTransactionsInteractor");
        Intrinsics.checkNotNullParameter(instalmentDetailsDialogMapper, "instalmentDetailsDialogMapper");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogModelMapper, "creditCardDialogModelMapper");
        Intrinsics.checkNotNullParameter(documentViewerDestinationMapper, "documentViewerDestinationMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69375p = creditCardInstalmentInteractor;
        this.f69376q = creditCardInteractor;
        this.f69377r = creditCardInstalmentTransactionsInteractor;
        this.f69378s = instalmentDetailsDialogMapper;
        this.f69379t = creditCardDialogMapper;
        this.u = getCreditHelpExtension;
        this.v = userInteractor;
        this.f69380w = creditCardDialogModelMapper;
        this.f69381x = documentViewerDestinationMapper;
        this.f69382y = mra.d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.z = e.a(this, new zo2.h(this, 8));
    }

    @Override // yji.l
    public final void I1() {
        InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData = this.o;
        String str = instalmentDetailsScreenContract$InputData.f69368a;
        String str2 = instalmentDetailsScreenContract$InputData.f69369b;
        r1 r1Var = (r1) this.f69375p;
        w4l.i iVar = w4l.i.f294643c;
        vkm.d dVarK = r1Var.k(str, str2, iVar);
        h0 h0Var = h0.f322473a;
        q0 q0VarN = rd0.e.n(dVarK, h0Var);
        String str3 = instalmentDetailsScreenContract$InputData.f69368a;
        Flow flowM = r1Var.m(str3, iVar);
        x2 x2Var = (x2) this.f69376q;
        j jVar = j.f294644c;
        vkm.d dVarP = x2Var.p(str3, jVar);
        t38.e eVarM = u0.m(u0.i(q0VarN, flowM, dVarP), nim.a.v(this.v.j(jVar), a0.f));
        Continuation continuation = null;
        l.a1(this, rd0.e.n(xam.a.h(new b0(this, continuation, 0), nim.a.u(new xsd.a(2, 16, continuation), eVarM)), h0Var), null, null, new b0(this, continuation, 1), 3);
    }

    public final zr4.g I2() {
        return (zr4.g) c.I(((i) ((j2) this.f69382y.f22677a).getValue()).f324568a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void J2(yx4.b item) throws Throwable {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f317544a;
        int iHashCode = str.hashCode();
        InstalmentDetailsScreenContract$InputData instalmentDetailsScreenContract$InputData = this.o;
        f15.a aVar = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = this.z;
        switch (iHashCode) {
            case -1730889751:
                if (str.equals("id_instalment_details_action_update")) {
                    C2(zr4.j.f324569a);
                    return;
                }
                break;
            case -1511590124:
                if (str.equals("id_credit_card_instalment_details_info_remaining_plan_amount")) {
                    h.v2(aVar2, InstalmentDetailsScreenContract$ModalStep.RemainingPlan.f69374a, bottom_dialog);
                    return;
                }
                break;
            case -481404684:
                if (str.equals("id_credit_card_instalment_details_plan_got_it_button_remaining")) {
                    K2();
                    return;
                }
                break;
            case 495267445:
                if (str.equals("id_instalment_details_action_repay")) {
                    zr4.h hVar = I2().f;
                    if (hVar != null) {
                        h.v2(aVar2, new InstalmentDetailsScreenContract$ModalStep.OverdueBalanceDialog(hVar.f324566a), bottom_dialog);
                        return;
                    } else {
                        C2(new k(I2().f324562b.E));
                        return;
                    }
                }
                break;
            case 509859635:
                if (str.equals("id_instalment_details_get_help")) {
                    ux4.i iVar = ux4.m.Companion;
                    String str2 = instalmentDetailsScreenContract$InputData.f69368a;
                    ux4.l lVar = ux4.l.FAQ_AND_FINANCIAL_DIFFICULTIES;
                    iVar.getClass();
                    aVar.O(ux4.i.a(str2, lVar));
                    return;
                }
                break;
            case 1918729248:
                if (str.equals("ERROR_STATE_ID")) {
                    n2(new zr4.z(this, null, 1), new whi.b(6));
                    return;
                }
                break;
            case 2035199386:
                if (str.equals("id_instalment_details_action_cancel")) {
                    K2();
                    return;
                }
                break;
        }
        Object obj2 = item.f317545b;
        if (obj2 instanceof gs4.j) {
            C1(this.f69381x.c(instalmentDetailsScreenContract$InputData.f69368a, instalmentDetailsScreenContract$InputData.f69369b, (gs4.j) obj2));
        } else {
            if (obj2 instanceof CreditCardModelParcel.DialogParcel) {
                h.v2(aVar2, new InstalmentDetailsScreenContract$ModalStep.Dialog(((CreditCardModelParcel.DialogParcel) obj2).f68855a), bottom_dialog);
                return;
            }
            Object obj3 = item.f317546c;
            if (obj3 instanceof p) {
                aVar.O1((p) obj3);
            }
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final void K2() throws Throwable {
        Object objA;
        InstalmentDetailsScreenContract$DomainState$CancellationModel instalmentDetailsScreenContract$DomainState$CancellationModel;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            instalmentDetailsScreenContract$DomainState$CancellationModel = I2().e;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = o.a(th10);
        }
        if (instalmentDetailsScreenContract$DomainState$CancellationModel == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        h.v2(this.z, new InstalmentDetailsScreenContract$ModalStep.Cancel(instalmentDetailsScreenContract$DomainState$CancellationModel), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        objA = Unit.f186387a;
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            e.n(thA);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f69382y;
    }
}
