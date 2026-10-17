package vw1;

import com.revolut.feature.apm.core.models.alias.Alias;
import elm.f;
import gim.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import uy1.j;
import vkm.d;
import zz1.i;

/* JADX INFO: loaded from: classes20.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f292611a;

    static Object a(b bVar, i iVar, c cVar) {
        wj0.b bVar2 = new wj0.b("IDEMPOTENCY_TAG_REGISTER_ALIAS");
        j jVar = (j) bVar;
        jVar.getClass();
        uvf.b bVar3 = new uvf.b(jVar, iVar, bVar2, (Continuation) null, 2);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, bVar3, cVar);
    }

    static Object b(b bVar, Alias alias, c cVar) {
        j jVar = (j) bVar;
        jVar.getClass();
        Continuation continuation = null;
        uvf.b bVar2 = new uvf.b(jVar, alias, continuation, continuation, 1);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, bVar2, cVar);
    }

    static d c(b bVar) {
        j jVar = (j) bVar;
        jVar.getClass();
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return jVar.f284046g.b(Unit.f186387a, loadingStrategy);
    }
}
