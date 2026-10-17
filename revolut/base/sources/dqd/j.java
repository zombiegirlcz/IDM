package dqd;

import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xld.b f116945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rqd.h f116946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f116947c;

    public j(xld.b incomeSorterDestinationsInteractor, rqd.h ratesProvider) {
        Intrinsics.checkNotNullParameter(incomeSorterDestinationsInteractor, "incomeSorterDestinationsInteractor");
        Intrinsics.checkNotNullParameter(ratesProvider, "ratesProvider");
        this.f116945a = incomeSorterDestinationsInteractor;
        this.f116946b = ratesProvider;
        this.f116947c = vkm.q.c(f0.f322471a);
    }
}
