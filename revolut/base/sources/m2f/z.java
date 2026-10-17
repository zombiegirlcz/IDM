package m2f;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.g1;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a f202002w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i, com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f202002w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(0, this.f202002w, continuation);
                zVar.v = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(1, this.f202002w, continuation);
                zVar2.v = obj2;
                return zVar2;
            default:
                z zVar3 = new z(2, this.f202002w, continuation);
                zVar3.v = obj2;
                return zVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((z) create((g1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar = this.f202002w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new lnk.m(data, 21));
                if (data.getContent() != null && !aVar.D) {
                    aVar.D = true;
                    if (aVar.o.d != null) {
                        String str = aVar.f91168t.f201965a.format(r5.intValue());
                        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        aVar.L2(str);
                    }
                }
                break;
            case 1:
                g1 g1Var = (g1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new a0(g1Var, 0));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.E, new lnk.m(data2, 22));
                break;
        }
        return Unit.f186387a;
    }
}
