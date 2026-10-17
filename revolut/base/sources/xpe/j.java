package xpe;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement f307952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f307953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f307954y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar, MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement primaryCountryReplacement, List list, List list2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f307952w = primaryCountryReplacement;
        this.f307953x = list;
        this.f307954y = list2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f307952w, this.f307953x, this.f307954y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar2 = this.v;
            jvh.a aVar3 = aVar2.f90303q;
            String str = aVar2.o.f90289a;
            MobileScreenParams.TaxResidenciesCollection taxResidenciesCollection = new MobileScreenParams.TaxResidenciesCollection(this.f307952w, this.f307953x, this.f307954y);
            this.u = 1;
            if (aVar3.j(str, taxResidenciesCollection, this) == aVar) {
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
