package bah;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.e1;
import z0h.f1;
import z0h.n1;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements pzg.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // pzg.a
    public final Clause a(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        e1 e1Var = disclaimer instanceof e1 ? (e1) disclaimer : null;
        if (e1Var == null) {
            return null;
        }
        int i = R$string.trading_stocks_transfer_out_confirmation_footer_format;
        int i2 = R$string.trading_stocks_transfer_out_confirmation_footer_gia;
        String str = e1Var.f318498b.C;
        return new TextLocalisedClause(i, u.c(new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) (str != null ? new n1(str) : null), "TRANSFER_OUT_DOCUMENT_LINK_ID", false), 10)), null, 12);
    }

    @Override // pzg.a
    public final boolean b(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return disclaimer instanceof e1;
    }
}
