package jk7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import e60.s;
import ip0.u00;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ CFACInsuranceSupportingDocumentsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = cFACInsuranceSupportingDocumentsScreen;
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
        e60.a aVar2 = ((k) this.u.T2()).f175118p;
        s sVar = (s) aVar2;
        sVar.T(new e60.i(null, new TextLocalisedClause(R$string.cfac_claim_supporting_documents_upload_document_title, null, null, 14), new TextLocalisedClause(R$string.cfac_claim_supporting_documents_upload_document_subtitle, u.c(10), null, 12), true, com.revolut.feature.image_picker.R$string.photo_picker_sources_document, 0, v.k(t80.f.JPEG, t80.f.PNG, t80.f.PDF), null, false, u00.BACK, null, 15777));
        return Unit.f186387a;
    }
}
