package mtj;

import com.revolut.retail.feature.impl.rewards_hub.network.RewardsHubService;
import d0j.h0;
import d0j.x;
import d9.e1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ttj.a0;
import ttj.d1;
import ttj.g1;
import ttj.j1;
import ttj.l2;
import ttj.m1;
import ttj.n1;
import ttj.u;
import ttj.z0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f208884w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(q qVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f208884w = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new l(this.f208884w, continuation, 0).invokeSuspend(Unit.f186387a);
            case 1:
                return new l(this.f208884w, continuation, 1).invokeSuspend(Unit.f186387a);
            default:
                return new l(this.f208884w, continuation, 2).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object challengesEligibility;
        Object rewardsHub;
        x xVar;
        Object unacknowledgedChallenges;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    RewardsHubService rewardsHubService = this.f208884w.f208893a;
                    this.v = 1;
                    challengesEligibility = rewardsHubService.getChallengesEligibility(this);
                    if (challengesEligibility == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    challengesEligibility = obj2;
                }
                return Boolean.valueOf(((a0) challengesEligibility).f274320a);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    RewardsHubService rewardsHubService2 = this.f208884w.f208893a;
                    this.v = 1;
                    rewardsHub = rewardsHubService2.getRewardsHub(this);
                    if (rewardsHub == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    rewardsHub = obj2;
                }
                n1 n1Var = (n1) rewardsHub;
                String str = "<this>";
                Intrinsics.checkNotNullParameter(n1Var, "<this>");
                List<d1> list = n1Var.f274378a;
                int i3 = 10;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (d1 d1Var : list) {
                    Intrinsics.checkNotNullParameter(d1Var, "<this>");
                    String str2 = d1Var.f274332a;
                    String str3 = d1Var.f274333b;
                    z0 z0Var = d1Var.f274334c;
                    Intrinsics.checkNotNullParameter(z0Var, "<this>");
                    arrayList.add(new d0j.b(str2, str3, new d0j.a(z0Var.f274431a, z0Var.f274432b)));
                }
                int i5 = n1Var.f274379b;
                int i6 = n1Var.f274380c;
                List list2 = n1Var.d;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(e1.V((u) it8.next()));
                }
                List<g1> list3 = n1Var.e;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                for (g1 g1Var : list3) {
                    Intrinsics.checkNotNullParameter(g1Var, "<this>");
                    arrayList3.add(new d0j.c(g1Var.f274345a, g1Var.f274346b, g1Var.f274347c, g1Var.d));
                }
                List list4 = n1Var.f;
                ArrayList arrayList4 = new ArrayList(w.t(list4, 10));
                Iterator it9 = list4.iterator();
                while (it9.hasNext()) {
                    j1 j1Var = (j1) it9.next();
                    Intrinsics.checkNotNullParameter(j1Var, str);
                    String str4 = j1Var.f274358a;
                    String str5 = j1Var.f274359b;
                    String str6 = j1Var.f274360c;
                    String str7 = j1Var.d;
                    String str8 = j1Var.e;
                    List list5 = j1Var.f;
                    Iterator it10 = it9;
                    ArrayList arrayList5 = new ArrayList(w.t(list5, i3));
                    Iterator it11 = list5.iterator();
                    while (it11.hasNext()) {
                        m1 m1Var = (m1) it11.next();
                        Intrinsics.checkNotNullParameter(m1Var, str);
                        String str9 = m1Var.f274373a;
                        String str10 = str;
                        String str11 = m1Var.f274374b;
                        String str12 = m1Var.f274375c;
                        Iterator it12 = it11;
                        x[] xVarArrValues = x.values();
                        ArrayList arrayList6 = arrayList;
                        int length = xVarArrValues.length;
                        int i21 = 0;
                        while (true) {
                            if (i21 < length) {
                                xVar = xVarArrValues[i21];
                                int i22 = i21;
                                int i32 = length;
                                if (!kotlin.text.a0.z(xVar.name(), str12, true)) {
                                    i21 = i22 + 1;
                                    length = i32;
                                }
                            } else {
                                xVar = null;
                            }
                        }
                        if (xVar == null) {
                            xVar = x.UNKNOWN;
                        }
                        arrayList5.add(new d0j.e(str9, str11, xVar));
                        it11 = it12;
                        str = str10;
                        arrayList = arrayList6;
                    }
                    arrayList4.add(new d0j.d(str4, str5, str6, str7, str8, arrayList5));
                    it9 = it10;
                    str = str;
                    arrayList = arrayList;
                    i3 = 10;
                }
                return new d0j.f(arrayList, i5, i6, arrayList2, arrayList3, arrayList4);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                q qVar = this.f208884w;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    RewardsHubService rewardsHubService3 = qVar.f208893a;
                    this.v = 1;
                    unacknowledgedChallenges = rewardsHubService3.getUnacknowledgedChallenges(this);
                    if (unacknowledgedChallenges == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    unacknowledgedChallenges = obj2;
                }
                l2 l2Var = (l2) unacknowledgedChallenges;
                Intrinsics.checkNotNullParameter(l2Var, "<this>");
                h0 h0Var = new h0(l2Var.f274366a);
                qVar.k.f(Unit.f186387a);
                return h0Var;
        }
    }
}
