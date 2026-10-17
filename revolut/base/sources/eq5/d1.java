package eq5;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f128262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j f128263x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i, com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f128263x = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d1 d1Var = new d1(0, this.f128263x, continuation);
                d1Var.f128262w = obj2;
                return d1Var;
            default:
                d1 d1Var2 = new d1(1, this.f128263x, continuation);
                d1Var2.f128262w = obj2;
                return d1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d1) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d1) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.j jVar = this.f128263x;
        switch (i) {
            case 0:
                s sVar = (s) this.f128262w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.f128262w = null;
                this.v = 1;
                Object objN2 = jVar.N2(sVar, this);
                return objN2 == aVar ? aVar : objN2;
            default:
                Pair pair = (Pair) this.f128262w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    ae5.a aVar3 = jVar.f71284y;
                    ae5.c cVar = ae5.c.CTA_CLICKED;
                    this.f128262w = null;
                    this.v = 1;
                    if (aVar3.Z2() == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
