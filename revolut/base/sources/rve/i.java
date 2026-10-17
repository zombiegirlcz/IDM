package rve;

import com.revolut.domain.models.topup.TopUpContext;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import xg6.j;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe6.a f257770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gve.b f257771b;

    public i(oe6.a externalInstitutionsInteractor, gve.b storedMethodRepository) {
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(storedMethodRepository, "storedMethodRepository");
        this.f257770a = externalInstitutionsInteractor;
        this.f257771b = storedMethodRepository;
    }

    public final Object a(dj0.d dVar, String str, String str2, TopUpContext topUpContext, gim.c cVar) throws Throwable {
        if (str2 != null) {
            ((j) this.f257770a).m(str2);
        }
        gve.b bVar = this.f257771b;
        bVar.getClass();
        gve.a aVar = new gve.a(bVar, str, dVar, topUpContext, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, aVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
