package b4c;

import com.revolut.feature.revolut_shop.ui.screen.dashboard.IppShopDashboardScreen;
import ip0.qs;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IppShopDashboardScreen f12264w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(IppShopDashboardScreen ippShopDashboardScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12264w = ippShopDashboardScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f12264w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f12264w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f12264w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            default:
                e eVar4 = new e(this.f12264w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((koi.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((qs) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IppShopDashboardScreen ippShopDashboardScreen = this.f12264w;
        switch (i) {
            case 0:
                koi.j jVar = (koi.j) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = ippShopDashboardScreen.e3();
                String listId = jVar.getF53563a();
                u uVar = (u) nVarE3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                uVar.f12283r.b3(listId);
                break;
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = ippShopDashboardScreen.e3();
                Intrinsics.h(str);
                ((u) nVarE32).J2(str);
                break;
            case 2:
                qs qsVar = (qs) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE33 = ippShopDashboardScreen.e3();
                u uVar2 = (u) nVarE33;
                uVar2.I2(qsVar.i, qsVar.f166042a);
                break;
            default:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE34 = ippShopDashboardScreen.e3();
                String listId2 = aVar4.f275445a;
                Object obj3 = aVar4.d;
                u uVar3 = (u) nVarE34;
                uVar3.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                uVar3.f12283r.Z2(obj3, listId2);
                break;
        }
        return Unit.f186387a;
    }
}
