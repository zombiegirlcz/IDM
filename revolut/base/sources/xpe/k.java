package xpe;

import aii.q;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement f307955w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f307956x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f307957y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar, MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement primaryCountryReplacement, List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f307955w = primaryCountryReplacement;
        this.f307956x = list;
        this.f307957y = list2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f307955w, this.f307956x, this.f307957y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            j jVar = new j(aVar2, this.f307955w, this.f307956x, this.f307957y, null);
            this.u = 1;
            if (aVar2.p2(this, jVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        aVar2.C2(q.f5292a);
        return Unit.f186387a;
    }
}
