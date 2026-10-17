package rog;

import com.revolut.shared.feature.user_declarations.api.flows.tracking.TrackingConsentInputData;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qog.d;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.user_declarations.shared.flows.tracking.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f256007w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.user_declarations.shared.flows.tracking.flow.a aVar, d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f256007w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f256007w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.f256007w;
        com.revolut.feature.user_declarations.shared.flows.tracking.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            TrackingConsentInputData trackingConsentInputData = aVar2.o;
            if (trackingConsentInputData instanceof TrackingConsentInputData.Manual) {
                str = null;
            } else {
                if (!(trackingConsentInputData instanceof TrackingConsentInputData.Workflow)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((TrackingConsentInputData.Workflow) trackingConsentInputData).f105032a;
            }
            if (str != null) {
                jvh.a aVar3 = aVar2.f94685p;
                MobileScreenParams.TrackingConsent trackingConsent = new MobileScreenParams.TrackingConsent(((qog.c) dVar).f248209a);
                this.u = 1;
                if (aVar3.j(str, trackingConsent, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((qog.c) dVar).f248209a) {
            aVar2.C2(nbl.b.f214092a);
        } else {
            aVar2.C2(nbl.c.f214093a);
        }
        return Unit.f186387a;
    }
}
