package et6;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.n1 f129309a;

    public q1(au6.n1 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f129309a = repository;
    }

    public final Object a(tr6.a aVar, Continuation continuation) throws Throwable {
        au6.n1 n1Var = this.f129309a;
        n1Var.getClass();
        ap7.k kVar = new ap7.k(n1Var, aVar, null, 14);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, kVar, continuation);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    public final Object b(gim.i iVar) throws Throwable {
        au6.n1 n1Var = this.f129309a;
        n1Var.getClass();
        au6.m1 m1Var = new au6.m1(n1Var, null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, m1Var, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
