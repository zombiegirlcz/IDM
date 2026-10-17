package ow3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements eq3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f230304a;

    public h(hz3.c applicationCommandsFactory, e creditApplicationCancellationInteractor, g creditApplicationCloseDescriptionProvider) {
        Intrinsics.checkNotNullParameter(applicationCommandsFactory, "applicationCommandsFactory");
        Intrinsics.checkNotNullParameter(creditApplicationCancellationInteractor, "creditApplicationCancellationInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCloseDescriptionProvider, "creditApplicationCloseDescriptionProvider");
        this.f230304a = creditApplicationCloseDescriptionProvider;
    }
}
