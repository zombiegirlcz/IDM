package com.revolut.feature.insurance.impl.ui.cfac;

import com.revolut.feature.insurance.impl.ui.cfac.CFACInsuranceFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_details.CFACClaimDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claim_expenses.CFACClaimExpensesScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.expense_details.CFACClaimExpenseDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreen;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lfg.z;
import lk7.i;
import rk7.h;
import vk7.e;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements lj7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CFACInsuranceFlowContract$Step f75042t;
    public final CFACInsuranceFlowContract$State u;

    public a(CFACInsuranceFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f75042t = inputData.f75033a;
        this.u = new CFACInsuranceFlowContract$State(0);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CFACInsuranceFlowContract$Step step = (CFACInsuranceFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CFACInsuranceFlowContract$Step.Details) {
            CFACInsuranceDetailsScreen cFACInsuranceDetailsScreen = new CFACInsuranceDetailsScreen(((CFACInsuranceFlowContract$Step.Details) step).f75040a);
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: lj7.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.a f195602b;

                {
                    this.f195602b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            i output = (i) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f195602b.E2(output.f196280a, true, null, false);
                            break;
                        case 1:
                            e output2 = (e) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            this.f195602b.E2(output2.f289876a, true, null, false);
                            break;
                        case 2:
                            h output3 = (h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            this.f195602b.E2(output3.f254760a, true, null, false);
                            break;
                        default:
                            tk7.e output4 = (tk7.e) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f195602b.E2(output4.f271908a, true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            cFACInsuranceDetailsScreen.H = function1;
            return cFACInsuranceDetailsScreen;
        }
        if (step instanceof CFACInsuranceFlowContract$Step.Documents) {
            return new CFACInsuranceDocumentsScreen(((CFACInsuranceFlowContract$Step.Documents) step).f75041a);
        }
        if (step instanceof CFACInsuranceFlowContract$Step.ClaimsList) {
            CFACClaimsListScreen cFACClaimsListScreen = new CFACClaimsListScreen(((CFACInsuranceFlowContract$Step.ClaimsList) step).f75039a);
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: lj7.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.a f195602b;

                {
                    this.f195602b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            i output = (i) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f195602b.E2(output.f196280a, true, null, false);
                            break;
                        case 1:
                            e output2 = (e) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            this.f195602b.E2(output2.f289876a, true, null, false);
                            break;
                        case 2:
                            h output3 = (h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            this.f195602b.E2(output3.f254760a, true, null, false);
                            break;
                        default:
                            tk7.e output4 = (tk7.e) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f195602b.E2(output4.f271908a, true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            cFACClaimsListScreen.H = function12;
            return cFACClaimsListScreen;
        }
        if (step instanceof CFACInsuranceFlowContract$Step.ClaimDetails) {
            CFACClaimDetailsScreen cFACClaimDetailsScreen = new CFACClaimDetailsScreen(((CFACInsuranceFlowContract$Step.ClaimDetails) step).f75035a);
            final int i3 = 2;
            Function1 function13 = new Function1(this) { // from class: lj7.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.a f195602b;

                {
                    this.f195602b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            i output = (i) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f195602b.E2(output.f196280a, true, null, false);
                            break;
                        case 1:
                            e output2 = (e) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            this.f195602b.E2(output2.f289876a, true, null, false);
                            break;
                        case 2:
                            h output3 = (h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            this.f195602b.E2(output3.f254760a, true, null, false);
                            break;
                        default:
                            tk7.e output4 = (tk7.e) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f195602b.E2(output4.f271908a, true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function13, "<set-?>");
            cFACClaimDetailsScreen.H = function13;
            return cFACClaimDetailsScreen;
        }
        if (step instanceof CFACInsuranceFlowContract$Step.ClaimExpenses) {
            CFACClaimExpensesScreen cFACClaimExpensesScreen = new CFACClaimExpensesScreen(((CFACInsuranceFlowContract$Step.ClaimExpenses) step).f75037a);
            final int i5 = 3;
            Function1 function14 = new Function1(this) { // from class: lj7.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.a f195602b;

                {
                    this.f195602b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i5) {
                        case 0:
                            i output = (i) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            this.f195602b.E2(output.f196280a, true, null, false);
                            break;
                        case 1:
                            e output2 = (e) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            this.f195602b.E2(output2.f289876a, true, null, false);
                            break;
                        case 2:
                            h output3 = (h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            this.f195602b.E2(output3.f254760a, true, null, false);
                            break;
                        default:
                            tk7.e output4 = (tk7.e) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f195602b.E2(output4.f271908a, true, null, false);
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function14, "<set-?>");
            cFACClaimExpensesScreen.H = function14;
            return cFACClaimExpensesScreen;
        }
        if (step instanceof CFACInsuranceFlowContract$Step.ClaimExpenseDetails) {
            CFACClaimExpenseDetailsScreen cFACClaimExpenseDetailsScreen = new CFACClaimExpenseDetailsScreen(((CFACInsuranceFlowContract$Step.ClaimExpenseDetails) step).f75036a);
            z zVar = new z(25);
            Intrinsics.checkNotNullParameter(zVar, "<set-?>");
            cFACClaimExpenseDetailsScreen.H = zVar;
            return cFACClaimExpenseDetailsScreen;
        }
        if (!(step instanceof CFACInsuranceFlowContract$Step.ClaimStatusUpdate)) {
            throw new NoWhenBranchMatchedException();
        }
        CFACClaimStatusUpdateScreen cFACClaimStatusUpdateScreen = new CFACClaimStatusUpdateScreen(((CFACInsuranceFlowContract$Step.ClaimStatusUpdate) step).f75038a);
        z zVar2 = new z(26);
        Intrinsics.checkNotNullParameter(zVar2, "<set-?>");
        cFACClaimStatusUpdateScreen.H = zVar2;
        return cFACClaimStatusUpdateScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.u;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f75042t;
    }
}
