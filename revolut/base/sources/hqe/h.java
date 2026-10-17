package hqe;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.pockets.api.navigation.PocketDetailsDestination;
import com.revolut.feature.pockets.api.navigation.PocketDetailsFlowContract$InputData;
import com.revolut.feature.pockets.api.navigation.PocketDetailsInitialAction;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends pfe.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oqk.k f154674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ua7.f f154675n;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.b f154676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xea.c f154677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AccountCellItemDelegate f154678r;

    public h(oqk.k transactionsWidgetActionExtension, ua7.f hiddenAccountsActionsExtension, j60.a bottomDialogExtension, wsg.b newWalletInteractor, xea.c pocketItemMapper) {
        AccountCellItemDelegate accountCellItemDelegate = new AccountCellItemDelegate();
        Intrinsics.checkNotNullParameter(transactionsWidgetActionExtension, "transactionsWidgetActionExtension");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsExtension, "hiddenAccountsActionsExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(newWalletInteractor, "newWalletInteractor");
        Intrinsics.checkNotNullParameter(pocketItemMapper, "pocketItemMapper");
        Intrinsics.checkNotNullParameter(accountCellItemDelegate, "accountCellItemDelegate");
        this.f154674m = transactionsWidgetActionExtension;
        this.f154675n = hiddenAccountsActionsExtension;
        this.o = bottomDialogExtension;
        this.f154676p = newWalletInteractor;
        this.f154677q = pocketItemMapper;
        this.f154678r = accountCellItemDelegate;
    }

    @Override // yji.n
    public final void D2() {
        AccountCellItemDelegate accountCellItemDelegate = this.f154678r;
        this.o.d(u.c(accountCellItemDelegate));
        yji.n.j2(this, rd0.e.b(accountCellItemDelegate.f51551c.f53218h), null, new g(this, null), 3);
    }

    @Override // pfe.a
    public final Set Z2() {
        yji.n[] elements = {this.f154674m, this.f154675n};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:102:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d  */
    @Override // pfe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(sfe.s r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hqe.h.b3(sfe.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c3(io3.d dVar) {
        A2(new PocketDetailsDestination(new PocketDetailsFlowContract$InputData(dVar, (AccountId) AccountId.Personal.f51414a, false, false, (wi0.b) null, false, false, (CheckoutParams) null, (CheckoutOrder) null, (PocketDetailsInitialAction) null, false, 4080)));
    }

    public final void d3(io3.d dVar) {
        A2(new MoveMoneyDestination(new MoveMoneyInputData(new Action.Add(new StartUpPocket.FiatCurrencyTeenAccount(dVar.f163145a), null), (Set) null, 6), null));
    }
}
