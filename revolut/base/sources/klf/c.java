package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ur2.c f185454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f185455c;
    public final h0 d;
    public final Lazy e;

    public c(CoroutineScope coroutineScope, ur2.c blockedMerchantsInteractor, m1 juniorDataSource, h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f185453a = coroutineScope;
        this.f185454b = blockedMerchantsInteractor;
        this.f185455c = juniorDataSource;
        this.d = commonDataSource;
        this.e = yhm.j.b(new k98.a(this, 11));
    }
}
