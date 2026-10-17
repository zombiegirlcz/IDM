package fs2;

import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.ContentUser;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.payments_list.BlockedPaymentsListFlowContract$PagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f137570w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f137570w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, this.f137570w, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((IndexedValue) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IndexedValue indexedValue = (IndexedValue) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        int i = indexedValue.f186391a;
        List list = (List) indexedValue.f186392b;
        s0 s0Var = new s0(2);
        s0Var.a(new BlockedPaymentsListFlowContract$PagerItem(ContentUser.Self.f64237b, "SELF_ID_MARKER"));
        s0Var.b(list.toArray(new BlockedPaymentsListFlowContract$PagerItem[0]));
        ArrayList arrayList = s0Var.f186433a;
        List listK = v.k(arrayList.toArray(new BlockedPaymentsListFlowContract$PagerItem[arrayList.size()]));
        o oVar = this.v;
        oVar.H2(oVar.f137573r, new l(this.f137570w, listK, i));
        return Unit.f186387a;
    }
}
