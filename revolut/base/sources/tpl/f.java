package tpl;

import com.revolut.core.ui_kit.delegates.IdDocumentDelegate;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.domain.models.Document;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ IdentityDocumentsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(IdentityDocumentsScreen identityDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = identityDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((IdDocumentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVar = (s) this.u.R2();
        Document document = ((j) ((j2) sVar.u.f22677a).getValue()).f273422b;
        if (document == null) {
            RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState("Copy clicked without selected document");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
        } else {
            sVar.I2(R$string.revolut_sso_document_number_title, document.f106144a);
        }
        return Unit.f186387a;
    }
}
