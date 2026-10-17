package pz1;

import elm.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import qd8.e;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements ax1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qz1.c f240865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vv9.c f240866b;

    public c(qz1.c repository, vv9.c mrInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(mrInteractor, "mrInteractor");
        this.f240865a = repository;
        this.f240866b = mrInteractor;
    }

    public final Object a(String str, gim.c cVar) throws Throwable {
        qz1.c cVar2 = this.f240865a;
        cVar2.getClass();
        e eVar = new e(cVar2, str, (Continuation) null, 17);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, eVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object b(String str, gim.c cVar) {
        qz1.c cVar2 = this.f240865a;
        cVar2.getClass();
        qz1.b bVar = new qz1.b(cVar2, str, null);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, bVar, cVar);
    }
}
