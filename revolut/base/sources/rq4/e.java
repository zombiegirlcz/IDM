package rq4;

import cli.y;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import ip0.gs;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditLimitCapChangeScreen f256461w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditLimitCapChangeScreen creditLimitCapChangeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256461w = creditLimitCapChangeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f256461w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f256461w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((gs) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditLimitCapChangeScreen creditLimitCapChangeScreen = this.f256461w;
        switch (i) {
            case 0:
                gs gsVar = (gs) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = creditLimitCapChangeScreen.e3();
                cy0.a sliderValue = gsVar.f164466b;
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) kVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(sliderValue, "sliderValue");
                long j2 = sliderValue.f110014a;
                y yVar = cVar.C;
                long jS = g4i.a.s(j2, ((i) zi0.c.I(((j) ((j2) yVar.f22677a).getValue()).f256465a)).f256462a.f175591b.f115082a);
                Long l2 = ((j) ((j2) yVar.f22677a).getValue()).f256467c;
                if (l2 != null && l2.longValue() != jS) {
                    long j3 = ((i) zi0.c.I(((j) ((j2) yVar.f22677a).getValue()).f256465a)).f256463b.f115082a;
                    boolean z = false;
                    boolean z3 = l2.longValue() >= j3 && jS < j3;
                    if (l2.longValue() <= j3 && jS > j3) {
                        z = true;
                    }
                    if (z3 || z) {
                        r70.c.b(cVar.f69185q, 3);
                    }
                }
                cVar.H2(yVar, new nxc.a(jS, 9));
                break;
            default:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) creditLimitCapChangeScreen.e3()).I2(aVar2.f275445a);
                break;
        }
        return Unit.f186387a;
    }
}
