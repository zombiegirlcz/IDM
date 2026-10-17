package grj;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le3.a0;
import le3.b0;
import le3.y;
import yua.q;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xua.a f146039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pzi.b f146040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzi.a f146041c;
    public final ge3.e d;

    public k(xua.a recurringPaymentInteractor, pzi.b budgetingInteractor, tzi.a budgetingCycleInteractor, ge3.e transactionCategorisationInteractor) {
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(budgetingInteractor, "budgetingInteractor");
        Intrinsics.checkNotNullParameter(budgetingCycleInteractor, "budgetingCycleInteractor");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        this.f146039a = recurringPaymentInteractor;
        this.f146040b = budgetingInteractor;
        this.f146041c = budgetingCycleInteractor;
        this.d = transactionCategorisationInteractor;
    }

    public final Object a(AccountId.Joint joint, gim.c cVar) {
        pfm.h hVarE = ((i) this.f146040b).e(joint, false);
        String id10 = joint.f51413b;
        Intrinsics.checkNotNullParameter(id10, "id");
        isj.c cVar2 = (isj.c) this.f146041c;
        pfm.a aVar = new pfm.a(cVar2.b(id10), new ir9.a(new isj.b(cVar2, 1), 19), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVarT = ((q) this.f146039a).t(false);
        Intrinsics.checkNotNullParameter(id10, "id");
        b0 b0Var = (b0) this.d;
        pfm.a aVar2 = new pfm.a(b0Var.b(id10), new y(new a0(b0Var, 2), 3), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        efm.b bVarP = efm.b.p(hVarE, aVar, aVarT, aVar2);
        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
        Object objA = nim.a.a(bVarP, cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
