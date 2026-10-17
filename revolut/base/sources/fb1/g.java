package fb1;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import com.revolut.feature.revpro.card_reader.order.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements d {

    @NotNull
    public static final e Companion = new e();

    public final Clause a(PaymentMethod wallet) {
        Intrinsics.checkNotNullParameter(wallet, "wallet");
        if (!(wallet instanceof PaymentMethod.Wallet)) {
            throw new NoWhenBranchMatchedException();
        }
        PaymentMethod.Wallet wallet2 = (PaymentMethod.Wallet) wallet;
        if (f.f133431a[wallet2.f60580b.ordinal()] == 1) {
            return yoj.b.w(new TextClause(a0.d.r(wallet2.f60581c.f115083b.f306286a, " · "), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.rev_pro_card_reader_order_checkout_pocket_pro, null, null, 14));
        }
        throw new NoWhenBranchMatchedException();
    }
}
