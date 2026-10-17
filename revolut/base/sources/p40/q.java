package p40;

import aw0.o9;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v20.v0;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z50.g f232793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a20.a f232794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.c f232795c;
    public final nf3.a d;
    public final v0 e;
    public final Lazy f;

    public q(z50.g agentAvatarProvider, a20.a authHeadersProvider, j30.c chatFeatureToggles, nf3.a chatAssistantResourcesConfig, v0 imageRepository) {
        Intrinsics.checkNotNullParameter(agentAvatarProvider, "agentAvatarProvider");
        Intrinsics.checkNotNullParameter(authHeadersProvider, "authHeadersProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatAssistantResourcesConfig, "chatAssistantResourcesConfig");
        Intrinsics.checkNotNullParameter(imageRepository, "imageRepository");
        this.f232793a = agentAvatarProvider;
        this.f232794b = authHeadersProvider;
        this.f232795c = chatFeatureToggles;
        this.d = chatAssistantResourcesConfig;
        this.e = imageRepository;
        this.f = yhm.j.b(new os2.a(this, 17));
    }

    public static TextLocalisedClause d(i iVar) {
        String str;
        AgentInfo agentInfo = iVar.f232778c;
        return (agentInfo == null || (str = agentInfo.f) == null) ? new TextLocalisedClause(R$string.chat_profile_card_title_private_support, null, null, 14) : new TextLocalisedClause(p.a.p("chat.agent.bio.", str, ".title"), (List) null, (Clause) new TextLocalisedClause(R$string.chat_profile_card_title_private_support, null, null, 14), false, 22);
    }

    public static j e(o40.a aVar) {
        int i = p.f232791b[aVar.ordinal()];
        if (i == 1) {
            return new j("BUTTON_CALL", R$string.chat_profile_card_action_call, R$drawable.uikit_icn_24_call);
        }
        if (i == 2) {
            return new j("BUTTON_SEARCH", R$string.chat_profile_card_action_search, R$drawable.uikit_icn_24_search);
        }
        if (i == 3) {
            return new j("BUTTON_TRANSCRIPT", R$string.chat_profile_card_action_transcript, R$drawable.uikit_icn_24_download);
        }
        if (i == 4) {
            return new j("BUTTON_FEEDBACK_FLOW", R$string.chat_profile_action_feedback, R$drawable.uikit_icn_24_double_thumbs);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause a() {
        return ((Boolean) this.f.getValue()).booleanValue() ? new TextLocalisedClause(R$string.chat_profile_subtitle_air, null, null, 14) : new TextLocalisedClause(R$string.chat_profile_card_subtitle_assistant, null, null, 14);
    }

    public final Clause b(i iVar) {
        String str;
        int i = p.f232790a[iVar.f232776a.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.chat_profile_card_title_revolut, null, null, 14);
        }
        if (i == 2) {
            return ((Boolean) this.f.getValue()).booleanValue() ? new TextLocalisedClause(R$string.chat_title_air, null, null, 14) : new TextLocalisedClause(R$string.chat_profile_card_title_revolut, null, null, 14);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        AgentInfo agentInfo = iVar.f232778c;
        return (agentInfo == null || (str = agentInfo.f50998b) == null) ? new TextLocalisedClause(R$string.chat_profile_card_title_revolut, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0799  */
    /* JADX WARN: Type inference failed for: r2v28, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.ArrayList] */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r47) {
        /*
            Method dump skipped, instruction units count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p40.q.c(cli.j):cli.o");
    }
}
