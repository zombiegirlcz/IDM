package w0i;

import e7l.g;
import efm.d0;
import ik3.c;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;
import vv7.l;
import vz1.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f293762a;

    public a(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f293762a = configurationInteractor;
    }

    public final i a() {
        d0 d0VarFirstOrError = m70.a.g(((c) this.f293762a).k(g.b.f123407a), null, new l(21), 1).firstOrError();
        vz4.c cVar = new vz4.c(new h(this), 5);
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, cVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
