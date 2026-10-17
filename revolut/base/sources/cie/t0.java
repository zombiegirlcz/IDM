package cie;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.data.model.Data;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.tab.accounts.api.model.AccountContent;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24521w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i, com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f24521w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                t0 t0Var = new t0(0, this.f24521w, continuation);
                t0Var.v = obj2;
                return t0Var;
            case 1:
                t0 t0Var2 = new t0(1, this.f24521w, continuation);
                t0Var2.v = obj2;
                return t0Var2;
            case 2:
                t0 t0Var3 = new t0(2, this.f24521w, continuation);
                t0Var3.v = obj2;
                return t0Var3;
            case 3:
                t0 t0Var4 = new t0(3, this.f24521w, continuation);
                t0Var4.v = obj2;
                return t0Var4;
            case 4:
                t0 t0Var5 = new t0(4, this.f24521w, continuation);
                t0Var5.v = obj2;
                return t0Var5;
            case 5:
                t0 t0Var6 = new t0(5, this.f24521w, continuation);
                t0Var6.v = obj2;
                return t0Var6;
            case 6:
                t0 t0Var7 = new t0(6, this.f24521w, continuation);
                t0Var7.v = obj2;
                return t0Var7;
            case 7:
                t0 t0Var8 = new t0(7, this.f24521w, continuation);
                t0Var8.v = obj2;
                return t0Var8;
            case 8:
                t0 t0Var9 = new t0(8, this.f24521w, continuation);
                t0Var9.v = obj2;
                return t0Var9;
            case 9:
                t0 t0Var10 = new t0(9, this.f24521w, continuation);
                t0Var10.v = obj2;
                return t0Var10;
            case 10:
                t0 t0Var11 = new t0(10, this.f24521w, continuation);
                t0Var11.v = obj2;
                return t0Var11;
            case 11:
                t0 t0Var12 = new t0(11, this.f24521w, continuation);
                t0Var12.v = obj2;
                return t0Var12;
            case 12:
                t0 t0Var13 = new t0(12, this.f24521w, continuation);
                t0Var13.v = obj2;
                return t0Var13;
            case 13:
                t0 t0Var14 = new t0(13, this.f24521w, continuation);
                t0Var14.v = obj2;
                return t0Var14;
            case 14:
                t0 t0Var15 = new t0(14, this.f24521w, continuation);
                t0Var15.v = obj2;
                return t0Var15;
            case 15:
                t0 t0Var16 = new t0(15, this.f24521w, continuation);
                t0Var16.v = obj2;
                return t0Var16;
            case 16:
                t0 t0Var17 = new t0(16, this.f24521w, continuation);
                t0Var17.v = obj2;
                return t0Var17;
            default:
                t0 t0Var18 = new t0(17, this.f24521w, continuation);
                t0Var18.v = obj2;
                return t0Var18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((t0) create((itb.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((t0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((t0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((t0) create((ProductAccountDescriptor$Value) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((t0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((t0) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((t0) create((sfe.z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((t0) create((k0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((t0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((t0) create((mkd.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((t0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((t0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowC;
        int i = this.u;
        int i2 = 0;
        int i3 = 24;
        zb7.f fVar = null;
        Object[] objArr = 0;
        com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = this.f24521w;
        switch (i) {
            case 0:
                itb.b bVar = (itb.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new ble.t0(bVar, 1));
                return Unit.f186387a;
            case 1:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new x0(((Boolean) rVar.f314203c).booleanValue(), ((Boolean) rVar.f314201a).booleanValue(), ((Boolean) rVar.f314202b).booleanValue(), i2));
                return Unit.f186387a;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new cbf.i(data, 23));
                return Unit.f186387a;
            case 3:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new bke.t(list, 11));
                return Unit.f186387a;
            case 4:
                ProductAccountDescriptor$Value descriptor = (ProductAccountDescriptor$Value) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean zCompareAndSet = dVar.m0.compareAndSet(true, false);
                vge.x xVar = (vge.x) dVar.f89711t;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                c8g.a.c(descriptor);
                if (descriptor instanceof ProductAccountDescriptor$Value.Main) {
                    ProductAccountDescriptor$Value.Main main = (ProductAccountDescriptor$Value.Main) descriptor;
                    flowC = xVar.c(main, new et0.q0(xVar, main, zCompareAndSet, 10));
                } else {
                    if (!(descriptor instanceof ProductAccountDescriptor$Value.Discover)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    flowC = xVar.c(descriptor, new vd1.a(xVar, descriptor, 7));
                }
                if (zCompareAndSet) {
                    return new v1(new c34.d((Object) flowC, (Object) dVar, (Continuation) (objArr == true ? 1 : 0), 21));
                }
                return flowC;
            case 5:
                List list2 = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new bke.t(list2, 12));
                return Unit.f186387a;
            case 6:
                NavBarMessage navBarMessage = (NavBarMessage) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new ble.f1(navBarMessage, 2));
                return Unit.f186387a;
            case 7:
                sfe.z zVar = (sfe.z) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (zVar == null) {
                    return new go.g(j0.f24492a, 2);
                }
                HomeFeedWidgetContext homeFeedWidgetContext = zVar.f262437a;
                return new ba4.x(dVar.E.c3(homeFeedWidgetContext, zVar.f262438b), homeFeedWidgetContext, i3);
            case 8:
                k0 k0Var = (k0) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new ce9.a(k0Var, 12));
                return Unit.f186387a;
            case 9:
                List list3 = (List) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new bke.t(list3, 13));
                return Unit.f186387a;
            case 10:
                mkd.c cVar = (mkd.c) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((gld.f0) dVar.D).c3(cVar);
                return Unit.f186387a;
            case 11:
                Data data2 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new cbf.i(data2, 24));
                return Unit.f186387a;
            case 12:
                Data data3 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new cbf.i(data3, 25));
                return Unit.f186387a;
            case 13:
                Data data4 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new cbf.i(data4, 26));
                return Unit.f186387a;
            case 14:
                Data data5 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gie.a aVar16 = dVar.Z;
                cli.h hVar = dVar.i0;
                aVar16.c3(com.revolut.feature.tab.accounts.impl.ui.tab.d.L2((List) ((TabAccountsScreenContract$State) ((j2) hVar.f22677a).getValue()).f89686c.getContent(), ((TabAccountsScreenContract$State) ((j2) hVar.f22677a).getValue()).k), (AccountContent) data5.getContent());
                return Unit.f186387a;
            case 15:
                Data data6 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new c7e.i(t1.c0(data6, ((TabAccountsScreenContract$State) ((j2) dVar.i0.f22677a).getValue()).f89686c), dVar, 22));
                dVar.f0.b3();
                return Unit.f186387a;
            case 16:
                Data data7 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) data7.getContent();
                ProductId f89727a = productAccountDescriptor$Value != null ? productAccountDescriptor$Value.getF89727a() : null;
                sb7.b bVar2 = dVar.z;
                int i5 = f89727a == null ? -1 : p0.f24512a[f89727a.ordinal()];
                if (i5 == 1) {
                    fVar = zb7.f.HOME;
                } else if (i5 == 2) {
                    fVar = zb7.f.LINKED_ACCOUNTS;
                }
                return fVar != null ? ((cc7.h) bVar2).Z2(fVar) : new go.g(zhm.f0.f322471a, 2);
            default:
                List list4 = (List) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.S2(new bke.t(list4, 14));
                return Unit.f186387a;
        }
    }
}
