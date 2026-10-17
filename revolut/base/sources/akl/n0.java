package akl;

import com.revolut.sso.impl.network.services.QrSignInService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg.o f6056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QrSignInService f6057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bjl.p0 f6058c;
    public final lkl.b d;

    public n0(kg.o gson, QrSignInService qrSignInService, bjl.p0 revolutSsoDependenciesProvider, lkl.b ssoServerErrorParser) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(qrSignInService, "qrSignInService");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        Intrinsics.checkNotNullParameter(ssoServerErrorParser, "ssoServerErrorParser");
        this.f6056a = gson;
        this.f6057b = qrSignInService;
        this.f6058c = revolutSsoDependenciesProvider;
        this.d = ssoServerErrorParser;
    }
}
