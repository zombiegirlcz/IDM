package m9j;

import com.revolut.data.model.Data;
import com.revolut.feature.staking.api.model.StakingProduct;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m9d.l0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a f203815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f203816c;

    public /* synthetic */ m(com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar, xi0.b bVar, int i) {
        this.f203814a = i;
        this.f203815b = aVar;
        this.f203816c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f203814a) {
            case 0:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar = this.f203815b;
                r8j.d dVar = aVar.f100012r;
                xi0.b bVar = this.f203816c;
                efm.r rVarR = pd.b.r(r8j.d.a(dVar, bVar), new m(aVar, baseCurrency, 2));
                efm.r rVarZ = nim.a.z(nim.a.w(gt5.a.a(aVar.f100010p, baseCurrency, false, 6), new i5f.g(24, bVar)), new l0(14));
                efm.r rVarZ2 = nim.a.z(nim.a.w(nim.a.w(aVar.o.e(v1.c.w(bVar, baseCurrency), n9l.b.SEC_3), new l0(19)), new l0(20)), new l0(21));
                yud.g gVar = aVar.f100014t;
                xi0.a aVar2 = xi0.b.Companion;
                String str = aVar.B.f99997a.f163147c;
                aVar2.getClass();
                efm.r rVarSwitchMap = rd0.e.c(gVar.d(xi0.a.a(str), w4l.h.f294642c), kotlin.coroutines.g.f186406a).switchMap(new m78.e(new m(aVar, baseCurrency, 1), 2));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return mif.a.f(rVarR, rVarZ, rVarZ2, rVarSwitchMap);
            case 1:
                Data productData = (Data) obj2;
                Intrinsics.checkNotNullParameter(productData, "productData");
                StakingProduct stakingProduct = (StakingProduct) productData.getContent();
                if (stakingProduct == null || !stakingProduct.b()) {
                    od0.i.Companion.getClass();
                    return zi0.c.j(od0.i.f224256b);
                }
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar3 = this.f203815b;
                return nim.a.z(nim.a.w(rd0.e.c(aVar3.f100014t.a(aVar3.B.f99997a.f163145a, this.f203816c, w4l.h.f294642c), kotlin.coroutines.g.f186406a), new l0(16)), new l0(17));
            default:
                io3.d dVar2 = (io3.d) obj2;
                com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.a aVar4 = this.f203815b;
                jul.o oVar = aVar4.f100011q;
                if (dVar2 == null) {
                    dVar2 = aVar4.B.f99997a;
                }
                return oVar.m(dVar2, this.f203816c);
        }
    }
}
