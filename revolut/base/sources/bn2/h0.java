package bn2;

import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockReason;
import com.revolut.feature.backgroundpicker.impl.model.UiAssetLockState;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h0 h0Var = new h0(2, continuation);
        h0Var.u = obj2;
        return h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Iterable iterable = (List) data.getContent();
        if (iterable == null) {
            iterable = zhm.f0.f322471a;
        }
        Iterable<em2.l> iterable2 = iterable;
        int iB = q0.b(zhm.w.t(iterable2, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (em2.l lVar : iterable2) {
            boolean z = lVar.f127594b;
            String str = lVar.f127593a;
            linkedHashMap.put(str, z ? UiAssetLockState.Available.f63805a : new UiAssetLockState.Locked(new UiAssetLockReason.Plan(str)));
        }
        return linkedHashMap;
    }
}
