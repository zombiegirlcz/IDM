package wl6;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.LinkedAccountConsentDetailsScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.LinkedAccountConsentDetailsScreenContract$OutputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LinkedAccountConsentDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = linkedAccountConsentDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f53228a;
        boolean zF = Intrinsics.f(str, "RENEW_OR_EDIT_ITEM_ID");
        LinkedAccountConsentDetailsScreen linkedAccountConsentDetailsScreen = this.v;
        if (zF) {
            com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a) linkedAccountConsentDetailsScreen.d();
            ph6.b bVar = (ph6.b) ((e) ((j2) aVar2.f72810q.f22677a).getValue()).f298438a.getContent();
            if (bVar != null) {
                ph6.c cVar = bVar.d.f236225b;
                aVar2.C2(new LinkedAccountConsentDetailsScreenContract$OutputData.RenewOrEdit(cVar.f236221a, cVar.f236222b));
            }
        } else if (Intrinsics.f(str, "REVOKE_ITEM_ID")) {
            com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a aVar3 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.linked_account_consent_details_screen.a) linkedAccountConsentDetailsScreen.d();
            ph6.b bVar2 = (ph6.b) ((e) ((j2) aVar3.f72810q.f22677a).getValue()).f298438a.getContent();
            if (bVar2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Consent details content was null when linked account consent revoke was clicked");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                ph6.c cVar2 = bVar2.d.f236225b;
                aVar3.C2(new LinkedAccountConsentDetailsScreenContract$OutputData.RevokeClicked(cVar2.f236221a, cVar2.f236222b));
            }
        }
        return Unit.f186387a;
    }
}
