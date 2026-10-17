package nvg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {
    public abstract void a(List list);

    public abstract void b(List list);

    public abstract void c(pvg.g gVar);

    public void d(pvg.g allocation, List cash, List assets) {
        Intrinsics.checkNotNullParameter(allocation, "allocation");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(assets, "assets");
        c(allocation);
        b(cash);
        a(assets);
    }

    public abstract pvg.g e(String str, String str2, boolean z);

    public yhm.r f(String accountTypesCombined, String currency, boolean z) {
        Intrinsics.checkNotNullParameter(accountTypesCombined, "accountTypesCombined");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new yhm.r(e(accountTypesCombined, currency, z), h(accountTypesCombined, currency, z), g(accountTypesCombined, currency, z));
    }

    public abstract List g(String str, String str2, boolean z);

    public abstract List h(String str, String str2, boolean z);
}
