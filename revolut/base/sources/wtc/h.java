package wtc;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cuc.d f299872a;

    public h(cuc.d linkedWalletsRepository) {
        Intrinsics.checkNotNullParameter(linkedWalletsRepository, "linkedWalletsRepository");
        this.f299872a = linkedWalletsRepository;
    }

    public final Object a(gim.i iVar) throws Throwable {
        cuc.d dVar = this.f299872a;
        dVar.getClass();
        cq6.k kVar = new cq6.k(dVar, null, 3);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, kVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
