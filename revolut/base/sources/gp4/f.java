package gp4;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.R$string;
import ip0.tm0;
import ip0.um0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new d(u.c(new um0("TWIN_HORIZONTAL_BUTTON", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.additional_cards_cardholders_details_cancel_invite_secondary_button, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.additional_cards_cardholders_details_cancel_invite_primary_button, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new lw0.a(new TextLocalisedClause(R$string.additional_cards_cardholders_details_cancel_invite_title, null, null, 14), new TextLocalisedClause(R$string.additional_cards_cardholders_details_cancel_invite_subtitle_without_name, null, null, 14), null, null, false, 28));
    }
}
