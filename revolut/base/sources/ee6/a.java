package ee6;

import dw3.f6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f125077a;

    public a(fe6.a extensionAuthInteractor, qpa.b pushMessagesInteractor, vil.f appConsentInteractor, q06.d deeplinkParser, f6 appChallengeCheckerExtensionProvider) {
        Intrinsics.checkNotNullParameter(extensionAuthInteractor, "extensionAuthInteractor");
        Intrinsics.checkNotNullParameter(pushMessagesInteractor, "pushMessagesInteractor");
        Intrinsics.checkNotNullParameter(appConsentInteractor, "appConsentInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(appChallengeCheckerExtensionProvider, "appChallengeCheckerExtensionProvider");
        this.f125077a = appChallengeCheckerExtensionProvider;
    }
}
