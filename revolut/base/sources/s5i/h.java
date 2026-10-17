package s5i;

import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface h {

    @NotNull
    public static final d Companion = d.f260086a;

    static /* synthetic */ qv0.i l(h hVar, OrderQuote orderQuote, Function1 function1, Function1 function12, xi0.b bVar, int i) {
        if ((i & 4) != 0) {
            function12 = e.f260087a;
        }
        if ((i & 8) != 0) {
            bVar = null;
        }
        return hVar.e(orderQuote, function1, function12, bVar);
    }

    static /* synthetic */ qv0.i m(h hVar, OrderQuote orderQuote, boolean z, Function1 function1, Function1 function12, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function12 = f.f260088a;
        }
        return hVar.o(orderQuote, z, function1, function12);
    }

    qv0.i e(OrderQuote orderQuote, Function1 function1, Function1 function12, xi0.b bVar);

    qv0.i o(OrderQuote orderQuote, boolean z, Function1 function1, Function1 function12);
}
