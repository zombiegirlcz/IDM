package mti;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pti.e f208863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f208864b;

    public n(pti.e airportsRepository, a airportsInteractor) {
        Intrinsics.checkNotNullParameter(airportsRepository, "airportsRepository");
        Intrinsics.checkNotNullParameter(airportsInteractor, "airportsInteractor");
        this.f208863a = airportsRepository;
        this.f208864b = airportsInteractor;
    }

    public static vkm.d a(n nVar, String terminalId) {
        nVar.getClass();
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        pti.e eVar = nVar.f208863a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return eVar.e.b(terminalId, loadingStrategy);
    }
}
