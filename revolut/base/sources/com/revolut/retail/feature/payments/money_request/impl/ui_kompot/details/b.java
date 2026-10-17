package com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details;

import bof.r;
import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.d2;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.gifview.api.declaration.GifViewDestination;
import com.revolut.feature.image_gallery.ImageGalleryController;
import com.revolut.feature.payments.money_request.api.model.MoneyRequestAction;
import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import com.revolut.feature.support.api.navigation.LegacyHelpCentreFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsContract$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsContract$ModalStep;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import m1a.q;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r70.c;
import rd7.i;
import rd7.j;
import vkm.j2;
import vkm.t0;
import yji.l;
import z6k.f0;
import z6k.g;
import z6k.h0;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements g {

    @NotNull
    public static final f0 Companion = new f0();
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g6k.a f102155p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f102156q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f102157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MoneyRequestDetailsContract$InputData f102158s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f102159t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(a interactor, g6k.a actionDelegate, c70.a clipboard, c hapticEngine, MoneyRequestDetailsContract$InputData inputData, r stateMapper, q splitBillItemizationItemsMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(actionDelegate, "actionDelegate");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(splitBillItemizationItemsMapper, "splitBillItemizationItemsMapper");
        this.o = interactor;
        this.f102155p = actionDelegate;
        this.f102156q = clipboard;
        this.f102157r = hapticEngine;
        this.f102158s = inputData;
        this.f102159t = splitBillItemizationItemsMapper;
        this.u = d.b(this, new z6k.a(new Data(null, null, true, 3, null), inputData.getF102150c()), stateMapper, null, false, 12);
        this.v = e.a(this, new yz4.b(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarJust;
        a aVar = this.o;
        efm.r rVarK = aVar.f102154c.k(false);
        MoneyRequestDetailsContract$InputData moneyRequestDetailsContract$InputData = aVar.f102152a;
        Continuation continuation = null;
        if (moneyRequestDetailsContract$InputData instanceof MoneyRequestDetailsContract$InputData.ById) {
            rVarJust = ((u6k.h) aVar.f102153b).c(((MoneyRequestDetailsContract$InputData.ById) moneyRequestDetailsContract$InputData).f102145a);
        } else {
            if (!(moneyRequestDetailsContract$InputData instanceof MoneyRequestDetailsContract$InputData.ByMoneyRequest)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarJust = efm.r.just(zi0.c.P(((MoneyRequestDetailsContract$InputData.ByMoneyRequest) moneyRequestDetailsContract$InputData).f102148a, false, null, 3));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        }
        l.a1(this, rd0.e.b(pd.b.r(kli.a.h(rVarK, rVarJust), new z2.a(aVar, 14))), null, null, new h0(this, continuation, 0), 3);
        l.a1(this, new t0(((g6k.r) this.f102155p).f141014w, 1), null, null, new h0(this, continuation, 1), 3);
    }

    public final void I2(w0a.c cVar) {
        boolean z = cVar instanceof w0a.a;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (!z) {
            if (!(cVar instanceof w0a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            l.j2(this, e1(new x0a.b(((w0a.b) cVar).f293673a)), popup, null, 2);
        } else {
            i iVar = j.Companion;
            String str = ((w0a.a) cVar).f293671a;
            iVar.getClass();
            l.j2(this, new ImageGalleryController(i.a(str), null, null, 6), popup, null, 2);
        }
    }

    public final void J2(ActionsView.Item actionItem) {
        Intrinsics.checkNotNullParameter(actionItem, "actionItem");
        Object obj2 = actionItem.f58324n;
        MoneyRequestAction moneyRequestAction = obj2 instanceof MoneyRequestAction ? (MoneyRequestAction) obj2 : null;
        if (moneyRequestAction != null) {
            ((g6k.r) this.f102155p).c3(moneyRequestAction, P2());
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(actionItem.f58324n, "Unsupported action: "));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    public final void K2(d2 actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        cw0.a aVar = actionData.f54010b;
        if (aVar instanceof cw0.c) {
            cw0.i iVar = ((cw0.c) aVar).f109513a;
            Object obj2 = iVar.e;
            w0a.c cVar = obj2 instanceof w0a.c ? (w0a.c) obj2 : null;
            if (cVar != null) {
                I2(cVar);
                return;
            } else {
                e.h(new IllegalStateException(a0.d.m(iVar.e, "Unsupported attachment parcel: ")));
                return;
            }
        }
        if (!(aVar instanceof cw0.d)) {
            e.h(new IllegalStateException(j6.a.q("Unsupported attachment action: ", o0.f186429a.b(aVar.getClass()).m())));
            return;
        }
        Object obj3 = ((cw0.d) aVar).f109514a.e;
        w0a.a aVar2 = obj3 instanceof w0a.a ? (w0a.a) obj3 : null;
        ItemizationReceiptDeletionData itemizationReceiptDeletionData = aVar2 != null ? aVar2.f293672b : null;
        ItemizationReceiptDeletionData.SplitBill splitBill = itemizationReceiptDeletionData instanceof ItemizationReceiptDeletionData.SplitBill ? (ItemizationReceiptDeletionData.SplitBill) itemizationReceiptDeletionData : null;
        if (splitBill == null) {
            e.h(new IllegalStateException(a0.d.m(obj3, "Unsupported remove attachment parcel: ")));
        } else {
            h.v2(this.v, new MoneyRequestDetailsContract$ModalStep.DeleteReceipt(splitBill), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    public final void L2(CellDetailsDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "ID_INVOICE_URL_ITEM")) {
            Object obj2 = model.o;
            String str = obj2 instanceof String ? (String) obj2 : null;
            if (str != null) {
                C1(new ExternalDestination.Browser(str, null));
            }
        }
    }

    public final void M2(Object obj2) {
        if (Intrinsics.f(obj2, "ID_HELP")) {
            C1(u0.b(new FeatureCommand(LegacyHelpCentreFeatureConfig.HelpCentre.f89360a)));
            return;
        }
        if (obj2 instanceof w0a.c) {
            I2((w0a.c) obj2);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "Unsupported chevron parcel: "));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void N2() {
        String str = P2().f;
        if (str != null) {
            C1(new GifViewDestination(new GifViewDestination.InputData(str)));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("CellDetailsPhotoDelegate without GIF");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final void O2(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        v61.c cVar = obj2 instanceof v61.c ? (v61.c) obj2 : null;
        String str = cVar != null ? cVar.f286270c : null;
        if (str != null) {
            C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(str), null, null, null, 126))));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("RowDelegate without transactionId for listId=", model.f53228a));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public final MoneyRequest P2() {
        z6k.b bVar = (z6k.b) ((z6k.a) ((j2) this.u.f22677a).getValue()).f319778a.getContent();
        MoneyRequest moneyRequest = bVar != null ? bVar.f319781a : null;
        if (moneyRequest != null) {
            return moneyRequest;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
