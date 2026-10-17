package yw3;

import e34.b;
import e34.c;
import elm.f;
import gim.i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f317314a;

    public a(c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f317314a = repository;
    }

    public final Object a(String str, i iVar) throws Throwable {
        c cVar = this.f317314a;
        cVar.getClass();
        b bVar = new b(cVar, str, null, 2);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, bVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
