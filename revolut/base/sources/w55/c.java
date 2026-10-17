package w55;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vge.z1;
import y45.f;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a f294695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f294696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f294697y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a aVar, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f294695w = aVar;
        this.f294696x = str;
        this.f294697y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f294695w, this.f294696x, this.f294697y, continuation, 0);
            default:
                return new c(this.f294695w, this.f294696x, this.f294697y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a aVar2 = this.f294695w;
                    l35.b bVar = aVar2.f70337t;
                    pfm.a aVarP = ((f) bVar).p(aVar2.v.f70332a, this.f294696x, this.f294697y);
                    this.v = 1;
                    if (nim.a.a(aVarP, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a aVar4 = this.f294695w;
                if (i2 == 0) {
                    o.b(obj2);
                    c cVar = new c(aVar4, this.f294696x, this.f294697y, continuation, 0);
                    this.v = 1;
                    if (aVar4.p2(this, cVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                aVar4.u.getClass();
                return l.a1(aVar4, aVar4.X1(xy4.b.b()), null, null, new z1(aVar4, null, 29), 3);
        }
    }
}
