package c48;

import com.revolut.feature.joint.api.JointAccountsApi$Toggles$JointAccountsPendingState;
import com.revolut.feature.joint.impl.data.network.JointService;
import gim.i;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n38.q;
import yhm.o;
import z38.l;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f21103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f21104x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21103w = gVar;
        this.f21104x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f21103w, this.f21104x, continuation, 0);
            case 1:
                return new d(this.f21103w, this.f21104x, continuation, 1);
            case 2:
                return new d(this.f21103w, this.f21104x, continuation, 2);
            case 3:
                return new d(this.f21103w, this.f21104x, continuation, 3);
            default:
                return new d(this.f21103w, this.f21104x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                g gVar = this.f21103w;
                if (i == 0) {
                    o.b(obj2);
                    JointService jointService = gVar.e;
                    this.v = 1;
                    obj2 = jointService.acceptInvitation(this.f21104x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return gVar.f21109b.b((l) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                g gVar2 = this.f21103w;
                if (i2 == 0) {
                    o.b(obj2);
                    JointService jointService2 = gVar2.e;
                    this.v = 1;
                    obj2 = jointService2.createAccount(this.f21104x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                n38.a aVarA = b48.b.a(((z38.c) obj2).getAccount());
                List listA = gVar2.f21112h.a();
                Set setH1 = listA != null ? d0.h1(listA) : new LinkedHashSet();
                if (setH1.add(aVarA)) {
                    gVar2.f21114l.j(Unit.f186387a, d0.d1(setH1));
                }
                gVar2.f21111g.remove("INVITATIONS_CACHE_KEY");
                gVar2.f.I0("INVITATIONS_CACHE_KEY");
                return (((jte.d) gVar2.f21113j).c(JointAccountsApi$Toggles$JointAccountsPendingState.f76458c) || aVarA.f211925c != q.PENDING) ? aVarA : n38.a.a(aVarA, q.ACTIVE);
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                g gVar3 = this.f21103w;
                if (i3 == 0) {
                    o.b(obj2);
                    JointService jointService3 = gVar3.e;
                    this.v = 1;
                    if (jointService3.rejectInvitation(this.f21104x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                gVar3.f21111g.remove("INVITATIONS_CACHE_KEY");
                gVar3.f.I0("INVITATIONS_CACHE_KEY");
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    JointService jointService4 = this.f21103w.e;
                    this.v = 1;
                    if (jointService4.remindInvitee(this.f21104x, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    JointService jointService5 = this.f21103w.e;
                    this.v = 1;
                    if (jointService5.terminateJointAccount(this.f21104x, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
