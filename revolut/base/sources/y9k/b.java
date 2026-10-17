package y9k;

import efm.d0;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import ue0.e;
import ufm.i;
import y25.c;
import y99.x;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements aa5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x9k.a f311868a;

    public b(x9k.a authInteractor) {
        Intrinsics.checkNotNullParameter(authInteractor, "authInteractor");
        this.f311868a = authInteractor;
    }

    public final i a() {
        r rVarA = ((dak.b) this.f311868a.f303746a).a();
        od0.i.Companion.getClass();
        d0 d0VarFirstOrError = e.E(rVarA, od0.i.f224256b).firstOrError();
        c cVar = new c(new x(4), 26);
        d0VarFirstOrError.getClass();
        i iVar = new i(new i(d0VarFirstOrError, cVar, 1), new c(new x(5), 27), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
