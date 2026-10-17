package akl;

import com.revolut.sso.impl.network.services.AppConsentService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg.o f5994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bjl.p0 f5995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppConsentService f5996c;
    public final lkl.b d;

    public c(kg.o gson, bjl.p0 revolutSsoDependenciesProvider, AppConsentService service, lkl.b ssoServerErrorParser) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(ssoServerErrorParser, "ssoServerErrorParser");
        this.f5994a = gson;
        this.f5995b = revolutSsoDependenciesProvider;
        this.f5996c = service;
        this.d = ssoServerErrorParser;
    }
}
