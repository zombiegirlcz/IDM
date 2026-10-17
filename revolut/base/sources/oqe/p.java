package oqe;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jmrtd.lds.LDSFile;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, Continuation continuation) {
        super(1, continuation);
        this.v = tVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        t tVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            xqe.b bVar = tVar.f227900p;
            String str = tVar.o.f90332a;
            this.u = 1;
            are.b bVar2 = bVar.f308167a;
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, new ald.l(bVar2, str, continuation, 7), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        til.m mVar = tVar.f227901q;
        String str2 = ((tqe.b) obj2).f273555a;
        k9 k9Var = k9.Junior;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return tVar.C1(til.m.a(mVar, new WorkflowConfiguration.Workflow(str2, (wi0.b) null, (NaviCommand) null, (String) null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), null, 6));
    }
}
