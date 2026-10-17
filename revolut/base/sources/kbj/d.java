package kbj;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import ue0.e;
import ufm.i;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd5.c f182619a;

    public d(sd5.c configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f182619a = configurationInteractor;
    }

    public final z a() {
        d0 d0VarFirstOrError = zi0.c.J(this.f182619a.a(false)).firstOrError();
        k64.a aVar = new k64.a(25, new k9h.d(19));
        d0VarFirstOrError.getClass();
        i iVar = new i(d0VarFirstOrError, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return e.F(iVar, f0.f322471a);
    }
}
