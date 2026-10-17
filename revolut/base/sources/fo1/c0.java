package fo1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import om4.k0;
import zhm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ e0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ io3.d f136739w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(e0 e0Var, io3.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = e0Var;
        this.f136739w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c0(this.v, this.f136739w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objE;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e0 e0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            k0 k0Var = e0Var.A;
            yw4.f fVar = yw4.f.POCKET_TRANSFER;
            this.u = 1;
            objE = k0Var.e(fVar, this);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objE = obj2;
        }
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        io3.d dVar = this.f136739w;
        String str = dVar != null ? dVar.f163145a : null;
        l2j.a aVar2 = e0Var.f136742p;
        xi0.b.Companion.getClass();
        return yji.l.i2(e0Var, aVar2.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker(str, xi0.b.f306276m, io3.l.CURRENT, (Set) null, (Set) null, z0.i(k1j.a.POCKETS, k1j.a.VAULTS, k1j.a.CRYPTO, k1j.a.COMMODITIES, zBooleanValue ? k1j.a.CREDIT_CARDS : null, k1j.a.JOINT_ACCOUNT), (TextLocalisedClause) null, false, (Integer) null, (Set) null, 1960))), null, new x(e0Var, 1), 1);
    }
}
