package uoj;

import com.revolut.retail.common.ui.api.Toggles;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufm.i;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends moj.a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f281655c;
    public final toj.b d;
    public final h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gte.a featureToggleInteractor, toj.b regularWelcomeMessageProvider, h seasonalStatusProvider) {
        super("ID_EVENT_SEASONAL");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(regularWelcomeMessageProvider, "regularWelcomeMessageProvider");
        Intrinsics.checkNotNullParameter(seasonalStatusProvider, "seasonalStatusProvider");
        this.f281655c = featureToggleInteractor;
        this.d = regularWelcomeMessageProvider;
        this.e = seasonalStatusProvider;
    }

    @Override // q7l.b
    public final boolean c(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return ((jte.d) this.f281655c).c(Toggles.SeasonalPasscodeGreeting.f98587c) && this.e.a().f281657b;
    }

    @Override // q7l.b
    public final boolean d() {
        return true;
    }

    @Override // q7l.b
    public final d0 e(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        i iVar = new i(this.d.b(user), new uoe.a(1, new um7.d(this, 12)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
