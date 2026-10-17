package fjd;

import com.revolut.data.model.Data;
import com.revolut.feature.shops.api.model.ShopsCategory;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$UpgradePlanRequest;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.home.a f135600w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.shops.impl.ui.home.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135600w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f135600w, continuation, 0);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(this.f135600w, continuation, 1);
                xVar2.v = obj2;
                return xVar2;
            case 2:
                x xVar3 = new x(this.f135600w, continuation, 2);
                xVar3.v = obj2;
                return xVar3;
            case 3:
                x xVar4 = new x(this.f135600w, continuation, 3);
                xVar4.v = obj2;
                return xVar4;
            case 4:
                x xVar5 = new x(this.f135600w, continuation, 4);
                xVar5.v = obj2;
                return xVar5;
            case 5:
                x xVar6 = new x(this.f135600w, continuation, 5);
                xVar6.v = obj2;
                return xVar6;
            case 6:
                x xVar7 = new x(this.f135600w, continuation, 6);
                xVar7.v = obj2;
                return xVar7;
            case 7:
                x xVar8 = new x(this.f135600w, continuation, 7);
                xVar8.v = obj2;
                return xVar8;
            case 8:
                x xVar9 = new x(this.f135600w, continuation, 8);
                xVar9.v = obj2;
                return xVar9;
            default:
                x xVar10 = new x(this.f135600w, continuation, 9);
                xVar10.v = obj2;
                return xVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((x) create((wid.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((x) create((fha.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((x) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ShopsCategory shopsCategory;
        String str;
        mid.n nVar;
        Object next;
        int i = this.u;
        int i2 = 18;
        Object[] objArr = 0;
        int i3 = 19;
        int i5 = 1;
        com.revolut.feature.shops.impl.ui.home.a aVar = this.f135600w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new f9a.i(data, 18));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new f9a.i(data2, 19));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new f9a.i(data3, 20));
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new f9a.i(data4, 21));
                break;
            case 4:
                wid.a aVar6 = (wid.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = aVar.Q;
                aVar.H2(yVar, new z(aVar6, 0));
                if (aVar6.f297881b && (shopsCategory = ((o) ((j2) yVar.f22677a).getValue()).f135583g) != null && (str = shopsCategory.f87040a) != null) {
                    com.revolut.feature.shops.impl.ui.home.a.K2(aVar, str, true, 4);
                }
                break;
            case 5:
                Data data5 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data5);
                ShopsCategory shopsCategory2 = (ShopsCategory) iii.c.f(data5, new blh.y(i2), new bk6.n(i3), new ec8.q(aVar, 27));
                aVar.H2(aVar.Q, new eed.i(data5, i3, aVar, shopsCategory2));
                if (shopsCategory2 != null) {
                    aVar.O2(shopsCategory2.f87040a, false);
                }
                break;
            case 6:
                Data data6 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                mid.m mVar = (mid.m) data6.getContent();
                if (mVar != null) {
                    Iterator it8 = mVar.f205726a.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            mid.n nVar2 = (mid.n) next;
                            if (data6.getLoading() || !Intrinsics.f(nVar2.f205730b, "DISCOVER_MORE")) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    nVar = (mid.n) next;
                } else {
                    nVar = null;
                }
                if (nVar != null) {
                    String str2 = nVar.f205729a;
                    jid.d dVar = aVar.A;
                    if (!Intrinsics.f(dVar.f174432c, str2)) {
                        dVar.f174431b = j6.a.h("create(...)");
                        dVar.f174432c = null;
                        a2 a2Var = aVar.M;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        aVar.M = aVar.n2(new f0(aVar, str2, objArr == true ? 1 : 0, i5), new whi.b(6));
                    }
                }
                break;
            case 7:
                fha.a aVar10 = (fha.a) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar2 = aVar.Q;
                ShopsCombinedHomeScreenContract$UpgradePlanRequest shopsCombinedHomeScreenContract$UpgradePlanRequest = ((o) ((j2) yVar2.f22677a).getValue()).k;
                ShopsCategory shopsCategory3 = ((o) ((j2) yVar2.f22677a).getValue()).f135583g;
                String str3 = shopsCategory3 != null ? shopsCategory3.f87040a : null;
                if (shopsCombinedHomeScreenContract$UpgradePlanRequest != null && str3 != null && shopsCombinedHomeScreenContract$UpgradePlanRequest.f87194c.compareTo(hha.s.f(aVar10.f135191b)) >= 0) {
                    aVar.H2(yVar2, new fj5.e(8));
                    aVar.P2(shopsCombinedHomeScreenContract$UpgradePlanRequest.f87192a, shopsCombinedHomeScreenContract$UpgradePlanRequest.f87193b);
                    com.revolut.feature.shops.impl.ui.home.a.K2(aVar, str3, true, 4);
                }
                break;
            case 8:
                Data data7 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new f9a.i(data7, 23));
                break;
            default:
                lk0.g gVar = (lk0.g) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.Q, new a3e.s(gVar, 2));
                break;
        }
        return Unit.f186387a;
    }
}
