package et6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.g f129234a;

    public h(au6.g freelancerAccountSelectionRepository) {
        Intrinsics.checkNotNullParameter(freelancerAccountSelectionRepository, "freelancerAccountSelectionRepository");
        this.f129234a = freelancerAccountSelectionRepository;
    }

    public final Object a(lr6.i iVar, Continuation continuation) throws Throwable {
        au6.k kVar = (au6.k) this.f129234a;
        kVar.getClass();
        au6.j jVar = new au6.j(iVar, kVar, null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, jVar, continuation);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
