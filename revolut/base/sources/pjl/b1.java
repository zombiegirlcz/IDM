package pjl;

import akl.f1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final akl.o0 f236794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bjl.p0 f236795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f236796c;

    public b1(akl.o0 accountUserInfoRepository, bjl.p0 dependenciesProvider, f1 sessionTokenRepository) {
        Intrinsics.checkNotNullParameter(accountUserInfoRepository, "accountUserInfoRepository");
        Intrinsics.checkNotNullParameter(dependenciesProvider, "dependenciesProvider");
        Intrinsics.checkNotNullParameter(sessionTokenRepository, "sessionTokenRepository");
        this.f236794a = accountUserInfoRepository;
        this.f236795b = dependenciesProvider;
        this.f236796c = sessionTokenRepository;
    }
}
