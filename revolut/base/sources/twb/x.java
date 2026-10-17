package twb;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a f275005w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f275005w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(this.f275005w, continuation, 0);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(this.f275005w, continuation, 1);
                xVar2.v = obj2;
                return xVar2;
            case 2:
                x xVar3 = new x(this.f275005w, continuation, 2);
                xVar3.v = obj2;
                return xVar3;
            case 3:
                x xVar4 = new x(this.f275005w, continuation, 3);
                xVar4.v = obj2;
                return xVar4;
            case 4:
                x xVar5 = new x(this.f275005w, continuation, 4);
                xVar5.v = obj2;
                return xVar5;
            default:
                x xVar6 = new x(this.f275005w, continuation, 5);
                xVar6.v = obj2;
                return xVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        m1c.x xVar;
        int i = this.u;
        com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar = this.f275005w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kwb.b bVar = (kwb.b) ((l) ((j2) aVar.J.f22677a).getValue()).f274986a.getContent();
                RevPoints revPoints = (bVar == null || (xVar = bVar.f190327b) == null) ? null : xVar.f201472c;
                m1c.x xVar2 = (m1c.x) data.getContent();
                RevPoints revPoints2 = xVar2 != null ? xVar2.f201472c : null;
                if (revPoints != null && revPoints2 != null && !revPoints.equals(revPoints2)) {
                    aVar.E.a();
                }
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = aVar.J;
                if (((l) ((j2) yVar.f22677a).getValue()).d == null) {
                    aVar.H2(yVar, new tvc.i(data2, aVar));
                } else {
                    aVar.H2(yVar, new tvc.i(data2, 5));
                }
                break;
            case 2:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new tvc.i(data3, 6));
                kwb.b bVar2 = (kwb.b) data3.getContent();
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a.I2(aVar, bVar2 != null ? bVar2.f190328c : null);
                break;
            case 3:
                Data data4 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new tvc.i(data4, 7));
                break;
            case 4:
                Data data5 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.J, new tvc.i(data5, 8));
                break;
            default:
                Data data6 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!data6.getLoading()) {
                    aVar.H2(aVar.J, new tvc.i(data6, 9));
                    kwb.b bVar3 = (kwb.b) data6.getContent();
                    com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a.I2(aVar, bVar3 != null ? bVar3.f190328c : null);
                }
                break;
        }
        return Unit.f186387a;
    }
}
