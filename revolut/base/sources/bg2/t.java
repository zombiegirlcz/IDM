package bg2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import efm.d0;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.k0;
import vkm.j2;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f15079w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(x xVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f15079w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f15079w, continuation, 0);
            case 1:
                return new t(this.f15079w, continuation, 1);
            default:
                return new t(this.f15079w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        Object objE;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    x xVar = this.f15079w;
                    s sVar = new s(xVar, (Continuation) null, 0);
                    this.v = 1;
                    if (do3.q.t(xVar, sVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                x xVar2 = this.f15079w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    wsg.n nVar = xVar2.f15084p;
                    xi0.b.Companion.getClass();
                    d0 d0VarR = osg.b.r(nVar, xi0.b.E, null, null, null, 62);
                    this.v = 1;
                    objB = nim.a.b(d0VarR, this);
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                xVar2.H2(xVar2.z, new afa.s((io3.d) objB, 1));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                x xVar3 = this.f15079w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    k0 k0Var = xVar3.f15091y;
                    yw4.f fVar = yw4.f.POCKET_TRANSFER;
                    this.v = 1;
                    objE = k0Var.e(fVar, this);
                    if (objE == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objE = obj2;
                }
                boolean zBooleanValue = ((Boolean) objE).booleanValue();
                io3.d dVar = ((g) ((j2) xVar3.z.f22677a).getValue()).e;
                yji.l.i2(xVar3, xVar3.f15088t.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker(dVar.f163145a, z92.f.l(dVar), io3.l.CURRENT, y0.b(dVar.f163147c), (Set) null, z0.i(k1j.a.POCKETS, k1j.a.VAULTS, k1j.a.CRYPTO, k1j.a.COMMODITIES, zBooleanValue ? k1j.a.CREDIT_CARDS : null), (TextLocalisedClause) null, false, (Integer) null, (Set) null, 1960))), null, new o(xVar3, 0), 1);
                return Unit.f186387a;
        }
    }
}
