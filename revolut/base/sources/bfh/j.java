package bfh;

import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowContract$Page;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PrivateCompanyDetailsFlowController f14995w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(PrivateCompanyDetailsFlowController privateCompanyDetailsFlowController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14995w = privateCompanyDetailsFlowController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j(this.f14995w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            default:
                j jVar2 = new j(this.f14995w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((PrivateCompanyDetailsFlowContract$Page) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PrivateCompanyDetailsFlowController privateCompanyDetailsFlowController = this.f14995w;
        switch (i) {
            case 0:
                String menuItemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a aVarE3 = privateCompanyDetailsFlowController.d();
                Intrinsics.h(menuItemId);
                o oVar = (o) aVarE3;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                nel.n nVar = (nel.n) ((c) ((j2) oVar.f15004t.f22677a).getValue()).d.getContent();
                if (nVar != null) {
                    Continuation continuation = null;
                    if (menuItemId.equals("WATCHLIST_TOOLBAR_ICON_ID")) {
                        oVar.n2(new n(oVar, nVar, null), new whi.b(6));
                    } else if (menuItemId.equals("SHARED_FAVOURITES_PRICE_ALERTS_MENU_ITEM_ID")) {
                        oVar.n2(new b96.d(oVar, menuItemId, nVar, continuation, 11), new whi.b(6));
                    }
                }
                break;
            default:
                PrivateCompanyDetailsFlowContract$Page page = (PrivateCompanyDetailsFlowContract$Page) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) privateCompanyDetailsFlowController.d();
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                oVar2.H2(oVar2.f15004t, new b9i.f(page, 22));
                break;
        }
        return Unit.f186387a;
    }
}
