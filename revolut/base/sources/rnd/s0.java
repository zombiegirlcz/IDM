package rnd;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ JuniorBankingProfile f255634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v0 f255635x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(JuniorBankingProfile juniorBankingProfile, v0 v0Var, Continuation continuation) {
        super(3, continuation);
        this.f255634w = juniorBankingProfile;
        this.f255635x = v0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        s0 s0Var = new s0(this.f255634w, this.f255635x, (Continuation) obj4);
        s0Var.u = (Data) obj2;
        s0Var.v = (Set) obj3;
        return s0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        Data data = this.u;
        Set set = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Intrinsics.h(data);
        String str = this.f255634w.f77103j;
        try {
            Object content = data.getContent();
            if (content != null) {
                List list = ((ejb.b) content).f126837b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (!set.contains(((SavingsAccountDetails) obj3).f86460a.f234881a) && !set.contains(str)) {
                        arrayList2.add(obj3);
                    }
                }
                arrayList = new ArrayList(zhm.w.t(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new AnalyticsAccount.Savings.JuniorSaving(((SavingsAccountDetails) it8.next()).f86460a.f234881a, str));
                }
            } else {
                arrayList = null;
            }
            return new Data(arrayList, data.getError(), data.getLoading());
        } catch (Throwable th10) {
            return new Data(null, th10, data.getLoading());
        }
    }
}
