package a0i;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature_crypto_order_flow.api.R$string;
import h5i.g;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import myh.j;
import org.jetbrains.annotations.NotNull;
import qv0.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f390a;

    public d(g quoteMapper) {
        Intrinsics.checkNotNullParameter(quoteMapper, "quoteMapper");
        this.f390a = quoteMapper;
    }

    public static FullScreenStateDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, ComplexImage.Regular regular) {
        return new FullScreenStateDelegate.Model(str, new TextLocalisedClause(R$string.cryptobuysell_fx_orders_take_profit_stop_loss_order_review_no_data_title, u.c(textLocalisedClause), null, 12), null, regular, zj.REGULAR, null, false, null, null, false, R$attr.uikit_dp32, R$attr.uikit_dp48, 26596);
    }

    public final List b(Data data, Data data2, Data data3, j tab2) {
        FullScreenStateDelegate.Model modelA;
        List listC;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        int[] iArr = c.f389a;
        int i = iArr[tab2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            data = data2;
        }
        if (data == null || (listC = (List) iii.c.f(data, new a09.a(this, 8), new a09.b(tab2, 2), new a(tab2, 0, this, data3))) == null) {
            Intrinsics.checkNotNullParameter(tab2, "tab");
            int i2 = iArr[tab2.ordinal()];
            if (i2 == 1) {
                modelA = a("EMPTY_TAKE_PROFIT_ITEM_ID", new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_abbreviation_take_profit, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D352", null, null, null, 30)));
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                modelA = a("EMPTY_STOP_LOSS_ITEM_ID", new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_abbreviation_stop_loss, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D352", null, null, null, 30)));
            }
            listC = u.c(modelA);
        }
        s0 s0Var = new s0(2);
        Intrinsics.checkNotNullParameter(tab2, "selectedTab");
        s0Var.a(new FixedTabsDelegate.Model("TPSL_TABS_ITEM_ID", v.k(new FixedTabs.Item(j.TAKE_PROFIT.getId(), new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_abbreviation_take_profit, null, null, 14), (AnalyticsContext) null, 12), new FixedTabs.Item(j.STOP_LOSS.getId(), new TextLocalisedClause(R$string.cryptobuysell_take_profit_stop_loss_abbreviation_stop_loss, null, null, 14), (AnalyticsContext) null, 12)), tab2.getId(), false, null, SyslogConstants.LOG_CLOCK));
        s0Var.b(listC.toArray(new i[0]));
        ArrayList arrayList = s0Var.f186433a;
        List listK = v.k(arrayList.toArray(new i[arrayList.size()]));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }
}
