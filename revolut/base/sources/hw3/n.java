package hw3;

import ft3.j1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p24.v f156081a;

    public n(p24.v repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f156081a = repository;
    }

    public static Object a(n nVar, j1 productType, gim.i iVar) {
        p24.v vVar = nVar.f156081a;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(productType, "productType");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.x(mo3.a.g(new a6e.b(rd0.e.n(vVar.e.b(new p24.x(productType), loadingStrategy), zhm.h0.f322473a), 7), null, new ht1.l(22), 1), iVar);
    }

    public final Object b(j1 j1Var, gim.c cVar) {
        p24.v vVar = this.f156081a;
        vVar.getClass();
        oqk.i iVar = new oqk.i(vVar, j1Var, (Continuation) null, 5);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, iVar, cVar);
    }
}
