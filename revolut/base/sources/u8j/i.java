package u8j;

import aw0.q0;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import s78.n;
import u4e.l;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a f278243w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f278243w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f278243w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f278243w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(this.f278243w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i(this.f278243w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i(this.f278243w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            case 5:
                i iVar6 = new i(this.f278243w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
            case 6:
                i iVar7 = new i(this.f278243w, continuation, 6);
                iVar7.v = obj2;
                return iVar7;
            case 7:
                i iVar8 = new i(this.f278243w, continuation, 7);
                iVar8.v = obj2;
                return iVar8;
            case 8:
                i iVar9 = new i(this.f278243w, continuation, 8);
                iVar9.v = obj2;
                return iVar9;
            case 9:
                i iVar10 = new i(this.f278243w, continuation, 9);
                iVar10.v = obj2;
                return iVar10;
            case 10:
                i iVar11 = new i(this.f278243w, continuation, 10);
                iVar11.v = obj2;
                return iVar11;
            case 11:
                i iVar12 = new i(this.f278243w, continuation, 11);
                iVar12.v = obj2;
                return iVar12;
            case 12:
                i iVar13 = new i(this.f278243w, continuation, 12);
                iVar13.v = obj2;
                return iVar13;
            case 13:
                i iVar14 = new i(this.f278243w, continuation, 13);
                iVar14.v = obj2;
                return iVar14;
            case 14:
                i iVar15 = new i(this.f278243w, continuation, 14);
                iVar15.v = obj2;
                return iVar15;
            case 15:
                i iVar16 = new i(this.f278243w, continuation, 15);
                iVar16.v = obj2;
                return iVar16;
            case 16:
                i iVar17 = new i(this.f278243w, continuation, 16);
                iVar17.v = obj2;
                return iVar17;
            default:
                i iVar18 = new i(this.f278243w, continuation, 17);
                iVar18.v = obj2;
                return iVar18;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.a aVar = this.f278243w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xi0.b bVar = (xi0.b) data.getContent();
                if (bVar != null) {
                    aVar.H2(aVar.M, new ou5.a(24, bVar));
                }
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new l(data2, 11));
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new l(data3, 12));
                break;
            case 3:
                BridgeDestination bridgeDestination = (BridgeDestination) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.C1(bridgeDestination);
                break;
            case 4:
                q0 q0Var = (q0) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new cy5.g(q0Var, 4));
                break;
            case 5:
                List list = (List) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new n(list, 17));
                break;
            case 6:
                List list2 = (List) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new n(list2, 18));
                break;
            case 7:
                List list3 = (List) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new n(list3, 16));
                break;
            case 8:
                List list4 = (List) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new n(list4, 19));
                break;
            case 9:
                Data data4 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new l(data4, 13));
                break;
            case 10:
                List list5 = (List) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new n(list5, 20));
                break;
            case 11:
                List list6 = (List) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new n(list6, 21));
                break;
            case 12:
                y yVar = aVar.M;
                Data data5 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!data5.getLoading() || ((b) ((j2) yVar.f22677a).getValue()).f278230m.getLoading()) {
                    aVar.H2(yVar, new l(data5, 14));
                }
                break;
            case 13:
                List list7 = (List) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new n(list7, 22));
                break;
            case 14:
                List list8 = (List) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new n(list8, 23));
                break;
            case 15:
                Data data6 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new l(data6, 15));
                break;
            case 16:
                Data data7 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new l(data7, 16));
                break;
            default:
                Data data8 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.M, new l(data8, 17));
                break;
        }
        return Unit.f186387a;
    }
}
