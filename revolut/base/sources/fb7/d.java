package fb7;

import com.revolut.feature.hidden_accounts.impl.ui.screens.hidden_accounts_list.HiddenAccountsListScreen;
import com.revolut.feature.hidden_accounts.impl.ui.utils.HiddenAccountProductArticleKey;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import fag.o0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HiddenAccountsListScreen f133467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(HiddenAccountsListScreen hiddenAccountsListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f133467w = hiddenAccountsListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f133467w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f133467w, continuation, 1);
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
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HiddenAccountProductArticleKey hiddenAccountProductArticleKey;
        int i = this.u;
        HiddenAccountsListScreen hiddenAccountsListScreen = this.f133467w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE3 = hiddenAccountsListScreen.d();
                Intrinsics.h(itemId);
                i0 i0Var = (i0) b0VarE3;
                i0Var.getClass();
                cli.y yVar = i0Var.v;
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("MULTI_SELECT_MENU_ITEM_ID")) {
                    i0Var.H2(yVar, new o0(17));
                    j2 j2Var = i0Var.u;
                    j2Var.getClass();
                    j2Var.g(null, qfe.j.f245295a);
                } else if (itemId.equals("HIDDEN_ACCOUNTS_INFO_MENU_BUTTON_LIST_ID")) {
                    int i2 = f0.f133474a[((j) ((j2) yVar.f22677a).getValue()).f133484c.ordinal()];
                    if (i2 == 1) {
                        hiddenAccountProductArticleKey = HiddenAccountProductArticleKey.HIDDEN_ACCOUNTS;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hiddenAccountProductArticleKey = HiddenAccountProductArticleKey.SECRET_ACCOUNTS;
                    }
                    i0Var.C2(new s(hiddenAccountProductArticleKey));
                } else {
                    hx7.e.h(new IllegalStateException("Unexpected menu item id ".concat(itemId)));
                }
                return Unit.f186387a;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0VarE32 = hiddenAccountsListScreen.d();
                Intrinsics.h(clickData);
                i0 i0Var2 = (i0) b0VarE32;
                i0Var2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof w) {
                    i0Var2.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit(((w) obj3).f133499a, 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                } else {
                    hx7.e.h(new IllegalStateException(j6.a.q("Unexpected parcel: ", obj3 != null ? obj3.getClass().getName() : null)));
                }
                return Unit.f186387a;
        }
    }
}
