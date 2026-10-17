package zuh;

import bvh.k0;
import com.revolut.feature.kyc_documents_scan.api.models.DocType;
import com.revolut.feature.kyc_documents_scan.api.models.WorkflowKycDocPage;
import com.revolut.feature.workflow.engine.shared.data.WorkflowService;
import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CitizenshipGroup;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Citizenships;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Redirect;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.SdkStep;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.VendorSideAttributes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import my8.b0;
import my8.v;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f325477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f325478x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325477w = oVar;
        this.f325478x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f325477w, this.f325478x, continuation, 0);
            case 1:
                return new m(this.f325477w, this.f325478x, continuation, 1);
            case 2:
                return new m(this.f325477w, this.f325478x, continuation, 2);
            default:
                return new m(this.f325477w, this.f325478x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object citizenships;
        Object objInitSdkStep;
        ril.i iVarValueOf;
        ril.g gVar;
        v vVarValueOf;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Set setI1;
        VendorSideAttributes vendorSideAttributes;
        my8.k kVarValueOf;
        List pages;
        WorkflowKycDocPage workflowKycDocPage;
        String issuingCountry;
        String type;
        bvh.o oVar;
        b0 b0VarValueOf;
        ril.g gVar2;
        int i = this.u;
        wi0.b bVarA = null;
        String str = this.f325478x;
        o oVar2 = this.f325477w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    WorkflowService workflowService = oVar2.f325482c;
                    this.v = 1;
                    citizenships = workflowService.getCitizenships(str, this);
                    if (citizenships == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    citizenships = obj2;
                }
                evh.d dVar = (evh.d) citizenships;
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                String declaredCitizenship = dVar.getDeclaredCitizenship();
                if (declaredCitizenship != null) {
                    wi0.b.Companion.getClass();
                    bVarA = wi0.a.a(declaredCitizenship);
                }
                List<evh.c> groups = dVar.getGroups();
                ArrayList arrayList4 = new ArrayList(w.t(groups, 10));
                for (evh.c cVar : groups) {
                    String group = cVar.getGroup();
                    List citizenships2 = cVar.getCitizenships();
                    ArrayList arrayList5 = new ArrayList(w.t(citizenships2, 10));
                    Iterator it8 = citizenships2.iterator();
                    while (it8.hasNext()) {
                        kii.e.B(wi0.b.Companion, (String) it8.next(), arrayList5);
                    }
                    arrayList4.add(new CitizenshipGroup(group, arrayList5));
                }
                return new Citizenships(arrayList4, bVarA);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    WorkflowService workflowService2 = oVar2.f325482c;
                    this.v = 1;
                    objInitSdkStep = workflowService2.initSdkStep(str, this);
                    if (objInitSdkStep == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objInitSdkStep = obj2;
                }
                bvh.o oVar3 = (bvh.o) objInitSdkStep;
                Intrinsics.checkNotNullParameter(oVar3, "<this>");
                String uri2 = oVar3.getToken().getUri();
                if (uri2 == null) {
                    uri2 = "";
                }
                String str2 = uri2;
                String checkId = oVar3.getCheckId();
                try {
                    iVarValueOf = ril.i.valueOf(oVar3.getVendor());
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    iVarValueOf = null;
                }
                if (iVarValueOf == null) {
                    throw new UnrecognisedContractException(p.a.p("SdkVendor ", oVar3.getVendor(), " is not supported"));
                }
                String method = oVar3.getMethod();
                if (method != null) {
                    ril.g[] gVarArrValues = ril.g.values();
                    int length = gVarArrValues.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            gVar2 = gVarArrValues[i5];
                            if (!a0.z(gVar2.name(), method, true)) {
                                i5++;
                            }
                        } else {
                            gVar2 = null;
                        }
                    }
                    if (gVar2 == null) {
                        throw new UnrecognisedContractException("Unknown SdkMethod ".concat(method));
                    }
                    gVar = gVar2;
                } else {
                    gVar = null;
                }
                String token = oVar3.getToken().getToken();
                String nfcType = oVar3.getNfcType();
                if (nfcType != null) {
                    try {
                        vVarValueOf = v.valueOf(nfcType);
                    } catch (Exception e2) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                        vVarValueOf = null;
                    }
                    if (vVarValueOf == null) {
                        throw new UnrecognisedContractException("Unexpected NFC type: ".concat(nfcType));
                    }
                    break;
                } else {
                    vVarValueOf = v.DISABLED;
                }
                v vVar = vVarValueOf;
                List steps = oVar3.getSteps();
                if (steps != null) {
                    List<String> list = steps;
                    arrayList = new ArrayList(w.t(list, 10));
                    for (String str3 : list) {
                        try {
                            b0VarValueOf = b0.valueOf(str3);
                            oVar = oVar3;
                        } catch (Exception e4) {
                            h0 h0Var3 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                            oVar = oVar3;
                            rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var3);
                            b0VarValueOf = null;
                        }
                        if (b0VarValueOf == null) {
                            throw new UnrecognisedContractException(p.a.p("VerificationStep ", str3, " is not supported"));
                        }
                        arrayList.add(b0VarValueOf);
                        oVar3 = oVar;
                    }
                } else {
                    arrayList = null;
                }
                bvh.o oVar4 = oVar3;
                bvh.j document = oVar4.getDocument();
                DocType docType = (document == null || (type = document.getType()) == null) ? null : new DocType(type);
                bvh.j document2 = oVar4.getDocument();
                wi0.b bVarC = (document2 == null || (issuingCountry = document2.getIssuingCountry()) == null) ? null : com.bumptech.glide.d.c(issuingCountry);
                bvh.j document3 = oVar4.getDocument();
                if (document3 == null || (pages = document3.getPages()) == null) {
                    arrayList2 = null;
                } else {
                    List<bvh.m> list2 = pages;
                    ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
                    for (bvh.m mVar : list2) {
                        try {
                            workflowKycDocPage = new WorkflowKycDocPage(my8.w.valueOf(mVar.getType()));
                        } catch (Exception e5) {
                            h0 h0Var4 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e5, h0Var4);
                            workflowKycDocPage = null;
                        }
                        if (workflowKycDocPage == null) {
                            throw new UnrecognisedContractException(j6.a.q("Unexpected page type: ", mVar.getType()));
                        }
                        arrayList6.add(workflowKycDocPage);
                        break;
                    }
                    arrayList2 = arrayList6;
                }
                List redirects = oVar4.getToken().getRedirects();
                if (redirects != null) {
                    List<bvh.a0> list3 = redirects;
                    ArrayList arrayList7 = new ArrayList(w.t(list3, 10));
                    for (bvh.a0 a0Var : list3) {
                        arrayList7.add(new Redirect(a0Var.getAction(), a0Var.getUri()));
                    }
                    arrayList3 = arrayList7;
                } else {
                    arrayList3 = null;
                }
                Set consents = oVar4.getConsents();
                if (consents != null) {
                    Set<String> set = consents;
                    ArrayList arrayList8 = new ArrayList(w.t(set, 10));
                    for (String str4 : set) {
                        try {
                            kVarValueOf = my8.k.valueOf(str4);
                        } catch (Exception e6) {
                            h0 h0Var5 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e6, h0Var5);
                            kVarValueOf = null;
                        }
                        if (kVarValueOf == null) {
                            throw new UnrecognisedContractException(j6.a.q("Unexpected consent type ", str4));
                        }
                        arrayList8.add(kVarValueOf);
                        break;
                    }
                    setI1 = d0.i1(arrayList8);
                } else {
                    setI1 = null;
                }
                k0 vendorSideAttributes2 = oVar4.getToken().getVendorSideAttributes();
                if (vendorSideAttributes2 != null) {
                    Intrinsics.checkNotNullParameter(vendorSideAttributes2, "<this>");
                    vendorSideAttributes = new VendorSideAttributes(vendorSideAttributes2.getVendorSideProjectId(), vendorSideAttributes2.getVendorSidePlanId(), vendorSideAttributes2.getVendorSideWorkflowId(), vendorSideAttributes2.getVendorSideApiUri(), vendorSideAttributes2.getVendorSideConsentConfigurationId());
                } else {
                    vendorSideAttributes = null;
                }
                return new SdkStep(str2, checkId, iVarValueOf, gVar, token, vVar, arrayList, docType, bVarC, arrayList2, arrayList3, setI1, vendorSideAttributes);
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    WorkflowService workflowService3 = oVar2.f325482c;
                    this.v = 1;
                    if (workflowService3.postWorkflowSsoFailure(str, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    WorkflowService workflowService4 = oVar2.f325482c;
                    evh.a0 a0Var2 = new evh.a0();
                    this.v = 1;
                    if (workflowService4.postWorkflowSsoSuccess(str, a0Var2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
