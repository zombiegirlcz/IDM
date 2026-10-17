package xu8;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.KycApi$FeatureToggle;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.kyc.api.common.KycConsentDescriptor;
import com.revolut.feature.kyc.api.flow.input_document_id.InputDocumentIdFlowDestination;
import com.revolut.feature.kyc.api.navigation.ConfirmAddressDestination;
import com.revolut.feature.kyc.api.navigation.ProofOfAddressFlowDescriptor;
import com.revolut.feature.kyc.api.navigation.ReviewDocumentDestination;
import com.revolut.feature.kyc.core.api.KycCoreApi$Toggles;
import com.revolut.feature.kyc.impl.KycPromptDestination;
import com.revolut.feature.kyc.impl.choosedocument.review.DocumentReviewScreenContract$InputData;
import com.revolut.feature.kyc.impl.cmd.flow.CmdFlow;
import com.revolut.feature.kyc.impl.cmd.flow.CmdFlowContract$InputData;
import com.revolut.feature.kyc.impl.common.screen.consent.KycConsentScreen;
import com.revolut.feature.kyc.impl.dap.DapFlow;
import com.revolut.feature.kyc.impl.dap.DapFlowContract$InputData;
import com.revolut.feature.kyc.impl.egov_kyc.flow.EgovKycFlow;
import com.revolut.feature.kyc.impl.egov_kyc.flow.EgovKycFlowContract$InputData;
import com.revolut.feature.kyc.impl.external.app.flow.ExternalAppKycProviderFlow;
import com.revolut.feature.kyc.impl.external.app.flow.ExternalAppKycProviderFlowContract$InputData;
import com.revolut.feature.kyc.impl.external.web.flow.ExternalWebKycProviderFlow;
import com.revolut.feature.kyc.impl.external.web.flow.ExternalWebKycProviderFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlow;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$ActionOnResult;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$DocumentsUploadConfig;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.addressverification.ProofOfAddressFlowContract$Step;
import com.revolut.feature.kyc.impl.flow.input_document_id.InputDocumentIdFlow;
import com.revolut.feature.kyc.impl.flow.input_document_id.InputDocumentIdFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlow;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowContract$Step;
import com.revolut.feature.kyc.impl.flow.kyc.KycFlowDestination;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlow;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowDestination;
import com.revolut.feature.kyc.impl.fourthline.FourthlineDestination;
import com.revolut.feature.kyc.impl.fourthline.flow.FourthlineFlow;
import com.revolut.feature.kyc.impl.fourthline.flow.FourthlineFlowContract$InputData;
import com.revolut.feature.kyc.impl.hyperverge.govauth.HypervergeDigilockerFlow;
import com.revolut.feature.kyc.impl.hyperverge.govauth.HypervergeDigilockerFlowContract$InputData;
import com.revolut.feature.kyc.impl.hyperverge.videoconference.HypervergeVideoKycFlow;
import com.revolut.feature.kyc.impl.hyperverge.videoconference.HypervergeVideoKycFlowContract$InputData;
import com.revolut.feature.kyc.impl.idnow.eid.flow.IdnowEidFlow;
import com.revolut.feature.kyc.impl.idnow.eid.flow.IdnowEidFlowContract$InputData;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlow;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$InputData;
import com.revolut.feature.kyc.impl.incode.IncodeDestination;
import com.revolut.feature.kyc.impl.incode.flow.IncodeFlow;
import com.revolut.feature.kyc.impl.incode.flow.IncodeFlowContract$InputData;
import com.revolut.feature.kyc.impl.screens.addressconfirmation.AddressConfirmationScreenContract$InputData;
import com.revolut.feature.kyc.impl.trustdock.icchip.TrustdockSdkFlow;
import com.revolut.feature.kyc.impl.trustdock.icchip.TrustdockSdkFlowContract$InputData;
import com.revolut.feature.kyc.impl.web_id.flow.WebIdFlow;
import com.revolut.feature.kyc.impl.web_id.flow.WebIdFlowContract$InputData;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockDestination;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreen;
import com.revolut.feature.kyc_documents_scan.externalkyc.trustdock.TrustdockScreenContract$InputData;
import cu8.r0;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iv8.a f308994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.kyc.impl.d f308995b;

    public d(r0 kycRequiredActionTransformer, iv8.a externalKycUiConfigurationProvider, com.revolut.feature.kyc.impl.d kycPromptControllerFactory) {
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(externalKycUiConfigurationProvider, "externalKycUiConfigurationProvider");
        Intrinsics.checkNotNullParameter(kycPromptControllerFactory, "kycPromptControllerFactory");
        this.f308994a = externalKycUiConfigurationProvider;
        this.f308995b = kycPromptControllerFactory;
    }

    public final g a(e eVar, jv8.a aVar, String str) {
        return eVar.a(new ExternalAppKycProviderFlow(new ExternalAppKycProviderFlowContract$InputData(aVar.b(), aVar.a(), str, this.f308994a.a(aVar), false)));
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        ProofOfAddressFlowContract$InputData proofOfAddressFlowContract$InputData;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof KycConsentDescriptor) {
            KycConsentDescriptor kycConsentDescriptor = (KycConsentDescriptor) descriptor;
            return kycConsentDescriptor.a(new KycConsentScreen(new uu8.a(kycConsentDescriptor.getF77469a(), kycConsentDescriptor.getF77470b())));
        }
        if (descriptor instanceof ProofOfAddressFlowDescriptor) {
            ProofOfAddressFlowDescriptor proofOfAddressFlowDescriptor = (ProofOfAddressFlowDescriptor) descriptor;
            boolean z = proofOfAddressFlowDescriptor instanceof ProofOfAddressFlowDescriptor.Verification;
            ProofOfAddressFlowContract$ActionOnResult.CompleteFlow completeFlow = ProofOfAddressFlowContract$ActionOnResult.CompleteFlow.f77674a;
            if (z) {
                ProofOfAddressFlowDescriptor.Verification verification = (ProofOfAddressFlowDescriptor.Verification) proofOfAddressFlowDescriptor;
                proofOfAddressFlowContract$InputData = new ProofOfAddressFlowContract$InputData(new ProofOfAddressFlowContract$Step.DocumentsIntro(new ProofOfAddressFlowContract$DocumentsUploadConfig(verification.getF77509a(), verification.getF77511c(), verification.getF77510b())), completeFlow, false);
            } else {
                if (!(proofOfAddressFlowDescriptor instanceof ProofOfAddressFlowDescriptor.Confirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProofOfAddressFlowDescriptor.Confirmation confirmation = (ProofOfAddressFlowDescriptor.Confirmation) proofOfAddressFlowDescriptor;
                proofOfAddressFlowContract$InputData = new ProofOfAddressFlowContract$InputData(new ProofOfAddressFlowContract$Step.AddressConfirmation(new AddressConfirmationScreenContract$InputData(confirmation.getF77506a(), confirmation.getF77507b(), confirmation.getF77508c(), lx8.a.CLOSE)), completeFlow);
            }
            return proofOfAddressFlowDescriptor.a(new ProofOfAddressFlow(proofOfAddressFlowContract$InputData));
        }
        if (descriptor instanceof ms8.a) {
            ms8.a aVar = (ms8.a) descriptor;
            return aVar.a(new CmdFlow(new CmdFlowContract$InputData(aVar.b())));
        }
        if (descriptor instanceof at8.a) {
            at8.a aVar2 = (at8.a) descriptor;
            return aVar2.a(new IdnowEidFlow(new IdnowEidFlowContract$InputData(aVar2.b())));
        }
        if (descriptor instanceof zs8.a) {
            zs8.a aVar3 = (zs8.a) descriptor;
            return aVar3.a(new IdnowVideoIdentFlow(new IdnowVideoIdentFlowContract$InputData(aVar3.b(), aVar3.c())));
        }
        if (descriptor instanceof ps8.a) {
            ps8.a aVar4 = (ps8.a) descriptor;
            return aVar4.a(new DapFlow(new DapFlowContract$InputData(aVar4.b())));
        }
        if (descriptor instanceof ps8.c) {
            ps8.c cVar = (ps8.c) descriptor;
            jv8.a aVar5 = jv8.a.DAP;
            return cVar.a(new ExternalAppKycProviderFlow(new ExternalAppKycProviderFlowContract$InputData(aVar5.b(), aVar5.a(), cVar.b(), iv8.a.b(), true)));
        }
        if (descriptor instanceof qs8.a) {
            return a(descriptor, jv8.a.DIIA, ((qs8.a) descriptor).b());
        }
        if (descriptor instanceof ss8.a) {
            ss8.a aVar6 = (ss8.a) descriptor;
            return aVar6.a(new EgovKycFlow(new EgovKycFlowContract$InputData(aVar6.b(), aVar6.c())));
        }
        if (descriptor instanceof ws8.a) {
            ws8.a aVar7 = (ws8.a) descriptor;
            return aVar7.a(new HypervergeDigilockerFlow(new HypervergeDigilockerFlowContract$InputData(aVar7.b(), aVar7.c())));
        }
        if (descriptor instanceof xs8.a) {
            xs8.a aVar8 = (xs8.a) descriptor;
            return aVar8.a(new HypervergeVideoKycFlow(new HypervergeVideoKycFlowContract$InputData(aVar8.b(), aVar8.c())));
        }
        if (descriptor instanceof ys8.a) {
            return a(descriptor, jv8.a.ID_AUSTRIA, ((ys8.a) descriptor).b());
        }
        if (descriptor instanceof ct8.a) {
            return a(descriptor, jv8.a.ITSME, ((ct8.a) descriptor).b());
        }
        if (descriptor instanceof jt8.a) {
            jt8.a aVar9 = (jt8.a) descriptor;
            return aVar9.a(new TrustdockSdkFlow(new TrustdockSdkFlowContract$InputData(aVar9.c(), aVar9.b())));
        }
        if (descriptor instanceof ls8.a) {
            return a(descriptor, jv8.a.BANK_ID, ((ls8.a) descriptor).b());
        }
        if (descriptor instanceof dt8.a) {
            dt8.a aVar10 = (dt8.a) descriptor;
            jv8.a aVar11 = jv8.a.MOBYWATEL;
            return aVar10.a(new ExternalAppKycProviderFlow(new ExternalAppKycProviderFlowContract$InputData(aVar11.b(), aVar11.a(), aVar10.b(), this.f308994a.a(aVar11), iv8.a.d(), false)));
        }
        if (descriptor instanceof ft8.a) {
            return descriptor.a(new ExternalWebKycProviderFlow(new ExternalWebKycProviderFlowContract$InputData(lv8.a.MY_INFO, ((ft8.a) descriptor).b())));
        }
        if (descriptor instanceof bt8.a) {
            return descriptor.a(new ExternalWebKycProviderFlow(new ExternalWebKycProviderFlowContract$InputData(lv8.a.IDURA, ((bt8.a) descriptor).b())));
        }
        if (descriptor instanceof lt8.a) {
            lt8.a aVar12 = (lt8.a) descriptor;
            return aVar12.a(new WebIdFlow(new WebIdFlowContract$InputData(aVar12.b())));
        }
        if (descriptor instanceof ly8.a) {
            ly8.a aVar13 = (ly8.a) descriptor;
            WorkflowDocumentScanCofiguration.Incode incodeB = aVar13.b();
            return aVar13.a(new IncodeFlow(new IncodeFlowContract$InputData(incodeB.getF77927a(), incodeB.getF77928b(), incodeB.getF77929c(), incodeB.getD(), incodeB.getE(), incodeB.getF())));
        }
        if (!(descriptor instanceof vs8.a)) {
            return null;
        }
        vs8.a aVar14 = (vs8.a) descriptor;
        String strB = aVar14.b();
        String strE = aVar14.e();
        DocType docTypeC = aVar14.c();
        String iSO3Country = new Locale("", aVar14.d().f297794a).getISO3Country();
        Intrinsics.checkNotNullExpressionValue(iSO3Country, "getISO3Country(...)");
        return aVar14.a(new FourthlineFlow(new FourthlineFlowContract$InputData(strB, strE, docTypeC, iSO3Country)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nhi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aii.x r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof xu8.c
            if (r4 == 0) goto L13
            r4 = r5
            xu8.c r4 = (xu8.c) r4
            int r0 = r4.f308993w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f308993w = r0
            goto L1a
        L13:
            xu8.c r4 = new xu8.c
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r4 = r4.f308993w
            r0 = 0
            if (r4 == 0) goto L47
            r1 = 1
            if (r4 != r1) goto L3f
            yhm.o.b(r5)
            ks8.j r5 = (ks8.j) r5
            boolean r4 = r5 instanceof ks8.i
            if (r4 != 0) goto L3e
            ks8.j$a r4 = ks8.j.a.f189313a
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r5, r4)
            if (r4 == 0) goto L38
            throw r0
        L38:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L3e:
            throw r0
        L3f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L47:
            yhm.o.b(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xu8.d.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nte.a
    public final List e() {
        return d0.E0(KycCoreApi$Toggles.a(), KycApi$FeatureToggle.a());
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        KycFlowContract$Step documentCollection;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof KycPromptDestination) {
            return this.f308995b.a((KycPromptDestination) destination);
        }
        boolean z = destination instanceof ReviewDocumentDestination;
        ProofOfAddressFlowContract$ActionOnResult openNextScreen = ProofOfAddressFlowContract$ActionOnResult.Finish.f77675a;
        if (z) {
            ReviewDocumentDestination reviewDocumentDestination = (ReviewDocumentDestination) destination;
            return new ProofOfAddressFlow(new ProofOfAddressFlowContract$InputData(new ProofOfAddressFlowContract$Step.DocumentReview(new DocumentReviewScreenContract$InputData(reviewDocumentDestination.f77512a, reviewDocumentDestination.f77513b, reviewDocumentDestination.f77514c, reviewDocumentDestination.d)), openNextScreen));
        }
        if (destination instanceof ConfirmAddressDestination) {
            ConfirmAddressDestination confirmAddressDestination = (ConfirmAddressDestination) destination;
            ProofOfAddressFlowContract$Step.AddressConfirmation addressConfirmation = new ProofOfAddressFlowContract$Step.AddressConfirmation(new AddressConfirmationScreenContract$InputData(new KycContract$Requirement(true), confirmAddressDestination.f77478b, confirmAddressDestination.f77479c, lx8.a.CLOSE));
            ConfirmAddressDestination.ActionOnResult actionOnResult = confirmAddressDestination.f77477a;
            if (!(actionOnResult instanceof ConfirmAddressDestination.ActionOnResult.Finish)) {
                if (!(actionOnResult instanceof ConfirmAddressDestination.ActionOnResult.OpenNextScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                openNextScreen = new ProofOfAddressFlowContract$ActionOnResult.OpenNextScreen(((ConfirmAddressDestination.ActionOnResult.OpenNextScreen) actionOnResult).getF77481a());
            }
            return new ProofOfAddressFlow(new ProofOfAddressFlowContract$InputData(addressConfirmation, openNextScreen));
        }
        if (destination instanceof TrustdockDestination) {
            return new TrustdockScreen(new TrustdockScreenContract$InputData(((TrustdockDestination) destination).f77940a));
        }
        if (destination instanceof FourthlineDestination) {
            FourthlineDestination fourthlineDestination = (FourthlineDestination) destination;
            String str = fourthlineDestination.f77753a;
            String str2 = fourthlineDestination.f77754b;
            DocType docType = fourthlineDestination.f77755c;
            String iSO3Country = new Locale("", fourthlineDestination.d.f297794a).getISO3Country();
            Intrinsics.checkNotNullExpressionValue(iSO3Country, "getISO3Country(...)");
            FourthlineFlow fourthlineFlow = new FourthlineFlow(new FourthlineFlowContract$InputData(str, str2, docType, iSO3Country));
            fxj.b block = new fxj.b(flowModel, this, 1);
            Intrinsics.checkNotNullParameter(block, "block");
            fourthlineFlow.H = block;
            return fourthlineFlow;
        }
        if (destination instanceof InputDocumentIdFlowDestination) {
            InputDocumentIdFlowDestination inputDocumentIdFlowDestination = (InputDocumentIdFlowDestination) destination;
            return new InputDocumentIdFlow(new InputDocumentIdFlowContract$InputData(inputDocumentIdFlowDestination.f77471a, inputDocumentIdFlowDestination.f77472b));
        }
        if (destination instanceof KycConsolidatedFlowDestination) {
            return new KycConsolidatedFlow(((KycConsolidatedFlowDestination) destination).getF77741a());
        }
        if (!(destination instanceof KycFlowDestination)) {
            if (!(destination instanceof IncodeDestination)) {
                return null;
            }
            IncodeDestination incodeDestination = (IncodeDestination) destination;
            IncodeFlow incodeFlow = new IncodeFlow(new IncodeFlowContract$InputData(incodeDestination.getF77802a(), incodeDestination.getF77804c(), d0.d1(incodeDestination.getF77803b()), incodeDestination.c(), incodeDestination.getE()));
            fxj.b block2 = new fxj.b(flowModel, this, 2);
            Intrinsics.checkNotNullParameter(block2, "block");
            incodeFlow.H = block2;
            return incodeFlow;
        }
        KycFlowDestination kycFlowDestination = (KycFlowDestination) destination;
        AnalyticsProduct f77710b = kycFlowDestination.getF77710b();
        if (kycFlowDestination instanceof KycFlowDestination.AdditionalVerification) {
            documentCollection = new KycFlowContract$Step.AdditionalVerificationPrompt(((KycFlowDestination.AdditionalVerification) destination).getF77701a());
        } else if (kycFlowDestination instanceof KycFlowDestination.USVisaDisclosure) {
            documentCollection = new KycFlowContract$Step.USVisaDisclosure(((KycFlowDestination.USVisaDisclosure) destination).getF77709a());
        } else if (kycFlowDestination instanceof KycFlowDestination.RevolutVision) {
            documentCollection = new KycFlowContract$Step.RevolutVision(((KycFlowDestination.RevolutVision) destination).getF77707a());
        } else if (kycFlowDestination instanceof KycFlowDestination.IncodeDocumentConsentProcessing) {
            documentCollection = new KycFlowContract$Step.IncodeDocumentProcessingConsent(((KycFlowDestination.IncodeDocumentConsentProcessing) destination).getF77705a());
        } else {
            if (!(kycFlowDestination instanceof KycFlowDestination.DocumentCollection)) {
                throw new NoWhenBranchMatchedException();
            }
            documentCollection = new KycFlowContract$Step.DocumentCollection(((KycFlowDestination.DocumentCollection) destination).getF77703a());
        }
        return new KycFlow(new KycFlowContract$InputData(documentCollection, f77710b));
    }
}
