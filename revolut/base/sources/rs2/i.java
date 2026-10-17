package rs2;

import com.revolut.business.feature.referrals.model.RewardTargetAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KTypeProjection;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f256946w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(n nVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f256946w = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        List list = (List) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(this.f256946w, continuation, 0);
                iVar.v = list;
                return iVar.invokeSuspend(Unit.f186387a);
            case 1:
                i iVar2 = new i(this.f256946w, continuation, 1);
                iVar2.v = list;
                return iVar2.invokeSuspend(Unit.f186387a);
            default:
                i iVar3 = new i(this.f256946w, continuation, 2);
                iVar3.v = list;
                return iVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f256946w;
        switch (i) {
            case 0:
                List list = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = nVar.f256955b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(i26.l.C((RewardTargetAccount) it8.next()));
                }
                cVar.G(arrayList, "BUSINESS_ACCOUNT_KEY", kii.e.o(tu.h.class, KTypeProjection.INSTANCE, List.class));
                break;
            case 1:
                List list3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = nVar.f256955b;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(i26.l.C((RewardTargetAccount) it9.next()));
                }
                cVar2.G(arrayList2, "PERSONAL_ACCOUNT_KEY", kii.e.o(tu.h.class, KTypeProjection.INSTANCE, List.class));
                break;
            default:
                List list5 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar3 = nVar.f256955b;
                List list6 = list5;
                ArrayList arrayList3 = new ArrayList(w.t(list6, 10));
                Iterator it10 = list6.iterator();
                while (it10.hasNext()) {
                    arrayList3.add(i26.l.C((RewardTargetAccount) it10.next()));
                }
                cVar3.G(arrayList3, "RECENT_ACCOUNTS_KEY", kii.e.o(tu.h.class, KTypeProjection.INSTANCE, List.class));
                break;
        }
        return Unit.f186387a;
    }
}
