package yca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.pix.api.model.PixBeneficiary;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f312593w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(2, continuation);
        this.v = tVar;
        this.f312593w = valid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, this.f312593w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB0;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        t tVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            r rVar = new r(tVar, this.f312593w, null);
            this.u = 1;
            objB0 = u0.b0(tVar.X(), "FETCH_BENEFICIARY_BUTTON_TAG", rVar, this);
            if (objB0 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objB0 = obj2;
        }
        PixBeneficiary pixBeneficiary = (PixBeneficiary) objB0;
        int i2 = q.f312591a[((h) ((j2) tVar.u.f22677a).getValue()).f312582b.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tVar.C2(new j(pixBeneficiary.f80397a));
            return Unit.f186387a;
        }
        x2k.e eVar = tVar.f312598t;
        f5j.a aVar2 = pixBeneficiary.f80397a;
        String str = pixBeneficiary.f80398b;
        return tVar.C1(u0.b(d2k.g.a(eVar, aVar2, null, null, null, null, new FlowExtras(new FinishCommand(null, null, null, 7)), str != null ? a0.d.x("PAYMENT_SCHEME_END_TO_END_ID", str) : null, null, 638)));
    }
}
