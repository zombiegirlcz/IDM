package t38;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f267689w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, AccountId.Joint joint, Continuation continuation) {
        super(1, continuation);
        this.v = pVar;
        this.f267689w = joint;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f267689w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        AccountId.Joint joint = this.f267689w;
        p pVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            vkm.d dVarB = rd0.e.b(pVar.f267700p.m0(joint));
            this.u = 1;
            obj2 = vkm.q.x(dVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = ((v38.e) obj2).f285858a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(z92.f.l(((io3.g) it8.next()).f163163a));
        }
        return pVar.A2(new AccountsStatementFeatureConfig.AccountsStatementDestination(d0.i1(arrayList), new AccountStatementProduct.JointCurrent(joint)));
    }
}
