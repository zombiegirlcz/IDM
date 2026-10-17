package tpl;

import com.revolut.core.ui_kit.delegates.IdDocumentDelegate;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.domain.models.Document;
import com.revolut.sso.impl.ui.revolut_id.documents.identity_documents.IdentityDocumentsScreen;
import java.time.LocalDate;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ IdentityDocumentsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(IdentityDocumentsScreen identityDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = identityDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((IdDocumentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
            LocalDate localDate = document.d;
            if (localDate != null) {
                int i = R$string.revolut_sso_document_birthday_title;
                String string = localDate.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sVar.I2(i, string);
            }
        }
        return Unit.f186387a;
    }
}
