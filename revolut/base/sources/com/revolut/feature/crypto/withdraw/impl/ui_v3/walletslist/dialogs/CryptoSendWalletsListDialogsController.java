package com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.dialogs;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ar5.b;
import ar5.c;
import ar5.e;
import ar5.f;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.crypto.withdraw.impl.R$layout;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import uo5.a;
import vc.s;
import yp0.y;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/dialogs/CryptoSendWalletsListDialogsController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lar5/e;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendWalletsListDialogsController extends SimpleViewController<e> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CryptoSendWalletsListDialogsController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/withdraw/impl/databinding/ScreenBottomSheetDialogBinding;", 0))};
    public final CryptoSendWalletsListDialogsControllerContract$InputData N;
    public final int O;
    public final h P;
    public final LargeActionButtonDelegate Q;
    public final j R;
    public final f S;

    public CryptoSendWalletsListDialogsController(CryptoSendWalletsListDialogsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_bottom_sheet_dialog;
        this.P = s.t(this, b.f);
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Q = largeActionButtonDelegate;
        this.R = new j(7, v.k(plainTextDelegate, largeActionButtonDelegate), false);
        this.S = new f();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = T;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.P;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((a) value).f281567b;
        CryptoSendWalletsListDialogsControllerContract$InputData cryptoSendWalletsListDialogsControllerContract$InputData = this.N;
        int i = ar5.a.f8519a[cryptoSendWalletsListDialogsControllerContract$InputData.f71349a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_compatible_header_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_incompatible_header_title, null, null, 14);
        }
        xi0.b currency = cryptoSendWalletsListDialogsControllerContract$InputData.f71350b;
        this.S.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        navBarBottomSheet.setHeaderModel(new lw0.a(textLocalisedClause, new TextLocalisedClause(R$string.crypto_withdrawals_screen_address_list_compatible_subtitle, u.c(new CurrencyClause(currency, null, null, 6)), null, 12), null, null, false, 28));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView bottomSheetDialogRecyclerView = ((a) value2).f281568c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetDialogRecyclerView, "bottomSheetDialogRecyclerView");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m2());
        j jVar = this.R;
        y.h(bottomSheetDialogRecyclerView, jVar, linearLayoutManager);
        aim.e eVarB = u.b();
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CRYPTO_SEND_WALLETS_DIALOG_ACTION_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R.string.common_action_learn_more, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        eVarB.add(model);
        jVar.c(u.a(eVarB));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.Q.d.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }
}
