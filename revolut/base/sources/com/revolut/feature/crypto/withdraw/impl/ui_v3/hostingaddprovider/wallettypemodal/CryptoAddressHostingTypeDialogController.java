package com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.wallettypemodal;

import aii.q;
import aim.e;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto.withdraw.impl.R$layout;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qq5.b;
import vc.s;
import yp0.y;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/hostingaddprovider/wallettypemodal/CryptoAddressHostingTypeDialogController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoAddressHostingTypeDialogController extends SimpleViewController<q> {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CryptoAddressHostingTypeDialogController.class, "binding", "getBinding()Lcom/revolut/feature/crypto/withdraw/impl/databinding/ScreenBottomSheetDialogBinding;", 0))};
    public final int N = R$layout.screen_bottom_sheet_dialog;
    public final h O = s.t(this, a.f);
    public final LargeActionButtonDelegate P;
    public final j Q;
    public final b R;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, uo5.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/crypto/withdraw/impl/databinding/ScreenBottomSheetDialogBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return uo5.a.a(p0);
        }
    }

    public CryptoAddressHostingTypeDialogController() {
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.P = largeActionButtonDelegate;
        this.Q = new j(7, v.k(plainTextDelegate, largeActionButtonDelegate), false);
        this.R = new b();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = S;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.O;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((uo5.a) value).f281567b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.crypto_withdrawals_screen_add_address_hosting_wallet_type_popup_title, null, null, 14), new TextLocalisedClause(R$string.crypto_withdrawals_screen_add_address_hosting_wallet_type_popup_desription, null, null, 14), null, null, false, 28));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ScreenContentRecyclerView bottomSheetDialogRecyclerView = ((uo5.a) value2).f281568c;
        Intrinsics.checkNotNullExpressionValue(bottomSheetDialogRecyclerView, "bottomSheetDialogRecyclerView");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m2());
        j jVar = this.Q;
        y.h(bottomSheetDialogRecyclerView, jVar, linearLayoutManager);
        e eVarB = u.b();
        this.R.getClass();
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CRYPTO_ADDRESS_HOSTING_TYPE_DIALOG_ACTION_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        eVarB.add(model);
        jVar.c(u.a(eVarB));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.P.d.f121375b), new qq5.a(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }
}
