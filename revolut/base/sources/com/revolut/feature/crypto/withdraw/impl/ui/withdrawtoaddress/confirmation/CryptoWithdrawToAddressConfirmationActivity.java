package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.feature.crypto.withdraw.impl.R$id;
import com.revolut.feature.crypto.withdraw.impl.R$layout;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import efm.r;
import ihm.f;
import j90.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import opi.b;
import pri.e;
import qp5.g;
import qp5.i;
import te0.w;
import vp5.c;
import vp5.d;
import yp0.y;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/confirmation/CryptoWithdrawToAddressConfirmationActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Lqp5/g;", "Lqp5/i;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoWithdrawToAddressConfirmationActivity extends BaseDelegatesActivity implements i {
    public static final /* synthetic */ KProperty[] I0;
    public final ActionWidgetLoadingDelegate B0;
    public final ActionWidgetDelegate C0;
    public final ScrollerDelegate D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    public final Object H0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public c f71164s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public b f71165t0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f71163r0 = "CRYPTO_WITHDRAW_TO_ADDRESS_FLOW";
    public final a u0 = u1.w(this, R$id.cryptoWithdrawToAddressConfirmation_actionFooterView);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final a f71166v0 = u1.w(this, R$id.cryptoWithdrawToAddressConfirmation_recyclerView);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Object f71167w0 = w.y0(new qni.a(4));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f71168x0 = w.y0(new qni.a(5));
    public final FooterTextDelegate y0 = new FooterTextDelegate();
    public final Object z0 = w.y0(new qni.a(6));
    public final Object A0 = w.y0(new qni.a(7));

    static {
        h0 h0Var = new h0(CryptoWithdrawToAddressConfirmationActivity.class, "actionFooterView", "getActionFooterView()Lcom/revolut/core/ui_kit/views/buttons/ActionFooterView;", 0);
        p0 p0Var = o0.f186429a;
        I0 = new KProperty[]{p0Var.j(h0Var), p.a.y(CryptoWithdrawToAddressConfirmationActivity.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, p0Var)};
    }

    public CryptoWithdrawToAddressConfirmationActivity() {
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        ActionWidgetLoadingDelegate actionWidgetLoadingDelegate = new ActionWidgetLoadingDelegate();
        this.B0 = actionWidgetLoadingDelegate;
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.C0 = actionWidgetDelegate;
        this.D0 = new ScrollerDelegate(v.k(heroBannerDelegate, actionWidgetLoadingDelegate, actionWidgetDelegate), false);
        this.E0 = w.y0(new qp5.a(this, 0));
        this.F0 = w.y0(new qni.a(8));
        this.G0 = w.y0(new qni.a(9));
        this.H0 = w.y0(new qp5.a(this, 1));
    }

    @Override // nri.b
    public final e F0() {
        c cVar = this.f71164s0;
        if (cVar != null) {
            return (g) cVar.J.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // mkd.g
    public final r F1() {
        return this.D0.i;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final String getF82699s0() {
        return this.f71163r0;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        c cVar = this.f71164s0;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.j0
    public final r T() {
        return ((RowDelegate) this.z0.getValue()).f53218h;
    }

    @Override // mga.j0
    public final View g0() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        return decorView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mga.j0
    public final f o0() {
        return ((HighlightTileDelegate) this.A0.getValue()).f52437c;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CryptoWithdrawToAddressConfirmationContract$Configuration cryptoWithdrawToAddressConfirmationContract$Configuration = (CryptoWithdrawToAddressConfirmationContract$Configuration) I0();
        if (cryptoWithdrawToAddressConfirmationContract$Configuration == null) {
            cryptoWithdrawToAddressConfirmationContract$Configuration = new CryptoWithdrawToAddressConfirmationContract$Configuration(false);
        }
        c cVar = new c(((d) com.bumptech.glide.c.l(this).b(null, this.f71163r0)).E, rd0.e.g(this, bundle, null), new xpi.f(R$id.cryptoWithdrawToAddressConfirmation_navBar, false), this, cryptoWithdrawToAddressConfirmationContract$Configuration);
        this.f71164s0 = cVar;
        this.f71165t0 = (b) cVar.f291068n.get();
        super.onCreate(bundle);
        setContentView(R$layout.activity_crypto_withdraw_to_address_confirmation);
        RecyclerView recyclerView = (RecyclerView) this.f71166v0.getValue(this, I0[1]);
        y.h(recyclerView, (j) this.E0.getValue(), new LinearLayoutManager(recyclerView.getContext()));
        b bVar = this.f71165t0;
        if (bVar != null) {
            bVar.W(new qp5.a(this, 2));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    @Override // nri.b, in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.E0.getValue()).c(items);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((j) this.E0.getValue()).f;
    }
}
