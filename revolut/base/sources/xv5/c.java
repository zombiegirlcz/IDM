package xv5;

import com.revolut.core.model.account.AccountId;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wsg.n;
import xo8.j0;
import xti.k;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f309205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f309206b;

    public c(n walletInteractor, g cryptoCommodityStorageInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityStorageInteractor, "cryptoCommodityStorageInteractor");
        this.f309205a = walletInteractor;
        this.f309206b = cryptoCommodityStorageInteractor;
    }

    public static r b(c cVar) {
        cVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return m70.a.g(cVar.a(), null, new k(4), 1);
    }

    public final r a() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        g gVar = this.f309206b;
        mk0.a aVar = gVar.f309211b;
        String id10 = gVar.f309212c.a();
        Intrinsics.checkNotNullParameter(id10, "id");
        r map = w.l(m70.a.f(pw5.a.z(aVar, new tk0.d(id10)), new j0(gVar, 6), new k(5), new k(6)), this.f309205a.J(AccountId.Personal.f51414a, loadingStrategy)).map(new xt1.a(14, new xub.e(this, 7)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}
