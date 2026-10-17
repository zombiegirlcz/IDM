package zyd;

import com.revolut.core.ui_kit.models.CurrencyClause;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f326450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f326451b;

    public o(xi0.b baseCurrency, f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f326450a = baseCurrency;
        this.f326451b = uiKitResources;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        xi0.b c16 = (xi0.b) obj2;
        xi0.b c2 = (xi0.b) obj3;
        Intrinsics.checkNotNullParameter(c16, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        xi0.b bVar = this.f326450a;
        boolean zF = Intrinsics.f(c16, bVar);
        boolean zF2 = Intrinsics.f(c2, bVar);
        if (zF && !zF2) {
            return -1;
        }
        if (!zF && zF2) {
            return 1;
        }
        CurrencyClause currencyClause = new CurrencyClause(c16, null, null, 6);
        f01.c cVar = this.f326451b;
        return a0.q(cVar.b(currencyClause).toString(), cVar.b(new CurrencyClause(c2, null, null, 6)).toString());
    }
}
