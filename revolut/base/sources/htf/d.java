package htf;

import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreen;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonNode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferReasonsScreen f155364w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TransferReasonsScreen transferReasonsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155364w = transferReasonsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f155364w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f155364w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f155364w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create((TransferReasonNode) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferReasonsScreen transferReasonsScreen = this.f155364w;
        switch (i) {
            case 0:
                ty0.a data = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = transferReasonsScreen.d();
                Intrinsics.h(data);
                r rVar = (r) oVarE3;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                if (Intrinsics.f(data.f275445a, "GET_HELP_ID")) {
                    rVar.f155380p.getClass();
                    rVar.C1(psf.a.a());
                }
                break;
            case 1:
                TransferReasonNode reason = (TransferReasonNode) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE32 = transferReasonsScreen.d();
                Intrinsics.h(reason);
                r rVar2 = (r) oVarE32;
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(reason, "reason");
                rVar2.C2(new m(((g) ((j2) rVar2.u.f22677a).getValue()).f155366b, reason));
                break;
            default:
                TransferReasonNode reason2 = (TransferReasonNode) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE33 = transferReasonsScreen.d();
                Intrinsics.h(reason2);
                r rVar3 = (r) oVarE33;
                rVar3.getClass();
                Intrinsics.checkNotNullParameter(reason2, "reason");
                rVar3.C2(new m(((g) ((j2) rVar3.u.f22677a).getValue()).f155366b, reason2));
                break;
        }
        return Unit.f186387a;
    }
}
