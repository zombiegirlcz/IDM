package pqg;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;
import org.joda.time.Period;
import skm.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f238770b;

    public /* synthetic */ u(i0 i0Var, int i) {
        this.f238769a = i;
        this.f238770b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ncd.c cVar;
        TransferScheduleData transferScheduleData;
        Period period;
        switch (this.f238769a) {
            case 0:
                npg.b customiseVault = (npg.b) obj2;
                Intrinsics.checkNotNullParameter(customiseVault, "customiseVault");
                this.f238770b.x2(new pp5.d(customiseVault, 10));
                return Unit.f186387a;
            case 1:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                i0 i0Var = this.f238770b;
                i0Var.L.onNext(Boolean.TRUE);
                return Boolean.valueOf(i0Var.D2(throwable));
            case 2:
                q pocketData = (q) obj2;
                Intrinsics.checkNotNullParameter(pocketData, "pocketData");
                this.f238770b.x2(new pp5.d(pocketData, 9));
                return Unit.f186387a;
            case 3:
                o it8 = (o) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                i0 i0Var2 = this.f238770b;
                if (!i0Var2.u.f94779h) {
                    return it8;
                }
                SavingsProductData savingsProductData = it8.i;
                xi0.b bVar = it8.f238749a;
                if (savingsProductData == null) {
                    return it8;
                }
                Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
                if (!ocd.a.d(savingsProductData)) {
                    return it8;
                }
                w80.b amountFormatter = i0Var2.z;
                Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
                dj0.d baseAmount = new dj0.d(it8.a(amountFormatter), bVar);
                if (baseAmount.f(dj0.d.e) && Intrinsics.f(it8.f238752g, bVar)) {
                    com.revolut.feature.shared.savings.models.product.a aVar = ncd.c.Companion;
                    SavingsProductData productData = it8.i;
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(baseAmount, "baseAmount");
                    Intrinsics.checkNotNullParameter(productData, "productData");
                    dj0.d dVarA = com.revolut.feature.shared.savings.models.product.a.a(productData.f86683a.f86621h.a().f86649a, baseAmount);
                    SavingsProduct savingsProduct = productData.f86683a;
                    ArrayList arrayList = savingsProduct.f86622j;
                    SavingsProduct.InterestRate interestRate = savingsProduct.f86621h;
                    Iterator it9 = arrayList.iterator();
                    double d = 0.0d;
                    double d5 = 0.0d;
                    while (it9.hasNext()) {
                        d5 += ((SavingsProduct.Deduction) it9.next()).f86635b;
                    }
                    dj0.d dVarA2 = com.revolut.feature.shared.savings.models.product.a.a(d5, baseAmount);
                    double d6 = interestRate.a().f86649a;
                    Iterator it10 = ocd.c.g(productData).iterator();
                    while (it10.hasNext()) {
                        d += ((ProductGroup.TaxBand) zhm.d0.b0(((ProductGroup.Tax) it10.next()).f86584c)).f86586b;
                    }
                    cVar = new ncd.c(dVarA, com.revolut.feature.shared.savings.models.product.a.a(interestRate.a().f86651c, baseAmount), dVarA2, com.revolut.feature.shared.savings.models.product.a.a((d / ((double) 100)) * d6, baseAmount));
                } else {
                    cVar = null;
                }
                return o.b(it8, null, null, 0L, null, null, null, null, null, false, false, cVar, 32767);
            case 4:
                od0.i optionalProduct = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalProduct, "optionalProduct");
                i0 i0Var3 = this.f238770b;
                i0Var3.x2(new pj3.b(optionalProduct, i0Var3, 17));
                return Unit.f186387a;
            case 5:
                this.f238770b.x2(new ocb.u(((Boolean) obj2).booleanValue(), 14));
                return Unit.f186387a;
            case 6:
                Boolean isObserving = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isObserving, "isObserving");
                boolean zF = Intrinsics.f(isObserving, Boolean.TRUE);
                i0 i0Var4 = this.f238770b;
                if (zF) {
                    xi0.b bVar2 = ((o) i0Var4.t2()).f238752g;
                    return te0.w.v(i0Var4.E2(bVar2), nz8.d.r(p0.f264003c, new oqk.i(i0Var4, bVar2, (Continuation) null, 29)), new kp0.m(i0Var4, bVar2, 26)).map(new po9.w(12, new u(i0Var4, 3)));
                }
                if (Intrinsics.f(isObserving, Boolean.FALSE)) {
                    return te0.w.h(i0Var4.t2());
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                this.f238770b.x2(new pp5.d((o) obj2, 8));
                return Unit.f186387a;
            default:
                List list = (List) obj2;
                Intrinsics.h(list);
                qua.p pVar = (qua.p) zhm.d0.d0(list);
                LocalDate localDate = pVar != null ? pVar.f249314a.f : null;
                jli.c cVarK = (pVar == null || (period = pVar.f249314a.f160151b) == null) ? null : jli.e.k(period);
                boolean z = localDate == null || cVarK == null;
                if (z) {
                    transferScheduleData = null;
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    transferScheduleData = new TransferScheduleData(jli.b.b(localDate), cVarK, 4);
                }
                i0 i0Var5 = this.f238770b;
                pcd.s sVar = i0Var5.u.f94775a;
                return new RecurringTransferFlowContract$FlowInput(transferScheduleData, null, pVar != null ? pVar.f249323j : null, sVar.f234881a, sVar.e(), ((o) i0Var5.t2()).f238749a.f306286a);
        }
    }
}
