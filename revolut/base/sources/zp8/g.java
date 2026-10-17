package zp8;

import aii.q;
import au6.u0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.impl.network.services.FreelancerCustomersService;
import com.revolut.feature.push_to_card.api.navigation.creation.CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId;
import com.revolut.feature.push_to_card.impl.flows.add_card_kompot.flow.CardOwnerCreationFlowContract$CreationProcessState;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationBrandOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationPreferenceOption;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationUpdateBrandsRequest;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationUpdatePreferencesRequest;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferLocateInputData;
import efm.d0;
import et6.b1;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import nii.z;
import nyb.c0;
import opf.l;
import osk.m;
import pfm.r;
import skm.e0;
import skm.p0;
import te0.w;
import tof.a3;
import vkm.j2;
import vkm.v1;
import wxd.o;
import zhm.h0;
import zqf.j;
import zqf.k;
import zr2.n;
import zzb.t;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f324192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f324193x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f324192w = obj2;
        this.f324193x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g((com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.f324192w, (e) this.f324193x, continuation, 0);
            case 1:
                return new g((zqa.f) this.f324192w, (CardOwnerCreationFlowContract$CreationProcessState) this.f324193x, continuation, 1);
            case 2:
                return new g((k) this.f324193x, continuation);
            case 3:
                return new g((n) this.f324192w, (a3) this.f324193x, continuation, 3);
            case 4:
                return new g((zv6.k) this.f324192w, (String) this.f324193x, continuation, 4);
            case 5:
                return new g((t) this.f324192w, (CoroutineScope) this.f324193x, continuation, 5);
            default:
                return new g((com.revolut.feature.statements.impl.ui.documents_hub.a) this.f324192w, (o) this.f324193x, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object next;
        String str;
        Object objB;
        Object next2;
        kse.a aVar;
        Object next3;
        int i = this.u;
        Object obj3 = this.f324193x;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b bVar = (com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.b) this.f324192w;
                    com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.a aVar3 = new com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.a(bVar, (e) obj3, null);
                    this.v = 1;
                    if (bVar.p2(this, aVar3) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                zqa.f fVar = (zqa.f) this.f324192w;
                t1j.b bVar2 = fVar.f324445l;
                CardOwnerCreationFlowContract$CreationProcessState cardOwnerCreationFlowContract$CreationProcessState = (CardOwnerCreationFlowContract$CreationProcessState) obj3;
                Iterator it8 = fVar.o.f81546b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (next instanceof CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId) {
                        }
                    } else {
                        next = null;
                    }
                }
                CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId cardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId = (CardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId) next;
                str = cardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId != null ? cardOwnerCreationInputData$AdditionalConfig$AttachPaymentWidgetId.f81548a : 0;
                this.v = 1;
                Object objB2 = bVar2.b(cardOwnerCreationFlowContract$CreationProcessState, str, this);
                return objB2 == obj4 ? obj4 : objB2;
            case 2:
                k kVar = (k) obj3;
                TransferLocateInputData transferLocateInputData = kVar.f324485p;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    str = transferLocateInputData.f92164a;
                    l lVar = kVar.f324486q;
                    this.f324192w = str;
                    this.v = 1;
                    objB = lVar.b(str, this);
                    if (objB == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2 && i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    str = (String) this.f324192w;
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                List list = (List) objB;
                int i6 = j.f324484a[transferLocateInputData.f92165b.ordinal()];
                if (i6 == 1) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next2 = it9.next();
                            if (((kse.a) next2).i.equals(kse.h.f189447c)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    aVar = (kse.a) next2;
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Iterator it10 = list.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next3 = it10.next();
                            if (((kse.a) next3).i.equals(kse.j.f189449c)) {
                            }
                        } else {
                            next3 = null;
                        }
                    }
                    aVar = (kse.a) next3;
                }
                if (aVar != null) {
                    this.f324192w = null;
                    this.v = 2;
                    yji.l.a1(kVar, kVar.X1(new y0("TICKET_ERROR_STATUS_ID", new z(new TextLocalisedClause(R$string.bank_transfer_troubleshooting_locate_error_reticket_title, null, null, 14), null, new TextLocalisedClause(R$string.bank_transfer_troubleshooting_locate_error_reticket_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new zah.f(kVar, aVar, str, 27), 3);
                    if (Unit.f186387a == aVar4) {
                        return aVar4;
                    }
                } else {
                    this.f324192w = null;
                    this.v = 3;
                    if (k.y2(kVar, str, this) == aVar4) {
                        return aVar4;
                    }
                }
                return Unit.f186387a;
            case 3:
                n nVar = (n) this.f324192w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    j60.a.v(nVar.u, false, null, 3);
                    r rVarA = nVar.f324542r.a(((a3) obj3).f272581b);
                    this.v = 1;
                    if (nim.a.a(rVarA, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                String id10 = (String) obj3;
                zv6.k kVar2 = (zv6.k) this.f324192w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    b1 b1Var = kVar2.f325587p;
                    lr6.e params = zv6.k.y2(kVar2);
                    b1Var.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(params, "params");
                    u0 u0Var = (u0) b1Var.f129196a;
                    u0Var.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(params, "params");
                    FreelancerCustomersService freelancerCustomersService = u0Var.f9626a;
                    Intrinsics.checkNotNullParameter(params, "<this>");
                    String str2 = params.f199397a;
                    String str3 = params.f199398b;
                    String str4 = params.f199399c;
                    String str5 = params.d;
                    Address address = params.e;
                    d0<com.revolut.feature.freelancer.impl.network.models.l> d0VarPatchCustomer = freelancerCustomersService.patchCustomer(id10, new com.revolut.feature.freelancer.impl.network.models.h(id10, str2, str3, str4, str5, address != null ? oo3.a.d(address) : null));
                    d0VarPatchCustomer.getClass();
                    pfm.h hVar = new pfm.h(d0VarPatchCustomer, 4);
                    Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                    r rVarG0 = w.g0(hVar);
                    b1 b1Var2 = kVar2.f325587p;
                    b1Var2.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    efm.b bVarIgnoreElements = mo3.a.n(b1Var2.b(id10, true)).ignoreElements();
                    Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                    pfm.a aVarE = rVarG0.e(ue0.e.v(bVarIgnoreElements));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                t tVar = (t) this.f324192w;
                c0 c0Var = tVar.f326665p;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    zzb.k kVar3 = (zzb.k) ((zzb.h) ((j2) tVar.f326668s.f22677a).getValue()).f326651a.getContent();
                    if (kVar3 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("onContinueClicked was clicked when content was null");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        return Unit.f186387a;
                    }
                    int i33 = 10;
                    if (kVar3 instanceof zzb.i) {
                        ArrayList arrayList = ((zzb.i) kVar3).f326652a.f84015b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj5 : arrayList) {
                            if (((RevPointsPersonalisationBrandOption) obj5).d) {
                                arrayList2.add(obj5);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
                        Iterator it11 = arrayList2.iterator();
                        while (it11.hasNext()) {
                            arrayList3.add(((RevPointsPersonalisationBrandOption) it11.next()).f84011a);
                        }
                        RevPointsPersonalisationUpdateBrandsRequest revPointsPersonalisationUpdateBrandsRequest = new RevPointsPersonalisationUpdateBrandsRequest(arrayList3);
                        this.v = 1;
                        oxb.f fVar2 = c0Var.f220778a;
                        fVar2.getClass();
                        m mVar = new m(fVar2, revPointsPersonalisationUpdateBrandsRequest, str, i33);
                        p0 p0Var = p0.f264001a;
                        Object objJ = e0.J(elm.f.f127540b, mVar, this);
                        fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                        Object obj6 = objJ;
                        if (objJ != aVar8) {
                            obj6 = Unit.f186387a;
                        }
                        if (obj6 != aVar8) {
                            obj6 = Unit.f186387a;
                        }
                        if (obj6 == aVar7) {
                            return aVar7;
                        }
                    } else {
                        if (!(kVar3 instanceof zzb.j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ArrayList arrayList4 = ((zzb.j) kVar3).f326653a.f84020b;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj7 : arrayList4) {
                            if (((RevPointsPersonalisationPreferenceOption) obj7).d) {
                                arrayList5.add(obj7);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                        Iterator it12 = arrayList5.iterator();
                        while (it12.hasNext()) {
                            arrayList6.add(((RevPointsPersonalisationPreferenceOption) it12.next()).f84016a);
                        }
                        RevPointsPersonalisationUpdatePreferencesRequest revPointsPersonalisationUpdatePreferencesRequest = new RevPointsPersonalisationUpdatePreferencesRequest(arrayList6);
                        this.v = 2;
                        oxb.f fVar3 = c0Var.f220778a;
                        fVar3.getClass();
                        m mVar2 = new m(fVar3, revPointsPersonalisationUpdatePreferencesRequest, str, 11);
                        p0 p0Var2 = p0.f264001a;
                        Object objJ2 = e0.J(elm.f.f127540b, mVar2, this);
                        fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                        Object obj8 = objJ2;
                        if (objJ2 != aVar9) {
                            obj8 = Unit.f186387a;
                        }
                        if (obj8 != aVar9) {
                            obj8 = Unit.f186387a;
                        }
                        if (obj8 == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i32 != 1 && i32 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                tVar.C2(q.f5292a);
                return Unit.f186387a;
            default:
                com.revolut.feature.statements.impl.ui.documents_hub.a aVar10 = (com.revolut.feature.statements.impl.ui.documents_hub.a) this.f324192w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    jyd.b bVar3 = aVar10.f88361p;
                    o request = (o) obj3;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(request, "request");
                    v1 v1Var = new v1(new i4g.d(request, bVar3, (Continuation) str, 16));
                    v20.c0 c0Var2 = new v20.c0(aVar10, 7);
                    this.v = 1;
                    if (v1Var.collect(c0Var2, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, Continuation continuation) {
        super(1, continuation);
        this.u = 2;
        this.f324193x = kVar;
    }
}
