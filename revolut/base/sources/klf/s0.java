package klf;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 {

    @NotNull
    private static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f185569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f185570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.b f185571c;
    public final Lazy d;

    public s0(CoroutineScope coroutineScope, h0 commonDataSource, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f185569a = coroutineScope;
        this.f185570b = commonDataSource;
        this.f185571c = transactionsContentProvider;
        this.d = yhm.j.b(new k98.a(this, 14));
    }
}
