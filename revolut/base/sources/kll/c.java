package kll;

import akl.i0;
import akl.z;
import bjl.p0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends fsi.c implements wil.a {

    @NotNull
    public static final b Companion = new b();
    public static final fsi.b k = new fsi.b("ID_REVOLUT_SSO_ON_CLIENT_LAUNCHED_ACTIVITY_DELEGATE");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p0 f185652h;
    public final i0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f185653j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p0 revolutSsoDependenciesProvider, i0 pendingAuthenticationRepository, z configurationRepository) {
        super(k);
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(pendingAuthenticationRepository, "pendingAuthenticationRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        this.f185652h = revolutSsoDependenciesProvider;
        this.i = pendingAuthenticationRepository;
        this.f185653j = configurationRepository;
    }
}
