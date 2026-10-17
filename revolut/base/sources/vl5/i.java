package vl5;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.crypto.spare.change.api.R$string;
import ip0.tm0;
import ip0.um0;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(new y(u.c(new um0("SPARE_CHANGE_ALREADY_EXIST_DIALOG_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.crypto_movesparechange_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.crypto_movesparechange_confirm, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(new TextLocalisedClause(R$string.crypto_movesparechange_title, null, null, 14), new TextLocalisedClause(R$string.crypto_movesparechange_subtitle, v.l(domainState.f290295a), null, 12), null, 28), l.WINDOW, null, null, null, 1016));
    }
}
