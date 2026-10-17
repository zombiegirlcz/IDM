package com.revolut.feature.insurance.impl.ui.cfac.claim;

import aii.q;
import com.revolut.feature.insurance.api.models.CFACClaimExpense;
import com.revolut.feature.insurance.api.models.CFACClaimingFor;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.api.models.details.CFACClaimFlowMode;
import com.revolut.feature.insurance.api.models.details.CFACClaimProperties;
import com.revolut.feature.insurance.api.models.details.CFACClaimTransactions;
import com.revolut.feature.insurance.api.models.details.CFACExcess;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.models.details.CFACReimbursementType;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$State;
import com.revolut.feature.insurance.impl.ui.cfac.claim.CFACInsuranceClaimFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.coverage_info.CFACInsuranceCoverageInfoScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.manage_expenses.CFACInsuranceManageExpensesScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.manage_expenses.CFACInsuranceManageExpensesScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.other_reason.CFACInsuranceOtherReasonScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.review_claim.CFACInsuranceReviewClaimScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreenContract$InputData;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreenContract$InputData;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.core.navigation.FeatureCommand;
import dki.g;
import ek7.j;
import ek7.k;
import gk7.g;
import gk7.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mj7.b;
import mj7.c;
import mj7.d;
import mj7.f;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f75060t;
    public final CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup u;
    public final CFACInsuranceClaimFlowContract$State v;

    public a(CFACInsuranceClaimFlowContract$InputData.MakeClaim inputData, b claimCacheRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(claimCacheRepository, "claimCacheRepository");
        this.f75060t = claimCacheRepository;
        CFACInsuranceDetails cFACInsuranceDetails = inputData.f75043a;
        dl7.b bVar = inputData.f75044b;
        this.u = new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(cFACInsuranceDetails.a(bVar).e.d);
        boolean z = inputData.f75045c;
        CFACCancellationReason cFACCancellationReason = (CFACCancellationReason) d0.b0(cFACInsuranceDetails.a(bVar).e.d);
        CFACReimbursementType cFACReimbursementType = CFACReimbursementType.DOC_PROOF_REIMBURSEMENT;
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.v = new CFACInsuranceClaimFlowContract$State(cFACInsuranceDetails, bVar, null, cFACCancellationReason, cFACReimbursementType, uuidRandomUUID, z);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        long j2;
        String str;
        CFACClaimingFor cFACClaimingFor;
        CFACExcess cFACExcess;
        CFACInsuranceClaimFlowContract$Step step = (CFACInsuranceClaimFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup) {
            CFACInsuranceReasonGroupScreen cFACInsuranceReasonGroupScreen = new CFACInsuranceReasonGroupScreen(new CFACInsuranceReasonGroupScreenContract$InputData(((CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup) step).f75050a, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).e, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75046a, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).b(), ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75049g));
            final int i = 1;
            Function1 function1 = new Function1(this) { // from class: mj7.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.claim.a f205939b;

                {
                    this.f205939b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CFACClaimFlowMode cFACClaimFlowMode;
                    switch (i) {
                        case 0:
                            gk7.g output = (gk7.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, g.a.f144333a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar = this.f205939b;
                            if (zF) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((h) output).f144335b) {
                                    aVar.q2();
                                } else {
                                    aVar.E2(CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails.f75055a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            ck7.h output2 = (ck7.h) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof ck7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar2 = this.f205939b;
                            if (z) {
                                CFACCancellationReason cFACCancellationReason = ((ck7.f) output2).f24790a;
                                if (ue0.e.n(cFACCancellationReason.d)) {
                                    aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, cFACCancellationReason, null, LDSFile.EF_SOD_TAG));
                                    aVar2.E2(Intrinsics.f(cFACCancellationReason.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                                } else {
                                    aVar2.E2(new CFACInsuranceClaimFlowContract$Step.ExactCancellationReason(cFACCancellationReason), true, null, false);
                                }
                            } else {
                                if (!(output2 instanceof ck7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, null, ((ck7.g) output2).f24791a, 103));
                                aVar2.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            uj7.h output3 = (uj7.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z3 = output3 instanceof uj7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar3 = this.f205939b;
                            if (z3) {
                                CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a;
                                CFACCancellationReason cFACCancellationReason2 = ((uj7.f) output3).f280526a;
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a(cFACInsuranceClaimFlowContract$State, null, cFACCancellationReason2, null, LDSFile.EF_SOD_TAG));
                                aVar3.E2(Intrinsics.f(cFACCancellationReason2.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            } else {
                                if (!(output3 instanceof uj7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a, null, null, ((uj7.g) output3).f280527a, LDSFile.EF_DG15_TAG));
                                aVar3.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            yj7.f output4 = (yj7.f) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f205939b.E2(output4.f314429a, true, null, false);
                            return Unit.f186387a;
                        case 4:
                            q it8 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar4 = this.f205939b;
                            CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State2 = (CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a;
                            int i2 = d.f205937a[cFACInsuranceClaimFlowContract$State2.e.ordinal()];
                            if (i2 == 1) {
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().e.f75010g;
                            } else {
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().f.f75010g;
                            }
                            if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
                                CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
                                aVar4.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a(everydayProtection.f74970a, everydayProtection.f74971b))));
                            } else if (((CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT) {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(7), true, null, false);
                            } else {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            }
                            return Unit.f186387a;
                        case 5:
                            j output5 = (j) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean zF2 = Intrinsics.f(output5, j.a.f126968a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar5 = this.f205939b;
                            if (zF2) {
                                aVar5.I2();
                            } else {
                                if (!(output5 instanceof k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.E2(((k) output5).f126969a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 6:
                            Intrinsics.checkNotNullParameter((jk7.h) obj2, "output");
                            this.f205939b.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            return Unit.f186387a;
                        default:
                            ak7.e output6 = (ak7.e) obj2;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar6 = this.f205939b;
                            aVar6.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar6.A2().f98429a, output6.f5728a, null, null, 123));
                            aVar6.E2(CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            cFACInsuranceReasonGroupScreen.H = function1;
            return cFACInsuranceReasonGroupScreen;
        }
        if (step instanceof CFACInsuranceClaimFlowContract$Step.ExactCancellationReason) {
            CFACCancellationReason cFACCancellationReason = ((CFACInsuranceClaimFlowContract$Step.ExactCancellationReason) step).f75052a;
            String str2 = cFACCancellationReason.f74969c;
            List list = cFACCancellationReason.d;
            Intrinsics.h(list);
            CFACInsuranceExactReasonScreen cFACInsuranceExactReasonScreen = new CFACInsuranceExactReasonScreen(new CFACInsuranceExactReasonScreenContract$InputData(str2, list, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).e, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75046a, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).b(), ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75049g));
            final int i2 = 2;
            Function1 function12 = new Function1(this) { // from class: mj7.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.claim.a f205939b;

                {
                    this.f205939b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CFACClaimFlowMode cFACClaimFlowMode;
                    switch (i2) {
                        case 0:
                            gk7.g output = (gk7.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, g.a.f144333a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar = this.f205939b;
                            if (zF) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((h) output).f144335b) {
                                    aVar.q2();
                                } else {
                                    aVar.E2(CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails.f75055a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            ck7.h output2 = (ck7.h) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof ck7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar2 = this.f205939b;
                            if (z) {
                                CFACCancellationReason cFACCancellationReason2 = ((ck7.f) output2).f24790a;
                                if (ue0.e.n(cFACCancellationReason2.d)) {
                                    aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, cFACCancellationReason2, null, LDSFile.EF_SOD_TAG));
                                    aVar2.E2(Intrinsics.f(cFACCancellationReason2.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                                } else {
                                    aVar2.E2(new CFACInsuranceClaimFlowContract$Step.ExactCancellationReason(cFACCancellationReason2), true, null, false);
                                }
                            } else {
                                if (!(output2 instanceof ck7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, null, ((ck7.g) output2).f24791a, 103));
                                aVar2.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            uj7.h output3 = (uj7.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z3 = output3 instanceof uj7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar3 = this.f205939b;
                            if (z3) {
                                CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a;
                                CFACCancellationReason cFACCancellationReason22 = ((uj7.f) output3).f280526a;
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a(cFACInsuranceClaimFlowContract$State, null, cFACCancellationReason22, null, LDSFile.EF_SOD_TAG));
                                aVar3.E2(Intrinsics.f(cFACCancellationReason22.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            } else {
                                if (!(output3 instanceof uj7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a, null, null, ((uj7.g) output3).f280527a, LDSFile.EF_DG15_TAG));
                                aVar3.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            yj7.f output4 = (yj7.f) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f205939b.E2(output4.f314429a, true, null, false);
                            return Unit.f186387a;
                        case 4:
                            q it8 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar4 = this.f205939b;
                            CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State2 = (CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a;
                            int i22 = d.f205937a[cFACInsuranceClaimFlowContract$State2.e.ordinal()];
                            if (i22 == 1) {
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().e.f75010g;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().f.f75010g;
                            }
                            if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
                                CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
                                aVar4.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a(everydayProtection.f74970a, everydayProtection.f74971b))));
                            } else if (((CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT) {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(7), true, null, false);
                            } else {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            }
                            return Unit.f186387a;
                        case 5:
                            j output5 = (j) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean zF2 = Intrinsics.f(output5, j.a.f126968a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar5 = this.f205939b;
                            if (zF2) {
                                aVar5.I2();
                            } else {
                                if (!(output5 instanceof k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.E2(((k) output5).f126969a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 6:
                            Intrinsics.checkNotNullParameter((jk7.h) obj2, "output");
                            this.f205939b.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            return Unit.f186387a;
                        default:
                            ak7.e output6 = (ak7.e) obj2;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar6 = this.f205939b;
                            aVar6.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar6.A2().f98429a, output6.f5728a, null, null, 123));
                            aVar6.E2(CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            cFACInsuranceExactReasonScreen.H = function12;
            return cFACInsuranceExactReasonScreen;
        }
        if (step instanceof CFACInsuranceClaimFlowContract$Step.OtherReason) {
            CFACInsuranceOtherReasonScreen cFACInsuranceOtherReasonScreen = new CFACInsuranceOtherReasonScreen();
            final int i3 = 7;
            Function1 function13 = new Function1(this) { // from class: mj7.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.claim.a f205939b;

                {
                    this.f205939b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CFACClaimFlowMode cFACClaimFlowMode;
                    switch (i3) {
                        case 0:
                            gk7.g output = (gk7.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, g.a.f144333a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar = this.f205939b;
                            if (zF) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((h) output).f144335b) {
                                    aVar.q2();
                                } else {
                                    aVar.E2(CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails.f75055a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            ck7.h output2 = (ck7.h) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof ck7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar2 = this.f205939b;
                            if (z) {
                                CFACCancellationReason cFACCancellationReason2 = ((ck7.f) output2).f24790a;
                                if (ue0.e.n(cFACCancellationReason2.d)) {
                                    aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, cFACCancellationReason2, null, LDSFile.EF_SOD_TAG));
                                    aVar2.E2(Intrinsics.f(cFACCancellationReason2.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                                } else {
                                    aVar2.E2(new CFACInsuranceClaimFlowContract$Step.ExactCancellationReason(cFACCancellationReason2), true, null, false);
                                }
                            } else {
                                if (!(output2 instanceof ck7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, null, ((ck7.g) output2).f24791a, 103));
                                aVar2.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            uj7.h output3 = (uj7.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z3 = output3 instanceof uj7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar3 = this.f205939b;
                            if (z3) {
                                CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a;
                                CFACCancellationReason cFACCancellationReason22 = ((uj7.f) output3).f280526a;
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a(cFACInsuranceClaimFlowContract$State, null, cFACCancellationReason22, null, LDSFile.EF_SOD_TAG));
                                aVar3.E2(Intrinsics.f(cFACCancellationReason22.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            } else {
                                if (!(output3 instanceof uj7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a, null, null, ((uj7.g) output3).f280527a, LDSFile.EF_DG15_TAG));
                                aVar3.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            yj7.f output4 = (yj7.f) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f205939b.E2(output4.f314429a, true, null, false);
                            return Unit.f186387a;
                        case 4:
                            q it8 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar4 = this.f205939b;
                            CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State2 = (CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a;
                            int i22 = d.f205937a[cFACInsuranceClaimFlowContract$State2.e.ordinal()];
                            if (i22 == 1) {
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().e.f75010g;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().f.f75010g;
                            }
                            if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
                                CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
                                aVar4.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a(everydayProtection.f74970a, everydayProtection.f74971b))));
                            } else if (((CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT) {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(7), true, null, false);
                            } else {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            }
                            return Unit.f186387a;
                        case 5:
                            j output5 = (j) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean zF2 = Intrinsics.f(output5, j.a.f126968a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar5 = this.f205939b;
                            if (zF2) {
                                aVar5.I2();
                            } else {
                                if (!(output5 instanceof k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.E2(((k) output5).f126969a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 6:
                            Intrinsics.checkNotNullParameter((jk7.h) obj2, "output");
                            this.f205939b.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            return Unit.f186387a;
                        default:
                            ak7.e output6 = (ak7.e) obj2;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar6 = this.f205939b;
                            aVar6.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar6.A2().f98429a, output6.f5728a, null, null, 123));
                            aVar6.E2(CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function13, "<set-?>");
            cFACInsuranceOtherReasonScreen.H = function13;
            return cFACInsuranceOtherReasonScreen;
        }
        if (step instanceof CFACInsuranceClaimFlowContract$Step.CoverageInfo) {
            CFACCancellationReason cFACCancellationReason2 = ((CFACInsuranceClaimFlowContract$State) A2().f98429a).d;
            if (cFACCancellationReason2 == null) {
                throw new IllegalStateException("cancellationReason must be selected");
            }
            CFACInsuranceCoverageInfoScreen cFACInsuranceCoverageInfoScreen = new CFACInsuranceCoverageInfoScreen(new CFACInsuranceCoverageInfoScreenContract$InputData(((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75048c, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).e, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75046a, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).b(), cFACCancellationReason2));
            final int i5 = 4;
            Function1 function14 = new Function1(this) { // from class: mj7.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.claim.a f205939b;

                {
                    this.f205939b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CFACClaimFlowMode cFACClaimFlowMode;
                    switch (i5) {
                        case 0:
                            gk7.g output = (gk7.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, g.a.f144333a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar = this.f205939b;
                            if (zF) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((h) output).f144335b) {
                                    aVar.q2();
                                } else {
                                    aVar.E2(CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails.f75055a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            ck7.h output2 = (ck7.h) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof ck7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar2 = this.f205939b;
                            if (z) {
                                CFACCancellationReason cFACCancellationReason22 = ((ck7.f) output2).f24790a;
                                if (ue0.e.n(cFACCancellationReason22.d)) {
                                    aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, cFACCancellationReason22, null, LDSFile.EF_SOD_TAG));
                                    aVar2.E2(Intrinsics.f(cFACCancellationReason22.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                                } else {
                                    aVar2.E2(new CFACInsuranceClaimFlowContract$Step.ExactCancellationReason(cFACCancellationReason22), true, null, false);
                                }
                            } else {
                                if (!(output2 instanceof ck7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, null, ((ck7.g) output2).f24791a, 103));
                                aVar2.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            uj7.h output3 = (uj7.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z3 = output3 instanceof uj7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar3 = this.f205939b;
                            if (z3) {
                                CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a;
                                CFACCancellationReason cFACCancellationReason222 = ((uj7.f) output3).f280526a;
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a(cFACInsuranceClaimFlowContract$State, null, cFACCancellationReason222, null, LDSFile.EF_SOD_TAG));
                                aVar3.E2(Intrinsics.f(cFACCancellationReason222.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            } else {
                                if (!(output3 instanceof uj7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a, null, null, ((uj7.g) output3).f280527a, LDSFile.EF_DG15_TAG));
                                aVar3.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            yj7.f output4 = (yj7.f) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f205939b.E2(output4.f314429a, true, null, false);
                            return Unit.f186387a;
                        case 4:
                            q it8 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar4 = this.f205939b;
                            CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State2 = (CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a;
                            int i22 = d.f205937a[cFACInsuranceClaimFlowContract$State2.e.ordinal()];
                            if (i22 == 1) {
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().e.f75010g;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().f.f75010g;
                            }
                            if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
                                CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
                                aVar4.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a(everydayProtection.f74970a, everydayProtection.f74971b))));
                            } else if (((CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT) {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(7), true, null, false);
                            } else {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            }
                            return Unit.f186387a;
                        case 5:
                            j output5 = (j) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean zF2 = Intrinsics.f(output5, j.a.f126968a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar5 = this.f205939b;
                            if (zF2) {
                                aVar5.I2();
                            } else {
                                if (!(output5 instanceof k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.E2(((k) output5).f126969a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 6:
                            Intrinsics.checkNotNullParameter((jk7.h) obj2, "output");
                            this.f205939b.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            return Unit.f186387a;
                        default:
                            ak7.e output6 = (ak7.e) obj2;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar6 = this.f205939b;
                            aVar6.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar6.A2().f98429a, output6.f5728a, null, null, 123));
                            aVar6.E2(CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function14, "<set-?>");
            cFACInsuranceCoverageInfoScreen.H = function14;
            return cFACInsuranceCoverageInfoScreen;
        }
        if (step instanceof CFACInsuranceClaimFlowContract$Step.SelectExpenses) {
            CFACInsuranceClaimFlowContract$Step.SelectExpenses selectExpenses = (CFACInsuranceClaimFlowContract$Step.SelectExpenses) step;
            CFACClaimTransactions cFACClaimTransactions = ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75046a.d.f74973a;
            CFACClaimProperties cFACClaimProperties = ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75046a.d;
            List listB = this.f75060t.b();
            ArrayList arrayList = new ArrayList(w.t(listB, 10));
            Iterator it8 = listB.iterator();
            while (it8.hasNext()) {
                arrayList.add(((CFACClaimExpense) it8.next()).f74926a.f272579a);
            }
            CFACInsuranceSelectExpensesScreen cFACInsuranceSelectExpensesScreen = new CFACInsuranceSelectExpensesScreen(new CFACInsuranceSelectExpensesScreenContract$InputData(cFACClaimTransactions, cFACClaimProperties, d0.i1(arrayList), selectExpenses.f75056a));
            final int i6 = 0;
            Function1 function15 = new Function1(this) { // from class: mj7.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.claim.a f205939b;

                {
                    this.f205939b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CFACClaimFlowMode cFACClaimFlowMode;
                    switch (i6) {
                        case 0:
                            gk7.g output = (gk7.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, g.a.f144333a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar = this.f205939b;
                            if (zF) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((h) output).f144335b) {
                                    aVar.q2();
                                } else {
                                    aVar.E2(CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails.f75055a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            ck7.h output2 = (ck7.h) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof ck7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar2 = this.f205939b;
                            if (z) {
                                CFACCancellationReason cFACCancellationReason22 = ((ck7.f) output2).f24790a;
                                if (ue0.e.n(cFACCancellationReason22.d)) {
                                    aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, cFACCancellationReason22, null, LDSFile.EF_SOD_TAG));
                                    aVar2.E2(Intrinsics.f(cFACCancellationReason22.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                                } else {
                                    aVar2.E2(new CFACInsuranceClaimFlowContract$Step.ExactCancellationReason(cFACCancellationReason22), true, null, false);
                                }
                            } else {
                                if (!(output2 instanceof ck7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, null, ((ck7.g) output2).f24791a, 103));
                                aVar2.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            uj7.h output3 = (uj7.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z3 = output3 instanceof uj7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar3 = this.f205939b;
                            if (z3) {
                                CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a;
                                CFACCancellationReason cFACCancellationReason222 = ((uj7.f) output3).f280526a;
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a(cFACInsuranceClaimFlowContract$State, null, cFACCancellationReason222, null, LDSFile.EF_SOD_TAG));
                                aVar3.E2(Intrinsics.f(cFACCancellationReason222.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            } else {
                                if (!(output3 instanceof uj7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a, null, null, ((uj7.g) output3).f280527a, LDSFile.EF_DG15_TAG));
                                aVar3.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            yj7.f output4 = (yj7.f) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f205939b.E2(output4.f314429a, true, null, false);
                            return Unit.f186387a;
                        case 4:
                            q it82 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it82, "it");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar4 = this.f205939b;
                            CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State2 = (CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a;
                            int i22 = d.f205937a[cFACInsuranceClaimFlowContract$State2.e.ordinal()];
                            if (i22 == 1) {
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().e.f75010g;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().f.f75010g;
                            }
                            if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
                                CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
                                aVar4.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a(everydayProtection.f74970a, everydayProtection.f74971b))));
                            } else if (((CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT) {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(7), true, null, false);
                            } else {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            }
                            return Unit.f186387a;
                        case 5:
                            j output5 = (j) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean zF2 = Intrinsics.f(output5, j.a.f126968a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar5 = this.f205939b;
                            if (zF2) {
                                aVar5.I2();
                            } else {
                                if (!(output5 instanceof k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.E2(((k) output5).f126969a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 6:
                            Intrinsics.checkNotNullParameter((jk7.h) obj2, "output");
                            this.f205939b.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            return Unit.f186387a;
                        default:
                            ak7.e output6 = (ak7.e) obj2;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar6 = this.f205939b;
                            aVar6.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar6.A2().f98429a, output6.f5728a, null, null, 123));
                            aVar6.E2(CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function15, "<set-?>");
            cFACInsuranceSelectExpensesScreen.H = function15;
            return cFACInsuranceSelectExpensesScreen;
        }
        if (step instanceof CFACInsuranceClaimFlowContract$Step.SupportingDocuments) {
            CFACInsuranceClaimFlowContract$Step.SupportingDocuments supportingDocuments = (CFACInsuranceClaimFlowContract$Step.SupportingDocuments) step;
            CFACCancellationReason cFACCancellationReason3 = ((CFACInsuranceClaimFlowContract$State) A2().f98429a).d;
            CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen = new CFACInsuranceSupportingDocumentsScreen(new CFACInsuranceSupportingDocumentsScreenContract$InputData(cFACCancellationReason3 != null ? cFACCancellationReason3.e : null, supportingDocuments.f75059c, supportingDocuments.f75057a, supportingDocuments.f75058b));
            final int i21 = 6;
            Function1 function16 = new Function1(this) { // from class: mj7.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.claim.a f205939b;

                {
                    this.f205939b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CFACClaimFlowMode cFACClaimFlowMode;
                    switch (i21) {
                        case 0:
                            gk7.g output = (gk7.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, g.a.f144333a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar = this.f205939b;
                            if (zF) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((h) output).f144335b) {
                                    aVar.q2();
                                } else {
                                    aVar.E2(CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails.f75055a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            ck7.h output2 = (ck7.h) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof ck7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar2 = this.f205939b;
                            if (z) {
                                CFACCancellationReason cFACCancellationReason22 = ((ck7.f) output2).f24790a;
                                if (ue0.e.n(cFACCancellationReason22.d)) {
                                    aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, cFACCancellationReason22, null, LDSFile.EF_SOD_TAG));
                                    aVar2.E2(Intrinsics.f(cFACCancellationReason22.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                                } else {
                                    aVar2.E2(new CFACInsuranceClaimFlowContract$Step.ExactCancellationReason(cFACCancellationReason22), true, null, false);
                                }
                            } else {
                                if (!(output2 instanceof ck7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, null, ((ck7.g) output2).f24791a, 103));
                                aVar2.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            uj7.h output3 = (uj7.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z3 = output3 instanceof uj7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar3 = this.f205939b;
                            if (z3) {
                                CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a;
                                CFACCancellationReason cFACCancellationReason222 = ((uj7.f) output3).f280526a;
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a(cFACInsuranceClaimFlowContract$State, null, cFACCancellationReason222, null, LDSFile.EF_SOD_TAG));
                                aVar3.E2(Intrinsics.f(cFACCancellationReason222.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            } else {
                                if (!(output3 instanceof uj7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a, null, null, ((uj7.g) output3).f280527a, LDSFile.EF_DG15_TAG));
                                aVar3.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            yj7.f output4 = (yj7.f) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f205939b.E2(output4.f314429a, true, null, false);
                            return Unit.f186387a;
                        case 4:
                            q it82 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it82, "it");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar4 = this.f205939b;
                            CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State2 = (CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a;
                            int i22 = d.f205937a[cFACInsuranceClaimFlowContract$State2.e.ordinal()];
                            if (i22 == 1) {
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().e.f75010g;
                            } else {
                                if (i22 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().f.f75010g;
                            }
                            if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
                                CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
                                aVar4.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a(everydayProtection.f74970a, everydayProtection.f74971b))));
                            } else if (((CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT) {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(7), true, null, false);
                            } else {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            }
                            return Unit.f186387a;
                        case 5:
                            j output5 = (j) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean zF2 = Intrinsics.f(output5, j.a.f126968a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar5 = this.f205939b;
                            if (zF2) {
                                aVar5.I2();
                            } else {
                                if (!(output5 instanceof k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.E2(((k) output5).f126969a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 6:
                            Intrinsics.checkNotNullParameter((jk7.h) obj2, "output");
                            this.f205939b.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            return Unit.f186387a;
                        default:
                            ak7.e output6 = (ak7.e) obj2;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar6 = this.f205939b;
                            aVar6.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar6.A2().f98429a, output6.f5728a, null, null, 123));
                            aVar6.E2(CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function16, "<set-?>");
            cFACInsuranceSupportingDocumentsScreen.H = function16;
            return cFACInsuranceSupportingDocumentsScreen;
        }
        if (!(step instanceof CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails)) {
            if (!(step instanceof CFACInsuranceClaimFlowContract$Step.ManageExpenses)) {
                throw new NoWhenBranchMatchedException();
            }
            CFACInsuranceManageExpensesScreen cFACInsuranceManageExpensesScreen = new CFACInsuranceManageExpensesScreen(new CFACInsuranceManageExpensesScreenContract$InputData(((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75046a));
            final int i22 = 3;
            Function1 function17 = new Function1(this) { // from class: mj7.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.claim.a f205939b;

                {
                    this.f205939b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    CFACClaimFlowMode cFACClaimFlowMode;
                    switch (i22) {
                        case 0:
                            gk7.g output = (gk7.g) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean zF = Intrinsics.f(output, g.a.f144333a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar = this.f205939b;
                            if (zF) {
                                aVar.I2();
                            } else {
                                if (!(output instanceof h)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((h) output).f144335b) {
                                    aVar.q2();
                                } else {
                                    aVar.E2(CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails.f75055a, true, null, false);
                                }
                            }
                            return Unit.f186387a;
                        case 1:
                            ck7.h output2 = (ck7.h) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            boolean z = output2 instanceof ck7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar2 = this.f205939b;
                            if (z) {
                                CFACCancellationReason cFACCancellationReason22 = ((ck7.f) output2).f24790a;
                                if (ue0.e.n(cFACCancellationReason22.d)) {
                                    aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, cFACCancellationReason22, null, LDSFile.EF_SOD_TAG));
                                    aVar2.E2(Intrinsics.f(cFACCancellationReason22.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                                } else {
                                    aVar2.E2(new CFACInsuranceClaimFlowContract$Step.ExactCancellationReason(cFACCancellationReason22), true, null, false);
                                }
                            } else {
                                if (!(output2 instanceof ck7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, null, ((ck7.g) output2).f24791a, 103));
                                aVar2.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            uj7.h output3 = (uj7.h) obj2;
                            Intrinsics.checkNotNullParameter(output3, "output");
                            boolean z3 = output3 instanceof uj7.f;
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar3 = this.f205939b;
                            if (z3) {
                                CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a;
                                CFACCancellationReason cFACCancellationReason222 = ((uj7.f) output3).f280526a;
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a(cFACInsuranceClaimFlowContract$State, null, cFACCancellationReason222, null, LDSFile.EF_SOD_TAG));
                                aVar3.E2(Intrinsics.f(cFACCancellationReason222.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            } else {
                                if (!(output3 instanceof uj7.g)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a, null, null, ((uj7.g) output3).f280527a, LDSFile.EF_DG15_TAG));
                                aVar3.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a).b().f.d), false, null, false);
                            }
                            return Unit.f186387a;
                        case 3:
                            yj7.f output4 = (yj7.f) obj2;
                            Intrinsics.checkNotNullParameter(output4, "output");
                            this.f205939b.E2(output4.f314429a, true, null, false);
                            return Unit.f186387a;
                        case 4:
                            q it82 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it82, "it");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar4 = this.f205939b;
                            CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State2 = (CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a;
                            int i222 = d.f205937a[cFACInsuranceClaimFlowContract$State2.e.ordinal()];
                            if (i222 == 1) {
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().e.f75010g;
                            } else {
                                if (i222 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State2.b().f.f75010g;
                            }
                            if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
                                CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
                                aVar4.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a(everydayProtection.f74970a, everydayProtection.f74971b))));
                            } else if (((CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT) {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(7), true, null, false);
                            } else {
                                aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            }
                            return Unit.f186387a;
                        case 5:
                            j output5 = (j) obj2;
                            Intrinsics.checkNotNullParameter(output5, "output");
                            boolean zF2 = Intrinsics.f(output5, j.a.f126968a);
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar5 = this.f205939b;
                            if (zF2) {
                                aVar5.I2();
                            } else {
                                if (!(output5 instanceof k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar5.E2(((k) output5).f126969a, true, null, false);
                            }
                            return Unit.f186387a;
                        case 6:
                            Intrinsics.checkNotNullParameter((jk7.h) obj2, "output");
                            this.f205939b.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                            return Unit.f186387a;
                        default:
                            ak7.e output6 = (ak7.e) obj2;
                            Intrinsics.checkNotNullParameter(output6, "output");
                            com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar6 = this.f205939b;
                            aVar6.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar6.A2().f98429a, output6.f5728a, null, null, 123));
                            aVar6.E2(CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function17, "<set-?>");
            cFACInsuranceManageExpensesScreen.H = function17;
            return cFACInsuranceManageExpensesScreen;
        }
        CFACInsuranceDetails cFACInsuranceDetails = ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75046a;
        CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State = (CFACInsuranceClaimFlowContract$State) A2().f98429a;
        String str3 = cFACInsuranceClaimFlowContract$State.f75048c;
        if (str3 == null) {
            CFACCancellationReason cFACCancellationReason4 = cFACInsuranceClaimFlowContract$State.d;
            String str4 = cFACCancellationReason4 != null ? cFACCancellationReason4.f74969c : null;
            if (str4 == null) {
                m70.a.c(t0.f186434a);
                str3 = "";
            } else {
                str3 = str4;
            }
        }
        CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State2 = (CFACInsuranceClaimFlowContract$State) A2().f98429a;
        CFACReimbursementType cFACReimbursementType = cFACInsuranceClaimFlowContract$State2.e;
        int[] iArr = d.f205937a;
        int i32 = iArr[cFACReimbursementType.ordinal()];
        if (i32 == 1) {
            j2 = cFACInsuranceClaimFlowContract$State2.b().e.f75007a;
        } else {
            if (i32 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            j2 = cFACInsuranceClaimFlowContract$State2.b().f.f75007a;
        }
        boolean z = ((CFACInsuranceClaimFlowContract$State) A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT;
        CFACCancellationReason cFACCancellationReason5 = ((CFACInsuranceClaimFlowContract$State) A2().f98429a).d;
        if (cFACCancellationReason5 == null || (str = cFACCancellationReason5.f74968b) == null) {
            throw new IllegalStateException("reasonCode must be selected on the ExactCancellationReason step");
        }
        String str5 = ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75048c;
        int i33 = f.f205940a[((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75047b.f115711a.ordinal()];
        if (i33 == 1) {
            cFACClaimingFor = CFACClaimingFor.EVENT;
        } else {
            if (i33 != 2) {
                throw new IllegalStateException("Supported claims only for Event and Trip cancellation. Selected subtype is " + ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f75047b.f115711a);
            }
            cFACClaimingFor = CFACClaimingFor.TRIP;
        }
        CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State3 = (CFACInsuranceClaimFlowContract$State) A2().f98429a;
        int i43 = iArr[cFACInsuranceClaimFlowContract$State3.e.ordinal()];
        if (i43 == 1) {
            cFACExcess = cFACInsuranceClaimFlowContract$State3.b().e.f75009c;
        } else {
            if (i43 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cFACExcess = cFACInsuranceClaimFlowContract$State3.b().f.f75009c;
        }
        CFACInsuranceReviewClaimScreen cFACInsuranceReviewClaimScreen = new CFACInsuranceReviewClaimScreen(new CFACInsuranceReviewClaimScreenContract$InputData(cFACInsuranceDetails, str3, j2, z, str, str5, cFACClaimingFor, cFACExcess, ((CFACInsuranceClaimFlowContract$State) A2().f98429a).f));
        final int i59 = 5;
        Function1 function18 = new Function1(this) { // from class: mj7.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.insurance.impl.ui.cfac.claim.a f205939b;

            {
                this.f205939b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CFACClaimFlowMode cFACClaimFlowMode;
                switch (i59) {
                    case 0:
                        gk7.g output = (gk7.g) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean zF = Intrinsics.f(output, g.a.f144333a);
                        com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar = this.f205939b;
                        if (zF) {
                            aVar.I2();
                        } else {
                            if (!(output instanceof h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (((h) output).f144335b) {
                                aVar.q2();
                            } else {
                                aVar.E2(CFACInsuranceClaimFlowContract$Step.ReviewClaimDetails.f75055a, true, null, false);
                            }
                        }
                        return Unit.f186387a;
                    case 1:
                        ck7.h output2 = (ck7.h) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        boolean z3 = output2 instanceof ck7.f;
                        com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar2 = this.f205939b;
                        if (z3) {
                            CFACCancellationReason cFACCancellationReason22 = ((ck7.f) output2).f24790a;
                            if (ue0.e.n(cFACCancellationReason22.d)) {
                                aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, cFACCancellationReason22, null, LDSFile.EF_SOD_TAG));
                                aVar2.E2(Intrinsics.f(cFACCancellationReason22.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                            } else {
                                aVar2.E2(new CFACInsuranceClaimFlowContract$Step.ExactCancellationReason(cFACCancellationReason22), true, null, false);
                            }
                        } else {
                            if (!(output2 instanceof ck7.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a, null, null, ((ck7.g) output2).f24791a, 103));
                            aVar2.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar2.A2().f98429a).b().f.d), false, null, false);
                        }
                        return Unit.f186387a;
                    case 2:
                        uj7.h output3 = (uj7.h) obj2;
                        Intrinsics.checkNotNullParameter(output3, "output");
                        boolean z310 = output3 instanceof uj7.f;
                        com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar3 = this.f205939b;
                        if (z310) {
                            CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State4 = (CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a;
                            CFACCancellationReason cFACCancellationReason222 = ((uj7.f) output3).f280526a;
                            aVar3.L2(CFACInsuranceClaimFlowContract$State.a(cFACInsuranceClaimFlowContract$State4, null, cFACCancellationReason222, null, LDSFile.EF_SOD_TAG));
                            aVar3.E2(Intrinsics.f(cFACCancellationReason222.f74968b, "OTHER") ? CFACInsuranceClaimFlowContract$Step.OtherReason.f75054a : CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                        } else {
                            if (!(output3 instanceof uj7.g)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar3.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a, null, null, ((uj7.g) output3).f280527a, LDSFile.EF_DG15_TAG));
                            aVar3.E2(new CFACInsuranceClaimFlowContract$Step.CancellationReasonGroup(((CFACInsuranceClaimFlowContract$State) aVar3.A2().f98429a).b().f.d), false, null, false);
                        }
                        return Unit.f186387a;
                    case 3:
                        yj7.f output4 = (yj7.f) obj2;
                        Intrinsics.checkNotNullParameter(output4, "output");
                        this.f205939b.E2(output4.f314429a, true, null, false);
                        return Unit.f186387a;
                    case 4:
                        q it82 = (q) obj2;
                        Intrinsics.checkNotNullParameter(it82, "it");
                        com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar4 = this.f205939b;
                        CFACInsuranceClaimFlowContract$State cFACInsuranceClaimFlowContract$State22 = (CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a;
                        int i222 = d.f205937a[cFACInsuranceClaimFlowContract$State22.e.ordinal()];
                        if (i222 == 1) {
                            cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State22.b().e.f75010g;
                        } else {
                            if (i222 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            cFACClaimFlowMode = cFACInsuranceClaimFlowContract$State22.b().f.f75010g;
                        }
                        if (cFACClaimFlowMode instanceof CFACClaimFlowMode.EverydayProtection) {
                            CFACClaimFlowMode.EverydayProtection everydayProtection = (CFACClaimFlowMode.EverydayProtection) cFACClaimFlowMode;
                            aVar4.C1(new BridgeDestination(new FeatureCommand(InsuranceEmbeddedDestinations.a(everydayProtection.f74970a, everydayProtection.f74971b))));
                        } else if (((CFACInsuranceClaimFlowContract$State) aVar4.A2().f98429a).e == CFACReimbursementType.DOC_PROOF_REIMBURSEMENT) {
                            aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SupportingDocuments(7), true, null, false);
                        } else {
                            aVar4.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                        }
                        return Unit.f186387a;
                    case 5:
                        j output5 = (j) obj2;
                        Intrinsics.checkNotNullParameter(output5, "output");
                        boolean zF2 = Intrinsics.f(output5, j.a.f126968a);
                        com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar5 = this.f205939b;
                        if (zF2) {
                            aVar5.I2();
                        } else {
                            if (!(output5 instanceof k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar5.E2(((k) output5).f126969a, true, null, false);
                        }
                        return Unit.f186387a;
                    case 6:
                        Intrinsics.checkNotNullParameter((jk7.h) obj2, "output");
                        this.f205939b.E2(new CFACInsuranceClaimFlowContract$Step.SelectExpenses(false), true, null, false);
                        return Unit.f186387a;
                    default:
                        ak7.e output6 = (ak7.e) obj2;
                        Intrinsics.checkNotNullParameter(output6, "output");
                        com.revolut.feature.insurance.impl.ui.cfac.claim.a aVar6 = this.f205939b;
                        aVar6.L2(CFACInsuranceClaimFlowContract$State.a((CFACInsuranceClaimFlowContract$State) aVar6.A2().f98429a, output6.f5728a, null, null, 123));
                        aVar6.E2(CFACInsuranceClaimFlowContract$Step.CoverageInfo.f75051a, true, null, false);
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function18, "<set-?>");
        cFACInsuranceReviewClaimScreen.H = function18;
        return cFACInsuranceReviewClaimScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
