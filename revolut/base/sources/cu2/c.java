package cu2;

import af3.f;
import cq6.k;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f108800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f108801b;

    public c(ue0.c storage, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f108800a = storage;
        this.f108801b = q.c(Boolean.FALSE);
        e0.C(coroutineScope, null, null, new k(this, null, 2), 3);
    }

    public final Object a(boolean z, i iVar) throws Throwable {
        f fVar = new f(this, z, (Continuation) null, 7);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, fVar, iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
