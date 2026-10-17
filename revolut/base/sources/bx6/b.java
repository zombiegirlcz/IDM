package bx6;

import aw0.n6;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.shopify.ShopifyManageScreen;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ShopifyManageScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ShopifyManageScreen shopifyManageScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = shopifyManageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ShopifyManageScreen shopifyManageScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) shopifyManageScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) shopifyManageScreen.e3();
                iVar.getClass();
                od0.a aVar3 = od0.a.f224253a;
                iVar.C1(new ExternalDestination.Browser(od0.a.e() ? "https://partners.shopify.com/2182951/apps/4819910657/overview" : "https://apps.shopify.com/revolut-gateway", null));
                break;
        }
        return Unit.f186387a;
    }
}
