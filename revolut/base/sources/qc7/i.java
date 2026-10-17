package qc7;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.widgets.CardWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.home_feed.api.R$string;
import ia3.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f244603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.g f244604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ef7.d f244605c;
    public final ef7.b d;

    public i(r cardsContentMapper, m93.g cardsSimplifiedItemMapper, ef7.d incentiveRewardFreeCardMapper, ef7.b incentiveRewardCardOrderReimbursedMapper) {
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        Intrinsics.checkNotNullParameter(incentiveRewardFreeCardMapper, "incentiveRewardFreeCardMapper");
        Intrinsics.checkNotNullParameter(incentiveRewardCardOrderReimbursedMapper, "incentiveRewardCardOrderReimbursedMapper");
        this.f244603a = cardsContentMapper;
        this.f244604b = cardsSimplifiedItemMapper;
        this.f244605c = incentiveRewardFreeCardMapper;
        this.d = incentiveRewardCardOrderReimbursedMapper;
    }

    public static CardWidgetDelegate.Model a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new CardWidgetDelegate.Model(id10, new ResourceImage(R$drawable.uikit_icn_40_revolut_card_placeholder, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.home_feed_widget_cards_get_card, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccentNeutral), false, false, 254), 10), null, null, "ADD_NEW_CARD_ACTION_LIST_ID", SyslogConstants.LOG_LOCAL6);
    }
}
