package nwc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final otc.b f219835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f219836b;

    public q(rwc.c securityHubImageProgressStyleMapper, r wealthProtectionStreetModeBadgeProvider, otc.b securityHubType, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(securityHubImageProgressStyleMapper, "securityHubImageProgressStyleMapper");
        Intrinsics.checkNotNullParameter(wealthProtectionStreetModeBadgeProvider, "wealthProtectionStreetModeBadgeProvider");
        Intrinsics.checkNotNullParameter(securityHubType, "securityHubType");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f219835a = securityHubType;
        this.f219836b = featureToggleInteractor;
    }

    public static TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.security_hub_wealth_protection_screen_subtitle_learn_more, null, new Click(30, (Integer) null, (Object) null, "WEALTH_PROTECTION_DESCRIPTION_LEARN_MORE_ID", false), 10);
    }

    public static TextLocalisedClause d(WealthProtectionFeatureState wealthProtectionFeatureState) {
        if (!(wealthProtectionFeatureState instanceof WealthProtectionFeatureState.Visible.Enabled)) {
            return null;
        }
        WealthProtectionFeatureState.Visible.Enabled enabled = (WealthProtectionFeatureState.Visible.Enabled) wealthProtectionFeatureState;
        dj0.d dVar = enabled.f85447b;
        if (dVar.f115082a == 0) {
            return new TextLocalisedClause(R$string.security_hub_wealth_protection_zero_limit, u.c(rwc.b.a(dVar)), null, 12);
        }
        return new TextLocalisedClause(R$string.security_hub_wealth_protection_limit_spent_ratio, v.k(rwc.b.a(enabled.f85448c), rwc.b.a(dVar)), null, 12);
    }

    public final RowDelegate.Model.MainImage.Image40 b(int i, boolean z, WealthProtectionFeatureState wealthProtectionFeatureState) {
        GlyphImage glyphImage = new GlyphImage(i, null, null, 6);
        AccentCircleBadge accentCircleBadge = z ? new AccentCircleBadge(dw0.a.Checked) : null;
        WealthProtectionFeatureState.Visible.Enabled enabled = wealthProtectionFeatureState instanceof WealthProtectionFeatureState.Visible.Enabled ? (WealthProtectionFeatureState.Visible.Enabled) wealthProtectionFeatureState : null;
        return new RowDelegate.Model.MainImage.Image40(glyphImage, accentCircleBadge, enabled != null ? rwc.c.a(enabled.f85448c.f115082a, enabled.f85447b.f115082a) : null, false, null, false, 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03b8  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r48) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nwc.q.c(cli.j):cli.o");
    }
}
