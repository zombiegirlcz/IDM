package u3c;

import com.revolut.core.ui_kit.delegates.bg;
import com.revolut.feature.revolut_shop.ui.screen.cart.IppShopCartScreen;
import d3c.c0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IppShopCartScreen f276895w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(IppShopCartScreen ippShopCartScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f276895w = ippShopCartScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f276895w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f276895w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        bg bgVar = (bg) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(bgVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        IppShopCartScreen ippShopCartScreen = this.f276895w;
        switch (i) {
            case 0:
                bg bgVar = (bg) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE3 = ippShopCartScreen.e3();
                Object obj3 = bgVar.f53733h;
                o oVar = (o) gVarE3;
                if (obj3 instanceof c0) {
                    oVar.I2((c0) obj3, -1);
                } else {
                    oVar.getClass();
                }
                break;
            default:
                bg bgVar2 = (bg) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE32 = ippShopCartScreen.e3();
                Object obj4 = bgVar2.f53733h;
                o oVar2 = (o) gVarE32;
                if (obj4 instanceof c0) {
                    oVar2.I2((c0) obj4, 1);
                } else {
                    oVar2.getClass();
                }
                break;
        }
        return Unit.f186387a;
    }
}
