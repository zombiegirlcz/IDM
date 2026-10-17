package zn6;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yui.v;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReviewAccountLinkingDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reviewAccountLinkingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVarE3 = this.v.R2();
        String permissionId = model.f52519a;
        com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c) kVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(permissionId, "permissionId");
        cVar.H2(cVar.f73063s, new v(permissionId, 21));
        return Unit.f186387a;
    }
}
