package xy9;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.pix.api.model.PixBeneficiary;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function1 {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f309660w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f309661x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(1, continuation);
        this.f309660w = oVar;
        this.f309661x = valid;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.f309660w, this.f309661x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o oVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            o oVar2 = this.f309660w;
            f8a.c cVar = oVar2.f309671l;
            this.u = oVar2;
            this.v = 1;
            Object objA = ((s8a.m) cVar).a(this.f309661x, this);
            if (objA == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.u;
            yhm.o.b(obj2);
        }
        PixBeneficiary pixBeneficiary = (PixBeneficiary) obj2;
        x2k.e eVar = oVar.f309676r;
        f5j.a aVar2 = pixBeneficiary.f80397a;
        String str = pixBeneficiary.f80398b;
        oVar.A2(u0.b(d2k.g.a(eVar, aVar2, null, null, null, null, new FlowExtras(new FinishCommand(null, null, null, 7)), str != null ? a0.d.x("PAYMENT_SCHEME_END_TO_END_ID", str) : null, null, 638)));
        return Unit.f186387a;
    }
}
