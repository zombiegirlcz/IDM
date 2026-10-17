package rf3;

import com.revolut.chat.ChatApi$Toggles;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements j30.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f253679a;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f253679a = featureToggleInteractor;
    }

    public final j30.a a() {
        ChatApi$Toggles.AssistantIntro assistantIntro = ChatApi$Toggles.AssistantIntro.f50969c;
        gte.a aVar = this.f253679a;
        if (!((jte.d) aVar).c(assistantIntro)) {
            return null;
        }
        if (((jte.d) aVar).c(ChatApi$Toggles.AirMandatoryIntroStoryConfirmation.f50965c)) {
            return j30.a.MANDATORY_STORIES;
        }
        return ((jte.d) aVar).c(ChatApi$Toggles.AirIntroRevamp.f50963c) ? j30.a.CMS_STORIES : j30.a.VIDEO;
    }

    public final j30.b b() {
        return ((jte.d) this.f253679a).c(ChatApi$Toggles.SupportNewInbox.f50985c) ? j30.b.FULLY_ENABLED : j30.b.DISABLED;
    }

    public final boolean c() {
        return ((jte.d) this.f253679a).c(ChatApi$Toggles.AssistantBranding.f50967c);
    }

    public final boolean d() {
        return ((jte.d) this.f253679a).c(ChatApi$Toggles.MoneyAssistant.f50984c);
    }
}
