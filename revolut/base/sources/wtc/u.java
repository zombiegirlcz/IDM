package wtc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cuc.t f299909a;

    public u(cuc.t securityHubChecklistRepository) {
        Intrinsics.checkNotNullParameter(securityHubChecklistRepository, "securityHubChecklistRepository");
        this.f299909a = securityHubChecklistRepository;
    }

    public final Object a(qtc.e eVar, gim.i iVar) throws Throwable {
        cuc.t tVar = this.f299909a;
        tVar.getClass();
        cn0.d dVar = new cn0.d(tVar, eVar, (Continuation) null, 10);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, dVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
