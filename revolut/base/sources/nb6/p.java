package nb6;

import c17.i;
import c84.t;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingSummary;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.ManualUnderwritingContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreenContract$ModalStep;
import com.revolut.feature.freelancer.common.models.onboarding.OnboardingVerificationStep;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$DomainState;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreenContract$OutputData;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsActivity;
import com.revolut.feature.insurance_pet.impl.ui.pet.dob.DOBInputData;
import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.feature.kyc.api.navigation.ConfirmAddressDestination;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.kyc.impl.init.InitKycScreenContract$Configuration;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.api.workflow.WorkflowFeatureConfig;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlowContract$FlowInput;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.esim.impl.repositories.exceptions.InsufficientFundsException;
import com.revolut.revolut.feature_fourthline_impl.R;
import d67.s;
import d67.u;
import efm.r;
import grl.k9;
import gzc.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n3j.w;
import nfj.s2;
import nmb.v;
import rd4.e;
import retrofit2.HttpException;
import tof.a3;
import tof.v6;
import vkm.j2;
import yt8.k;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.q implements Function1 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Object obj2, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj2, str, str2);
        this.f = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.revolut.retail.core.navigation.NaviCommand] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        FeatureConfig startKyc;
        int i = 2;
        int i2 = 26;
        int i3 = 0;
        int i5 = 1;
        switch (this.f) {
            case 0:
                h p0 = (h) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((com.revolut.feature.donations.impl.ui.kompot.flow.overview.b) this.receiver).C2(p0);
                return Unit.f186387a;
            case 1:
                List p03 = (List) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ((ihm.f) this.receiver).onNext(p03);
                return Unit.f186387a;
            case 2:
                List p010 = (List) obj2;
                Intrinsics.checkNotNullParameter(p010, "p0");
                ((ihm.f) this.receiver).onNext(p010);
                return Unit.f186387a;
            case 3:
                rd4.e p011 = (rd4.e) obj2;
                Intrinsics.checkNotNullParameter(p011, "p0");
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a aVar = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.receiver;
                aVar.getClass();
                if (p011 instanceof e.b) {
                    oki.h.t2(aVar, aVar.f67919y, ManualUnderwritingContract$Step.Documents.f67905a, false, null, false, 12);
                } else if (p011 instanceof rd4.f) {
                    aVar.Q2(((rd4.f) p011).f253337a, jv3.b.MANDATORY);
                } else {
                    if (!(p011 instanceof e.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j60.a aVar2 = aVar.f67912p;
                    if (aVar2.j()) {
                        j60.a.v(aVar2, false, null, 3);
                    } else {
                        t.J2(aVar, false, null, null, 7);
                    }
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a p012 = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a) obj2;
                Intrinsics.checkNotNullParameter(p012, "p0");
                com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a aVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.receiver;
                qki.d dVar = aVar3.u;
                if (p012 instanceof a.b) {
                    ManualUnderwritingContract$State manualUnderwritingContract$State = (ManualUnderwritingContract$State) ((j2) dVar.f22677a).getValue();
                    int i6 = manualUnderwritingContract$State.f67902b;
                    ManualUnderwritingSummary manualUnderwritingSummary = manualUnderwritingContract$State.f67901a;
                    if (manualUnderwritingSummary == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if (i6 < manualUnderwritingSummary.f66481b.size() - 1) {
                        aVar3.H2(dVar, new nd4.b(aVar3, i));
                        oki.h.t2(aVar3, aVar3.f67919y, ManualUnderwritingContract$Step.Documents.f67905a, true, null, false, 12);
                    } else {
                        aVar3.K2(null);
                    }
                } else if (p012 instanceof pd4.j) {
                    aVar3.l2(new w(aVar3, p012, (Continuation) , 19), new yi5.b(i2));
                } else if (p012 instanceof a.c) {
                    ManualUnderwritingContract$State manualUnderwritingContract$State2 = (ManualUnderwritingContract$State) ((j2) dVar.f22677a).getValue();
                    ManualUnderwritingSummary manualUnderwritingSummary2 = manualUnderwritingContract$State2.f67901a;
                    if (manualUnderwritingSummary2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    aVar3.Q2((ManualUnderwritingReferralFlag) manualUnderwritingSummary2.f66481b.get(manualUnderwritingContract$State2.f67902b), jv3.b.MANDATORY);
                } else {
                    if (!(p012 instanceof a.C0473a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j60.a aVar4 = aVar3.f67912p;
                    if (aVar4.j()) {
                        j60.a.v(aVar4, false, null, 3);
                    } else {
                        t.J2(aVar3, false, null, null, 7);
                    }
                }
                return Unit.f186387a;
            case 5:
                NaviCommand p013 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p013, "p0");
                ((sri.m) this.receiver).c(p013);
                return Unit.f186387a;
            case 6:
                teh.c p014 = (teh.c) obj2;
                Intrinsics.checkNotNullParameter(p014, "p0");
                return neh.b.f((neh.b) this.receiver, p014);
            case 7:
                HttpException p015 = (HttpException) obj2;
                Intrinsics.checkNotNullParameter(p015, "p0");
                ServerError serverErrorC = ((s2) this.receiver).d.c(p015);
                return (serverErrorC == null || serverErrorC.f51362a != 1006) ? p015 : new InsufficientFundsException(null);
            case 8:
                Throwable p016 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p016, "p0");
                ni1.i iVar = (ni1.i) this.receiver;
                iVar.H2(iVar.f215633s, new nd8.l(p016, i5));
                return Boolean.TRUE;
            case 9:
                xc8.g p017 = (xc8.g) obj2;
                Intrinsics.checkNotNullParameter(p017, "p0");
                ((nj8.a) this.receiver).getClass();
                xc8.c cVar = (xc8.c) p017.f304108b.get(v6d.a.PERSONAL_DATA_PROCESSING);
                if (cVar == null || cVar.f304103c != xc8.b.GUARDIAN_CONSENT || cVar.b()) {
                    return null;
                }
                return cVar;
            case 10:
                Throwable p018 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p018, "p0");
                return Boolean.valueOf(((sj9.a) ((di9.c) this.receiver)).b3(p018));
            case 11:
                List p019 = (List) obj2;
                Intrinsics.checkNotNullParameter(p019, "p0");
                ((ihm.f) this.receiver).onNext(p019);
                return Unit.f186387a;
            case 12:
                List p020 = (List) obj2;
                Intrinsics.checkNotNullParameter(p020, "p0");
                ((ihm.f) this.receiver).onNext(p020);
                return Unit.f186387a;
            case 13:
                cn3.b p021 = (cn3.b) obj2;
                Intrinsics.checkNotNullParameter(p021, "p0");
                ((com.revolut.feature.contacts_chooser.impl.ui.a) this.receiver).C2(p021);
                return Unit.f186387a;
            case 14:
                a3 p022 = (a3) obj2;
                Intrinsics.checkNotNullParameter(p022, "p0");
                nof.m mVar = (nof.m) this.receiver;
                osg.b bVar = mVar.f;
                nof.h hVar = mVar.f218040a;
                String str = p022.f272584c;
                List list = nof.m.f218039j;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            if (((v6) it8.next()) == p022.f) {
                                if (hVar.a(p022) && str != null && hVar.c(p022) != null) {
                                    wsg.n nVar = (wsg.n) bVar;
                                    r rVarSwitchMap = m70.a.h(zi0.c.J(nVar.Q(str)), new ngh.i(4), null, new v(15), 2).switchMap(new njf.c(new nof.j(mVar, p022, i), i2));
                                    Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                                    r map = te0.w.m(rVarSwitchMap, m70.a.g(rd0.e.c(mVar.f218042c.a(), kotlin.coroutines.g.f186406a), null, new v(14), 1), m70.a.h(zi0.c.J(nVar.Y(str)), new ngh.i(5), null, new v(17), 2)).map(new njf.c(new nof.j(mVar, p022, i3), 24));
                                    Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                                    r rVarDoOnNext = ue0.e.H(map, h0.f322473a, new nnf.h(18)).subscribeOn(hhm.f.f152431c).doOnNext(new njf.c(new nof.j(mVar, p022, i5), 25));
                                    Data data = (Data) mVar.f218043g.get(p022);
                                    if (data == null) {
                                        data = new Data(null, null, true, 3, null);
                                    }
                                    r rVarStartWith = rVarDoOnNext.startWith(data);
                                    Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                                    return rVarStartWith;
                                }
                            }
                        }
                    }
                }
                ihm.b bVarE = ihm.b.e(new Data(null, null, false, 7, null));
                Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
                return bVarE;
            case 15:
                jpg.e p023 = (jpg.e) obj2;
                Intrinsics.checkNotNullParameter(p023, "p0");
                com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.a aVar5 = (com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.a) this.receiver;
                AddMoneyFlowContract$FlowInput addMoneyFlowContract$FlowInput = aVar5.f94768t;
                if (!(p023 instanceof jpg.c)) {
                    if (!(p023 instanceof jpg.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TextLocalisedClause textLocalisedClause = ((jpg.d) p023).f177275b;
                    if (addMoneyFlowContract$FlowInput.i != null) {
                        aVar5.C1(u0.b(new FinishCommand(-1, null, null, 6)));
                    } else if (addMoneyFlowContract$FlowInput.f94766j) {
                        aVar5.G2(new ipg.a(textLocalisedClause));
                    } else {
                        aVar5.I2();
                    }
                } else if (addMoneyFlowContract$FlowInput.i != null) {
                    aVar5.C1(u0.b(new FinishCommand(-1, null, null, 6)));
                } else {
                    aVar5.I2();
                }
                return Unit.f186387a;
            case 16:
                Throwable p024 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p024, "p0");
                com.revolut.feature.credit.card.impl.ui.statement.export.b bVar2 = (com.revolut.feature.credit.card.impl.ui.statement.export.b) this.receiver;
                bVar2.getClass();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, p024, h0Var);
                oki.h.v2(bVar2.u, CreditCardStatementExportScreenContract$ModalStep.UnexpectedError.f69698a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Boolean.TRUE;
            case 17:
                yt8.k verificationResult = (yt8.k) obj2;
                Intrinsics.checkNotNullParameter(verificationResult, "p0");
                nw8.f fVar = (nw8.f) ((nw8.h) this.receiver);
                nw8.g gVar = fVar.f219798a;
                sri.m mVar2 = fVar.f219800c;
                t70.g localization = fVar.d;
                Intrinsics.checkNotNullParameter(verificationResult, "verificationResult");
                if (verificationResult instanceof yt8.l) {
                    wi0.b bVar3 = ((yt8.l) verificationResult).f316674b;
                    InitKycScreenContract$Configuration initKycScreenContract$Configuration = ((nw8.c) gVar).f219792c;
                    NaviCommand naviCommand = initKycScreenContract$Configuration.f77822b;
                    KycFinalCommand.Next next = naviCommand != null ? new KycFinalCommand.Next(naviCommand) : null;
                    FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
                    if (initKycScreenContract$Configuration.e) {
                         = next != null ? next.f77475a : 0;
                        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                        k9 k9Var = k9.KYC;
                        companion.getClass();
                        startKyc = new WorkflowFeatureConfig(new WorkflowConfiguration.Product("BANKING", null, , AnalyticsProduct.Companion.b(k9Var), 38), true);
                    } else {
                        AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
                        k9 k9Var2 = frl.a.f137499j;
                        companion2.getClass();
                        AnalyticsProduct.Companion.a(k9Var2);
                        startKyc = new KycFeatureConfig.StartKyc(next, bVar3, true, null, null, initKycScreenContract$Configuration.d, new AnalyticsProduct.Retail(k9Var2), my8.r.DEFAULT, gt8.a.VERIFY_IDENTITY_IN_PROGRESS, null, null, null, null, false, null, 129136);
                    }
                    mVar2.c(com.revolut.retail.core.navigation.a.c(finishCommand, new FeatureCommand(startKyc)));
                } else if (verificationResult instanceof k.c) {
                    mVar2.c(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), fVar.e));
                } else if (verificationResult instanceof yt8.m) {
                    npi.f fVar2 = fVar.f219799b;
                    Intrinsics.checkNotNullParameter(localization, "localization");
                    String string = localization.getString(R.string.source_of_funds_alert_verify_confirm_title);
                    String strI = localization.i(R.string.source_of_funds_alert_verify_confirm_message, ((yt8.m) verificationResult).f316676a);
                    int i21 = R$string.common_action_ok;
                    Intrinsics.checkNotNullParameter(localization, "localization");
                    String string2 = localization.getString(i21);
                    int i22 = R$string.common_action_cancel;
                    Intrinsics.checkNotNullParameter(localization, "localization");
                    npi.f.J(fVar2, string, strI, string2, localization.getString(i22), new nrd.g(fVar, 20), 48);
                } else if (verificationResult instanceof k.a) {
                    NaviCommand naviCommand2 = ((nw8.c) gVar).f219792c.f77822b;
                    mVar2.c(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new ConfirmAddressDestination(naviCommand2 != null ? new ConfirmAddressDestination.ActionOnResult.OpenNextScreen(naviCommand2) : ConfirmAddressDestination.ActionOnResult.Finish.f77480a, 6), false, (Integer) null, 0, 61))));
                } else {
                    if (!(verificationResult instanceof k.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    NaviCommand finishCommand2 = ((nw8.c) fVar.f219798a).f219792c.f77822b;
                    if (finishCommand2 == null) {
                        finishCommand2 = new FinishCommand(null, null, null, 7);
                    }
                    mVar2.c(finishCommand2);
                }
                return Unit.f186387a;
            case 18:
                NaviCommand p025 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(p025, "p0");
                return ((ln.a) this.receiver).a(p025);
            case 19:
                List p026 = (List) obj2;
                Intrinsics.checkNotNullParameter(p026, "p0");
                ((PetEditDetailsActivity) ((ny7.g) this.receiver)).setItems(p026);
                return Unit.f186387a;
            case 20:
                DOBInputData p027 = (DOBInputData) obj2;
                Intrinsics.checkNotNullParameter(p027, "p0");
                return ((com.revolut.feature.insurance_pet.impl.ui.pet.dob.a) this.receiver).a(p027);
            case 21:
                ((ny7.f) this.receiver).a(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 22:
                String p028 = (String) obj2;
                Intrinsics.checkNotNullParameter(p028, "p0");
                ((cya.f) this.receiver).a2(p028);
                return Unit.f186387a;
            case 23:
                return com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.J2((com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) this.receiver, (Continuation) obj2);
            case 24:
                hz6.h p029 = (hz6.h) obj2;
                Intrinsics.checkNotNullParameter(p029, "p0");
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar4 = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) this.receiver;
                bVar4.getClass();
                if (Intrinsics.f(p029, hz6.f.f157043a)) {
                    bVar4.B2();
                } else {
                    if (!(p029 instanceof hz6.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(bVar4, bVar4.D, new FreelancerOnboardingFlowContract$Step.BusinessInfo.Description(((FreelancerOnboardingFlowContract$DomainState) ((j2) bVar4.C.f22677a).getValue()).f73977c), true, null, false, 12);
                }
                return Unit.f186387a;
            case 25:
                jz6.h p030 = (jz6.h) obj2;
                Intrinsics.checkNotNullParameter(p030, "p0");
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar5 = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) this.receiver;
                yki.i iVar2 = bVar5.D;
                qki.d dVar2 = bVar5.C;
                if (Intrinsics.f(p030, jz6.f.f179591a)) {
                    bVar5.B2();
                } else {
                    if (!Intrinsics.f(p030, jz6.g.f179592a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j2 j2Var = (j2) dVar2.f22677a;
                    j2 j2Var2 = (j2) dVar2.f22677a;
                    if (((FreelancerOnboardingFlowContract$DomainState) j2Var.getValue()).c() != null) {
                        oki.h.t2(bVar5, iVar2, new FreelancerOnboardingFlowContract$Step.BusinessInfo.Website(((FreelancerOnboardingFlowContract$DomainState) j2Var2.getValue()).d, !pd.b.j(((FreelancerOnboardingFlowContract$DomainState) j2Var2.getValue()).c() != null ? Boolean.valueOf(r2.f73449b) : null)), true, null, false, 12);
                    } else if (((FreelancerOnboardingFlowContract$DomainState) j2Var2.getValue()).b() != null) {
                        OnboardingVerificationStep.ActivityProof activityProofB = ((FreelancerOnboardingFlowContract$DomainState) j2Var2.getValue()).b();
                        String str2 = activityProofB != null ? activityProofB.f73447b : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        oki.h.t2(bVar5, bVar5.D, new FreelancerOnboardingFlowContract$Step.BusinessInfo.ProofOfActivity(str2), true, null, false, 12);
                    } else {
                        oki.h.t2(bVar5, iVar2, FreelancerOnboardingFlowContract$Step.TermsAndConditions.f73989a, true, null, false, 12);
                    }
                }
                return Unit.f186387a;
            case 26:
                c17.i p031 = (c17.i) obj2;
                Intrinsics.checkNotNullParameter(p031, "p0");
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar6 = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) this.receiver;
                bVar6.getClass();
                if (!Intrinsics.f(p031, i.b.f20392a) && !Intrinsics.f(p031, i.a.f20391a)) {
                    throw new NoWhenBranchMatchedException();
                }
                OnboardingVerificationStep.ActivityProof activityProofB2 = ((FreelancerOnboardingFlowContract$DomainState) ((j2) bVar6.C.f22677a).getValue()).b();
                if (activityProofB2 != null) {
                    oki.h.t2(bVar6, bVar6.D, new FreelancerOnboardingFlowContract$Step.BusinessInfo.ProofOfActivity(activityProofB2.f73447b), true, null, false, 12);
                } else {
                    oki.h.t2(bVar6, bVar6.D, FreelancerOnboardingFlowContract$Step.TermsAndConditions.f73989a, true, null, false, 12);
                }
                return Unit.f186387a;
            case 27:
                u p032 = (u) obj2;
                Intrinsics.checkNotNullParameter(p032, "p0");
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar7 = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) this.receiver;
                bVar7.getClass();
                if (Intrinsics.f(p032, d67.q.f111462a) || Intrinsics.f(p032, s.f111464a)) {
                    oki.h.D2(bVar7.D);
                }
                return Unit.f186387a;
            case 28:
                FreelancerTermsScreenContract$OutputData p033 = (FreelancerTermsScreenContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(p033, "p0");
                com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar8 = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) this.receiver;
                bVar8.getClass();
                if (!Intrinsics.f(p033, FreelancerTermsScreenContract$OutputData.TermsConfirmed.f74064a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar8.l2(new nz6.h(bVar8, , i3), new yi5.b(i2));
                return Unit.f186387a;
            default:
                List warningsDto = (List) obj2;
                Intrinsics.checkNotNullParameter(warningsDto, "p0");
                ((lzc.a) this.receiver).getClass();
                Intrinsics.checkNotNullParameter(warningsDto, "warningsDto");
                List<jzc.u> list2 = warningsDto;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (jzc.u uVar : list2) {
                    arrayList.add(new z(uVar.getTitle(), uVar.getMessage(), uVar.getButtonTitle(), uVar.getIcon()));
                }
                return arrayList;
        }
    }
}
