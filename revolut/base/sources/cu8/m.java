package cu8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.onfido.android.sdk.capture.Onfido;
import com.onfido.workflow.OnfidoWorkflow;
import com.onfido.workflow.WorkflowConfig;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.KycScreenContract$Configuration;
import com.revolut.feature.kyc.impl.KycScreenContract$KycDocsStatus;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc_documents_scan.api.externalkyc.ExternalKycProviderContract$Configuration;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import ip0.v7;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.kyc.impl.c f108856b;

    public /* synthetic */ m(com.revolut.feature.kyc.impl.c cVar, int i) {
        this.f108855a = i;
        this.f108856b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Bundle extras;
        et8.a aVar;
        int i = this.f108855a;
        int i2 = 3;
        int i3 = 14;
        pfm.m mVar = pfm.m.f235744a;
        int i5 = 0;
        SubmitCitizenshipFlowOutput submitCitizenshipFlowOutput = null;
        Integer numValueOf = null;
        submitCitizenshipFlowOutput = null;
        int i6 = 4;
        com.revolut.feature.kyc.impl.c cVar = this.f108856b;
        switch (i) {
            case 0:
                kpi.a result = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                g1 g1Var = cVar.o;
                efm.d0 d0VarK3 = ((com.revolut.feature.kyc.impl.b) g1Var).k3();
                efm.d0 d0VarFirstOrError = ((n1) ((com.revolut.feature.kyc.impl.b) g1Var).e).D0().c(te0.s.f270018a).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return new pfm.a(te0.w.H0(d0VarK3, d0VarFirstOrError), new n(i3, new cma.b(result, cVar, 26)), 4);
            case 1:
                my8.s result2 = (my8.s) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                return mo3.a.u(((com.revolut.feature.kyc.impl.f) cVar.f77576n).n3(result2), cVar.k, true);
            case 2:
                return ((com.revolut.feature.kyc.impl.f) cVar.f77576n).goBack();
            case 3:
                kpi.a result3 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                Intent intent = result3.f188248c;
                if (intent != null && (extras = intent.getExtras()) != null) {
                    submitCitizenshipFlowOutput = (SubmitCitizenshipFlowOutput) extras.getParcelable("EXTRA_SUBMIT_CITIZENSHIP_RESULT");
                }
                if (!(submitCitizenshipFlowOutput instanceof SubmitCitizenshipFlowOutput.SelectedCitizenship)) {
                    return submitCitizenshipFlowOutput instanceof SubmitCitizenshipFlowOutput.Decline ? new pfm.h(new o(cVar, i5), 2) : submitCitizenshipFlowOutput instanceof SubmitCitizenshipFlowOutput.Back ? mVar : ((com.revolut.feature.kyc.impl.f) cVar.f77576n).goBack();
                }
                efm.d0 d0VarFirstOrError2 = ((com.revolut.feature.kyc.impl.b) cVar.o).v3().firstOrError();
                n nVar = new n(13, new cma.b(cVar, (SubmitCitizenshipFlowOutput.SelectedCitizenship) submitCitizenshipFlowOutput, 25));
                d0VarFirstOrError2.getClass();
                return new pfm.a(d0VarFirstOrError2, nVar, 4);
            case 4:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.kyc.impl.f fVar = (com.revolut.feature.kyc.impl.f) cVar.f77576n;
                fVar.getClass();
                pfm.h hVar = new pfm.h(new s0(fVar, i5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 5:
                kpi.a it9 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                com.revolut.feature.kyc.impl.f fVar2 = (com.revolut.feature.kyc.impl.f) cVar.f77576n;
                return v7.x(new ufm.f(fVar2.k3(), new u0(i6, new t0(fVar2, 10)), i2), "ignoreElement(...)");
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                KycScreenContract$Step kycScreenContract$Step = (KycScreenContract$Step) pair.f186385a;
                my8.r rVar = (my8.r) pair.f186386b;
                if (!(kycScreenContract$Step instanceof KycScreenContract$Step.RemoteDocs)) {
                    aVar = kycScreenContract$Step instanceof KycScreenContract$Step.MoreDocs ? et8.a.NONE : et8.a.NONE;
                } else if (((com.revolut.feature.kyc.impl.b) cVar.o).p3()) {
                    aVar = et8.a.NONE;
                } else if (rVar == my8.r.TAX_RESIDENCY) {
                    aVar = et8.a.CLOSE;
                } else if (rVar == my8.r.JP_MY_NUMBER) {
                    aVar = !((com.revolut.feature.kyc.impl.b) cVar.o).p3() ? et8.a.CLOSE : et8.a.NONE;
                } else {
                    KycScreenContract$Configuration kycScreenContract$Configuration = cVar.f77579r;
                    boolean z = kycScreenContract$Configuration.f77550p;
                    boolean z3 = kycScreenContract$Configuration.e;
                    aVar = (!z || z3) ? (!z && z3) ? et8.a.BACK : et8.a.CLOSE : et8.a.NONE;
                }
                xpi.g gVar = cVar.f77573j;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                int i21 = h.f108841a[aVar.ordinal()];
                if (i21 == 1) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow);
                } else if (i21 == 2) {
                    numValueOf = Integer.valueOf(R$drawable.uikit_icn_24_cross);
                } else if (i21 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ((xpi.c) gVar).e0(numValueOf);
                return Unit.f186387a;
            case 7:
                ((xpi.c) cVar.f77573j).setVisible(((Boolean) obj2).booleanValue());
                return Unit.f186387a;
            case 8:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                efm.d0 d0VarFirstOrError3 = ((com.revolut.feature.kyc.impl.b) cVar.o).r3().firstOrError();
                n nVar2 = new n(12, new m(cVar, i3));
                d0VarFirstOrError3.getClass();
                return new pfm.a(d0VarFirstOrError3, nVar2, 4).g(te0.w.h(naviCommand));
            case 9:
                Boolean bool = (Boolean) obj2;
                iqi.h hVar2 = cVar.f77581t;
                Intrinsics.h(bool);
                ((iqi.b) hVar2).setVisible(bool.booleanValue());
                return Unit.f186387a;
            case 10:
                ((tpi.i) cVar.k).Q();
                return Unit.f186387a;
            case 11:
                String it10 = (String) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(Intrinsics.f(it10, "MENU_ITEM_SUPPORT") && cVar.f77579r.o != null);
            case 12:
                String it11 = (String) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return cVar.f77579r.o;
            case 13:
                String deeplink = (String) obj2;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                efm.d0 d0VarS1 = lg0.b.s1(cVar.z, deeplink, lg0.a.IGNORE, null, 4);
                d0VarS1.getClass();
                return new pfm.h(d0VarS1, 4);
            case 14:
                KycScreenContract$Step step = (KycScreenContract$Step) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                return step instanceof KycScreenContract$Step.USVisaDisclosure ? ((com.revolut.feature.kyc.impl.b) cVar.o).C3(((KycScreenContract$Step.USVisaDisclosure) step).f77563b) : mVar;
            case 15:
                akl.s sVar = cVar.i;
                if (!((Boolean) obj2).booleanValue()) {
                    return Unit.f186387a;
                }
                KycScreenContract$Configuration kycScreenContract$Configuration2 = cVar.f77579r;
                ifm.b bVar = cVar.f239031a;
                i1 i1Var = cVar.f77576n;
                int i22 = q.f108884a[kycScreenContract$Configuration2.f77547l.ordinal()];
                if (i22 == 1) {
                    com.revolut.feature.kyc.impl.f fVar3 = (com.revolut.feature.kyc.impl.f) i1Var;
                    pfm.a aVar2 = new pfm.a(fVar3.i.c0(com.revolut.feature.kyc.impl.g.a((wi0.b) ((n1) fVar3.f77668b).y0().get())), new a0d.g(9, new c0d.j(new BreadcrumbException(), 22)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
                    ofm.h hVarW = aVar2.w(new a08.p0(7, sVar), new a08.q(21, r.f108888a));
                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                    te0.w.j0(bVar, hVarW);
                } else if (i22 != 2) {
                    pfm.a aVar3 = new pfm.a(((com.revolut.feature.kyc.impl.f) i1Var).m3(), new a0d.g(9, new c0d.j(new BreadcrumbException(), 24)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                    ofm.h hVarW2 = aVar3.w(new a08.p0(7, sVar), new a08.q(21, t.f108896a));
                    Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
                    te0.w.j0(bVar, hVarW2);
                } else {
                    pfm.a aVar4 = new pfm.a(((com.revolut.feature.kyc.impl.f) i1Var).i.c0(new StatusViewConfiguration.Pending("verifying_identity_dialog_id", new TextLocalisedClause(R$string.kyc_reviewing_modal_title, null, null, 14), new TextLocalisedClause(R$string.kyc_reviewing_modal_description, null, null, 14), null, null, KycScreenContract$KycDocsStatus.Completed.f77552a, false, 8120)), new a0d.g(9, new c0d.j(new BreadcrumbException(), 23)), 2);
                    Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
                    ofm.h hVarW3 = aVar4.w(new a08.p0(7, sVar), new a08.q(21, s.f108893a));
                    Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
                    te0.w.j0(bVar, hVarW3);
                }
                return Unit.f186387a;
            case 16:
                NaviCommand naviCommand2 = (NaviCommand) obj2;
                if (naviCommand2 instanceof FeatureCommand) {
                    FeatureConfig featureConfig = ((FeatureCommand) naviCommand2).f98638a;
                    if (featureConfig instanceof ExternalKycProviderContract$Configuration) {
                        ExternalKycProviderContract$Configuration config = (ExternalKycProviderContract$Configuration) featureConfig;
                        ry8.d dVar = (ry8.d) cVar.f77575m;
                        Activity activity = dVar.f258262h;
                        Intrinsics.checkNotNullParameter(config, "config");
                        if (config instanceof ExternalKycProviderContract$Configuration.Onfido) {
                            activity.overridePendingTransition(0, 0);
                            Onfido onfido = (Onfido) dVar.f258263j.get();
                            sy8.b bVar2 = dVar.i;
                            Context applicationContext = activity.getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            onfido.startActivityForResult(activity, ConnectionsStatusCodes.STATUS_ALREADY_DISCOVERING, bVar2.a((ExternalKycProviderContract$Configuration.Onfido) config, applicationContext));
                        } else {
                            if (!(config instanceof ExternalKycProviderContract$Configuration.OnfidoStudio)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ExternalKycProviderContract$Configuration.OnfidoStudio onfidoStudio = (ExternalKycProviderContract$Configuration.OnfidoStudio) config;
                            activity.overridePendingTransition(0, 0);
                            activity.startActivityForResult(((OnfidoWorkflow) dVar.k.get()).createIntent(new WorkflowConfig.Builder(onfidoStudio.f77921a, onfidoStudio.f77922b).build()), ConnectionsStatusCodes.STATUS_ALREADY_CONNECTED_TO_ENDPOINT);
                        }
                        return Unit.f186387a;
                    }
                }
                throw new IllegalArgumentException("This command is not supported, " + naviCommand2);
            case 17:
                KycScreenContract$Step it12 = (KycScreenContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                if (it12 instanceof a1) {
                    return mVar;
                }
                efm.d0 d0VarFirstOrError4 = ((com.revolut.feature.kyc.impl.b) cVar.o).t3().firstOrError();
                d0VarFirstOrError4.getClass();
                return new pfm.h(d0VarFirstOrError4, 4);
            default:
                kpi.a result4 = (kpi.a) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4.f188247b == -1) {
                    cVar.f77577p.c(new FinishCommand(-1, null, null, 6));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("failed during internal document verification");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
