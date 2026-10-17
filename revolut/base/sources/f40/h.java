package f40;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import f40.d;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof d.b) {
            return new cii.b(new aw0.h(false, new n6(new TextLocalisedClause(R$string.chat_profile_card_agent_offline_bottom_sheet_call_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.chat_profile_card_agent_offline_bottom_sheet_cancel_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.chat_profile_card_agent_offline_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.chat_profile_card_agent_offline_bottom_sheet_description, null, null, 14), null, null, false, 28));
        }
        if (domainState instanceof d.a) {
            return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.chat_profile_card_agent_availability_bottom_sheet_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.chat_profile_card_agent_availability_bottom_sheet_busy_title, null, null, 14), new TextLocalisedClause(R$string.chat_profile_card_agent_availability_bottom_sheet_busy_description, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_no_call, null, null, 6)), null, false, 24));
        }
        if (domainState instanceof c) {
            Instant instant = ((c) domainState).f131989a;
            return new cii.b(new aw0.h(false, new n6(new TextLocalisedClause(R$string.chat_profile_card_agent_availability_bottom_sheet_away_call_support, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.chat_profile_card_agent_availability_bottom_sheet_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), f0.f322471a, new lw0.a(instant != null ? new TextLocalisedClause(R$string.chat_profile_card_agent_availability_bottom_sheet_away_title_with_date, u.c(new TimeClause(instant.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.chat_profile_card_agent_offline_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.chat_profile_card_agent_availability_bottom_sheet_away_description, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_moon, null, null, 6)), null, false, 24));
        }
        if (domainState instanceof e) {
            return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.chat_business_call_availability_bottom_sheet_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, 55), f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.chat_business_call_availability_bottom_sheet_title, null, null, 14), new TextClause(((e) domainState).f131992a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_moon, null, null, 6)), null, false, 24));
        }
        throw new NoWhenBranchMatchedException();
    }
}
