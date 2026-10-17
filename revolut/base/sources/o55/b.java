package o55;

import com.revolut.feature.credit.loan.impl.network.LoanCancellationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoanCancellationService f222317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e55.a f222318b;

    public b(LoanCancellationService api2, e55.a configMapper) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(configMapper, "configMapper");
        this.f222317a = api2;
        this.f222318b = configMapper;
    }
}
