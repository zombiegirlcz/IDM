package com.revolut.feature.payment.counterparty.impl.screen.profile;

import b6k.e;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.payment.counterparty.impl.screen.profile.CounterPartyDetailsScreenContract$ModalStep;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.transfer.core.api.ui.reference.ReferenceInputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import fgj.g;
import fjd.g0;
import fo9.i;
import fo9.j;
import fo9.k;
import fo9.m;
import fo9.n;
import fo9.o;
import fo9.p;
import fo9.t;
import fo9.u;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import te0.w;
import tof.q6;
import tof.qa;
import vkm.j2;
import vkm.q;
import whf.b;
import yji.l;
import zof.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements i {
    public final CounterPartyDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f79052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f79053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final co9.b f79054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r10.a f79055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final un9.a f79056t;
    public final d2a.a u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f79057w;

    public a(CounterPartyDetailsScreenContract$InputData inputData, b transactionsContentProvider, f transferFeatureScreensProvider, co9.b paymentCounterpartyInteractor, r10.a recipientAnalyticsInteractor, un9.a paymentCounterpartyNavigationProvider, d2a.a wallpaperPickerControllerModelExtension, t stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(recipientAnalyticsInteractor, "recipientAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(paymentCounterpartyNavigationProvider, "paymentCounterpartyNavigationProvider");
        Intrinsics.checkNotNullParameter(wallpaperPickerControllerModelExtension, "wallpaperPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f79052p = transactionsContentProvider;
        this.f79053q = transferFeatureScreensProvider;
        this.f79054r = paymentCounterpartyInteractor;
        this.f79055s = recipientAnalyticsInteractor;
        this.f79056t = paymentCounterpartyNavigationProvider;
        this.u = wallpaperPickerControllerModelExtension;
        this.v = d.b(this, new fo9.h(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new e(null, null), "LIST_ID_TAB_DETAILS"), stateMapper, null, false, 12);
        this.f79057w = hx7.e.a(this, new g(this, 18));
    }

    @Override // yji.l
    public final void I1() {
        CounterPartyDetailsScreenContract$InputData counterPartyDetailsScreenContract$InputData = this.o;
        l.a1(this, q.H(new g0(this, (Continuation) null, 11), rd0.e.b(b.a(this.f79052p, w.h(new qa(counterPartyDetailsScreenContract$InputData.f79049a)), null, null, null, 14))), null, null, new u(this, null, 0), 3);
        l.a1(this, this.f79054r.d(counterPartyDetailsScreenContract$InputData.f79049a), null, null, new u(this, null, 1), 3);
    }

    public final void I2(p event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof m;
        y yVar = this.v;
        if (z) {
            H2(yVar, new f9g.l(((m) event).f136849a, 16));
            return;
        }
        if (event.equals(fo9.l.f136848a)) {
            C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) new TextLocalisedClause(R$string.apm_transactions_title, null, null, 14), (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(new qa(this.o.f79049a), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, rhf.g.OTHER, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65262)));
            return;
        }
        if (event instanceof o) {
            C1(new BridgeDestination(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(((o) event).f136851a), null, null, null, 126))));
            return;
        }
        if (event instanceof j) {
            String str = ((j) event).f136846a;
            int iHashCode = str.hashCode();
            com.revolut.kompot.navigable.vc.modal.a aVar = this.f79057w;
            if (iHashCode == -1668528987) {
                if (str.equals("ITEM_ID_CHANGE_BACKGROUND")) {
                    h.v2(aVar, CounterPartyDetailsScreenContract$ModalStep.ChangeBackgroundDialog.f79050a, ModalDestination.Style.POPUP.f98311a);
                    return;
                }
                return;
            } else if (iHashCode == 181796590) {
                if (str.equals("LIST_ID_DELETE")) {
                    h.v2(aVar, CounterPartyDetailsScreenContract$ModalStep.DeleteRecipient.f79051a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    return;
                }
                return;
            } else {
                if (iHashCode == 1802956017 && str.equals("LIST_ID_REPORT_ISSUE")) {
                    C1(new BridgeDestination(new FeatureCommand(SupportFeatureConfig.f89363a)));
                    return;
                }
                return;
            }
        }
        if (!(event instanceof n)) {
            if (!(event instanceof k)) {
                throw new NoWhenBranchMatchedException();
            }
            B2();
            return;
        }
        ActionsView.Item item = ((n) event).f136850a;
        String str2 = item.f58316a;
        if (!Intrinsics.f(str2, "ACTION_ID_EDIT")) {
            if (Intrinsics.f(str2, "ACTION_ID_PAY")) {
                Object obj2 = item.f58324n;
                PaymentCounterpartyInfo paymentCounterpartyInfo = obj2 instanceof PaymentCounterpartyInfo ? (PaymentCounterpartyInfo) obj2 : null;
                if (paymentCounterpartyInfo != null) {
                    C1(((eo9.b) this.f79056t).b(paymentCounterpartyInfo, m1l.a.SCHEDULE_ENABLED));
                    return;
                }
                return;
            }
            return;
        }
        PaymentCounterpartyInfo paymentCounterpartyInfo2 = (PaymentCounterpartyInfo) ((fo9.h) ((j2) yVar.f22677a).getValue()).f136843a.getContent();
        if (paymentCounterpartyInfo2 == null) {
            return;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.payment.counterparty.api.R$string.counterparty_label_edit_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.payment.counterparty.api.R$string.counterparty_label_textbox_title, null, null, 14);
        String str3 = paymentCounterpartyInfo2.d;
        if (str3 == null) {
            str3 = "";
        }
        l.g2(this, ((qpf.h) this.f79053q).b(new ReferenceInputData(25, textLocalisedClause, textLocalisedClause2, str3)), null, new fg8.y(paymentCounterpartyInfo2, this, 24), 1);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f79057w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
