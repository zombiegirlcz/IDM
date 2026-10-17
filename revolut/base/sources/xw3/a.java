package xw3;

import a94.f;
import cuc.c;
import d34.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f309327a;

    public a(e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f309327a = repository;
    }

    public final Object a(String str, String str2, f fVar) throws Throwable {
        e eVar = this.f309327a;
        eVar.getClass();
        c cVar = new c(12, eVar, str2, str, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, cVar, fVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
