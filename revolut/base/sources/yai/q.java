package yai;

import com.revolut.data.model.Data;
import com.revolut.feature.referrals.code.data.api.ReferrerDetailsState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.email.screen.a f312043b;

    public /* synthetic */ q(com.revolut.feature_retail_user_declarations.email.screen.a aVar, int i) {
        this.f312042a = i;
        this.f312043b = aVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj2, Continuation continuation) {
        switch (this.f312042a) {
            case 0:
                com.revolut.feature_retail_user_declarations.email.screen.a aVar = this.f312043b;
                aVar.H2(aVar.f97593w, new y4c.i((Data) obj2, 17));
                break;
            default:
                ReferrerDetailsState referrerDetailsState = (ReferrerDetailsState) obj2;
                com.revolut.feature_retail_user_declarations.email.screen.a aVar2 = this.f312043b;
                aVar2.H2(aVar2.f97593w, new y8a.h(referrerDetailsState, 12));
                skm.r rVar = aVar2.v;
                if (rVar != null) {
                    rVar.U(referrerDetailsState.getF81680a());
                }
                break;
        }
        return Unit.f186387a;
    }
}
