package xjl;

import akl.i0;
import akl.z;
import bjl.p0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f306574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f306575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f306576c;

    public n(p0 revolutSsoDependenciesProvider, i0 pendingAuthenticationRepository, z configurationRepository) {
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(pendingAuthenticationRepository, "pendingAuthenticationRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f306574a = revolutSsoDependenciesProvider;
        this.f306575b = pendingAuthenticationRepository;
        this.f306576c = configurationRepository;
    }
}
