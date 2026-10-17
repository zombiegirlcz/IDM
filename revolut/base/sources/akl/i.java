package akl;

import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.repositories.impl.plugins.financial_evidence.FinancialEvidenceRepositoryImpl$getRevolutTransactionIdsType$1;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestination;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.retail.feature.api.income_sorter.models.ConflictingIncomeSorterExistsException;
import com.revolut.retail.feature.impl.income_sorter.network.IncomeSorterService;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public Object A;
    public Serializable B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int u = 3;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f6028w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6029x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f6030y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar, dj0.d dVar, String str, Long l2, String str2, String str3, dj0.d dVar2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.z = aVar;
        this.A = dVar;
        this.v = str;
        this.B = l2;
        this.C = str2;
        this.D = str3;
        this.f6028w = dVar2;
        this.f6030y = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f6030y, (k) this.z, (cjl.s) this.A, (jkl.i) this.B, (String) this.v, (String) this.C, (Boolean) this.f6028w, (String) this.D, continuation);
            case 1:
                return new i((j34.g) this.C, (ft3.h1) this.D, this.f6030y, continuation);
            case 2:
                return new i((List) this.z, (jtj.n) this.A, (hzi.c) this.B, (hzi.a) this.D, (IncomeSorterDestinationId) this.f6028w, (String) this.v, (String) this.C, this.f6030y, continuation);
            case 3:
                return new i((com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.z, (dj0.d) this.A, (String) this.v, (Long) this.B, (String) this.C, (String) this.D, (dj0.d) this.f6028w, this.f6030y, continuation);
            default:
                i iVar = new i((vkm.d) this.A, continuation, (AtomicBoolean) this.B, (Function1) this.v, (qe0.o) this.C, (qe0.k) this.D, (qe0.l) this.f6028w, this.f6030y);
                iVar.z = obj2;
                return iVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Boolean boolValueOf;
        Boolean bool;
        Object objJ;
        CreditPluginsService creditPluginsService;
        String str;
        ArrayList arrayList;
        Object objSubmitFinancialEvidence;
        Object objP;
        int i = this.u;
        boolean z = this.f6030y;
        Continuation continuation = null;
        Object obj3 = this.D;
        Object obj4 = this.C;
        int i2 = 1;
        switch (i) {
            case 0:
                jkl.i iVar = (jkl.i) this.B;
                cjl.s sVar = (cjl.s) this.A;
                k kVar = (k) this.z;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f6029x;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    if (z) {
                        this.f6029x = 1;
                        if (kVar.f6042a.bypassChallengeWithApproval(k.a(kVar), cj9.c.l(sVar), iVar.getValue(), (String) this.v, (String) obj4, (Boolean) this.f6028w, (String) obj3, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        this.f6029x = 2;
                        if (kVar.f6042a.bypassChallengeWithDecline(k.a(kVar), cj9.c.l(sVar), iVar.getValue(), (String) this.v, (String) obj4, (Boolean) this.f6028w, (String) obj3, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                ft3.h1 h1Var = (ft3.h1) obj3;
                j34.g gVar = (j34.g) obj4;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.f6029x;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    CreditPluginsService creditPluginsService2 = gVar.d;
                    String str2 = h1Var.f137835a;
                    List listA = j34.g.a(gVar, h1Var);
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(listA, 10));
                    Iterator it8 = listA.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(gVar.f.b(new File(((i24.a) it8.next()).getFilePath()), "uploadedEvidenceDocuments"));
                    }
                    boolValueOf = Boolean.valueOf(z);
                    bool = (Boolean) gVar.e.v0(Boolean.FALSE, j34.g.d(h1Var), wim.z.d(kotlin.jvm.internal.o0.b(Boolean.TYPE)));
                    bool.getClass();
                    this.z = creditPluginsService2;
                    this.v = str2;
                    this.A = arrayList2;
                    this.f6028w = boolValueOf;
                    this.B = bool;
                    this.f6029x = 1;
                    j34.b bVar = new j34.b(gVar, h1Var, continuation, i2);
                    skm.p0 p0Var = skm.p0.f264001a;
                    objJ = skm.e0.J(elm.f.f127540b, bVar, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                    creditPluginsService = creditPluginsService2;
                    str = str2;
                    arrayList = arrayList2;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objSubmitFinancialEvidence = obj2;
                        return gVar.f170970c.p((tt3.a) objSubmitFinancialEvidence);
                    }
                    bool = (Boolean) this.B;
                    boolValueOf = (Boolean) this.f6028w;
                    arrayList = (ArrayList) this.A;
                    String str3 = (String) this.v;
                    CreditPluginsService creditPluginsService3 = (CreditPluginsService) this.z;
                    yhm.o.b(obj2);
                    creditPluginsService = creditPluginsService3;
                    str = str3;
                    objJ = obj2;
                }
                xu3.o0 o0Var = (xu3.o0) objJ;
                String strName = o0Var != null ? o0Var.name() : null;
                ve0.c cVar = gVar.e;
                String strE = j34.g.e(h1Var);
                Type type = new FinancialEvidenceRepositoryImpl$getRevolutTransactionIdsType$1().getType();
                Intrinsics.checkNotNullExpressionValue(type, "getRevolutTransactionIdsType(...)");
                d14.a aVar3 = new d14.a(boolValueOf, bool, strName, (Set) ue0.e.M((Set) cVar.v0(zhm.h0.f322473a, strE, type)));
                this.z = null;
                this.v = null;
                this.A = null;
                this.f6028w = null;
                this.B = null;
                this.f6029x = 2;
                objSubmitFinancialEvidence = creditPluginsService.submitFinancialEvidence(str, arrayList, aVar3, this);
                if (objSubmitFinancialEvidence == aVar2) {
                    return aVar2;
                }
                return gVar.f170970c.p((tt3.a) objSubmitFinancialEvidence);
            case 2:
                jtj.n nVar = (jtj.n) this.A;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.f6029x;
                try {
                    if (i6 == 0) {
                        yhm.o.b(obj2);
                        List list = (List) this.z;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list, 10));
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(gtj.b.c((IncomeSorterDestination) it9.next()));
                        }
                        IncomeSorterService incomeSorterService = nVar.f178523c;
                        htj.c cVar2 = new htj.c((String) this.v, (String) obj4, ((hzi.c) this.B).toString(), this.f6030y, arrayList3, gtj.b.d((hzi.a) obj3), gtj.b.e((IncomeSorterDestinationId) this.f6028w));
                        this.f6029x = 1;
                        if (incomeSorterService.createIncomeSorter(cVar2, false, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i6 != 1) {
                            if (i6 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            yhm.o.b(obj2);
                            return Unit.f186387a;
                        }
                        yhm.o.b(obj2);
                    }
                    x4l.c cVar3 = nVar.d;
                    String str4 = (String) this.v;
                    this.f6029x = 2;
                    if (cVar3.d(str4, false, this) == aVar4) {
                        return aVar4;
                    }
                    return Unit.f186387a;
                } catch (HttpException e) {
                    if (e.code() == 409) {
                        throw new ConflictingIncomeSorterExistsException(0);
                    }
                    throw e;
                }
            case 3:
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar5 = (com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a) this.z;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.f6029x;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    dj0.d dVar = (dj0.d) this.A;
                    chj.h0 h0Var = new chj.h0(dVar, (String) this.v, (Long) this.B, 3);
                    o9a.v vVar = new o9a.v(i2);
                    o9a.x xVar = new o9a.x(aVar5, dVar, (String) obj4, (String) obj3, (dj0.d) this.f6028w, this.f6030y, null, 2);
                    this.f6029x = 1;
                    objP = n14.k.P(aVar5.X(), null, vVar, h0Var, xVar, this);
                    if (objP == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP = obj2;
                }
                nii.e eVar = (nii.e) objP;
                if (eVar instanceof nii.d) {
                    aVar5.C2(o9a.l.f223159a);
                } else {
                    if (!(eVar instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i22 = jli.h.f175850a;
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.f6029x;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.z;
                    vkm.d dVar2 = (vkm.d) this.A;
                    qe0.n nVar2 = new qe0.n(flowCollector, (AtomicBoolean) this.B, (Function1) this.v, (qe0.o) obj4, (qe0.k) obj3, (qe0.l) this.f6028w, this.f6030y);
                    this.z = null;
                    this.f6029x = 1;
                    if (dVar2.collect(nVar2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j34.g gVar, ft3.h1 h1Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.C = gVar;
        this.D = h1Var;
        this.f6030y = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, jtj.n nVar, hzi.c cVar, hzi.a aVar, IncomeSorterDestinationId incomeSorterDestinationId, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.z = list;
        this.A = nVar;
        this.B = cVar;
        this.D = aVar;
        this.f6028w = incomeSorterDestinationId;
        this.v = str;
        this.C = str2;
        this.f6030y = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vkm.d dVar, Continuation continuation, AtomicBoolean atomicBoolean, Function1 function1, qe0.o oVar, qe0.k kVar, qe0.l lVar, boolean z) {
        super(2, continuation);
        this.A = dVar;
        this.B = atomicBoolean;
        this.v = function1;
        this.C = oVar;
        this.D = kVar;
        this.f6028w = lVar;
        this.f6030y = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z, k kVar, cjl.s sVar, jkl.i iVar, String str, String str2, Boolean bool, String str3, Continuation continuation) {
        super(2, continuation);
        this.f6030y = z;
        this.z = kVar;
        this.A = sVar;
        this.B = iVar;
        this.v = str;
        this.C = str2;
        this.f6028w = bool;
        this.D = str3;
    }
}
