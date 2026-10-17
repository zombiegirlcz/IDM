package dfj;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 {

    @NotNull
    public static final h0 Companion = new h0();
    public static final j0 f = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f114013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm0.d f114014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oej.a f114015c;
    public final v2 d;
    public final Lazy e;

    public k0(ang.f userInteractor, dm0.d deviceIdProvider, oej.a esimCoreInteractor, v2 esimProfilesInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(esimCoreInteractor, "esimCoreInteractor");
        Intrinsics.checkNotNullParameter(esimProfilesInteractor, "esimProfilesInteractor");
        this.f114013a = userInteractor;
        this.f114014b = deviceIdProvider;
        this.f114015c = esimCoreInteractor;
        this.d = esimProfilesInteractor;
        this.e = yhm.j.b(new d8e.a(this, 1));
    }

    public final Object a(gim.c cVar) {
        return vkm.q.x(rd0.e.e(mo3.a.g(d(w4l.h.f294642c), null, new dee.a0(4), 1), zhm.h0.f322473a, new a82.q(3, 9, null)), cVar);
    }

    public final vkm.y b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return rd0.e.e(hb9.b.x(nim.a.u(new c5a.m0(this, continuation, 24), zh9.u0.m(this.d.g(loadingStrategy), this.f114013a.j(w4l.j.f294644c))), zhm.f0.f322471a), zhm.h0.f322473a, new c9k.k(3, 13, continuation));
    }

    public final Flow d(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(hb9.b.x(zi0.c.w(nim.a.u(new d4f.m(2, 2, null), b(loadingStrategy))), zhm.f0.f322471a));
    }

    public final Object e(Continuation continuation) {
        x4l.c cVar = ((nfj.m1) this.d.f114130a).e;
        Unit unit = Unit.f186387a;
        Object objD = cVar.d(unit, true, continuation);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = unit;
        }
        if (objD != aVar) {
            objD = unit;
        }
        return objD == aVar ? objD : unit;
    }
}
