package com.revolut.feature.raffle.impl.screen.share_raffle;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.raffle.impl.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.ArrayList;
import jh.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mta.a;
import mta.b;
import mta.g;
import mx0.l;
import mx0.t;
import ty0.c;
import vc.s;
import xki.e;
import yy0.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/raffle/impl/screen/share_raffle/ShareRaffleScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lmta/g;", "feature_raffle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShareRaffleScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(ShareRaffleScreen.class, "binding", "getBinding()Lcom/revolut/feature/raffle/impl/databinding/ScreenShareRaffleBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public ShareRaffleScreen(ShareRaffleScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_share_raffle;
        this.L = te0.w.y0(new a(this, 0));
        this.M = s.t(this, b.f);
        this.N = te0.w.y0(new mhd.b(this, inputData, 15));
        this.O = te0.w.y0(new a(this, 1));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        eta.b bVarD3 = d3();
        Context context = d3().f.getContext();
        Intrinsics.h(context);
        f fVarQ = d.f(context).Q();
        c cVarB0 = d.f(context).b0();
        ActionsView raffleShareActionsView = bVarD3.f129400c;
        Intrinsics.checkNotNullExpressionValue(raffleShareActionsView, "raffleShareActionsView");
        ArrayList arrayList = uiState.f208779a;
        ActionsView.Companion companion = ActionsView.INSTANCE;
        raffleShareActionsView.k(arrayList, t.f210002a);
        UrlImage urlImage = uiState.f208781c;
        AppCompatImageView raffleShareAsset = bVarD3.d;
        Intrinsics.checkNotNullExpressionValue(raffleShareAsset, "raffleShareAsset");
        f.e(fVarQ, urlImage, raffleShareAsset, null, null, 12);
        ResourceImage resourceImage = uiState.f208780b;
        AppCompatImageView raffleShareAssetBackground = bVarD3.e;
        Intrinsics.checkNotNullExpressionValue(raffleShareAssetBackground, "raffleShareAssetBackground");
        f.e(fVarQ, resourceImage, raffleShareAssetBackground, null, null, 12);
        ResourceImage resourceImage2 = uiState.f;
        AppCompatImageView raffleShareRevolutLogo = bVarD3.i;
        Intrinsics.checkNotNullExpressionValue(raffleShareRevolutLogo, "raffleShareRevolutLogo");
        f.e(fVarQ, resourceImage2, raffleShareRevolutLogo, null, null, 12);
        Image image = uiState.e;
        AppCompatImageView raffleShareQrCode = bVarD3.f129402h;
        Intrinsics.checkNotNullExpressionValue(raffleShareQrCode, "raffleShareQrCode");
        f.e(fVarQ, image, raffleShareQrCode, null, null, 12);
        d3().f.setBackground(uiState.d);
        TextClause textClause = uiState.f208782g;
        AppCompatTextView raffleShareTitle = bVarD3.f129403j;
        Intrinsics.checkNotNullExpressionValue(raffleShareTitle, "raffleShareTitle");
        c.b(cVarB0, textClause, raffleShareTitle, null, null, 12);
        TextClause textClause2 = uiState.f208783h;
        AppCompatTextView raffleShareDescription = bVarD3.f129401g;
        Intrinsics.checkNotNullExpressionValue(raffleShareDescription, "raffleShareDescription");
        c.b(cVarB0, textClause2, raffleShareDescription, null, null, 12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fta.f) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mta.f) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f129399b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f129400c.setLayoutType(l.DYNAMIC_CIRCLE_ACTIONS);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f129399b.f59410q), new mta.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f129400c.f58296a.f121375b), new mta.d(this, null), 3);
    }

    public final eta.b d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (eta.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.L.getValue();
    }
}
