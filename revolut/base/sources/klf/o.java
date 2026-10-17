package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bal.a f185543c;
    public final Lazy d;

    public o(CoroutineScope coroutineScope, h0 commonDataSource, bal.a entityConfigRepository) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(entityConfigRepository, "entityConfigRepository");
        this.f185541a = coroutineScope;
        this.f185542b = commonDataSource;
        this.f185543c = entityConfigRepository;
        this.d = yhm.j.b(new k98.a(this, 13));
    }
}
