package olf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import m35.q;

/* JADX INFO: loaded from: classes8.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jt0.b f226397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f226398b;

    public n(jt0.b commonHeaderProvider, h0 commonDataSource, q loanTransactionCategoryIconMapper) {
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(loanTransactionCategoryIconMapper, "loanTransactionCategoryIconMapper");
        this.f226397a = commonHeaderProvider;
        this.f226398b = commonDataSource;
    }

    public n(jt0.b commonHeaderProvider, h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f226397a = commonHeaderProvider;
        this.f226398b = commonDataSource;
    }
}
