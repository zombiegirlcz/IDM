package jq4;

import akd.s;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.credit.card.impl.ui.cashback.details.CreditCardCashbackDetailsScreenContract$InputData;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import dp4.c1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.x2;
import org.jetbrains.annotations.NotNull;
import tof.fc;
import tof.i7;
import tof.n7;
import tof.o7;
import tof.q7;
import tof.u9;
import tof.va;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends oki.h implements i {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final TransactionContext f177458x = new TransactionContext(new Priority.HIGH("Cashback transactions section [CreditCardCashbackDetailsScreenModel]"), null, 2);
    public final CreditCardCashbackDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final al4.n f177459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final whf.b f177460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final an4.e f177461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lq4.g f177462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f177463t;
    public final mkd.d u;
    public final ssi.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f177464w;

    public n(CreditCardCashbackDetailsScreenContract$InputData inputData, al4.n creditCardInteractor, whf.b transactionItemsProvider, an4.e creditCardNavigationFactory, lq4.g dialogMapper, j60.a bottomDialogExtension, mkd.d slotManagerFeedControllerModelExtension, ssi.m transactionsWidgetActionExtension, p stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(transactionItemsProvider, "transactionItemsProvider");
        Intrinsics.checkNotNullParameter(creditCardNavigationFactory, "creditCardNavigationFactory");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f177459p = creditCardInteractor;
        this.f177460q = transactionItemsProvider;
        this.f177461r = creditCardNavigationFactory;
        this.f177462s = dialogMapper;
        this.f177463t = bottomDialogExtension;
        this.u = slotManagerFeedControllerModelExtension;
        this.v = transactionsWidgetActionExtension;
        this.f177464w = mra.d.b(this, new h(new Data(null, null, true, 3, null), f0.f322471a), stateMapper, null, false, 12);
    }

    public static q7 I2(Set set) {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new u9(false), new va(set), fc.c(new n7(), new o7())};
        cVar.getClass();
        return i7.c.a(i7VarArr);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardCashbackDetailsScreenContract$InputData creditCardCashbackDetailsScreenContract$InputData = this.o;
        String facilityId = creditCardCashbackDetailsScreenContract$InputData.f69165a;
        x2 x2Var = (x2) this.f177459p;
        x2Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c1 c1Var = x2Var.f226745a;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = c1Var.f116622s.b(facilityId, loadingStrategy);
        String str = creditCardCashbackDetailsScreenContract$InputData.f69165a;
        Flow flowE = boh.f.e(u0.i(dVarB, x2Var.f(str), x2Var.e(str)), new jlh.g(this, 10));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(flowE, h0Var), null, null, new m(this, null, 1), 3);
        mkd.a aVar = new mkd.a(new SlotContext(s.CREDIT_CARD_CASHBACK_DETAILS, y0.b(str)));
        gld.f0 f0Var = (gld.f0) this.u;
        f0Var.c3(aVar);
        yji.l.a1(this, rd0.e.e(mo3.a.g(f0Var.f144638l.h(), null, new jme.f(12), 1), h0Var, new i23.c(3, 7, null)), null, null, new m(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f177464w;
    }
}
