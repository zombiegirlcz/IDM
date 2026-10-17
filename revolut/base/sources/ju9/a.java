package ju9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.messaging.common.api.R$string;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import cu9.n;
import eu9.b;
import eu9.c;
import eu9.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements n {

    @NotNull
    public static final C1015a Companion = new C1015a();

    /* JADX INFO: renamed from: ju9.a$a, reason: collision with other inner class name */
    public static final class C1015a {
        private C1015a() {
        }
    }

    public static boolean c(MessageType messageType) {
        if ((messageType instanceof MessageType.Emoji) || (messageType instanceof MessageType.Gif) || (messageType instanceof MessageType.Sticker) || (messageType instanceof MessageType.GiphyGifId) || (messageType instanceof MessageType.Text)) {
            return true;
        }
        if ((messageType instanceof MessageType.Key) || (messageType instanceof MessageType.Referral) || (messageType instanceof MessageType.SalaryReferral) || (messageType instanceof MessageType.PricingPlanGift) || (messageType instanceof MessageType.PlanReferral)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List a(MessageItem chatReaction) {
        Intrinsics.checkNotNullParameter(chatReaction, "chatReaction");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.social_payments_chat_status_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_arrow_repeat, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 11.0f, null, null, 48), null, null, false, null, false, 62);
        d dVar = new d(chatReaction);
        MessageType messageType = chatReaction.f79535h;
        RowDelegate.Model model = new RowDelegate.Model("CHAT_TRY_AGAIN_ID", image40, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, dVar, null, 0, 0, 0, 0, 532676600);
        if (chatReaction.f79536j != dv9.d.ERROR) {
            model = null;
        }
        RowDelegate.Model model2 = model;
        RowDelegate.Model model3 = new RowDelegate.Model("COPY_TO_CLIPBOARD_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_copy, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 11.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.payments_common_action_copy, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new b(chatReaction), null, 0, 0, 0, 0, 532676600);
        if (!(messageType instanceof MessageType.Text)) {
            model3 = null;
        }
        RowDelegate.Model[] elements = {model2, model3, (chatReaction.f79533c == dv9.n.OUTGOING && c(messageType)) ? new RowDelegate.Model("CHAT_DELETE_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(companion, R$drawable.uikit_icn_24_delete, Integer.valueOf(R$attr.uikit_colorRed), R$attr.uikit_colorRed_10, 11.0f, null, null, 48), null, null, false, null, false, 62), new TextLocalisedClause(R$string.social_payments_chat_menu_delete, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new c(chatReaction), null, 0, 0, 0, 0, 532676600) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public final List b(MessageItem chatReaction) {
        Intrinsics.checkNotNullParameter(chatReaction, "chatReaction");
        PopupMenuItem.Cell cell = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.social_payments_chat_status_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_arrow_repeat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246);
        d dVar = new d(chatReaction);
        MessageType messageType = chatReaction.f79535h;
        PopupMenuItem.Cell cell2 = new PopupMenuItem.Cell("CHAT_TRY_AGAIN_ID", textLocalisedClause, resourceImage, null, null, null, null, null, dVar, null, 760);
        if (chatReaction.f79536j != dv9.d.ERROR) {
            cell2 = null;
        }
        PopupMenuItem.Cell cell3 = messageType instanceof MessageType.Text ? new PopupMenuItem.Cell("COPY_TO_CLIPBOARD_ID", new TextLocalisedClause(R$string.payments_common_action_copy, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_copy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, null, null, new b(chatReaction), null, 760) : null;
        PopupMenuItem.Cell cell4 = new PopupMenuItem.Cell("CHAT_DELETE_ID", new TextLocalisedClause(R$string.social_payments_chat_menu_delete, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, null, null, new c(chatReaction), null, 760);
        if (chatReaction.f79533c == dv9.n.OUTGOING && c(messageType)) {
            cell = cell4;
        }
        PopupMenuItem.Cell[] elements = {cell2, cell3, cell};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }
}
