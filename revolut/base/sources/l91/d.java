package l91;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.account_switching.impl.data.network.AccountSwitchingService;
import gim.i;
import java.util.ArrayList;
import k91.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import u91.t;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f193016w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f193016w = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new d(this.f193016w, continuation, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new d(this.f193016w, continuation, 1).invokeSuspend(Unit.f186387a);
            case 2:
                return new d(this.f193016w, continuation, 2).invokeSuspend(Unit.f186387a);
            case 3:
                return new d(this.f193016w, continuation, 3).invokeSuspend(Unit.f186387a);
            default:
                return new d(this.f193016w, continuation, 4).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [fim.a] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    AccountSwitchingService accountSwitchingService = this.f193016w.f193020a;
                    this.v = 1;
                    obj2 = accountSwitchingService.getAccountSwitchingIntroData(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return j91.a.a((k91.b) obj2);
            case 1:
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
                this.v = 1;
                Object objA = g.a(this.f193016w, this);
                return objA == aVar2 ? aVar2 : objA;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    AccountSwitchingService accountSwitchingService2 = this.f193016w.f193020a;
                    this.v = 1;
                    obj2 = accountSwitchingService2.getStatus(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return qk.d.C((k91.d) obj2);
            case 3:
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    AccountSwitchingService accountSwitchingService3 = this.f193016w.f193020a;
                    this.v = 1;
                    obj2 = accountSwitchingService3.getSourceBanksDetails(this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                Iterable<k91.o> iterable = (Iterable) obj2;
                arrayList = new ArrayList(w.t(iterable, 10));
                for (k91.o oVar : iterable) {
                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                    arrayList.add(new t(oVar.getId(), oVar.getName(), oVar.getLogoUrl()));
                }
                return arrayList;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    AccountSwitchingService accountSwitchingService4 = this.f193016w.f193020a;
                    this.v = 1;
                    obj2 = accountSwitchingService4.getSubmittedSwitchData(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return t1.S((p) obj2);
        }
    }
}
