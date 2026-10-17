package e4i;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import dj0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    l4i.a e();

    default Asset f(xi0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        e().getClass();
        return l4i.a.c(bVar);
    }

    default d g(Amount amount) {
        Intrinsics.checkNotNullParameter(amount, "<this>");
        e().getClass();
        return l4i.a.b(amount);
    }
}
