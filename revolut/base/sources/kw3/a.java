package kw3;

import ft3.j1;
import it3.k;
import kotlin.jvm.internal.Intrinsics;
import o24.e;
import vkm.d;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f190209a;

    public a(e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f190209a = repository;
    }

    public final d a(j1 productType, k kVar, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        e eVar = this.f190209a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return eVar.e.b(new o24.a(productType, ((wr3.b) eVar.d).a(productType) ? o24.b.V3 : o24.b.V2, kVar), loadingStrategy);
    }
}
