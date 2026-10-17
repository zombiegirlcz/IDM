package j30;

import com.revolut.chat.domain.model.ChatEntryPoint;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.ui.flow.ChatFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f170918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l30.b f170919b;

    public f(c chatFeatureToggles, l30.b assistantChatUpdatesProvider) {
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(assistantChatUpdatesProvider, "assistantChatUpdatesProvider");
        this.f170918a = chatFeatureToggles;
        this.f170919b = assistantChatUpdatesProvider;
    }

    public final ChatFlow a(ChatEntryPoint chatEntryPoint) {
        Intrinsics.checkNotNullParameter(chatEntryPoint, "chatEntryPoint");
        if (!((rf3.d) this.f170918a).d()) {
            return null;
        }
        ChatEntryPoint chatEntryPoint2 = z50.c.f319403c;
        if (chatEntryPoint2 != null) {
            chatEntryPoint = chatEntryPoint2;
        }
        z50.c.f319403c = null;
        return new ChatFlow(new ChatTarget.Messages(new ChatFeed.Assistant(null, null, true, 3), null, chatEntryPoint, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jji.x b() {
        /*
            r8 = this;
            j30.c r0 = r8.f170918a
            rf3.d r0 = (rf3.d) r0
            boolean r1 = r0.d()
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            dy0.q0 r1 = new dy0.q0
            r3 = 1
            r1.<init>(r2, r3, r3)
            boolean r0 = r0.c()
            if (r0 == 0) goto L1b
            int r4 = com.revolut.chat_core.R$string.assistant_swipe_to_ask_air_message
            goto L1d
        L1b:
            int r4 = com.revolut.chat_core.R$string.assistant_pull_for_assistant_message
        L1d:
            v30.t r5 = v30.t.DEFAULT
            l30.b r6 = r8.f170919b
            l30.e r6 = (l30.e) r6
            l30.f r5 = r6.a(r5)
            r6 = -1
            if (r5 != 0) goto L2c
            r5 = r6
            goto L34
        L2c:
            int[] r7 = j30.e.f170917a
            int r5 = r5.ordinal()
            r5 = r7[r5]
        L34:
            if (r5 == r6) goto L45
            if (r5 == r3) goto L42
            r3 = 2
            if (r5 != r3) goto L3c
            goto L45
        L3c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L42:
            dy0.g r0 = dy0.g.SUGGESTIONS
            goto L4c
        L45:
            if (r0 == 0) goto L4a
            dy0.g r0 = dy0.g.WITH_GLOW
            goto L4c
        L4a:
            dy0.g r0 = dy0.g.DEFAULT
        L4c:
            dy0.h r3 = new dy0.h
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r6 = 14
            r5.<init>(r4, r2, r2, r6)
            r3.<init>(r5, r0)
            jji.x r0 = new jji.x
            r0.<init>(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j30.f.b():jji.x");
    }
}
