package rsl;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import jsl.h0;
import jsl.i0;
import jsl.y;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import org.jetbrains.annotations.NotNull;
import rnd.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xul.l f257147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wul.o f257148b;

    public s(msl.a badgeMapper, xul.l stockOrderUnifiedInfoGroupMapper, nbh.a instrumentImageProvider, wul.o tradingOrderMapper) {
        Intrinsics.checkNotNullParameter(badgeMapper, "badgeMapper");
        Intrinsics.checkNotNullParameter(stockOrderUnifiedInfoGroupMapper, "stockOrderUnifiedInfoGroupMapper");
        Intrinsics.checkNotNullParameter(instrumentImageProvider, "instrumentImageProvider");
        Intrinsics.checkNotNullParameter(tradingOrderMapper, "tradingOrderMapper");
        this.f257147a = stockOrderUnifiedInfoGroupMapper;
        this.f257148b = tradingOrderMapper;
    }

    public static ActionsView.Item b(InvestOrder.InvestSecuritiesOrder investSecuritiesOrder, boolean z) {
        return new ActionsView.Item("CANCEL_INVEST_ORDER_ACTION_ID", null, false, z ? e4.EnabledClickable : e4.DisabledNonClickable, null, new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new ndf.b(investSecuritiesOrder), null, 24470);
    }

    public final i0 a(y yVar) {
        i0 i0Var;
        Data data = yVar.f178254a;
        Data data2 = yVar.f;
        Data dataT = (data == null || data2 == null) ? null : t1.t(data, data2);
        return (dataT == null || (i0Var = (i0) iii.c.f(dataT, new c(13), new d0(25), new q(this, yVar, 1))) == null) ? h0.f178214a : i0Var;
    }
}
