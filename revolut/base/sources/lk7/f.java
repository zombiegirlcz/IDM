package lk7;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.insurance.api.models.details.CFACProductDetails;
import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CFACInsuranceDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CFACInsuranceDetailsScreen cFACInsuranceDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cFACInsuranceDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item action = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.Y.getValue();
        Intrinsics.h(action);
        l lVar = (l) jVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.f(action.f58316a, "ID_ACTION_ALL_DOCUMENTS")) {
            Object obj3 = action.f58324n;
            CFACProductDetails cFACProductDetails = obj3 instanceof CFACProductDetails ? (CFACProductDetails) obj3 : null;
            if (cFACProductDetails != null) {
                lVar.v2(new i(new CFACInsuranceFlowContract$Step.Documents(new CFACInsuranceDocumentsScreenContract$InputData(lVar.f196284p.f75121a, cFACProductDetails, null))));
            }
        }
        return Unit.f186387a;
    }
}
