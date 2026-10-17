package esb;

import bw0.m;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.i3;
import mx0.m3;
import nel.n;
import qrb.k;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements a {
    @Override // esb.a
    public final TextLocalisedClause a(qrb.b inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        int i = c.f128932a[inputType.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.trading_advanced_charts_order_view_amount_input_title_amount, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.trading_advanced_charts_order_view_amount_input_title_shares, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // esb.a
    public final m b(k kVar, Data data) {
        return null;
    }

    @Override // esb.a
    public final String c(qrb.b inputType, n instrument) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        int i = c.f128932a[inputType.ordinal()];
        if (i == 1) {
            return cp5.d.J(instrument.i);
        }
        if (i == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // esb.a
    public final i3 d() {
        return new i3(m3.ON, null, null);
    }
}
