package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final glc.d f185568c;
    public final Lazy d;

    public r1(CoroutineScope coroutineScope, h0 commonDataSource, glc.d roboTradeDetailsProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(roboTradeDetailsProvider, "roboTradeDetailsProvider");
        this.f185566a = coroutineScope;
        this.f185567b = commonDataSource;
        this.f185568c = roboTradeDetailsProvider;
        this.d = yhm.j.b(new k98.a(this, 20));
    }
}
