package ina;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ t v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountId.Joint f162746w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, AccountId.Joint joint, Continuation continuation) {
        super(2, continuation);
        this.v = tVar;
        this.f162746w = joint;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, this.f162746w, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int size = list.size();
        AccountId.Joint joint = this.f162746w;
        t tVar = this.v;
        if (size <= 1) {
            AccountStatementProduct.JointCurrent jointCurrent = new AccountStatementProduct.JointCurrent(joint);
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((io3.g) it8.next()).f163163a);
            }
            tVar.f3(jointCurrent, arrayList);
        } else {
            tVar.d3(list, new ijg.c(tVar, joint, 18));
        }
        return Unit.f186387a;
    }
}
