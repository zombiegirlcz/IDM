package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.p1 f184881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.o1 f184882b;

    public p3(klf.p1 loanSepaAccountDataSource, klf.o1 loanExternalAccountDataSource) {
        Intrinsics.checkNotNullParameter(loanSepaAccountDataSource, "loanSepaAccountDataSource");
        Intrinsics.checkNotNullParameter(loanExternalAccountDataSource, "loanExternalAccountDataSource");
        this.f184881a = loanSepaAccountDataSource;
        this.f184882b = loanExternalAccountDataSource;
    }
}
