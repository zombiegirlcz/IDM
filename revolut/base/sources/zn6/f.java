package zn6;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.model.account_linking.AccountLinkingExpirationOption;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.ReviewAccountLinkingDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ ReviewAccountLinkingDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ReviewAccountLinkingDetailsScreen reviewAccountLinkingDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = reviewAccountLinkingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c cVar = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.c) this.u.R2();
        y yVar = cVar.f73063s;
        oh6.e eVar = (oh6.e) ((h) ((j2) yVar.f22677a).getValue()).f323673a.getContent();
        if (eVar != null) {
            ArrayList arrayList = eVar.d.f225314b;
            Iterator it8 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.f((AccountLinkingExpirationOption) it8.next(), ((h) ((j2) yVar.f22677a).getValue()).d)) {
                    break;
                }
                i++;
            }
            oki.h.v2(cVar.f73064t, new ReviewAccountLinkingDetailsScreenContract$ModalStep.ExpirationSelection(i >= 0 ? i : 0, arrayList), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
