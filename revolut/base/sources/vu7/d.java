package vu7;

import aii.n;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig;
import efm.r;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.t0;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f292270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dl7.a f292271x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a aVar, String str, dl7.a aVar2, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f292270w = str;
        this.f292271x = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f292270w, this.f292271x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f292270w;
        com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarG = m70.a.g(si7.a.c(aVar2.f76079p, str), null, null, 3);
            this.u = 1;
            obj2 = nim.a.e(rVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        CFACInsuranceDetails cFACInsuranceDetails = (CFACInsuranceDetails) obj2;
        if (cFACInsuranceDetails != null) {
            m70.a.c(t0.f186434a);
            n nVarC1 = aVar2.C1(u0.c(new CFACInsuranceFeatureConfig.MakeClaim(cFACInsuranceDetails, new dl7.b(this.f292271x, "", null), true, null)));
            if (nVarC1 != null) {
                return nVarC1;
            }
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "InsuranceDetailsFlowModel", j6.a.q("No insurance details found for ", str), null, h0Var);
        return Unit.f186387a;
    }
}
