package no;

import com.revolut.tracking.v3.NudgeContext;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class r1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f217836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo.b f217837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo.q0 f217838c;
    public final uo.l d;
    public final gpk.c e;
    public final ef0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f217839g;

    public r1(d4m.a tracker, uo.b activeScreenHolder, uo.q0 screenNameFinder, uo.l productMapper, gpk.c coroutineScopeProvider, ef0.b currentTimeProvider) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f217836a = tracker;
        this.f217837b = activeScreenHolder;
        this.f217838c = screenNameFinder;
        this.d = productMapper;
        this.e = coroutineScopeProvider;
        this.f = currentTimeProvider;
        this.f217839g = new LinkedHashMap();
    }

    public static final NudgeContext.a a(r1 r1Var, txl.e eVar) {
        NudgeContext.a aVarNewBuilder = NudgeContext.newBuilder();
        lie.a aVar = (lie.a) eVar;
        String strB = aVar.b();
        aVarNewBuilder.c();
        ((NudgeContext) aVarNewBuilder.f49761b).setId(strB);
        String strA = aVar.c().a();
        aVarNewBuilder.c();
        ((NudgeContext) aVarNewBuilder.f49761b).setType(strA);
        Intrinsics.checkNotNullExpressionValue(aVarNewBuilder, "setType(...)");
        return aVarNewBuilder;
    }
}
