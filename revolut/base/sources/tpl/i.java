package tpl;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tjf.p0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ IdentityDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IdentityDocumentsScreen identityDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = identityDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarM3 = this.v.R2();
        String listId = model.f52373a;
        s sVar = (s) lVarM3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
            sVar.l2(new p0(sVar, continuation, 8), new o(sVar, 0));
        } else {
            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState(j6.a.q("Unexpected click with ", listId));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
        }
        return Unit.f186387a;
    }
}
