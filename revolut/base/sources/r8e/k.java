package r8e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.impl.ui.edit.invite.flow.InviteMembersFlow;
import com.revolut.feature.subaccount.impl.ui.edit.invite.flow.InviteMembersFlowContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import s6e.z;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Subaccount.Group f252411w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, Subaccount.Group group, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f252411w = group;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f252411w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        n nVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            nVar.X1(q7e.b.b());
            g6e.d dVar = nVar.f252415q;
            String str = nVar.f252414p.f89102a;
            this.u = 1;
            obj2 = ((z) dVar).h(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nVar.s1();
        return yji.l.i2(nVar, new InviteMembersFlow(new InviteMembersFlowContract$InputData(this.f252411w.f88953a.f234881a, (List) obj2)), ModalDestination.Style.POPUP.f98311a, null, 2);
    }
}
