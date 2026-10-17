package jtf;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer_reasons.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements h {
    public final y o;

    public j(k stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new c(v.k(new g(new TextLocalisedClause(R$string.transfer_reasons_refund_step_option_yes, null, null, 14), "REFUND_ROW_YES_ID"), new g(new TextLocalisedClause(R$string.transfer_reasons_refund_step_option_no, null, null, 14), "REFUND_ROW_NO_ID"))), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
