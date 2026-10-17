package av8;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.kyc.impl.document_collection.document_selection.DocumentSelectionController;
import com.revolut.feature.kyc.shared.exception.KycException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DocumentSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DocumentSelectionController documentSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = documentSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        Object obj3 = model.k;
        com.revolut.feature.kyc.impl.document_collection.document_selection.a aVar2 = (com.revolut.feature.kyc.impl.document_collection.document_selection.a) lVarE3;
        if (obj3 instanceof i) {
            aVar2.H2(aVar2.f77627r, new o(obj3, 0));
        } else {
            aVar2.getClass();
            KycException kycException = new KycException("DocumentSelection", new IllegalStateException(a0.d.m(obj3, "Wrong parcel is used for document selection: ")));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, kycException, h0Var);
        }
        return Unit.f186387a;
    }
}
