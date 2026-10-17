package a83;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.cards_core.R$string;
import com.revolut.tracking.v3.PayLaterToggleContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.i1;
import zh9.j1;

/* JADX INFO: loaded from: classes21.dex */
public final class z0 implements cli.n {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi9.n f2102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.d f2103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jla.h f2104c;
    public final gte.a d;
    public final zjh.j e;
    public final ef7.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ef7.b f2105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2106h;

    public z0(vi9.n payLaterModeItemMapper, m93.d cardThumbnailImageProvider, jla.h productCatalogueInteractor, gte.a featureToggleInteractor, zjh.j legalEntityDisclaimerMapper, ef7.d incentiveRewardFreeCardMapper, ef7.b incentiveRewardCardOrderReimbursedMapper) {
        Intrinsics.checkNotNullParameter(payLaterModeItemMapper, "payLaterModeItemMapper");
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(incentiveRewardFreeCardMapper, "incentiveRewardFreeCardMapper");
        Intrinsics.checkNotNullParameter(incentiveRewardCardOrderReimbursedMapper, "incentiveRewardCardOrderReimbursedMapper");
        this.f2102a = payLaterModeItemMapper;
        this.f2103b = cardThumbnailImageProvider;
        this.f2104c = productCatalogueInteractor;
        this.d = featureToggleInteractor;
        this.e = legalEntityDisclaimerMapper;
        this.f = incentiveRewardFreeCardMapper;
        this.f2105g = incentiveRewardCardOrderReimbursedMapper;
        this.f2106h = te0.w.y0(new a2g.a(this, 6));
    }

    public static RowDelegate.Model a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_home_item_find_atms, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_map_point;
        int i2 = R$attr.uikit_colorWidgetBackground;
        companion.getClass();
        Color.Solid backgroundColor = new Color.Solid(i2);
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        List listC = zhm.u.c(new LayeredImage.Layer.InvertedDrawable(i, R$drawable.uikit_icn_circle_background, 8.0f, backgroundColor, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null));
        Float fValueOf = Float.valueOf(40.0f);
        return new RowDelegate.Model("ATM_MAP_LIST_ID", new RowDelegate.Model.MainImage.Image40(new LayeredImage(listC, fValueOf, fValueOf, 8), null, null, false, null, false, 62), textLocalisedClause, null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        AnalyticsContext analyticsContext;
        List list;
        o domainState = (o) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list2 = (List) iii.c.f(domainState.f2064a, new a82.l(9), new a5g.l(15), new a15.n(this, domainState, 7));
        Data data = domainState.f2066c;
        od0.i iVar = (od0.i) data.getContent();
        zh9.y0 y0Var = iVar != null ? (zh9.y0) iVar.f224257a : null;
        List listC = y0Var == null ? zhm.f0.f322471a : zhm.u.c(this.f2102a.b(y0Var));
        od0.i iVar2 = (od0.i) data.getContent();
        if (iVar2 != null) {
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            PayLaterToggleContext.a aVarNewBuilder = PayLaterToggleContext.newBuilder();
            boolean zD = iVar2.d();
            aVarNewBuilder.c();
            ((PayLaterToggleContext) aVarNewBuilder.f49761b).setPayLaterToggleVisible(zD);
            zh9.y0 y0Var2 = (zh9.y0) iVar2.f224257a;
            j1 j1VarA = y0Var2 != null ? y0Var2.a() : null;
            aVarNewBuilder.c();
            ((PayLaterToggleContext) aVarNewBuilder.f49761b).setPayLaterToggleEnabled(j1VarA instanceof i1);
            com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
        } else {
            analyticsContext = null;
        }
        return new y(list2, listC, analyticsContext, new TextLocalisedClause(y0.f2098a[domainState.f2067g.ordinal()] == 1 ? R$string.crypto_cards_main_title : domainState.i ? R$string.cards_main_wallets_title : R$string.cards_main_title, null, null, 14), (((Boolean) this.f2106h.getValue()).booleanValue() && (list = (List) domainState.f.getContent()) != null && (list.isEmpty() ^ true)) ? R$attr.uikit_dp32 : R$attr.uikit_dp0);
    }
}
