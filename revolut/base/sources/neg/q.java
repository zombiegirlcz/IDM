package neg;

import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import h93.j0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lnd.n0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f214528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f214529c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q(Subaccount subaccount, List list, o7e.k kVar, ZonedDateTime zonedDateTime) {
        this.f214527a = 22;
        this.f214528b = subaccount;
        this.f214529c = list;
        this.d = zonedDateTime;
    }

    private final Object a(Object obj2) {
        AccountWrapper accountWrapper = (AccountWrapper) this.f214528b;
        dj0.d dVar = (dj0.d) this.f214529c;
        j0 j0Var = (j0) this.d;
        List balanceGroups = (List) obj2;
        Intrinsics.checkNotNullParameter(balanceGroups, "balanceGroups");
        List list = balanceGroups;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((k1j.b) it8.next()).f180284c);
        }
        ArrayList arrayListU = w.u(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayListU) {
            if (!Intrinsics.f(((BalanceWrapper) obj3).f99404a, accountWrapper.getId())) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList2) {
            BalanceWrapper balanceWrapper = (BalanceWrapper) obj4;
            if (Intrinsics.f(balanceWrapper.getF99406c(), dVar.f115083b)) {
                Long l2 = balanceWrapper.f99405b;
                if ((l2 != null ? l2.longValue() : 0L) >= dVar.f115082a) {
                    arrayList3.add(obj4);
                }
            } else {
                dj0.d f = balanceWrapper.getF();
                if (f != null && f.f(dVar)) {
                    arrayList3.add(obj4);
                }
            }
        }
        if (j0Var == j0.PRO) {
            return d0.P0(arrayList3, new m2j.s(new oh3.e(new m2j.s(new oh3.e(new oh3.e(new oh3.e(new m2j.s(new m2j.s(new m2j.s(new oh3.e(new oh3.e(new oh3.e(new oh3.e(new oh3.e(new m2j.s(new m2j.s(new m2j.s(new oh3.e(new n0(3, dVar), cim.b.f(cim.b.e()), 15), 24, cim.b.f(cim.b.e()), dVar), 25, cim.b.f(cim.b.e()), dVar), 26, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 16), cim.b.f(cim.b.e()), 17), cim.b.f(cim.b.e()), 18), cim.b.f(cim.b.e()), 19), cim.b.f(cim.b.e()), 20), 19, cim.b.f(cim.b.e()), dVar), 20, cim.b.f(cim.b.e()), dVar), 21, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 11), cim.b.f(cim.b.e()), 12), cim.b.f(cim.b.e()), 13), 22, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 14), 23, cim.b.f(cim.b.e()), dVar));
        }
        if (j0Var == j0.JOINT_ACCOUNT) {
            return d0.P0(arrayList3, new m2j.s(new bm8.a(new m2j.s(new bm8.a(new m2j.s(new bm8.a(new bm8.a(new bm8.a(new bm8.a(new oh3.e(new m2j.s(new m2j.s(new m2j.s(new bm8.a(new bm8.a(new bm8.a(new m2j.s(new m2j.s(new n0(1, dVar), 6, cim.b.f(cim.b.e()), dVar), 7, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 27), cim.b.f(cim.b.e()), 28), cim.b.f(cim.b.e()), 29), 8, cim.b.f(cim.b.e()), dVar), 9, cim.b.f(cim.b.e()), dVar), 10, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 0), cim.b.f(cim.b.e()), 21), cim.b.f(cim.b.e()), 22), cim.b.f(cim.b.e()), 23), cim.b.f(cim.b.e()), 24), 3, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 25), 4, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 26), 5, cim.b.f(cim.b.e()), dVar));
        }
        return d0.P0(arrayList3, new m2j.s(new oh3.e(new m2j.s(new oh3.e(new m2j.s(new oh3.e(new oh3.e(new oh3.e(new m2j.s(new m2j.s(new m2j.s(new oh3.e(new oh3.e(new oh3.e(new oh3.e(new oh3.e(new m2j.s(new m2j.s(new n0(2, dVar), 15, cim.b.f(cim.b.e()), dVar), 16, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 6), cim.b.f(cim.b.e()), 7), cim.b.f(cim.b.e()), 8), cim.b.f(cim.b.e()), 9), cim.b.f(cim.b.e()), 10), 17, cim.b.f(cim.b.e()), dVar), 18, cim.b.f(cim.b.e()), dVar), 11, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 1), cim.b.f(cim.b.e()), 2), cim.b.f(cim.b.e()), 3), 12, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 4), 13, cim.b.f(cim.b.e()), dVar), cim.b.f(cim.b.e()), 5), 14, cim.b.f(cim.b.e()), dVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0886  */
    /* JADX WARN: Type inference failed for: r17v3, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r18v13, types: [qfg.i] */
    /* JADX WARN: Type inference failed for: r21v6, types: [com.revolut.core.ui_kit.models.avatar.AvatarModel$Border$StaticGradient] */
    /* JADX WARN: Type inference failed for: r6v3, types: [nxa.o] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 2714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: neg.q.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ q(AccountWrapper accountWrapper, dj0.d dVar, j0 j0Var, oh3.f fVar) {
        this.f214527a = 27;
        this.f214528b = accountWrapper;
        this.f214529c = dVar;
        this.d = j0Var;
    }

    public /* synthetic */ q(Object obj2, int i, Object obj3, Object obj4) {
        this.f214527a = i;
        this.f214528b = obj2;
        this.f214529c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ q(Object obj2, Object obj3, String str, int i) {
        this.f214527a = i;
        this.f214528b = obj2;
        this.d = obj3;
        this.f214529c = str;
    }

    public /* synthetic */ q(nvg.t tVar, String str, eel.c cVar, String str2) {
        this.f214527a = 7;
        this.f214529c = str;
        this.f214528b = cVar;
        this.d = str2;
    }
}
