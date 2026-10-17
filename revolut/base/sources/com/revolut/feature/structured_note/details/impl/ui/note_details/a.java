package com.revolut.feature.structured_note.details.impl.ui.note_details;

import ael.d0;
import ael.k;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import b4b.z;
import b4g.f0;
import b5e.g;
import b5e.i;
import b5e.p;
import b5e.q;
import b5e.u;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.structured_note.details.impl.R$string;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowControllerContract$ModalStep;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowControllerContract$Page;
import com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewController;
import com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import md6.s;
import mra.d;
import nel.n;
import oki.h;
import vkm.j2;
import ybl.b;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements g {
    public final NoteDetailsFlowControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f88869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f88870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kdh.b f88871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gdh.a f88872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d4h.b f88873t;
    public final e u;
    public final d5e.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f88874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f88875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ali.b f88876y;

    public a(u stateMapper, NoteDetailsFlowControllerContract$InputData inputData, b instrumentTickerInteractor, d0 stocksInteractor, kdh.b instrumentActionsInteractor, gdh.a navigationExtension, d4h.b actionsToActionPanelStateMapper, e dateProvider, d5e.a dialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        Intrinsics.checkNotNullParameter(actionsToActionPanelStateMapper, "actionsToActionPanelStateMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f88869p = instrumentTickerInteractor;
        this.f88870q = stocksInteractor;
        this.f88871r = instrumentActionsInteractor;
        this.f88872s = navigationExtension;
        this.f88873t = actionsToActionPanelStateMapper;
        this.u = dateProvider;
        this.v = dialogProvider;
        NoteDetailsFlowControllerContract$Page noteDetailsFlowControllerContract$Page = NoteDetailsFlowControllerContract$Page.OVERVIEW;
        this.f88874w = d.b(this, new i(noteDetailsFlowControllerContract$Page.getF70838b(), zhm.u.c(noteDetailsFlowControllerContract$Page), null, null, null), stateMapper, null, false, 12);
        final int i = 0;
        this.f88875x = hx7.e.a(this, new Function2(this) { // from class: b5e.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.structured_note.details.impl.ui.note_details.a f12505b;

            {
                this.f12505b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                com.revolut.feature.structured_note.details.impl.ui.note_details.a aVar = this.f12505b;
                switch (i2) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        NoteDetailsFlowControllerContract$ModalStep step = (NoteDetailsFlowControllerContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof NoteDetailsFlowControllerContract$ModalStep.YearlySellWarning)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d5e.a aVar2 = aVar.v;
                        String instrumentName = ((NoteDetailsFlowControllerContract$ModalStep.YearlySellWarning) step).f88867a;
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
                        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.trading_structured_notes_pre_sell_title, zhm.u.c(instrumentName), null, 12), new TextLocalisedClause(R$string.trading_structured_notes_pre_sell_message, null, null, 14), null, null, false, 28);
                        m6 m6Var = n6.Companion;
                        aw0.g gVar = new aw0.g(m6.c(m6Var, new TextLocalisedClause(R$string.trading_structured_notes_pre_sell_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.trading_structured_notes_pre_sell_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                        k9 k9Var = k9.Trading;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                        z block = new z(aVar, 15);
                        Intrinsics.checkNotNullParameter(block, "block");
                        actionsBottomSheetController.H = block;
                        return actionsBottomSheetController;
                    default:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        NoteDetailsFlowControllerContract$Page page = (NoteDetailsFlowControllerContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (p.f12506a[page.ordinal()] == 1) {
                            return new NoteDetailsOverviewController(new NoteDetailsOverviewControllerContract$InputData(aVar.o.f88865a));
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
        final int i2 = 1;
        this.f88876y = s.b(this, new Function2(this) { // from class: b5e.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.structured_note.details.impl.ui.note_details.a f12505b;

            {
                this.f12505b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                com.revolut.feature.structured_note.details.impl.ui.note_details.a aVar = this.f12505b;
                switch (i22) {
                    case 0:
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        NoteDetailsFlowControllerContract$ModalStep step = (NoteDetailsFlowControllerContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (!(step instanceof NoteDetailsFlowControllerContract$ModalStep.YearlySellWarning)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d5e.a aVar2 = aVar.v;
                        String instrumentName = ((NoteDetailsFlowControllerContract$ModalStep.YearlySellWarning) step).f88867a;
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(instrumentName, "instrumentName");
                        lw0.a aVar3 = new lw0.a(new TextLocalisedClause(R$string.trading_structured_notes_pre_sell_title, zhm.u.c(instrumentName), null, 12), new TextLocalisedClause(R$string.trading_structured_notes_pre_sell_message, null, null, 14), null, null, false, 28);
                        m6 m6Var = n6.Companion;
                        aw0.g gVar = new aw0.g(m6.c(m6Var, new TextLocalisedClause(R$string.trading_structured_notes_pre_sell_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.trading_structured_notes_pre_sell_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                        k9 k9Var = k9.Trading;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                        z block = new z(aVar, 15);
                        Intrinsics.checkNotNullParameter(block, "block");
                        actionsBottomSheetController.H = block;
                        return actionsBottomSheetController;
                    default:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        NoteDetailsFlowControllerContract$Page page = (NoteDetailsFlowControllerContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(page, "page");
                        if (p.f12506a[page.ordinal()] == 1) {
                            return new NoteDetailsOverviewController(new NoteDetailsOverviewControllerContract$InputData(aVar.o.f88865a));
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f88876y;
    }

    public final void I2(b5e.a aVar, hdh.e eVar) {
        bfl.g gVar;
        w2 w2Var;
        if (aVar == null) {
            r6.b.D("If no actions are available button clicks shouldn't be handled");
            return;
        }
        int i = p.f12507b[aVar.ordinal()];
        if (i == 1) {
            gVar = bfl.g.SELL;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = bfl.g.BUY;
        }
        bfl.g gVar2 = bfl.g.SELL;
        gdh.a aVar2 = this.f88872s;
        if (gVar != gVar2) {
            aVar2.b3(gVar, eVar, false);
            return;
        }
        y yVar = this.f88874w;
        Data data = ((i) ((j2) yVar.f22677a).getValue()).f12495c;
        LocalDate localDate = null;
        n nVar = data != null ? (n) data.getContent() : null;
        Data data2 = ((i) ((j2) yVar.f22677a).getValue()).d;
        if (data2 != null && (w2Var = (w2) data2.getContent()) != null) {
            localDate = w2Var.e.f173610b;
        }
        if (localDate == null || nVar == null) {
            r6.b.D("Click shouldn't happen before details and instrument loaded");
        } else if (localDate.plusYears(1L).compareTo((ChronoLocalDate) ((f) this.u).e()) > 0) {
            h.v2(this.f88875x, new NoteDetailsFlowControllerContract$ModalStep.YearlySellWarning(nVar.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            aVar2.b3(gVar, eVar, false);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f88875x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        NoteDetailsFlowControllerContract$InputData noteDetailsFlowControllerContract$InputData = this.o;
        l.b1(this, rd0.e.b(((k) this.f88869p).f(noteDetailsFlowControllerContract$InputData.f88865a)), null, new q(this, null, 1), 3);
        String str = noteDetailsFlowControllerContract$InputData.f88865a;
        l.b1(this, nim.a.v(rd0.e.b(this.f88870q.a(str, true)), new f0(7)), null, new q(this, null, 2), 3);
        if (noteDetailsFlowControllerContract$InputData.f88866b) {
            l.b1(this, kdh.b.b0(this.f88871r, str, 6), null, new q(this, null, 0), 3);
        } else {
            H2(this.f88874w, new f0(6));
        }
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f88874w;
    }
}
