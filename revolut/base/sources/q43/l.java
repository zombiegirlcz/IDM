package q43;

import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.crypto.onboarding.api.navigation.destination.CryptoFcaRisksDestination;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SelectorScreen f242028w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(SelectorScreen selectorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f242028w = selectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f242028w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f242028w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            case 2:
                l lVar3 = new l(this.f242028w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
            default:
                l lVar4 = new l(this.f242028w, continuation, 3);
                lVar4.v = obj2;
                return lVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((l) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Integer num;
        b0 b0Var;
        String strA;
        int i = this.u;
        int i2 = 0;
        SelectorScreen selectorScreen = this.f242028w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0 a0VarT2 = selectorScreen.T2();
                Intrinsics.h(aVar);
                ((o0) a0VarT2).A2(new t(aVar));
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a0 a0VarT22 = selectorScreen.T2();
                Intrinsics.h(clickData);
                o0 o0Var = (o0) a0VarT22;
                o0Var.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                CryptoFcaRisksDestination cryptoFcaRisksDestinationD = ((gi5.d) o0Var.u).d(clickData);
                if (cryptoFcaRisksDestinationD != null) {
                    o0Var.C1(cryptoFcaRisksDestinationD);
                }
                break;
            case 2:
                String str = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(str);
                if (str.length() == 0) {
                    KProperty[] kPropertyArr = SelectorScreen.f65290n0;
                    selectorScreen.h3().d.scrollToPosition(0);
                }
                ((o0) selectorScreen.T2()).A2(new y(str));
                break;
            default:
                z zVar = (z) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o0) selectorScreen.T2()).A2(zVar);
                String str2 = zVar.f242055a;
                b0[] b0VarArrValues = b0.values();
                int length = b0VarArrValues.length;
                int i3 = 0;
                while (true) {
                    num = null;
                    if (i3 < length) {
                        b0Var = b0VarArrValues[i3];
                        if (!Intrinsics.f(b0Var.b(), str2)) {
                            i3++;
                        }
                    } else {
                        b0Var = null;
                    }
                }
                if (b0Var != null && (strA = b0Var.a()) != null) {
                    Iterator it8 = selectorScreen.d3().b().iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            i2 = -1;
                        } else if (!Intrinsics.f(((koi.j) it8.next()).getF52324a(), strA)) {
                            i2++;
                        }
                    }
                    Integer numValueOf = Integer.valueOf(i2);
                    if (i2 > -1) {
                        num = numValueOf;
                    }
                }
                if (num != null && selectorScreen.d3().getItemCount() > 0) {
                    selectorScreen.i3().post(new p6.e(selectorScreen, num, 4));
                }
                break;
        }
        return Unit.f186387a;
    }
}
