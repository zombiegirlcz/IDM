package vpd;

import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f291166a = new g0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return Boolean.valueOf(obj2 instanceof IncomeSorterDestinationInfo.Investment.Instrument);
    }
}
