package dna;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.profile.impl.R$string;
import ip0.tm0;
import ip0.um0;
import jki.i;
import jki.j;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends jki.g implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f116255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f116256q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j60.a bottomDialogExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f116255p = bottomDialogExtension;
        this.f116256q = j.f175191a;
    }

    @Override // yji.l
    public final void I1() {
        this.f116255p.x(new y(u.c(new um0("NAME_CHANGE_DISCLAIMER_ACTION_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.profile_details_item_name_change_popup_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.profile_details_item_name_change_popup_confirm, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(new TextLocalisedClause(R$string.profile_details_item_name_change_popup_title, null, null, 14), new TextLocalisedClause(R$string.profile_details_item_name_change_popup_subtitle, null, null, 14), null, 28), null, null, null, null, 1020));
    }

    @Override // jki.g
    public final i r2() {
        return this.f116256q;
    }
}
