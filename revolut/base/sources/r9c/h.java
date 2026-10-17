package r9c;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import com.revolut.feature.revolutpay.impl.R$string;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o9c.c0;
import o9c.d0;
import o9c.w;
import org.jetbrains.annotations.NotNull;
import r7i.r;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPaySummaryScreenContract$InputData f252563a;

    public h(RevolutPaySummaryScreenContract$InputData inputData, gec.j zeroAuthNavBarContentMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(zeroAuthNavBarContentMapper, "zeroAuthNavBarContentMapper");
        this.f252563a = inputData;
    }

    public static d0 a(RampOrderDetails rampOrderDetails, Data data, sh5.c cVar) {
        return new d0(R$drawable.uikit_icn_24_cross, cVar != null ? cVar.f263435a : null, (c0) iii.c.f(data, new r(11), new r6d.h(20), new qbg.j(rampOrderDetails, 20)));
    }

    public static d0 b() {
        int i = R$drawable.uikit_icn_24_cross;
        int i2 = R$drawable.uikit_icn_24_lock;
        Float fValueOf = Float.valueOf(16.0f);
        List listK = v.k(new ImageClause(i2, (Integer) null, fValueOf, fValueOf, 18), new TextLocalisedClause(R$string.revolut_pay_order_summary_checkout_title, null, null, 14));
        m70.a.t(t0.f186434a);
        return new d0(i, null, new w(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)));
    }
}
