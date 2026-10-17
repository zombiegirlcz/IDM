package bec;

import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.impl.total_wealth.models.TotalWealthCategoryViewInfo;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes6.dex */
public final class n0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f14803w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                n0 n0Var = new n0(3, 0, (Continuation) obj4);
                n0Var.f14803w = (Data) obj2;
                n0Var.v = (List) obj3;
                return n0Var.invokeSuspend(Unit.f186387a);
            case 1:
                n0 n0Var2 = new n0(3, 1, (Continuation) obj4);
                n0Var2.v = (List) obj2;
                n0Var2.f14803w = (Data) obj3;
                return n0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                n0 n0Var3 = new n0(3, 2, (Continuation) obj4);
                n0Var3.f14803w = (Data) obj2;
                n0Var3.v = (List) obj3;
                return n0Var3.invokeSuspend(Unit.f186387a);
            default:
                n0 n0Var4 = new n0(3, 3, (Continuation) obj4);
                n0Var4.v = (List) obj2;
                n0Var4.f14803w = (Data) obj3;
                return n0Var4.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h hVar;
        Collection collection;
        switch (this.u) {
            case 0:
                Data data = this.f14803w;
                List list = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content = data.getContent();
                    if (content != null) {
                        u6c.j0 j0Var = (u6c.j0) content;
                        hVar = new h(j0Var.f277565a, list, j0Var.d);
                    } else {
                        hVar = null;
                    }
                    return new Data(hVar, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 1:
                List list2 = this.v;
                Data data2 = this.f14803w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aim.e eVarB = zhm.u.b();
                eVarB.addAll(list2);
                eVarB.add(data2);
                return zhm.u.a(eVarB);
            case 2:
                Data data3 = this.f14803w;
                List list3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    Object content2 = data3.getContent();
                    return new Data(content2 != null ? new dlc.b((Map) content2, list3) : null, data3.getError(), data3.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, data3.getLoading());
                }
            default:
                List list4 = this.v;
                Data data4 = this.f14803w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                TotalWealthCategoryViewInfo totalWealthCategoryViewInfo = (TotalWealthCategoryViewInfo) data4.getContent();
                if (totalWealthCategoryViewInfo == null || (collection = totalWealthCategoryViewInfo.f89606b) == null) {
                    collection = zhm.h0.f322473a;
                }
                return !collection.isEmpty() ? list4 : zhm.f0.f322471a;
        }
    }
}
