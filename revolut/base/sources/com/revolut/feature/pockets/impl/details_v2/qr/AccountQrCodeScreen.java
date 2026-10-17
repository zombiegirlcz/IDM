package com.revolut.feature.pockets.impl.details_v2.qr;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pockets.impl.R$id;
import com.revolut.feature.pockets.impl.R$layout;
import com.revolut.feature.pockets.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import os2.a;
import pdg.d;
import pe2.c;
import pea.e;
import pea.f;
import pea.h;
import pea.l;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/qr/AccountQrCodeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lpea/h;", "Lcom/revolut/feature/pockets/impl/details_v2/qr/AccountQrCodeScreenContract$InputData;", "Laii/q;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountQrCodeScreen extends BaseRecyclerViewScreen<h, AccountQrCodeScreenContract$InputData, q> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f80879e0 = {o0.f186429a.j(new h0(AccountQrCodeScreen.class, "binding", "getBinding()Lcom/revolut/feature/pockets/impl/databinding/ScreenAccountQrBinding;", 0))};
    public final int U;
    public final int V;
    public final int W;
    public final boolean X;
    public final ao.h Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f80880a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f80881b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f80882d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountQrCodeScreen(AccountQrCodeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_account_qr;
        this.V = R$id.accountQr_recyclerView;
        this.W = R$style.UiKitTheme_Mono;
        this.X = true;
        this.Y = s.t(this, e.f);
        this.Z = w.y0(new c(this, inputData, 1));
        this.f80880a0 = w.y0(new a(this, 23));
        Lazy lazyY0 = w.y0(new d(17));
        this.f80881b0 = lazyY0;
        Lazy lazyY02 = w.y0(new d(18));
        this.c0 = lazyY02;
        this.f80882d0 = v.k(new QrCodePlainDelegate(), new QRCodeLoadingDelegate(), (TextDelegate) lazyY0.getValue(), (SmallActionButtonDelegate) lazyY02.getValue());
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getS() {
        return Integer.valueOf(this.W);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (oda.e) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.f80880a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.Y.getValue(this, f80879e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((qda.a) value).f244897b.f59211b), null, new p0l.d(this, null, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SmallActionButtonDelegate) this.c0.getValue()).f53336c.f121375b), null, new f(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Y.getValue(this, f80879e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BasicNavBar basicNavBar = ((qda.a) value).f244897b;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.revolut_accounts_account_details_qr_code_title, null, null, 14));
        basicNavBar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF80882d0() {
        return this.f80882d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
