package fz4;

import com.revolut.feature.credit.direct.debit.new_account.DirectDebitNewAccountScreen;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DirectDebitNewAccountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DirectDebitNewAccountScreen directDebitNewAccountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = directDebitNewAccountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DirectDebitNewAccountScreen directDebitNewAccountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                directDebitNewAccountScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = (l) directDebitNewAccountScreen.T2();
                Map map = ((g) lVar.t2()).f139091a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    n nVar = (n) entry.getValue();
                    linkedHashMap.put(key, nVar.f139100a ? nVar.f139102c : nVar.f139101b);
                }
                String str = (String) linkedHashMap.get("sort.code.key");
                String str2 = (String) linkedHashMap.get("account.number.key");
                if (str == null || str2 == null) {
                    lVar.f139098q.getClass();
                    lVar.X1(xy4.b.a());
                } else {
                    lVar.v2(new h(str2, str));
                }
                break;
        }
        return Unit.f186387a;
    }
}
