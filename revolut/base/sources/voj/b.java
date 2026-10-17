package voj;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.api.Toggles;
import com.revolut.retail.feature.event_appearance.impl.R$string;
import efm.d0;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ufm.i;
import vif.c;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends moj.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f290995c;
    public final toj.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gte.a featureToggleInteractor, toj.b regularWelcomeMessageProvider) {
        super("ID_EVENT_WORLD_CUP");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(regularWelcomeMessageProvider, "regularWelcomeMessageProvider");
        this.f290995c = featureToggleInteractor;
        this.d = regularWelcomeMessageProvider;
    }

    @Override // q7l.b
    public final boolean c(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return ((d) this.f290995c).c(Toggles.WorldCupPasscodeGreeting.f98596c);
    }

    @Override // q7l.b
    public final boolean d() {
        return true;
    }

    @Override // q7l.b
    public final d0 e(p7l.a user) {
        Intrinsics.checkNotNullParameter(user, "user");
        String str = user.f233790a;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        i iVar = new i(str != null ? d0.m(new TextLocalisedClause(R$string.easter_eggs_passcode_welcome_worldcup_football, u.c(str), null, 12)) : this.d.b(user), new c(new vn8.a(15), 29), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
