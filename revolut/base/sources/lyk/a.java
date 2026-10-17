package lyk;

import elm.f;
import gim.i;
import hsd.c;
import hyk.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f200849a;

    public a(h repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f200849a = repository;
    }

    public final Object a(pxk.a aVar, i iVar) throws Throwable {
        h hVar = this.f200849a;
        hVar.getClass();
        c cVar = new c(hVar, aVar, (Continuation) null, 7);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, cVar, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
