package qtd;

import com.revolut.core.ui_kit.delegates.widgets.v4;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import jtd.g;
import jtd.h;
import jtd.i;
import jtd.m;
import jtd.n;
import jtd.o;
import jtd.q;
import jtd.r;
import jtd.s;
import jtd.t;
import jtd.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f249094a;

    public d(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f249094a = countryInteractor;
    }

    public static v4 a(u uVar) {
        if (uVar instanceof h) {
            return new v4("ATM_ID", R$drawable.uikit_icn_24_map_point, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_atm_shortTitle, null, null, 14), uVar);
        }
        if (Intrinsics.f(uVar, i.f178480a)) {
            return new v4("BIZUM_ID", R$drawable.uikit_icn_24_bizum, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_bizum_title, null, null, 14), uVar);
        }
        if (uVar instanceof m) {
            return new v4("ACTIVE_ESIM_ID", R$drawable.uikit_icn_24_sim_card, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_esim_shortTitle, null, null, 14), uVar);
        }
        if (uVar instanceof n) {
            return new v4("AVAILABLE_TO_ACTIVATE_ESIM_ID", R$drawable.uikit_icn_24_sim_card, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_esim_shortTitle, null, null, 14), uVar);
        }
        if (uVar instanceof o) {
            return new v4("AVAILABLE_TO_BUY_ESIM_ID", R$drawable.uikit_icn_24_sim_card, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_esim_shortTitle, null, null, 14), uVar);
        }
        if (Intrinsics.f(uVar, r.f178490a)) {
            return new v4("PIX_ID", R$drawable.uikit_icn_24_logo_pix, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_pixArea_shortTitle, null, null, 14), uVar);
        }
        if (Intrinsics.f(uVar, g.f178478a)) {
            return new v4("ALIPAY_ID", R$drawable.uikit_icn_24_alipayplus, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_alipay_shortTitle, null, null, 14), uVar);
        }
        if (Intrinsics.f(uVar, s.f178491a)) {
            return new v4("SPLIT_BILL_ID", R$drawable.uikit_icn_24_people, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_splitBill_shortTitle, null, null, 14), uVar);
        }
        if (Intrinsics.f(uVar, t.f178492a)) {
            return new v4("TRANSPORT_HUBS_ID", R$drawable.uikit_icn_24_transport, new TextLocalisedClause(R$string.analytics_travel_mode_section_tool_transportHubs_shortTitle, null, null, 14), uVar);
        }
        if (uVar instanceof q) {
            throw new IllegalStateException("Exchange should not be shown as a cell");
        }
        throw new NoWhenBranchMatchedException();
    }
}
