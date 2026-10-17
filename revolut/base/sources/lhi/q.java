package lhi;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class q implements hpa.a {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b90.a f195298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xr3.y f195299b;

    public q(b90.a pushMessagesTools, xr3.y creditOnboardingLifecycleProvider) {
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(creditOnboardingLifecycleProvider, "creditOnboardingLifecycleProvider");
        this.f195298a = pushMessagesTools;
        this.f195299b = creditOnboardingLifecycleProvider;
    }

    @Override // hpa.a
    public final boolean b(ipa.j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (ipa.k.l(message) != ipa.h.CREDIT) {
            return false;
        }
        Collection collection = (Collection) this.f195299b.f308246a.get("KEY_CREDIT_ONBOARDING_FLOW_ACTIVE");
        if (collection != null && !collection.isEmpty() && Boolean.parseBoolean((String) message.get("notShowInActiveCreditApplication"))) {
            return true;
        }
        b90.a.c(this.f195298a, message, new b90.f(b90.b.DEEPLINK, ipa.k.e(message), 4), a0.d.r(ipa.k.o(message), ipa.k.i(message)), ipa.l.HIGH, null, null, 48);
        return true;
    }
}
