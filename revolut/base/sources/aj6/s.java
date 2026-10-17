package aj6;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f5426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uib.a f5427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5428c;

    public s(Data accountsData, uib.a aVar, Map toBaseCurrencyRatesMap) {
        Intrinsics.checkNotNullParameter(accountsData, "accountsData");
        Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
        this.f5426a = accountsData;
        this.f5427b = aVar;
        this.f5428c = toBaseCurrencyRatesMap;
    }
}
