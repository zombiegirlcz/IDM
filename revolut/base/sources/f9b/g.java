package f9b;

import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes13.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g81.a f132904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f132905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f132906c;
    public final b80.c d;
    public final sf0.h e;
    public final v60.e f;

    public g(g81.a commonErrorHandler, gte.a featureToggleInteractor, m navigator, b80.c networkStateRepository, sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(commonErrorHandler, "commonErrorHandler");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f132904a = commonErrorHandler;
        this.f132905b = featureToggleInteractor;
        this.f132906c = navigator;
        this.d = networkStateRepository;
        this.e = serverErrorParser;
        this.f = serverErrorsProvider;
    }
}
