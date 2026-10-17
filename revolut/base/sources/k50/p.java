package k50;

import com.revolut.chat.ChatApi$Toggles;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j30.c f181202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f80.a f181203b;

    public p(j30.c featureToggles, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f181202a = featureToggles;
        this.f181203b = uriHelper;
    }

    public final r a(String str) {
        if (!kotlin.text.a0.H(str, "rev-chat-entity://follow-up", false)) {
            return null;
        }
        if (((jte.d) ((rf3.d) this.f181202a).f253679a).c(ChatApi$Toggles.AirFollowUpSuggestions.f50962c)) {
            return r.FOLLOW_UP;
        }
        return null;
    }
}
