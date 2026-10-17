package img;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.user.checklist.impl.data.service.UserChecklistService;
import e31.i;
import fmg.n0;
import ghl.l;
import gmg.a0;
import i69.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import retrofit2.Response;
import skm.e0;
import skm.p0;
import w4l.k;
import wim.z;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements mmg.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserChecklistService f162449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f162450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hmg.b f162451c;
    public final j d;
    public final x4l.c e;

    public g(UserChecklistService service, ue0.c storage, hmg.b mapper, j memoryCache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f162449a = service;
        this.f162450b = storage;
        this.f162451c = mapper;
        this.d = memoryCache;
        this.e = new x4l.c(new l(this, null, 16), new ii4.b(this, 10), new p(this, 28), new i(2, 28, null), new eci.a(3, 21, null));
    }

    public static final n0 f(g gVar, Response response) {
        hmg.b bVar = gVar.f162451c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.code() == 200) {
            return bVar.a((a0) response.body());
        }
        if (response.code() == 204) {
            return bVar.a(null);
        }
        throw new HttpException(response);
    }

    @Override // mmg.a
    public final Object a(String str, qmg.j jVar) throws Throwable {
        hx7.e.n(new UnsupportedOperationException("Marking step as completed is not supported for user checklist"));
        return Unit.f186387a;
    }

    @Override // mmg.a
    public final void b(cmg.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f162450b.G(state, "USER_CHECKLIST_VISIBILITY_STATE_KEY", z.d(o0.b(cmg.a.class)));
    }

    @Override // mmg.a
    public final Object c(gim.c cVar) {
        ikf.g gVar = new ikf.g(this, (Continuation) null, 4);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, gVar, cVar);
    }

    @Override // mmg.a
    public final Flow d() {
        return t1.E(new a44.c(ue0.e.R(this.f162450b, "USER_CHECKLIST_VISIBILITY_STATE_KEY", z.d(o0.b(cmg.a.class))), 4));
    }

    @Override // mmg.a
    public final vkm.d e(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.e.b(Unit.f186387a, loadingStrategy);
    }
}
