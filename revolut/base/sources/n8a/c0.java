package n8a;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.feature.pix.api.model.PixBeneficiary;
import com.revolut.feature.pix.impl.data.network.PixTransactionsService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import l8a.x0;
import l8a.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class c0 extends gim.i implements Function2 {
    public y0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d0 f213302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PixIdentifiedType.Valid f213303x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, PixIdentifiedType.Valid valid, Continuation continuation) {
        super(2, continuation);
        this.f213302w = d0Var;
        this.f213303x = valid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c0(this.f213302w, this.f213303x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y0 y0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        d0 d0Var = this.f213302w;
        if (i == 0) {
            yhm.o.b(obj2);
            PixTransactionsService pixTransactionsService = d0Var.f213307a;
            PixIdentifiedType.Valid valid = this.f213303x;
            x0 x0Var = new x0(new l8a.c(valid.f50352a, valid.getF50358b()));
            this.v = 1;
            obj2 = pixTransactionsService.resolvePixAlias(x0Var, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = this.u;
            yhm.o.b(obj2);
            return new PixBeneficiary((f5j.a) obj2, y0Var.getEndToEndId());
        }
        yhm.o.b(obj2);
        y0 y0Var2 = (y0) obj2;
        o71.a aVar2 = d0Var.f213308b;
        String aliasBeneficiaryId = y0Var2.getAliasBeneficiaryId();
        if (aliasBeneficiaryId == null) {
            aliasBeneficiaryId = "";
        }
        this.u = y0Var2;
        this.v = 2;
        Object objF = ((r21.h) aVar2).f(aliasBeneficiaryId, this);
        if (objF != aVar) {
            y0Var = y0Var2;
            obj2 = objF;
            return new PixBeneficiary((f5j.a) obj2, y0Var.getEndToEndId());
        }
        return aVar;
    }
}
