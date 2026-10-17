package klf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f185550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whf.b f185551b;

    public p(h0 commonDataSource, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f185550a = commonDataSource;
        this.f185551b = transactionsContentProvider;
    }
}
