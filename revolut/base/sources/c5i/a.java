package c5i;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import com.revolut.feature_market_data_impl.ui.delegates.charge_description.ChargeDescriptionDelegateContract$DetailsParcel;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import efm.r;
import ip0.ck0;
import ip0.yj0;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import p4i.f;
import pri.c;
import rp0.l;
import rp0.t;
import rp0.y;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends c implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f21563h;

    public a(b mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f21563h = mapper;
    }

    @Override // p4i.f
    public final r E(Screen screen) {
        Screen.ChargeDescription screen2 = (Screen.ChargeDescription) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        ChargeEntry entry = screen2.f97107a;
        this.f21563h.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(screen2, "screen");
        Intrinsics.checkNotNullParameter(entry, "entry");
        t tVar = new t(new TextClause(entry.f104725a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30);
        Intrinsics.checkNotNullParameter(entry, "entry");
        ChargeEntryDetails chargeEntryDetails = entry.d;
        TextClause[] elements = {new TextClause(entry.f104727c, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), chargeEntryDetails != null ? new TextClause(chargeEntryDetails.f104729a, (Style) new Click(28, (Integer) null, (Object) new ChargeDescriptionDelegateContract$DetailsParcel(chargeEntryDetails.f104730b), "CHARGE_BREAKDOWN_CLICK_ID", false), (Integer) null, false, (o9) null, (List) null, 124) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        TextDelegate.Model model = new TextDelegate.Model("charge.description.description", yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d.L(elements)), false, new ck0(yj0.START), null, null, R$attr.uikit_dp0, 0, 0, 0, 1908);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("charge.description.gotItButton", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        return w.h(new y(v.k(model, model2), tVar, l.WINDOW, null, screen2, null, 984));
    }
}
