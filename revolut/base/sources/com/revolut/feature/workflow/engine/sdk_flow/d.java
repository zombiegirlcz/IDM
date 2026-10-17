package com.revolut.feature.workflow.engine.sdk_flow;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowDocumentScanCofiguration;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.SdkStep;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.VendorSideAttributes;
import gim.i;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import skm.e0;
import skm.p0;
import wuh.s;
import yhm.o;
import zhm.f0;
import zuh.m;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransitionAnimation f96600w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, TransitionAnimation transitionAnimation, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f96600w = transitionAnimation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f96600w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        FlowStep onfido;
        f fVar = this.v;
        SdkFlowContract$InputData sdkFlowContract$InputData = fVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Object[] objArr = 0;
        int i2 = 1;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar2 = fVar.f96602q;
            String str = ((SdkFlowContract$InputData.Workflow) sdkFlowContract$InputData).f96583a;
            this.u = 1;
            zuh.o oVar = aVar2.f178883a;
            oVar.getClass();
            m mVar = new m(oVar, str, objArr == true ? 1 : 0, i2);
            p0 p0Var = p0.f264001a;
            objJ = e0.J(elm.f.f127540b, mVar, this);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objJ = obj2;
        }
        SdkStep sdkStep = (SdkStep) objJ;
        yki.i iVar = fVar.f96606w;
        ril.i iVar2 = sdkStep.f105649c;
        VendorSideAttributes vendorSideAttributes = sdkStep.f105654m;
        List list = sdkStep.f105652j;
        List list2 = sdkStep.f105650g;
        wi0.b bVar = sdkStep.i;
        String str2 = sdkStep.e;
        String str3 = sdkStep.f105648b;
        switch (s.f300164a[iVar2.ordinal()]) {
            case 1:
                AnalyticsProduct analyticsProduct = ((SdkFlowContract$InputData.Workflow) sdkFlowContract$InputData).f96584b;
                if (list2 == null) {
                    throw new IllegalArgumentException("steps cannot be null");
                }
                DocType docType = sdkStep.f105651h;
                if (docType == null) {
                    throw new IllegalArgumentException("docType cannot be null");
                }
                if (list == null) {
                    list = f0.f322471a;
                }
                List list3 = list;
                if (bVar == null) {
                    throw new IllegalArgumentException("countryCode cannot be null");
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("token cannot be null");
                }
                WorkflowDocumentScanCofiguration.Onfido onfido2 = new WorkflowDocumentScanCofiguration.Onfido(docType, "no_applicant_id", str2, list2, list3, sdkStep.f, bVar, Intrinsics.f(analyticsProduct, new AnalyticsProduct.Shared(k9.Onboarding, x0.Onboarding, q6.Onboarding, w2.Onboarding, od.Terminal)));
                if (str3 == null) {
                    throw new IllegalArgumentException("checkId cannot be null for ONFIDO");
                }
                onfido = new SdkFlowContract$Step.Workflow.Onfido(str3, onfido2);
                break;
                break;
            case 2:
                if (vendorSideAttributes == null) {
                    throw new IllegalArgumentException("vendorSideAttributes cannot be null for ONFIDO_STUDIO");
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("token cannot be null for ONFIDO_STUDIO");
                }
                String str4 = vendorSideAttributes.f105661c;
                if (str4 == null) {
                    throw new IllegalArgumentException("vendorSideWorkflowId cannot be null for ONFIDO_STUDIO");
                }
                WorkflowDocumentScanCofiguration.OnfidoStudio onfidoStudio = new WorkflowDocumentScanCofiguration.OnfidoStudio(str2, str4);
                if (str3 == null) {
                    throw new IllegalArgumentException("checkId cannot be null for ONFIDO_STUDIO");
                }
                onfido = new SdkFlowContract$Step.Workflow.OnfidoStudio(str3, onfidoStudio);
                break;
                break;
            case 3:
                if (str2 == null) {
                    throw new IllegalArgumentException("Can't be undefined here");
                }
                if (str3 == null) {
                    throw new IllegalArgumentException("checkId cannot be null for VISION");
                }
                onfido = new SdkFlowContract$Step.Workflow.Vision(str3, new WorkflowDocumentScanCofiguration.Vision(str2, sdkStep.f105653l));
                break;
                break;
            case 4:
                if (str3 == null) {
                    throw new IllegalArgumentException("checkId cannot be null for INCODE");
                }
                if (bVar == null) {
                    throw new IllegalArgumentException("countryCode cannot be null");
                }
                if (str2 == null) {
                    throw new IllegalArgumentException("token cannot be null");
                }
                if (list2 == null) {
                    throw new IllegalArgumentException("steps cannot be null");
                }
                if (list == null) {
                    throw new IllegalArgumentException("docPages cannot be null");
                }
                onfido = new SdkFlowContract$Step.Workflow.Incode(str3, new WorkflowDocumentScanCofiguration.Incode(bVar, str2, list2, list, vendorSideAttributes != null ? vendorSideAttributes.d : null, vendorSideAttributes != null ? vendorSideAttributes.e : null));
                break;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                throw new IllegalStateException("Can't be defined at this step");
            default:
                throw new NoWhenBranchMatchedException();
        }
        h.t2(fVar, iVar, onfido, false, this.f96600w, false, 8);
        return Unit.f186387a;
    }
}
