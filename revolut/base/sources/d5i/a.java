package d5i;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import efm.r;
import ip0.ck0;
import ip0.yj0;
import kotlin.jvm.internal.Intrinsics;
import p4i.f;
import pri.c;
import rp0.l;
import rp0.t;
import rp0.y;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f111419h;

    public a(b mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f111419h = mapper;
    }

    @Override // p4i.f
    public final r E(Screen screen) {
        Screen.CharityDescription screen2 = (Screen.CharityDescription) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        this.f111419h.getClass();
        Intrinsics.checkNotNullParameter(screen2, "screen");
        return w.h(new y(u.c(new TextDelegate.Model("charity.description.description", new TextLocalisedClause(R$string.donations_one_off_transfer_transfer_breakdown_charity_gets_explanation, null, null, 14), false, new ck0(yj0.START), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908)), new t(new TextLocalisedClause(R$string.donations_one_off_transfer_transfer_breakdown_charity_gets, null, null, 14), null, null, 30), l.WINDOW, null, screen2, null, 984));
    }
}
