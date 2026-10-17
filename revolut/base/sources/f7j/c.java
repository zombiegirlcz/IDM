package f7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import d7j.a0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements a0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f132628a;

    public c(w80.b amountFormatter, u80.o moneyPrefixFormatter, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f132628a = amountFormatter;
    }

    public final String a(MoneyDetails moneyDetails) {
        Long l2 = moneyDetails.f99904b;
        xi0.b bVar = moneyDetails.f99903a;
        return u80.o.b(new u80.g(new dj0.d(this.f132628a.b(String.valueOf(l2 != null ? l2.longValue() : 0L), bVar.f306286a), bVar), u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
    }
}
