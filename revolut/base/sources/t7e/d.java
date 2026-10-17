package t7e;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$State;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$SubaccountInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import s6e.z;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.create.flow.main.c f268637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SubaccountType f268638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CreateSubaccountFlowContract$SubaccountInfo f268639y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar, SubaccountType subaccountType, CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo, List list, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f268637w = cVar;
        this.f268638x = subaccountType;
        this.f268639y = createSubaccountFlowContract$SubaccountInfo;
        this.z = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f268637w, this.f268638x, this.f268639y, this.z, continuation, 0);
            default:
                return new d(this.f268637w, this.f268638x, this.f268639y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar = this.f268637w;
                g6e.d dVar = cVar.f89036p;
                CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo = this.f268639y;
                String str = createSubaccountFlowContract$SubaccountInfo.f89034b;
                String str2 = createSubaccountFlowContract$SubaccountInfo.d;
                xi0.b bVar = createSubaccountFlowContract$SubaccountInfo.f89035c;
                List list = ((CreateSubaccountFlowContract$State) ((j2) cVar.z.f22677a).getValue()).f89019b;
                String str3 = cVar.o.d;
                this.v = 1;
                Object objE = ((z) dVar).e(this.f268638x, str, str2, bVar, this.z, str3, this);
                return objE == aVar ? aVar : objE;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar2 = this.f268637w;
                g6e.d dVar2 = cVar2.f89036p;
                CreateSubaccountFlowContract$SubaccountInfo createSubaccountFlowContract$SubaccountInfo2 = this.f268639y;
                String str4 = createSubaccountFlowContract$SubaccountInfo2.f89034b;
                String str5 = createSubaccountFlowContract$SubaccountInfo2.d;
                xi0.b bVar2 = createSubaccountFlowContract$SubaccountInfo2.f89035c;
                List list2 = ((CreateSubaccountFlowContract$State) ((j2) cVar2.z.f22677a).getValue()).f89019b;
                String str6 = cVar2.o.d;
                this.v = 1;
                Object objE2 = ((z) dVar2).e(this.f268638x, str4, str5, bVar2, this.z, str6, this);
                return objE2 == aVar2 ? aVar2 : objE2;
        }
    }
}
