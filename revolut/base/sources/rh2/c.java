package rh2;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rea.j;
import s2i.i;
import tx0.o1;
import xo9.h;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements gh2.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f254301a;

    public c(uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f254301a = apmFeatureChecker;
    }

    @Override // xo9.i
    public final d0 a(h parsingResult) {
        Intrinsics.checkNotNullParameter(parsingResult, "parsingResult");
        ufm.c cVar = new ufm.c(new d62.b(parsingResult, 2), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    @Override // xo9.i
    public final d0 b(xq2.a code) {
        Intrinsics.checkNotNullParameter(code, "code");
        ty1.b bVar = (ty1.b) this.f254301a;
        ufm.c cVar = new ufm.c(new i(bVar, 4), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        ufm.i iVar = new ufm.i(cVar, new o1(new ty1.a(bVar, 3), 26), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(iVar, new j(new d62.a(this, code, 2), 11), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
