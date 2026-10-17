package anf;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7748c;

    public q() {
        this(0);
    }

    public q(Map maxLoanAmountByCurrencyMap, Map minLoanAmountByCurrencyMap, boolean z) {
        Intrinsics.checkNotNullParameter(maxLoanAmountByCurrencyMap, "maxLoanAmountByCurrencyMap");
        Intrinsics.checkNotNullParameter(minLoanAmountByCurrencyMap, "minLoanAmountByCurrencyMap");
        this.f7746a = z;
        this.f7747b = maxLoanAmountByCurrencyMap;
        this.f7748c = minLoanAmountByCurrencyMap;
    }

    public /* synthetic */ q(int i) {
        this(r0.g(), r0.g(), false);
    }
}
