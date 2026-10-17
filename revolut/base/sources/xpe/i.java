package xpe;

import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import yhm.o;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement f307949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f307950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f307951y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar, MobileScreenParams.TaxResidenciesCollection.PrimaryCountryReplacement primaryCountryReplacement, List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f307949w = primaryCountryReplacement;
        this.f307950x = list;
        this.f307951y = list2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, this.f307949w, this.f307950x, this.f307951y, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            Collection collection = this.f307950x;
            if (collection == null) {
                collection = f0.f322471a;
            }
            this.v.O2(this.f307949w, d0.F0(com.revolut.shared.feature.workflow.engine.api.models.a.PROHIBITED_RESIDENCY_CONFIRMED, collection), this.f307951y);
        } else if (!(n1Var instanceof k1)) {
            if (!(n1Var instanceof m1) && !(n1Var instanceof j1)) {
                throw new NoWhenBranchMatchedException();
            }
            hx7.e.n(new IllegalArgumentException(com.revolut.data.database.models.openbanking.d.s("Unexpected dialog result ", n1Var)));
        }
        return Unit.f186387a;
    }
}
