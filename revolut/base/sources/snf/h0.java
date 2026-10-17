package snf;

import com.revolut.core.model.account.AccountId;
import com.revolut.domain.models.joint.JointAccountData;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f264585b;

    public /* synthetic */ h0(l0 l0Var, int i) {
        this.f264584a = i;
        this.f264585b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        AccountId.Joint joint;
        switch (this.f264584a) {
            case 0:
                k71.q transactionsExtraData = (k71.q) obj2;
                Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
                aim.e eVarB = zhm.u.b();
                eVarB.add(AccountId.Personal.f51414a);
                JointAccountData jointAccountData = transactionsExtraData.f181805r;
                if (jointAccountData != null && (joint = jointAccountData.f60312b) != null) {
                    eVarB.add(joint);
                }
                aim.e eVarA = zhm.u.a(eVarB);
                ArrayList arrayList = new ArrayList(zhm.w.t(eVarA, 10));
                ListIterator listIterator = eVarA.listIterator(0);
                while (true) {
                    aim.b bVar = (aim.b) listIterator;
                    if (!bVar.hasNext()) {
                        efm.r map = efm.r.merge(arrayList).scan(new LinkedHashSet(), new sl3.r(new sl5.g(12), 19)).map(new sl3.r(new sl3.i(21), 20));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return map.map(new sl3.r(new ahf.v(transactionsExtraData, 6), 23));
                    }
                    arrayList.add(rd0.e.c(this.f264585b.f264595c.n((AccountId) bVar.next()), kotlin.coroutines.g.f186406a));
                }
                break;
            default:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                Pair pair = (Pair) rVar.f314201a;
                g0 g0Var = (g0) rVar.f314202b;
                na7.a aVar = (na7.a) rVar.f314203c;
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                k71.q qVar = (k71.q) obj3;
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                Set set = (Set) obj4;
                Set setKeySet = qVar.f181806s.keySet();
                if (setKeySet.isEmpty()) {
                    efm.r rVarJust = efm.r.just(new i0(qVar, zhm.h0.f322473a, set, g0Var, aVar));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                Set<String> set2 = setKeySet;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(set2, 10));
                for (String str : set2) {
                    arrayList2.add(((ypg.p) this.f264585b.f264594b).l(w4l.h.f294642c, new pcd.h(new pcd.l(str))));
                }
                efm.r map2 = efm.r.merge(arrayList2).scan(new LinkedHashSet(), new sl3.r(new sl5.g(13), 17)).map(new sl3.r(new sc7.b(qVar, set, g0Var, aVar, 1), 18));
                Intrinsics.h(map2);
                return map2;
        }
    }
}
