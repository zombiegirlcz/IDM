package wo2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingRequestStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingRequestStatusScreen;
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
        yhm.o.b(obj2);
        h hVarD3 = this.v.d();
        String listId = model.f53228a;
        m mVar = (m) hVarD3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        yo2.i iVar = (yo2.i) ((g) ((j2) mVar.f298875r.f22677a).getValue()).f298868b.getContent();
        if (iVar != null) {
            if (Intrinsics.f(listId, "ID_DOCUMENT_LINKS")) {
                mVar.I2(new TextLocalisedClause(R$string.account_switch_status_documents_title, null, null, 14), iVar.f315550h);
            } else if (Intrinsics.f(listId, "ID_FAQ_LINKS")) {
                mVar.I2(new TextLocalisedClause(R$string.account_switch_status_faqs_title, null, null, 14), iVar.i);
            }
        }
        return Unit.f186387a;
    }
}
