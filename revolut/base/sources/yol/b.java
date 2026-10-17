package yol;

import kotlin.jvm.internal.Intrinsics;
import xjl.i;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f315701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nkl.b f315702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rql.a f315703c;

    public b(i revolutSsoFlowConfigurationInteractor, nkl.b revolutSsoFlowsFactory, rql.a ssoReauthenticationRepository) {
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        Intrinsics.checkNotNullParameter(ssoReauthenticationRepository, "ssoReauthenticationRepository");
        this.f315701a = revolutSsoFlowConfigurationInteractor;
        this.f315702b = revolutSsoFlowsFactory;
        this.f315703c = ssoReauthenticationRepository;
    }
}
