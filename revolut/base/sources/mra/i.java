package mra;

import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.me;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.d3;
import com.revolut.core.ui_kit.delegates.widgets.e3;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.push_to_card.api.data.Card;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.retail.feature.payments.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements aqa.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aqa.a f208094a;

    public i(aqa.a cardOwnerAvatarMapper) {
        Intrinsics.checkNotNullParameter(cardOwnerAvatarMapper, "cardOwnerAvatarMapper");
        this.f208094a = cardOwnerAvatarMapper;
    }

    public static TextClause a(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        return new TextClause(nqa.a.b(cardOwner.f81493g), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static Custom b(CardOwner cardOwner) {
        if (cardOwner.f81493g.a()) {
            return new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        }
        return null;
    }

    public final RowDelegate.Model c(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        Custom customB = b(cardOwner);
        b bVar = (b) this.f208094a;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(bVar.a(cardOwner), bVar.b(cardOwner), null, false, 28);
        Intrinsics.checkNotNullParameter(cardOwner, "<this>");
        String strA = cardOwner.a();
        Card card = cardOwner.f81493g;
        return new RowDelegate.Model("CARD_ITEM", image40, new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(strA, " · ", card.f81486b), (Style) customB, (Integer) null, false, (o9) null, (List) null, 124), null, 0, new TextClause(nqa.a.b(card), (Style) customB, (Integer) null, false, (o9) null, (List) null, 124), null, null, 0, card.a() ? new RowDelegate.Model.c.a(new TagViewData(null, new TextLocalisedClause(R$string.payments_common_outdated_tag, null, null, 14), null, R$attr.uikit_colorGreyTone50, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, false, 6) : null, false, null, false, null, null, null, null, null, null, cardOwner, null, 0, 0, 0, 0, 532675544);
    }

    public final RewardDelegate.Model d(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        String str = cardOwner.f81490a;
        b bVar = (b) this.f208094a;
        return new RewardDelegate.Model(str, (Image) bVar.a(cardOwner), (Clause) new TextClause(cardOwner.f81491b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (CompositeClause) null, (RewardDelegate.a) new me(bVar.b(cardOwner)), false, (Object) cardOwner, (AnalyticsContext) null, 744);
    }

    public final QuickActionWidgetDelegate.Model e(String listId, CardOwner cardOwner, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        b bVar = (b) this.f208094a;
        return new QuickActionWidgetDelegate.Model(listId, bVar.a(cardOwner), bVar.b(cardOwner), i != 0 ? com.revolut.core.ui_kit_core.displayers.image.models.a.a(i, Integer.valueOf(R$attr.uikit_colorWidgetBackground), Integer.valueOf(R$attr.uikit_colorAccent), Integer.valueOf(R$attr.uikit_colorAccent), 2.0f) : null, new TextClause(cardOwner.f81491b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new d3(new e3(R$drawable.uikit_icn_24_arrow_up, true), (e3) null, 6), null, null, CaptureActivity.RESULT_EXIT_USER_FLOW);
    }
}
