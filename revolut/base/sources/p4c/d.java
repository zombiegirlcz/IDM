package p4c;

import aw0.n6;
import com.revolut.feature.revolut_shop.ui.screen.product.IppShopProductScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p4c.p;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IppShopProductScreen f232878w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(IppShopProductScreen ippShopProductScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232878w = ippShopProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f232878w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f232878w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        int i = this.u;
        IppShopProductScreen ippShopProductScreen = this.f232878w;
        switch (i) {
            case 0:
                String listId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE3 = ippShopProductScreen.R2();
                Intrinsics.h(listId);
                x xVar = (x) rVarE3;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "CART_MENU_ITEM_ID")) {
                    xVar.C2(p.a.f232889a);
                }
                break;
            default:
                n6 n6Var = (n6) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarE32 = ippShopProductScreen.R2();
                String tag2 = n6Var.f;
                x xVar2 = (x) rVarE32;
                xVar2.getClass();
                cli.y yVar = xVar2.u;
                Intrinsics.checkNotNullParameter(tag2, "tag");
                String str3 = "ADD_TO_CART_BUTTON_TAG";
                if (Intrinsics.f(tag2, "ADD_TO_CART_BUTTON_TAG")) {
                    p0g.b bVar = new p0g.b(29);
                    d3c.x xVar3 = ((k) ((j2) yVar.f22677a).getValue()).e;
                    if (xVar3 != null && (str2 = xVar3.f111071a) != null) {
                        xVar2.n2(new of6.d(13, xVar2, str3, str2, bVar, null), new whi.b(6));
                    }
                } else if (Intrinsics.f(tag2, "BUY_NOW_BUTTON_TAG")) {
                    p0g.b bVar2 = new p0g.b(28);
                    d3c.x xVar4 = ((k) ((j2) yVar.f22677a).getValue()).e;
                    if (xVar4 != null && (str = xVar4.f111071a) != null) {
                        xVar2.n2(new of6.d(13, xVar2, "BUY_NOW_BUTTON_TAG", str, bVar2, null), new whi.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
