package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mjf.l0 f185452c;
    public final Lazy d;

    public b3(CoroutineScope coroutineScope, h0 commonDataSource, mjf.l0 warrantInteractor) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(warrantInteractor, "warrantInteractor");
        this.f185450a = coroutineScope;
        this.f185451b = commonDataSource;
        this.f185452c = warrantInteractor;
        this.d = yhm.j.b(new k98.a(this, 24));
    }
}
