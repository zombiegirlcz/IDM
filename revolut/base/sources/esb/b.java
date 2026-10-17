package esb;

import bw0.m;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import ec8.q;
import eqd.h;
import kotlin.jvm.internal.Intrinsics;
import mx0.i3;
import nel.n;
import qrb.k;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements a {
    @Override // esb.a
    public final TextLocalisedClause a(qrb.b inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        return new TextLocalisedClause(R$string.trading_advanced_charts_order_view_amount_input_title_units, null, null, 14);
    }

    @Override // esb.a
    public final m b(k kVar, Data data) {
        if (data != null) {
            return (m) iii.c.f(data, new h(18), new en6.a(16), new q(this, kVar, 13));
        }
        return null;
    }

    @Override // esb.a
    public final String c(qrb.b inputType, n instrument) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        return null;
    }

    @Override // esb.a
    public final i3 d() {
        return null;
    }
}
