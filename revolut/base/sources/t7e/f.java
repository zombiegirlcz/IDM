package t7e;

import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$SubaccountInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.create.flow.main.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubaccountType f268643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CreateSubaccountFlowContract$SubaccountInfo f268644x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f268645y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar, SubaccountType subaccountType, CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo, List list, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f268643w = subaccountType;
        this.f268644x = createSubaccountFlowContract$SubaccountInfo;
        this.f268645y = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f268643w, this.f268644x, this.f268645y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar = new e(cVar, this.f268643w, this.f268644x, this.f268645y, null);
            this.u = 1;
            obj2 = cVar.p2(this, eVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return cVar.C1((MainContainerScreenDestination.JustShow) obj2);
    }
}
