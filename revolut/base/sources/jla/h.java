package jla;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements bla.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fla.g f175663a;

    public h(fla.g repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f175663a = repository;
    }

    public final bla.c d(String code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        fla.g gVar = this.f175663a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(code, "code");
        f fVar = (f) gVar.f135927c.get("PRODUCT_CATALOGUE_CACHE_KEY");
        c cVarC = fVar != null ? gVar.c(fVar, code, str) : null;
        bla.c cVar = cVarC != null ? cVarC.f175656a : null;
        return cVar == null ? bla.c.NOT_AVAILABLE : cVar;
    }
}
