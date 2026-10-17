package wi6;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f297823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f297824b;

    public p(Data accountsData, Map toBaseCurrencyRatesMap) {
        Intrinsics.checkNotNullParameter(accountsData, "accountsData");
        Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
        this.f297823a = accountsData;
        this.f297824b = toBaseCurrencyRatesMap;
    }
}
