package gqk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f145764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f145765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f145766c;

    public c() {
        this(0);
    }

    public c(Map maxLoanAmountByCurrencyMap, Map minLoanAmountByCurrencyMap, boolean z) {
        Intrinsics.checkNotNullParameter(maxLoanAmountByCurrencyMap, "maxLoanAmountByCurrencyMap");
        Intrinsics.checkNotNullParameter(minLoanAmountByCurrencyMap, "minLoanAmountByCurrencyMap");
        this.f145764a = z;
        this.f145765b = maxLoanAmountByCurrencyMap;
        this.f145766c = minLoanAmountByCurrencyMap;
    }

    public /* synthetic */ c(int i) {
        this(r0.g(), r0.g(), false);
    }
}
