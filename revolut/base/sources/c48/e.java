package c48;

import com.revolut.feature.joint.impl.data.network.JointService;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import z38.l;
import z38.m;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f21105w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21105w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f21105w, continuation, 0);
            case 1:
                return new e(this.f21105w, continuation, 1);
            default:
                return new e(this.f21105w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    JointService jointService = this.f21105w.e;
                    this.v = 1;
                    obj2 = jointService.getJointAccounts(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                z38.b accounts = (z38.b) obj2;
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                List accounts2 = accounts.getAccounts();
                if (accounts2 == null) {
                    return f0.f322471a;
                }
                List list = accounts2;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(b48.b.a((z38.a) it8.next()));
                }
                return arrayList;
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
                JointService jointService2 = this.f21105w.e;
                this.v = 1;
                Object userEligibility = jointService2.getUserEligibility(this);
                return userEligibility == aVar2 ? aVar2 : userEligibility;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                g gVar = this.f21105w;
                if (i3 == 0) {
                    o.b(obj2);
                    JointService jointService3 = gVar.e;
                    this.v = 1;
                    obj2 = jointService3.getPendingInvitations(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                b48.b bVar = gVar.f21109b;
                m invitations = (m) obj2;
                Intrinsics.checkNotNullParameter(invitations, "invitations");
                List invitations2 = invitations.getInvitations();
                ArrayList arrayList2 = new ArrayList(w.t(invitations2, 10));
                Iterator it9 = invitations2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(bVar.b((l) it9.next()));
                }
                return arrayList2;
        }
    }
}
