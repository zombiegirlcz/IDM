package fg8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f134965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f134966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq.a f134967c;
    public final q78.e d;

    public m0(sri.m navigator, hj8.a juniorProfileInteractor, zq.a juniorRemoteLoginInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorRemoteLoginInteractor, "juniorRemoteLoginInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f134965a = navigator;
        this.f134966b = juniorProfileInteractor;
        this.f134967c = juniorRemoteLoginInteractor;
        this.d = juniorAccountDestinationResolver;
    }
}
