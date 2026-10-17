package hgb;

import com.revolut.feature.retail.salary_account.impl.salary_hub.SalaryHubController;
import com.revolut.feature.retail.salary_account.impl.salary_hub.SalaryHubControllerContract$ModalStep;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SalaryHubController f152144w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(SalaryHubController salaryHubController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f152144w = salaryHubController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f152144w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f152144w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f152144w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        mgb.f fVar;
        String str;
        int i = this.u;
        SalaryHubController salaryHubController = this.f152144w;
        switch (i) {
            case 0:
                s salaryHubParcel = (s) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar2 = (com.revolut.feature.retail.salary_account.impl.salary_hub.a) salaryHubController.d();
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(salaryHubParcel, "salaryHubParcel");
                if (salaryHubParcel instanceof q) {
                    mgb.o oVar = ((q) salaryHubParcel).f152151a;
                    com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.v;
                    int i2 = y.f152162a[oVar.ordinal()];
                    if (i2 != 1) {
                        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                        SalaryHubControllerContract$ModalStep.SwitchSalary switchSalary = SalaryHubControllerContract$ModalStep.SwitchSalary.f82990a;
                        if (i2 == 2) {
                            mgb.k kVarI2 = aVar2.I2();
                            if (kVarI2 == null || !kVarI2.f205247a) {
                                oki.h.v2(aVar3, switchSalary, bottom_dialog);
                            } else {
                                aVar2.K2(new v(aVar2, 2));
                            }
                        } else {
                            if (i2 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            mgb.k kVarI22 = aVar2.I2();
                            if (kVarI22 == null || !kVarI22.f205247a) {
                                oki.h.v2(aVar3, switchSalary, bottom_dialog);
                            } else {
                                aVar2.K2(new v(aVar2, 0));
                            }
                        }
                    } else {
                        mgb.k kVarI23 = aVar2.I2();
                        if (kVarI23 == null || (fVar = kVarI23.d) == null || (str = fVar.f205236a) == null) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("SalaryHubData with salary draw deeplink is expected to be not null");
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                        } else {
                            aVar2.J2(str);
                        }
                    }
                } else {
                    if (!Intrinsics.f(salaryHubParcel, r.f152152a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C1(AnalyticsFeatureConfig.IncomeSortersList.Destination.f87418a);
                }
                return Unit.f186387a;
            case 1:
                String deeplink = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar5 = (com.revolut.feature.retail.salary_account.impl.salary_hub.a) salaryHubController.d();
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                aVar5.J2(deeplink);
                return Unit.f186387a;
            default:
                String deeplink2 = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar7 = (com.revolut.feature.retail.salary_account.impl.salary_hub.a) salaryHubController.d();
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                aVar7.J2(deeplink2);
                return Unit.f186387a;
        }
    }
}
