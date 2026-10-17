package jjd;

import aw0.n6;
import cli.y;
import com.revolut.feature.shops.impl.ui.items_details.cancellation.ShopsCancelOrderScreen;
import gim.i;
import ji1.m;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ShopsCancelOrderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ShopsCancelOrderScreen shopsCancelOrderScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = shopsCancelOrderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ShopsCancelOrderScreen shopsCancelOrderScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVar = (b) shopsCancelOrderScreen.S.getValue();
                y yVar = bVar.f174816q;
                if (!((a) ((j2) yVar.f22677a).getValue()).f174814b) {
                    bVar.H2(yVar, new jj3.a(8));
                    bVar.A1(new m(bVar, null, 1), new yi5.b(25));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVar2 = (b) shopsCancelOrderScreen.S.getValue();
                if (!((a) ((j2) bVar2.f174816q.f22677a).getValue()).f174814b) {
                    bVar2.B2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
