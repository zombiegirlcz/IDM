package ty4;

import com.revolut.feature.credit.direct.debit.account_selection.models.DirectDebitPreviousMandate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f275476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ DirectDebitPreviousMandate f275477x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, DirectDebitPreviousMandate directDebitPreviousMandate, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f275476w = oVar;
        this.f275477x = directDebitPreviousMandate;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f275476w, this.f275477x, continuation, 0);
            default:
                return new n(this.f275476w, this.f275477x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                o oVar = this.f275476w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    tw9.h hVar = new tw9.h(oVar, this.f275477x, continuation, 2);
                    this.v = 1;
                    if (oVar.p2(this, hVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                oVar.f275482t.getClass();
                return yji.l.a1(oVar, oVar.X1(xy4.b.b()), null, null, new tk5.c(oVar, continuation, 26), 3);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o oVar2 = this.f275476w;
                mcg.j jVar = new mcg.j(oVar2, this.f275477x, null, 13);
                this.v = 1;
                Object objB = pu7.a.B(oVar2.k, "select mandate", jVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
