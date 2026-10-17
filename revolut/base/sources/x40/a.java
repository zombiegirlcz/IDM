package x40;

import aw0.o9;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.domain.model.AgentPresenceState;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v20.n;
import v30.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: x40.a$a, reason: collision with other inner class name */
    public static final class C1679a {
        private C1679a() {
        }

        public static String a(n message) {
            Intrinsics.checkNotNullParameter(message, "message");
            String string = message.getId().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    private a() {
    }

    public static CompositeClause a(AgentInfo agentInfo) {
        v30.a aVarB;
        TextLocalisedClause textLocalisedClause;
        Float fValueOf = Float.valueOf(12.0f);
        if (agentInfo != null && (aVarB = agentInfo.b()) != v30.a.ONLINE && aVarB != v30.a.UNKNOWN) {
            AgentPresenceState agentPresenceState = agentInfo.f51009s;
            Instant instant = agentPresenceState != null ? agentPresenceState.f51027b : null;
            if (aVarB != v30.a.OUT_OF_OFFICE || instant == null) {
                String str = agentInfo.f50999c;
                if (str != null) {
                    textLocalisedClause = new TextLocalisedClause(R$string.chat_agent_offline, u.c(str), null, 12);
                }
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.chat_profile_card_agent_presence_away_until, u.c(new TimeClause(instant.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12);
            }
            return new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_moon, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16), textLocalisedClause), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        }
        return null;
    }

    public static LayeredImage b() {
        return LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_logo_revolut, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10);
    }

    public static AnimatedBackgroundType c(s pricingPlan) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        switch (b.f302761a[pricingPlan.ordinal()]) {
            case 1:
            case 2:
                return null;
            case 3:
                return AnimatedBackgroundType.PLAN_PREMIUM.f51481a;
            case 4:
                return AnimatedBackgroundType.PLAN_METAL.f51479a;
            case 5:
                return AnimatedBackgroundType.PLAN_ULTRA_CX.f51484a;
            case 6:
                return AnimatedBackgroundType.PLAN_PRIVATE.f51482a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
