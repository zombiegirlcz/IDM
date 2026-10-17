package l2e;

import g2e.i;
import g2e.j;
import g2e.r;
import kotlin.jvm.internal.Intrinsics;
import t1e.u;
import vkm.d;
import w4l.k;
import x4l.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f191789a;

    public a(r storeBrandsRepository) {
        Intrinsics.checkNotNullParameter(storeBrandsRepository, "storeBrandsRepository");
        this.f191789a = storeBrandsRepository;
    }

    public final d a(u params, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        String id10 = params.f267271a;
        String str = params.f267272b;
        i params2 = new i(id10, null, str);
        r rVar = this.f191789a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(params2, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        String strZ = rVar.e.z();
        c cVar = rVar.f140025h;
        Intrinsics.checkNotNullParameter(id10, "id");
        return cVar.b(new i(id10, strZ, str), loadingStrategy);
    }

    public final d b(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVar = this.f191789a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rVar.f140024g.b(new j(rVar.e.z()), loadingStrategy);
    }
}
