package y6e;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import gim.i;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import qf1.f;
import qf1.t;
import rd0.d;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ AccountId.Joint v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        c cVar = new c(3, (Continuation) obj4);
        cVar.u = (Data) obj2;
        cVar.v = (AccountId.Joint) obj3;
        return cVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = this.u;
        AccountId.Joint joint = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Throwable error = data.getError();
        if (error != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, error, h0Var);
        }
        List list = (List) data.getContent();
        boolean z = false;
        if ((list != null ? list.contains(SubaccountType.Joint.f88961a) : false) && joint != null) {
            z = true;
        }
        if (z) {
            return new t(f.JOINT_POCKET.getId());
        }
        return null;
    }
}
