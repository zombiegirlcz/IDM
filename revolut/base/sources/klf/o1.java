package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f185548c;

    public o1(CoroutineScope coroutineScope, h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f185546a = coroutineScope;
        this.f185547b = commonDataSource;
        this.f185548c = yhm.j.b(new k98.a(this, 18));
    }
}
