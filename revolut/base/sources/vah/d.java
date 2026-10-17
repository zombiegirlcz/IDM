package vah;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.impl.ui.flows.withdraw.WithdrawFlowContract$State;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.retail.trading.core.domain.PocketInfo;
import efl.h;
import gim.i;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import t1h.j;
import vch.y0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.withdraw.b f287295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f287296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y0 f287297y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.wealth.impl.ui.flows.withdraw.b bVar, dj0.d dVar, y0 y0Var, h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f287295w = bVar;
        this.f287296x = dVar;
        this.f287297y = y0Var;
        this.z = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f287295w, this.f287296x, this.f287297y, this.z, continuation, 0);
            default:
                return new d(this.f287295w, this.f287296x, this.f287297y, this.z, continuation, 1);
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
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.wealth.impl.ui.flows.withdraw.b bVar = this.f287295w;
                    j jVar = bVar.f95570p;
                    TransferSubjectId transferSubjectId = bVar.o.f95565a;
                    Data data = this.f287297y.f287750a;
                    PocketInfo pocketInfo = data != null ? (PocketInfo) data.getContent() : null;
                    UUID uuid = ((WithdrawFlowContract$State) ((j2) bVar.f95573s.f22677a).getValue()).f95568a;
                    this.v = 1;
                    if (jVar.a(transferSubjectId, this.f287296x, pocketInfo, uuid, this.z, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.wealth.impl.ui.flows.withdraw.b bVar2 = this.f287295w;
                    d dVar = new d(bVar2, this.f287296x, this.f287297y, this.z, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(bVar2, dVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
