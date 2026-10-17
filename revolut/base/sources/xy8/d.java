package xy8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yy8.c f309650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.a aVar, yy8.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f309650w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f309650w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.error_generic, null, null, 14);
            g3l.a aVar2 = this.v.f77952t;
            Clause clause = this.f309650w.f317865a.f210399b;
            efm.b bVarC0 = aVar2.c0(new StatusViewConfiguration.Error("ONFIDO_ERROR_DIALOG_ID", clause == null ? textLocalisedClause : clause, null, null, null, null, null, 8188));
            this.u = 1;
            if (nim.a.a(bVarC0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
