package b30;

import com.revolut.chat.data.network.SuggestionsApi;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f11978h = v.k("help_today", "need_hand", "whats_on_mind", "where_start");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuggestionsApi f11979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mjj.a f11980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f11981c;
    public final df0.b d;
    public final CoroutineScope e;
    public final nf3.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile b f11982g;

    public e(SuggestionsApi suggestionsApi, mjj.a mapper, ue0.c storage, df0.b dateProvider, CoroutineScope scope, nf3.a chatAssistantResourcesConfig) {
        Intrinsics.checkNotNullParameter(suggestionsApi, "suggestionsApi");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(chatAssistantResourcesConfig, "chatAssistantResourcesConfig");
        this.f11979a = suggestionsApi;
        this.f11980b = mapper;
        this.f11981c = storage;
        this.d = dateProvider;
        this.e = scope;
        this.f = chatAssistantResourcesConfig;
    }

    public static TextLocalisedClause a(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -213493598) {
            if (iHashCode != 1076092536) {
                if (iHashCode == 1564581059 && str.equals("help_today")) {
                    return new TextLocalisedClause(R$string.chat_suggestions_title_help_today, null, null, 14);
                }
            } else if (str.equals("need_hand")) {
                return new TextLocalisedClause(R$string.chat_suggestions_title_need_hand, null, null, 14);
            }
        } else if (str.equals("whats_on_mind")) {
            return new TextLocalisedClause(R$string.chat_suggestions_title_whats_on_mind, null, null, 14);
        }
        return new TextLocalisedClause(R$string.chat_suggestions_title_where_start, null, null, 14);
    }
}
