package wsg;

import aqd.h1;
import atg.t;
import atg.v;
import efm.d0;
import efm.r;
import ip0.v7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f299722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f299723c;

    public /* synthetic */ g(n nVar, String str, int i) {
        this.f299721a = i;
        this.f299722b = nVar;
        this.f299723c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f299721a) {
            case 0:
                String registeredIdentityId = (String) obj2;
                Intrinsics.checkNotNullParameter(registeredIdentityId, "it");
                v vVar = (v) this.f299722b.f299736b;
                String walletId = this.f299723c;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                r map = vVar.k(registeredIdentityId, loadingStrategy).map(new a08.r(5, new t(walletId, walletId, 2)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 1:
                List sortedPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(sortedPockets, "sortedPockets");
                return this.f299722b.e.c(dz5.b.EXTERNAL_POCKETS, n.H(this.f299723c, sortedPockets));
            case 2:
                List sortedPockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(sortedPockets2, "sortedPockets");
                return this.f299722b.e.c(dz5.b.CRYPTO_POCKETS, n.H(this.f299723c, sortedPockets2));
            case 3:
                List sortedPockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(sortedPockets3, "sortedPockets");
                return this.f299722b.e.c(dz5.b.EXTERNAL_POCKETS, n.G(this.f299723c, sortedPockets3));
            case 4:
                List sortedPockets4 = (List) obj2;
                Intrinsics.checkNotNullParameter(sortedPockets4, "sortedPockets");
                return this.f299722b.e.c(dz5.b.CRYPTO_POCKETS, n.G(this.f299723c, sortedPockets4));
            default:
                String walletId2 = (String) obj2;
                Intrinsics.checkNotNullParameter(walletId2, "it");
                v vVar2 = (v) this.f299722b.f299736b;
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                String registeredIdentityId2 = this.f299723c;
                Intrinsics.checkNotNullParameter(registeredIdentityId2, "registeredIdentityId");
                w4l.f fVar = vVar2.f9082j;
                ar0.b bVar = new ar0.b(19);
                a31.m mVar = new a31.m(vVar2, 23, registeredIdentityId2, walletId2);
                d0 d0VarFirstOrError = m70.a.e(fVar.f(registeredIdentityId2, true), new h1(bVar, 8), new h1(10)).firstOrError();
                int i = 3;
                atg.n nVar = new atg.n(i, new a08.e(1, mVar, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, 23));
                d0VarFirstOrError.getClass();
                pfm.h hVarX = v7.x(new ufm.f(d0VarFirstOrError, nVar, 3), "ignoreElement(...)");
                atg.h hVar = (atg.h) vVar2.e;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(walletId2, "walletId");
                pfm.a aVarE = new pfm.h(new a08.l(hVar, walletId2, 6), 2).e(hVar.f.g(Unit.f186387a, true));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                pfm.a aVarE2 = hVarX.e(aVarE);
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return ue0.e.v(aVarE2);
        }
    }
}
