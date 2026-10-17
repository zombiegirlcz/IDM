package bvb;

import aw0.n6;
import bvb.g;
import cli.y;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ RevPointsBuyingControllerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RevPointsBuyingControllerScreen revPointsBuyingControllerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = revPointsBuyingControllerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsBuyingControllerScreen revPointsBuyingControllerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) revPointsBuyingControllerScreen.d();
                int dayOfMonth = ((l80.f) rVar.f19006t).e().getDayOfMonth();
                if (29 <= dayOfMonth && dayOfMonth < 32) {
                    rVar.C2(g.a.f18986a);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar2 = (r) revPointsBuyingControllerScreen.d();
                y yVar = rVar2.f19008x;
                rub.j jVar = ((e) ((j2) yVar.f22677a).getValue()).f18981b;
                rub.m mVar = (rub.m) ((e) ((j2) yVar.f22677a).getValue()).f18980a.getContent();
                Continuation continuation = null;
                rub.i iVar = mVar != null ? mVar.f257525c : null;
                if (jVar != null) {
                    rVar2.n2(new a1a.c(rVar2, iVar, jVar, continuation, 26), new whi.b(6));
                } else if (!rVar2.f19002p.f83566a || iVar == null) {
                    rVar2.J2();
                } else {
                    rVar2.n2(new btk.j(rVar2, iVar, null, 3), new whi.b(6));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar3 = (r) revPointsBuyingControllerScreen.d();
                rub.j jVar2 = ((e) ((j2) rVar3.f19008x.f22677a).getValue()).f18981b;
                if (jVar2 != null) {
                    rVar3.n2(new b96.d(rVar3, jVar2, (Continuation) null, 24), new whi.b(6));
                } else {
                    rVar3.J2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
