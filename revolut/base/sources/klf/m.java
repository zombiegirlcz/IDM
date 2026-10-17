package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kye.e f185528c;
    public final Lazy d;

    public m(CoroutineScope coroutineScope, h0 commonDataSource, kye.e transactionFeeBreakdownInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionFeeBreakdownInteractor, "transactionFeeBreakdownInteractor");
        this.f185526a = coroutineScope;
        this.f185527b = commonDataSource;
        this.f185528c = transactionFeeBreakdownInteractor;
        this.d = yhm.j.b(new k98.a(this, 12));
    }
}
