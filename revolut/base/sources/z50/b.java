package z50;

import aw0.o9;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n50.p;
import n50.r;
import n50.s;
import v20.n;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f319400a;

    public b(g liveAgentAvatarProvider) {
        Intrinsics.checkNotNullParameter(liveAgentAvatarProvider, "liveAgentAvatarProvider");
        this.f319400a = liveAgentAvatarProvider;
    }

    public static Clause c(MessageAuthor messageAuthor) {
        Custom custom = new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254);
        Clause textLocalisedClause = new TextLocalisedClause(R$string.chat_support_suggestions_assistant_name, null, custom, 10);
        if (!(messageAuthor instanceof ChatAgent.Live)) {
            return textLocalisedClause;
        }
        String name = ((ChatAgent.Live) messageAuthor).getName();
        if (name != null) {
            textLocalisedClause = new TextClause(name, (Style) custom, (Integer) null, false, (o9) null, (List) null, 124);
        }
        return textLocalisedClause;
    }

    public final int a(cam.f chatItemPosition, s messageInGroupData, boolean z) {
        Intrinsics.checkNotNullParameter(chatItemPosition, "chatItemPosition");
        Intrinsics.checkNotNullParameter(messageInGroupData, "messageInGroupData");
        return ((chatItemPosition instanceof gw0.i) && ((messageInGroupData instanceof r) || (messageInGroupData instanceof p)) && z) ? R$attr.uikit_dp48 : R$attr.uikit_dp16;
    }

    public final TimeClause b(n message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new TimeClause(message.getTime().getMillis(), TimeClause.Format.TimeDefault.f57977b, null, null, 12);
    }
}
