package com.revolut.feature.credit.card.impl.ui.statement_financing.details;

import al4.m;
import al4.n;
import ang.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelParcel;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ew4.j;
import ew4.v;
import ew4.w;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import lt4.d;
import oki.h;
import om4.r1;
import om4.x2;
import ql4.d0;
import vkm.j2;
import vt4.b;
import w4l.i;
import yji.l;
import yr4.g;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends h implements j {
    public final CreditCardStatementFinancingDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f69754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pak.h f69755q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f69756r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f69757s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g f69758t;
    public final f u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f69759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f69760x;

    public a(CreditCardStatementFinancingDetailsScreenContract$InputData inputData, m creditCardInstalmentInteractor, pak.h documentViewerDestinationMapper, d creditCardDialogModelMapper, n creditCardInteractor, g instalmentDetailsDialogMapper, f userInteractor, b creditCardDialogMapper, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInstalmentInteractor, "creditCardInstalmentInteractor");
        Intrinsics.checkNotNullParameter(documentViewerDestinationMapper, "documentViewerDestinationMapper");
        Intrinsics.checkNotNullParameter(creditCardDialogModelMapper, "creditCardDialogModelMapper");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(instalmentDetailsDialogMapper, "instalmentDetailsDialogMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(creditCardDialogMapper, "creditCardDialogMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f69754p = creditCardInstalmentInteractor;
        this.f69755q = documentViewerDestinationMapper;
        this.f69756r = creditCardDialogModelMapper;
        this.f69757s = creditCardInteractor;
        this.f69758t = instalmentDetailsDialogMapper;
        this.u = userInteractor;
        this.v = creditCardDialogMapper;
        this.f69759w = mra.d.b(this, new ew4.h(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f69760x = e.a(this, new eul.f(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData = this.o;
        vkm.d dVarU = ((r1) this.f69754p).u(creditCardStatementFinancingDetailsScreenContract$InputData.f69746a, creditCardStatementFinancingDetailsScreenContract$InputData.f69747b, i.f294643c);
        String str = creditCardStatementFinancingDetailsScreenContract$InputData.f69746a;
        x2 x2Var = (x2) this.f69757s;
        w4l.j jVar = w4l.j.f294644c;
        l.a1(this, rd0.e.n(nim.a.v(u0.i(dVarU, x2Var.p(str, jVar), nim.a.v(this.u.j(jVar), w.f)), new eul.d(this, 24)), h0.f322473a), null, null, new ew1.d(this, null, 3), 3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void I2(yx4.b event) {
        d0 d0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event.f317544a;
        int iHashCode = str.hashCode();
        y yVar = this.f69759w;
        Object[] objArr = 0;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f69760x;
        switch (iHashCode) {
            case -1511590124:
                if (str.equals("id_credit_card_instalment_details_info_remaining_plan_amount")) {
                    h.v2(aVar, CreditCardStatementFinancingDetailsScreenContract$ModalStep.RemainingPlan.f69752a, bottom_dialog);
                    return;
                }
                break;
            case -1364312432:
                if (str.equals("id_credit_card_statement_financing_details_interest_apr")) {
                    h.v2(aVar, CreditCardStatementFinancingDetailsScreenContract$ModalStep.TotalEffectiveCost.f69753a, bottom_dialog);
                    return;
                }
                break;
            case -481404684:
                if (str.equals("id_credit_card_instalment_details_plan_got_it_button_remaining")) {
                    ew4.g gVar = (ew4.g) ((ew4.h) ((j2) yVar.f22677a).getValue()).f130076a.getContent();
                    CreditCardStatementFinancingDetailsScreenContract$CancellationModel creditCardStatementFinancingDetailsScreenContract$CancellationModel = gVar != null ? gVar.f130075b : null;
                    if (creditCardStatementFinancingDetailsScreenContract$CancellationModel == null) {
                        return;
                    }
                    h.v2(aVar, new CreditCardStatementFinancingDetailsScreenContract$ModalStep.Cancel(creditCardStatementFinancingDetailsScreenContract$CancellationModel), bottom_dialog);
                    return;
                }
                break;
            case 656479763:
                if (str.equals("id_credit_card_statement_financing_details_interest_rate")) {
                    h.v2(aVar, CreditCardStatementFinancingDetailsScreenContract$ModalStep.FinancingInterestRate.f69751a, bottom_dialog);
                    return;
                }
                break;
            case 1741473649:
                if (str.equals("id_credit_card_statement_financing_action_repay")) {
                    ew4.g gVar2 = (ew4.g) ((ew4.h) ((j2) yVar.f22677a).getValue()).f130076a.getContent();
                    if (gVar2 == null || (d0Var = gVar2.f130074a) == null) {
                        return;
                    }
                    C2(new ew4.i(d0Var.f247110p));
                    return;
                }
                break;
            case 1918729248:
                if (str.equals("ERROR_STATE_ID")) {
                    n2(new v(this, objArr == true ? 1 : 0, 1), new whi.b(6));
                    return;
                }
                break;
        }
        Object obj2 = event.f317545b;
        if (obj2 instanceof gs4.j) {
            CreditCardStatementFinancingDetailsScreenContract$InputData creditCardStatementFinancingDetailsScreenContract$InputData = this.o;
            C1(this.f69755q.c(creditCardStatementFinancingDetailsScreenContract$InputData.f69746a, creditCardStatementFinancingDetailsScreenContract$InputData.f69747b, (gs4.j) obj2));
        } else if (obj2 instanceof CreditCardModelParcel.DialogParcel) {
            h.v2(aVar, new CreditCardStatementFinancingDetailsScreenContract$ModalStep.Dialog(((CreditCardModelParcel.DialogParcel) obj2).f68855a), bottom_dialog);
        } else if (obj2 instanceof CreditCardStatementFinancingDetailsScreenContract$CancellationModel) {
            h.v2(aVar, new CreditCardStatementFinancingDetailsScreenContract$ModalStep.Cancel((CreditCardStatementFinancingDetailsScreenContract$CancellationModel) obj2), bottom_dialog);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f69760x;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f69759w;
    }
}
