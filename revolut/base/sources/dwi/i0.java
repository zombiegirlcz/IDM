package dwi;

import hwi.x0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements qvi.d {

    @NotNull
    private static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f120428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f120429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pre.c f120430c;

    public i0(x0 userCapabilitiesRepository, ang.f userInteractor, pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(userCapabilitiesRepository, "userCapabilitiesRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f120428a = userCapabilitiesRepository;
        this.f120429b = userInteractor;
        this.f120430c = termsInteractor;
    }

    public final efm.r a() {
        efm.r rVarSwitchMap = rd0.e.c(x0.a(this.f120428a), kotlin.coroutines.g.f186406a).distinctUntilChanged().switchMap(new dv5.n(new f0(this, 0), 14));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
