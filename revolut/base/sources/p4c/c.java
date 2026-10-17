package p4c;

import aw0.n6;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ IppShopProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(IppShopProductScreen ippShopProductScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = ippShopProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        IppShopProductScreen ippShopProductScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zji.d dVar = ((oki.h) ippShopProductScreen.R2()).f226129n;
                Unit unit = Unit.f186387a;
                dVar.a(unit);
                return unit;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) ippShopProductScreen.R2();
                p0g.b bVar = new p0g.b(28);
                d3c.x xVar2 = ((k) ((j2) xVar.u.f22677a).getValue()).e;
                if (xVar2 != null && (str = xVar2.f111071a) != null) {
                    xVar.n2(new of6.d(13, xVar, "BUY_NOW_BUTTON_TAG", str, bVar, null), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
