package com.revolut.feature.kyc_documents_scan.ui.document_scan_flow;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$InputData;
import com.revolut.biometric_verification.impl.ui.flow.launcher.BiometricVerificationLauncherFlow;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.DocumentScanFlowContract$Step;
import com.revolut.feature.kyc_documents_scan.ui.onfido.OnfidoScreen;
import com.revolut.feature.kyc_documents_scan.ui.onfido.OnfidoScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import dki.g;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import my8.s;
import my8.t;
import nq.x;
import oq.e;
import xy8.d;
import yi5.b;
import yy8.c;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends g implements xy8.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g3l.a f77952t;
    public final bs.a u;
    public final DocumentScanFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final DocumentScanFlowContract$State f77953w;

    public a(DocumentScanFlowContract$InputData inputData, g3l.a statusDialogViewConfigurationDispatcher, bs.a biometricVerificationFlowProvider) {
        DocumentScanFlowContract$Step onfidoStudio;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(biometricVerificationFlowProvider, "biometricVerificationFlowProvider");
        this.f77952t = statusDialogViewConfigurationDispatcher;
        this.u = biometricVerificationFlowProvider;
        WorkflowDocumentScanCofiguration workflowDocumentScanCofigurationA = inputData.a();
        if (workflowDocumentScanCofigurationA instanceof WorkflowDocumentScanCofiguration.Onfido) {
            onfidoStudio = new DocumentScanFlowContract$Step.Onfido((WorkflowDocumentScanCofiguration.Onfido) workflowDocumentScanCofigurationA);
        } else if (workflowDocumentScanCofigurationA instanceof WorkflowDocumentScanCofiguration.Vision) {
            onfidoStudio = new DocumentScanFlowContract$Step.Vision((WorkflowDocumentScanCofiguration.Vision) workflowDocumentScanCofigurationA);
        } else if (workflowDocumentScanCofigurationA instanceof WorkflowDocumentScanCofiguration.Incode) {
            onfidoStudio = new DocumentScanFlowContract$Step.Incode((WorkflowDocumentScanCofiguration.Incode) workflowDocumentScanCofigurationA);
        } else {
            if (!(workflowDocumentScanCofigurationA instanceof WorkflowDocumentScanCofiguration.OnfidoStudio)) {
                throw new NoWhenBranchMatchedException();
            }
            onfidoStudio = new DocumentScanFlowContract$Step.OnfidoStudio((WorkflowDocumentScanCofiguration.OnfidoStudio) workflowDocumentScanCofigurationA);
        }
        this.v = onfidoStudio;
        this.f77953w = new DocumentScanFlowContract$State();
    }

    public final void O2(c cVar) {
        if (cVar.f317865a.f210398a == t.ERROR) {
            l2(new d(this, cVar, null), new b(26));
        }
        G2(new xy8.b(cVar.f317865a));
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        DocumentScanFlowContract$Step step = (DocumentScanFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof DocumentScanFlowContract$Step.Onfido) {
            OnfidoScreen onfidoScreen = new OnfidoScreen(new OnfidoScreenContract$InputData.Onfido(((DocumentScanFlowContract$Step.Onfido) step).f77949a));
            final int i = 0;
            Function1 block = new Function1(this) { // from class: xy8.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.a f309649b;

                {
                    this.f309649b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    t tVar;
                    switch (i) {
                        case 0:
                            yy8.c screenOutput = (yy8.c) obj2;
                            Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                            this.f309649b.O2(screenOutput);
                            return Unit.f186387a;
                        case 1:
                            yy8.c screenOutput2 = (yy8.c) obj2;
                            Intrinsics.checkNotNullParameter(screenOutput2, "screenOutput");
                            this.f309649b.O2(screenOutput2);
                            return Unit.f186387a;
                        case 2:
                            e biometricOutput = (e) obj2;
                            Intrinsics.checkNotNullParameter(biometricOutput, "biometricOutput");
                            if ((biometricOutput instanceof oq.c) || (biometricOutput instanceof oq.d)) {
                                tVar = t.SUCCESS;
                            } else {
                                if (!(biometricOutput instanceof oq.b) && !(biometricOutput instanceof oq.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tVar = t.CANCEL;
                            }
                            this.f309649b.G2(new b(new s(tVar, null)));
                            return Unit.f186387a;
                        default:
                            ly8.b incodeResult = (ly8.b) obj2;
                            Intrinsics.checkNotNullParameter(incodeResult, "incodeResult");
                            this.f309649b.G2(new b(incodeResult.f200747a));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            onfidoScreen.H = block;
            return onfidoScreen;
        }
        if (step instanceof DocumentScanFlowContract$Step.OnfidoStudio) {
            OnfidoScreen onfidoScreen2 = new OnfidoScreen(new OnfidoScreenContract$InputData.OnfidoStudio(((DocumentScanFlowContract$Step.OnfidoStudio) step).f77950a));
            final int i2 = 1;
            Function1 block2 = new Function1(this) { // from class: xy8.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.a f309649b;

                {
                    this.f309649b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    t tVar;
                    switch (i2) {
                        case 0:
                            yy8.c screenOutput = (yy8.c) obj2;
                            Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                            this.f309649b.O2(screenOutput);
                            return Unit.f186387a;
                        case 1:
                            yy8.c screenOutput2 = (yy8.c) obj2;
                            Intrinsics.checkNotNullParameter(screenOutput2, "screenOutput");
                            this.f309649b.O2(screenOutput2);
                            return Unit.f186387a;
                        case 2:
                            e biometricOutput = (e) obj2;
                            Intrinsics.checkNotNullParameter(biometricOutput, "biometricOutput");
                            if ((biometricOutput instanceof oq.c) || (biometricOutput instanceof oq.d)) {
                                tVar = t.SUCCESS;
                            } else {
                                if (!(biometricOutput instanceof oq.b) && !(biometricOutput instanceof oq.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tVar = t.CANCEL;
                            }
                            this.f309649b.G2(new b(new s(tVar, null)));
                            return Unit.f186387a;
                        default:
                            ly8.b incodeResult = (ly8.b) obj2;
                            Intrinsics.checkNotNullParameter(incodeResult, "incodeResult");
                            this.f309649b.G2(new b(incodeResult.f200747a));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            onfidoScreen2.H = block2;
            return onfidoScreen2;
        }
        if (!(step instanceof DocumentScanFlowContract$Step.Vision)) {
            if (!(step instanceof DocumentScanFlowContract$Step.Incode)) {
                throw new NoWhenBranchMatchedException();
            }
            ViewController viewControllerE1 = e1(new ly8.a(((DocumentScanFlowContract$Step.Incode) step).f77948a));
            final int i3 = 3;
            Function1 block3 = new Function1(this) { // from class: xy8.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.a f309649b;

                {
                    this.f309649b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    t tVar;
                    switch (i3) {
                        case 0:
                            yy8.c screenOutput = (yy8.c) obj2;
                            Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                            this.f309649b.O2(screenOutput);
                            return Unit.f186387a;
                        case 1:
                            yy8.c screenOutput2 = (yy8.c) obj2;
                            Intrinsics.checkNotNullParameter(screenOutput2, "screenOutput");
                            this.f309649b.O2(screenOutput2);
                            return Unit.f186387a;
                        case 2:
                            e biometricOutput = (e) obj2;
                            Intrinsics.checkNotNullParameter(biometricOutput, "biometricOutput");
                            if ((biometricOutput instanceof oq.c) || (biometricOutput instanceof oq.d)) {
                                tVar = t.SUCCESS;
                            } else {
                                if (!(biometricOutput instanceof oq.b) && !(biometricOutput instanceof oq.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                tVar = t.CANCEL;
                            }
                            this.f309649b.G2(new b(new s(tVar, null)));
                            return Unit.f186387a;
                        default:
                            ly8.b incodeResult = (ly8.b) obj2;
                            Intrinsics.checkNotNullParameter(incodeResult, "incodeResult");
                            this.f309649b.G2(new b(incodeResult.f200747a));
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block3, "block");
            viewControllerE1.H = block3;
            return viewControllerE1;
        }
        WorkflowDocumentScanCofiguration.Vision vision = ((DocumentScanFlowContract$Step.Vision) step).f77951a;
        String str = vision.f77937a;
        Set set = vision.f77938b;
        if (set == null) {
            set = h0.f322473a;
        }
        BiometricVerificationFlowProvider$InputData inputData = new BiometricVerificationFlowProvider$InputData(str, x.ONBOARDING_KYC, new sd9.a(set), null, false, SyslogConstants.LOG_CLOCK);
        this.u.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        BiometricVerificationLauncherFlow biometricVerificationLauncherFlow = new BiometricVerificationLauncherFlow(inputData);
        final int i5 = 2;
        Function1 block4 = new Function1(this) { // from class: xy8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.kyc_documents_scan.ui.document_scan_flow.a f309649b;

            {
                this.f309649b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                t tVar;
                switch (i5) {
                    case 0:
                        yy8.c screenOutput = (yy8.c) obj2;
                        Intrinsics.checkNotNullParameter(screenOutput, "screenOutput");
                        this.f309649b.O2(screenOutput);
                        return Unit.f186387a;
                    case 1:
                        yy8.c screenOutput2 = (yy8.c) obj2;
                        Intrinsics.checkNotNullParameter(screenOutput2, "screenOutput");
                        this.f309649b.O2(screenOutput2);
                        return Unit.f186387a;
                    case 2:
                        e biometricOutput = (e) obj2;
                        Intrinsics.checkNotNullParameter(biometricOutput, "biometricOutput");
                        if ((biometricOutput instanceof oq.c) || (biometricOutput instanceof oq.d)) {
                            tVar = t.SUCCESS;
                        } else {
                            if (!(biometricOutput instanceof oq.b) && !(biometricOutput instanceof oq.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            tVar = t.CANCEL;
                        }
                        this.f309649b.G2(new b(new s(tVar, null)));
                        return Unit.f186387a;
                    default:
                        ly8.b incodeResult = (ly8.b) obj2;
                        Intrinsics.checkNotNullParameter(incodeResult, "incodeResult");
                        this.f309649b.G2(new b(incodeResult.f200747a));
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block4, "block");
        biometricVerificationLauncherFlow.H = block4;
        return biometricVerificationLauncherFlow;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f77953w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
