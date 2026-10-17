package s50;

import com.revolut.chat.ui.ratechatexpression.ChatRatingShotDelegate$ChatRatingShotParcel;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import rp0.k1;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f259908a;

    public e(g1 shotDialogDisplayer) {
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        this.f259908a = shotDialogDisplayer;
    }

    public final void a(int i, UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        ((k1) this.f259908a).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "CHAT_RATING_SHOT_SUBMITTED", new TextLocalisedClause(R$string.chat_rate_submitted_tooltip_title, null, null, 14), new ChatRatingShotDelegate$ChatRatingShotParcel(i, chatId), new TextLocalisedClause(R$string.chat_rate_submitted_tooltip_action_title, null, null, 14), null, 48));
    }

    public final void b(int i, UUID chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        ((k1) this.f259908a).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "CHAT_RATING_SHOT_SUBMITTED", new TextLocalisedClause(R$string.chat_rate_success_tooltip_title, null, null, 14), new ChatRatingShotDelegate$ChatRatingShotParcel(i, chatId), null, null, 56));
    }
}
