package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import ael.s;
import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallengeCreationData;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow.SavingsOnboardingFlowContract$Step;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.retail.core.navigation.FinishCommand;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import xlb.f;
import xlb.g;
import xlb.w;
import xlb.y;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SavingsProductData f83267w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ SavingsChallengeCreationData f83268x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, SavingsProductData savingsProductData, SavingsChallengeCreationData savingsChallengeCreationData, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f83267w = savingsProductData;
        this.f83268x = savingsChallengeCreationData;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f83267w, this.f83268x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            y yVar = eVar.v;
            SavingsOnboardingFlowContract$Input savingsOnboardingFlowContract$Input = eVar.o;
            SavingAccountType savingAccountType = savingsOnboardingFlowContract$Input.f83238b;
            boolean z = savingsOnboardingFlowContract$Input.d;
            this.u = 1;
            yVar.getClass();
            SavingsProductData savingsProductData = this.f83267w;
            int i2 = w.f307007a[savingsProductData.f86683a.f86619c.ordinal()];
            SavingsChallengeCreationData savingsChallengeCreationData = this.f83268x;
            if (i2 == 1 || i2 == 2) {
                SavingsProduct savingsProduct = savingsProductData.f86683a;
                obj2 = new xlb.e(new SavingsAccountCreationStepDestination.Bank(savingAccountType, savingsProduct.f86617a, savingsProduct.f86618b.f306286a, yVar.a(savingsProductData), new FinishCommand(null, null, null, 7), savingsChallengeCreationData, z));
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                obj2 = yVar.b(new s(yVar, savingsProductData, z, savingAccountType, savingsChallengeCreationData, 13), this);
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        g gVar = (g) obj2;
        if (gVar instanceof xlb.e) {
            eVar.T2(new SavingsOnboardingFlowContract$Step.AccountCreation(((xlb.e) gVar).f306982a));
            return Unit.f186387a;
        }
        if (gVar instanceof f) {
            return eVar.C1(u0.b(((f) gVar).f306983a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
