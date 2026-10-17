package com.revolut.feature.workflow.engine.sdk_flow;

import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$InputData;
import com.revolut.feature.workflow.engine.sdk_flow.SdkFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.shared.feature.workflow.engine.api.models.SdkVendorInfo;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.SdkStep;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.VendorSideAttributes;
import gim.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import oki.h;
import ril.g;
import skm.e0;
import skm.p0;
import yhm.o;
import zuh.m;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function1 {
    public SdkFlowContract$Step.PredefinedVendor u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f96598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TransitionAnimation f96599x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, TransitionAnimation transitionAnimation, Continuation continuation) {
        super(1, continuation);
        this.f96598w = fVar;
        this.f96599x = transitionAnimation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f96598w, this.f96599x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        SdkVendorInfo webId;
        SdkFlowContract$Step.PredefinedVendor predefinedVendor;
        f fVar = this.f96598w;
        SdkFlowContract$InputData sdkFlowContract$InputData = fVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        int i2 = 1;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar2 = fVar.f96602q;
            String str = ((SdkFlowContract$InputData.Predefined) sdkFlowContract$InputData).f96580a;
            this.v = 1;
            zuh.o oVar = aVar2.f178883a;
            oVar.getClass();
            m mVar = new m(oVar, str, null, i2);
            p0 p0Var = p0.f264001a;
            objJ = e0.J(elm.f.f127540b, mVar, this);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SdkFlowContract$Step.PredefinedVendor predefinedVendor2 = this.u;
            o.b(obj2);
            predefinedVendor = predefinedVendor2;
            h.t2(fVar, fVar.f96606w, predefinedVendor, false, this.f96599x, false, 8);
            return Unit.f186387a;
        }
        o.b(obj2);
        objJ = obj2;
        SdkStep step = (SdkStep) objJ;
        SdkFlowContract$InputData.Predefined inputData = (SdkFlowContract$InputData.Predefined) sdkFlowContract$InputData;
        fVar.f96603r.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(step, "step");
        ril.i iVar = step.f105649c;
        ril.i iVar2 = step.f105649c;
        String str2 = step.e;
        g gVar = step.d;
        String str3 = step.f105647a;
        switch (kvh.e.f190125b[iVar.ordinal()]) {
            case 1:
                webId = new SdkVendorInfo.WebId(kvh.f.a(step), str3);
                break;
            case 2:
                webId = new SdkVendorInfo.Diia(kvh.f.a(step), str3, inputData.f96581b);
                break;
            case 3:
                webId = new SdkVendorInfo.MyInfo(kvh.f.a(step), str3);
                break;
            case 4:
                webId = new SdkVendorInfo.Cmd(str3);
                break;
            case 5:
                int i3 = gVar != null ? kvh.e.f190124a[gVar.ordinal()] : -1;
                if (i3 == 1) {
                    webId = new SdkVendorInfo.IdnowVideoIdent(kvh.f.a(step), str3, kvh.f.b(step));
                } else {
                    if (i3 != 2) {
                        throw new IllegalArgumentException("Illegal method " + gVar + " for Idnow vendor");
                    }
                    String strA = kvh.f.a(step);
                    if (str2 == null || d0.W(str2)) {
                        Object obj3 = gVar;
                        if (gVar == null) {
                            obj3 = "any";
                        }
                        throw new IllegalArgumentException("Token can't be empty for " + iVar2 + " vendor and " + obj3 + " method");
                    }
                    webId = new SdkVendorInfo.IdnowEid(strA, str2);
                }
                break;
            case 6:
                List listB = kvh.f.b(step);
                int i5 = gVar != null ? kvh.e.f190124a[gVar.ordinal()] : -1;
                if (i5 == 1) {
                    webId = new SdkVendorInfo.HypervergeVideoConference(kvh.f.a(step), str3, listB);
                } else {
                    if (i5 != 3) {
                        throw new IllegalArgumentException("Illegal method " + gVar + " for Hyperverge vendor");
                    }
                    webId = new SdkVendorInfo.HypervergeGovAuth(kvh.f.a(step), str3, listB);
                }
                break;
            case 7:
                int i6 = gVar != null ? kvh.e.f190124a[gVar.ordinal()] : -1;
                if (i6 == 3) {
                    webId = new SdkVendorInfo.Dap(str3);
                } else {
                    if (i6 != 4) {
                        throw new IllegalArgumentException("Illegal method " + gVar + " for Dap vendor");
                    }
                    webId = new SdkVendorInfo.DapQes(str3);
                }
                break;
            case 8:
                webId = new SdkVendorInfo.Mobywatel(kvh.f.a(step), str3);
                break;
            case 9:
                webId = new SdkVendorInfo.EgovKyc(str3, kvh.f.b(step));
                break;
            case 10:
                int i21 = gVar != null ? kvh.e.f190124a[gVar.ordinal()] : -1;
                if (i21 == 2) {
                    webId = new SdkVendorInfo.TrustdockWeb(kvh.f.a(step), str3);
                } else {
                    if (i21 != 3) {
                        throw new IllegalArgumentException("Illegal method " + gVar + " for Trustdock vendor");
                    }
                    VendorSideAttributes vendorSideAttributes = step.f105654m;
                    if (vendorSideAttributes == null) {
                        throw new IllegalArgumentException(("VendorSideAttributes is required for " + iVar).toString());
                    }
                    String strA2 = kvh.f.a(step);
                    String str4 = vendorSideAttributes.f105660b;
                    if (str4 == null || d0.W(str4)) {
                        throw new IllegalArgumentException("VendorSide planId is required for " + iVar);
                    }
                    String str5 = vendorSideAttributes.f105659a;
                    if (str5 == null || d0.W(str5)) {
                        throw new IllegalArgumentException("VendorSide projectId is required for " + iVar);
                    }
                    webId = new SdkVendorInfo.TrustdockSdk(strA2, str4, str5);
                }
                break;
            case 11:
                webId = new SdkVendorInfo.Itsme(kvh.f.a(step), str3);
                break;
            case 12:
                webId = new SdkVendorInfo.IdAustria(str3);
                break;
            case 13:
                webId = new SdkVendorInfo.BankId(kvh.f.a(step), str3);
                break;
            case 14:
                webId = new SdkVendorInfo.Idura(kvh.f.a(step), str3);
                break;
            case 15:
                webId = new SdkVendorInfo.UaePass(kvh.f.a(step), str3, kvh.f.b(step));
                break;
            case 16:
                String strA3 = kvh.f.a(step);
                if (str2 == null || d0.W(str2)) {
                    Object obj4 = gVar;
                    if (gVar == null) {
                        obj4 = "any";
                    }
                    throw new IllegalArgumentException("Token can't be empty for " + iVar2 + " vendor and " + obj4 + " method");
                }
                DocType docType = step.f105651h;
                Object obj5 = gVar;
                if (docType == null) {
                    if (gVar == null) {
                        obj5 = "any";
                    }
                    throw new IllegalArgumentException(("DocType is required for " + iVar + " vendor and " + obj5 + " method").toString());
                }
                wi0.b bVar = step.i;
                Object obj6 = gVar;
                if (bVar == null) {
                    if (gVar == null) {
                        obj6 = "any";
                    }
                    throw new IllegalArgumentException(("CountryCode is required for " + iVar + " vendor and " + obj6 + " method").toString());
                }
                webId = new SdkVendorInfo.Fourthline(docType, strA3, str2, bVar);
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                throw new IllegalArgumentException("Can't be defined at this step");
            default:
                throw new NoWhenBranchMatchedException();
        }
        SdkFlowContract$Step.PredefinedVendor predefinedVendor3 = new SdkFlowContract$Step.PredefinedVendor(webId);
        String str6 = ((SdkFlowContract$InputData.Predefined) sdkFlowContract$InputData).f96582c;
        this.u = predefinedVendor3;
        this.v = 2;
        if (f.I2(fVar, webId, str6, this) != aVar) {
            predefinedVendor = predefinedVendor3;
            h.t2(fVar, fVar.f96606w, predefinedVendor, false, this.f96599x, false, 8);
            return Unit.f186387a;
        }
        return aVar;
    }
}
