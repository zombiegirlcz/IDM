package i95;

import com.revolut.feature.credit.overdraft.impl.network.OverdraftService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ String f159576w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f159577x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f159577x = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        String str = (String) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(this.f159577x, continuation, 0);
                cVar.f159576w = str;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                c cVar2 = new c(this.f159577x, continuation, 1);
                cVar2.f159576w = str;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String facilityId = this.f159576w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                e eVar = this.f159577x;
                if (i == 0) {
                    o.b(obj2);
                    OverdraftService overdraftService = eVar.f159579a;
                    this.f159576w = facilityId;
                    this.v = 1;
                    obj2 = overdraftService.getOverdraftAgreements(facilityId, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                rx4.b agreements = (rx4.b) obj2;
                d0 d0Var = eVar.f159580b;
                Intrinsics.checkNotNullParameter(agreements, "agreements");
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return tx4.a.a(agreements, new c55.b(((ij0.a) d0Var.f226551b).getBaseUrl(), facilityId, 2));
            default:
                String str = this.f159576w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    OverdraftService overdraftService2 = this.f159577x.f159579a;
                    this.f159576w = null;
                    this.v = 1;
                    obj2 = overdraftService2.getOverdraftDetails(str, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return s95.a.a((r95.a) obj2);
        }
    }
}
