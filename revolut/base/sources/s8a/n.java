package s8a;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import n3j.w;
import n8a.f0;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f260965a;

    public n(f0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f260965a = repository;
    }

    public final Object a(List list, gim.i iVar) throws Throwable {
        f0 f0Var = this.f260965a;
        f0Var.getClass();
        w wVar = new w(f0Var, list, (Continuation) null, 13);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, wVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
