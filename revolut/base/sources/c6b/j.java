package c6b;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import y5b.e0;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f21766a;

    public j(e0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f21766a = repository;
    }

    public final Object a(gim.c cVar) throws Throwable {
        e0 e0Var = this.f21766a;
        e0Var.getClass();
        xb4.e eVar = new xb4.e(e0Var, null, 26);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, eVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final void b(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        e0 e0Var = this.f21766a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        z9h.n.l(String.class, e0Var.f311037b, "KEY_PROMO_CODE", code);
    }
}
