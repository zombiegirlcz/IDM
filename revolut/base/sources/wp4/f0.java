package wp4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class f0 extends gim.i implements Function2 {
    public b u;
    public RepaymentSource v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f299045w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f299046x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i0 f299047y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.f299047y = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f0 f0Var = new f0(this.f299047y, continuation);
        f0Var.f299046x = obj2;
        return f0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e eVar;
        RepaymentSource repaymentSource;
        e eVar2;
        RepaymentSource repaymentSource2;
        Data data = (Data) this.f299046x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f299045w;
        i0 i0Var = this.f299047y;
        if (i == 0) {
            yhm.o.b(obj2);
            i0Var.x2(new wgd.k(data, 20));
            eVar = (e) data.getContent();
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                RepaymentSource repaymentSource3 = bVar.f299036j.f299043a;
                if (repaymentSource3 != null) {
                    ck4.b bVar2 = i0Var.A;
                    this.f299046x = null;
                    this.u = bVar;
                    this.v = repaymentSource3;
                    this.f299045w = 1;
                    ((om4.q) bVar2).f226665a.setValue(repaymentSource3);
                    if (Unit.f186387a == aVar) {
                        return aVar;
                    }
                    eVar2 = eVar;
                    repaymentSource2 = repaymentSource3;
                } else {
                    repaymentSource = repaymentSource3;
                    b bVar3 = (b) eVar;
                    i0Var.v2(new h(bVar3.f299031a, bVar3.f299033c, bVar3.f299032b, bVar3.f, bVar3.f299034g, bVar3.i, repaymentSource, bVar3.k));
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        repaymentSource2 = this.v;
        eVar2 = this.u;
        yhm.o.b(obj2);
        repaymentSource = repaymentSource2;
        eVar = eVar2;
        b bVar32 = (b) eVar;
        i0Var.v2(new h(bVar32.f299031a, bVar32.f299033c, bVar32.f299032b, bVar32.f, bVar32.f299034g, bVar32.i, repaymentSource, bVar32.k));
        return Unit.f186387a;
    }
}
