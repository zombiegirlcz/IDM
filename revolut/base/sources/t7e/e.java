package t7e;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$SubaccountInfo;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.create.flow.main.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubaccountType f268640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CreateSubaccountFlowContract$SubaccountInfo f268641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f268642y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar, SubaccountType subaccountType, CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo, List list, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f268640w = subaccountType;
        this.f268641x = createSubaccountFlowContract$SubaccountInfo;
        this.f268642y = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f268640w, this.f268641x, this.f268642y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d dVar = new d(cVar, this.f268640w, this.f268641x, this.f268642y, null, 1);
            this.u = 1;
            obj2 = l89.e.f192813a.a(dVar, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        Subaccount subaccount = (Subaccount) obj2;
        zfe.e eVar = cVar.f89038r;
        ProductAccountDescriptor$Value.Main main = new ProductAccountDescriptor$Value.Main(new ProductAccountId(subaccount.getF88959a().f234881a, com.revolut.feature.subaccount.api.models.a.b(subaccount.c())), ProductId.SUBACCOUNT);
        MainScreenTab mainScreenTab = ibb.c.f160140a;
        this.u = 2;
        Object objB = ((cge.e) eVar).b(main, mainScreenTab, null, this);
        return objB == aVar ? aVar : objB;
    }
}
