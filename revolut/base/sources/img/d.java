package img;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.user.checklist.impl.data.service.AdoptionJourneyService;
import i69.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import w4l.k;
import wim.z;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements mmg.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdoptionJourneyService f162445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f162446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f162447c;
    public final x4l.c d;

    public d(AdoptionJourneyService service, ue0.c storage, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f162445a = service;
        this.f162446b = storage;
        this.f162447c = memoryCache;
        Continuation continuation = null;
        this.d = new x4l.c(new e6d.f(this, continuation, 25), new ii4.b(this, 9), new p(this, 27), new iaf.d(this, continuation, 13), new hwi.b(this, continuation, 10));
    }

    @Override // mmg.a
    public final Object a(String str, qmg.j jVar) throws Throwable {
        ikf.g gVar = new ikf.g(this, str, null, 3);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, gVar, jVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // mmg.a
    public final void b(cmg.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f162446b.G(state, "ADOPTION_JOURNEY_VISIBILITY_STATE_KEY", z.d(o0.b(cmg.a.class)));
    }

    @Override // mmg.a
    public final Object c(gim.c cVar) {
        ikf.g gVar = new ikf.g(this, (Continuation) null, 2);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, gVar, cVar);
    }

    @Override // mmg.a
    public final Flow d() {
        return t1.E(new a44.c(ue0.e.R(this.f162446b, "ADOPTION_JOURNEY_VISIBILITY_STATE_KEY", z.d(o0.b(cmg.a.class))), 3));
    }

    @Override // mmg.a
    public final vkm.d e(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.d.b(Unit.f186387a, loadingStrategy);
    }
}
