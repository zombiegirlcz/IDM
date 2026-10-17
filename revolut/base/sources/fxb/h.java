package fxb;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.w0;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.giftcards.api.R$string;
import com.revolut.tracking.v3.RevPointsGenericWidgetContext;
import grl.t9;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements wvb.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jwb.e f138788a;

    public h(jwb.e revPointsGiftcardsInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f138788a = revPointsGiftcardsInteractor;
    }

    public static AvatarModel.Card a() {
        return new AvatarModel.Card(new LayeredImage(v.k(new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_40_revolut_card_placeholder, (Integer) null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 126), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_plus, Integer.valueOf(R$attr.uikit_colorAccentNeutral), 18.0f, 18.0f, 8.0f, 8.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 64)), (Float) null, (Float) null, 14), (AvatarModel.Card.Overlay.Badges) null, com.revolut.core.ui_kit.models.avatar.d.SMALL, 6);
    }

    public static w0 b(t9 t9Var) {
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        RevPointsGenericWidgetContext.a aVarNewBuilder = RevPointsGenericWidgetContext.newBuilder();
        aVarNewBuilder.h(t9Var);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static ContactsWidgetDelegate.Model c(String str) {
        w0 w0VarB = b(t9.EMPTY);
        return new ContactsWidgetDelegate.Model(str, u.c(new ReferralContactDelegate.Model("GIFT_CARDS_MEDIUM_EMPTY_ITEM_ID", a(), new TextLocalisedClause(R$string.gift_cards_widget_empty, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccentNeutral), false, false, 254), 10), null, null, null, null, null, 8184)), new TextLocalisedClause(R$string.gift_cards_widget_title, null, null, 14), false, new AnalyticsContext(w0VarB), new zn.b(str, new ViewableRecordItem$Type.ViewableRecord(null), new AnalyticsContext(w0VarB)), 8);
    }
}
