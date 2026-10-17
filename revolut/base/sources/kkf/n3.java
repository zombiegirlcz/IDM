package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.p1 f184840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final klf.o1 f184841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c45.b f184842c;

    public n3(klf.p1 loanSepaAccountDataSource, klf.o1 loanExternalAccountDataSource, c45.b sepaAccountMapper) {
        Intrinsics.checkNotNullParameter(loanSepaAccountDataSource, "loanSepaAccountDataSource");
        Intrinsics.checkNotNullParameter(loanExternalAccountDataSource, "loanExternalAccountDataSource");
        Intrinsics.checkNotNullParameter(sepaAccountMapper, "sepaAccountMapper");
        this.f184840a = loanSepaAccountDataSource;
        this.f184841b = loanExternalAccountDataSource;
        this.f184842c = sepaAccountMapper;
    }
}
