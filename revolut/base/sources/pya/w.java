package pya;

import com.revolut.data.model.Data;
import com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.k1;
import nii.l1;
import nii.n1;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a f240734w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f240734w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                w wVar = new w(this.f240734w, continuation, 0);
                wVar.v = obj2;
                return wVar;
            case 1:
                w wVar2 = new w(this.f240734w, continuation, 1);
                wVar2.v = obj2;
                return wVar2;
            default:
                w wVar3 = new w(this.f240734w, continuation, 2);
                wVar3.v = obj2;
                return wVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((w) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((w) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((w) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a aVar = this.f240734w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.G, new njf.e(list, 27));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(data);
                cli.y yVar = aVar.G;
                ActiveOrPastInviteeDetails activeOrPastInviteeDetails = (ActiveOrPastInviteeDetails) data.getContent();
                if (activeOrPastInviteeDetails != null) {
                    aVar.M2(activeOrPastInviteeDetails);
                } else if (data.getLoading()) {
                    aVar.H2(yVar, new px0.a(20));
                } else if (data.getError() != null) {
                    aVar.H2(yVar, new px0.a(21));
                    aVar.K2();
                }
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof k1) || (n1Var instanceof l1)) {
                    aVar.s1();
                    aVar.B2();
                }
                break;
        }
        return Unit.f186387a;
    }
}
