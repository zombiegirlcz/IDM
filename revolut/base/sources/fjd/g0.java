package fjd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.bills.billers.impl.data.network.BillersService;
import com.revolut.feature.apm.bills.boleto.api.R$string;
import com.revolut.feature.apm.breb.impl.data.network.qr.BrebQrService;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPaymentsQuery;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.topup_screen.impl.data.network.service.RevertTransferService;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.lds.LDSFile;
import tof.a3;
import vkm.j2;
import xzg.n0;
import yhm.m;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f135572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f135573x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g0(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 27;
        this.f135572w = bVar;
        this.f135573x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v54, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0((com.revolut.feature.shops.impl.ui.home.a) this.f135572w, (List) this.f135573x, continuation, 0);
            case 1:
                return new g0((fk4.q) this.f135572w, (String) this.f135573x, continuation, 1);
            case 2:
                g0 g0Var = new g0((fkl.h) this.f135573x, continuation, 2);
                g0Var.f135572w = obj2;
                return g0Var;
            case 3:
                return new g0((flf.t) this.f135572w, (a3) this.f135573x, continuation, 3);
            case 4:
                return new g0((fm1.c) this.f135572w, (String) this.f135573x, continuation, 4);
            case 5:
                return new g0((fm1.c) this.f135572w, (cm1.b) this.f135573x, continuation, 5);
            case 6:
                g0 g0Var2 = new g0((com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) this.f135573x, continuation, 6);
                g0Var2.f135572w = obj2;
                return g0Var2;
            case 7:
                return new g0((com.revolut.feature.apm.bills.boleto.impl.flow.a) this.f135572w, (mn1.o) this.f135573x, continuation, 7);
            case 8:
                g0 g0Var3 = new g0((fna.h) this.f135573x, continuation, 8);
                g0Var3.f135572w = obj2;
                return g0Var3;
            case 9:
                return new g0((fo1.e0) this.f135572w, (io3.d) this.f135573x, continuation, 9);
            case 10:
                return new g0((fo8.b) this.f135572w, (JuniorBankingProfile) this.f135573x, continuation, 10);
            case 11:
                g0 g0Var4 = new g0((com.revolut.feature.payment.counterparty.impl.screen.profile.a) this.f135573x, continuation, 11);
                g0Var4.f135572w = obj2;
                return g0Var4;
            case 12:
                return new g0((com.revolut.feature.wealth_discovery.impl.collection.top_movers.a) this.f135572w, (n0) this.f135573x, continuation, 12);
            case 13:
                return new g0((fr7.i) this.f135572w, (sl7.e) this.f135573x, continuation, 13);
            case 14:
                return new g0((fsl.s) this.f135572w, (fsl.l) this.f135573x, continuation, 14);
            case 15:
                return new g0((ft1.m) this.f135572w, (String) this.f135573x, continuation, 15);
            case 16:
                return new g0((ft4.i0) this.f135572w, (a3) this.f135573x, continuation, 16);
            case 17:
                g0 g0Var5 = new g0((fti.b) this.f135573x, continuation, 17);
                g0Var5.f135572w = obj2;
                return g0Var5;
            case 18:
                return new g0((com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) this.f135572w, this.f135573x, continuation, 18);
            case 19:
                g0 g0Var6 = new g0((fuc.h) this.f135573x, continuation, 19);
                g0Var6.f135572w = obj2;
                return g0Var6;
            case 20:
                return new g0((r10.r) this.f135572w, (String) this.f135573x, continuation, 20);
            case 21:
                return new g0((String) this.f135572w, (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) this.f135573x, continuation, 21);
            case 22:
                return new g0((fve.a) this.f135572w, (String) this.f135573x, continuation, 22);
            case 23:
                return new g0((com.revolut.feature.security_hub.impl.ui.transactions_limits.a) this.f135572w, (String) this.f135573x, continuation, 23);
            case 24:
                return new g0((fxc.u) this.f135572w, (t61.g) this.f135573x, continuation, 24);
            case 25:
                g0 g0Var7 = new g0((fyi.d) this.f135573x, continuation, 25);
                g0Var7.f135572w = obj2;
                return g0Var7;
            case 26:
                return new g0((fz4.l) this.f135572w, (ty0.a) this.f135573x, continuation, 26);
            case 27:
                return new g0((com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b) this.f135572w, (Function1) this.f135573x, continuation);
            case 28:
                return new g0((g17.h) this.f135572w, (wi0.b) this.f135573x, continuation, 28);
            default:
                return new g0((com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a) this.f135572w, (zm3.a) this.f135573x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [r10.a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v36, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
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
        Object billerById;
        Object billers;
        Object objA;
        Address address;
        Object objB;
        Object objA2;
        Object objW;
        Object objDecode;
        Object objRevertTransfer;
        int i = this.u;
        Object obj3 = this.f135573x;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.feature.shops.impl.ui.home.a) this.f135572w).u.f((List) obj3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fk4.q qVar = (fk4.q) this.f135572w;
                eg4.b bVar = new eg4.b(qVar, (String) obj3, , 24);
                this.v = 1;
                Object objB2 = pu7.a.B(qVar.k, "observe external accounts", bVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            case 2:
                FlowCollector flowCollector = (FlowCollector) this.f135572w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    Boolean bool = (Boolean) j6.a.k(Boolean.TYPE, ((fkl.h) obj3).f135869c, "LOGOUT_REQUIRED");
                    if (bool != null ? bool.booleanValue() : false) {
                        Unit unit = Unit.f186387a;
                        this.f135572w = null;
                        this.v = 1;
                        if (flowCollector.emit(unit, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    flf.t tVar = (flf.t) this.f135572w;
                    flf.r rVar = new flf.r(tVar, (a3) obj3, , i2);
                    this.v = 1;
                    if (u0.b0(tVar.q2(), "DIRECT_DEBIT_RETRY_ACTION_TAG_" + tVar.f135983r.f206252a.f185494j, rVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    billerById = ((fm1.c) this.f135572w).f136019a.getBillerById((String) obj3, this);
                    if (billerById == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    billerById = obj2;
                }
                return fm1.a.a((em1.a) billerById);
            case 5:
                cm1.b bVar2 = (cm1.b) obj3;
                ?? arrayList = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    BillersService billersService = ((fm1.c) this.f135572w).f136019a;
                    String strName = bVar2.f25105a.name();
                    String str = bVar2.f25106b;
                    Integer num = new Integer(100);
                    Integer num2 = new Integer(bVar2.f25107c);
                    xo1.b bVar3 = bVar2.d;
                    String strName2 = bVar3 != null ? bVar3.name() : null;
                    this.v = 1;
                    billers = billersService.getBillers(strName, str, num, num2, strName2, this);
                    if (billers != arrayList) {
                    }
                    return arrayList;
                }
                if (i32 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                billers = obj2;
                List billers2 = ((em1.b) billers).getBillers();
                arrayList = new ArrayList(zhm.w.t(billers2, 10));
                Iterator it8 = billers2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(fm1.a.a((em1.a) it8.next()));
                }
                return arrayList;
            case 6:
                com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b bVar4 = (com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.review_product.b) obj3;
                Data data = (Data) this.f135572w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    bVar4.H2(bVar4.L, new fk4.o(data, 4));
                    ijb.a aVar7 = bVar4.f83297p;
                    this.f135572w = null;
                    this.v = 1;
                    if (ijb.a.e(aVar7, null, this, 3) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                mn1.o oVar = (mn1.o) obj3;
                com.revolut.feature.apm.bills.boleto.impl.flow.a aVar8 = (com.revolut.feature.apm.bills.boleto.impl.flow.a) this.f135572w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    mn1.k kVar = (mn1.k) oVar;
                    Flow flowX1 = aVar8.X1(new mii.f("HIDE_SHOW_BOLETO_TOAST", new TextLocalisedClause(kVar.f207343a ? R$string.boleto_finder_boleto_hidden : R$string.boleto_finder_boleto_displayed, null, null, 14), null, new ResourceImage(kVar.f207343a ? R$drawable.uikit_icn_24_eye_hide : R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                    this.v = 1;
                    if (vkm.q.x(flowX1, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yki.a aVar10 = aVar8.f61185r;
                if (aVar10.c()) {
                    aVar8.B2();
                } else {
                    Intrinsics.checkNotNullParameter(aVar10, "<this>");
                    aVar10.n();
                }
                return Unit.f186387a;
            case 8:
                FlowCollector flowCollector2 = (FlowCollector) this.f135572w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    fna.h hVar = (fna.h) obj3;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    efm.d0 d0VarF = hVar.f136576b.f(false);
                    this.f135572w = flowCollector2;
                    this.v = 1;
                    objB = nim.a.b(d0VarF, this);
                    if (objB == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i59 != 1) {
                        if (i59 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                objA = (do3.n) objB;
                m.Companion companion3 = yhm.m.INSTANCE;
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
                if (objA instanceof yhm.n) {
                    objA = null;
                }
                do3.n nVar = (do3.n) objA;
                od0.h hVar2 = od0.i.Companion;
                wi0.b bVarG = (nVar == null || (address = nVar.k) == null) ? null : nz8.d.g(address);
                hVar2.getClass();
                Data data2 = new Data(od0.h.a(bVarG), null, false, 6, null);
                this.f135572w = null;
                this.v = 2;
                if (flowCollector2.emit(data2, this) == aVar11) {
                    return aVar11;
                }
                return Unit.f186387a;
            case 9:
                io3.d dVar = (io3.d) obj3;
                fo1.e0 e0Var = (fo1.e0) this.f135572w;
                cli.y yVar = e0Var.B;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    do1.a aVar13 = e0Var.z;
                    dj0.d dVar2 = ((fo1.g) ((j2) yVar.f22677a).getValue()).d;
                    String str2 = dVar.f163145a;
                    this.v = 1;
                    objA2 = ((iz1.q) aVar13.f116371a).a(new t02.g(new ApmPaymentSource(str2, t02.c.POCKET), ApmPaymentMethod.BPAY.f62166a, dVar2, null), this);
                    if (objA2 == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA2 = obj2;
                }
                e0Var.H2(yVar, new fg8.y((ApmQuote) objA2, e0Var, dVar));
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fo8.b bVar5 = (fo8.b) this.f135572w;
                eg4.b bVar6 = new eg4.b((JuniorBankingProfile) obj3, bVar5, , 25);
                this.v = 1;
                Object objB3 = pu7.a.B(bVar5.e, "simulateInvitationAcceptance", bVar6, this);
                return objB3 == aVar14 ? aVar14 : objB3;
            case 11:
                Data data3 = (Data) this.f135572w;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payment.counterparty.impl.screen.profile.a aVar16 = (com.revolut.feature.payment.counterparty.impl.screen.profile.a) obj3;
                    whf.p pVar = (whf.p) data3.getContent();
                     = pVar != null ? pVar.f297646a : 0;
                    this.f135572w = data3;
                    this.v = 1;
                    objW = aVar16.f79055s.W(, this);
                    if (objW == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objW = obj2;
                }
                return new Pair(data3, (b6k.e) objW);
            case 12:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.wealth_discovery.impl.collection.top_movers.a aVar18 = (com.revolut.feature.wealth_discovery.impl.collection.top_movers.a) this.f135572w;
                    pfm.r rVarU = aVar18.f96142p.u(aVar18.v, (n0) obj3);
                    this.v = 1;
                    if (nim.a.a(rVarU, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    fr7.i iVar = (fr7.i) this.f135572w;
                    f9i.c cVar = ((sl7.e) obj3).f264156a;
                    this.v = 1;
                    if (iVar.G1(cVar, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 != 0) {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fsl.s sVar = (fsl.s) this.f135572w;
                fsl.r rVar2 = new fsl.r((fsl.l) obj3, sVar, null);
                this.v = 1;
                Object objB4 = pu7.a.B(sVar.e, "open_invest_orders_list_screen", rVar2, this);
                return objB4 == aVar20 ? aVar20 : objB4;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    ft1.m mVar = (ft1.m) this.f135572w;
                    f9i.c cVar2 = new f9i.c(new f9i.e((String) obj3, true));
                    this.v = 1;
                    if (mVar.G1(cVar2, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ft4.i0 i0Var = (ft4.i0) this.f135572w;
                ah1.m mVar2 = new ah1.m(i0Var, (a3) obj3, , 11);
                this.v = 1;
                Object objB5 = pu7.a.B(i0Var.k, "select_instalment_transaction", mVar2, this);
                return objB5 == aVar22 ? aVar22 : objB5;
            case 17:
                FlowCollector flowCollector3 = (FlowCollector) this.f135572w;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    boolean zA = ((mti.h) ((fti.b) obj3).f138027b).a();
                    qf1.t tVar2 = new qf1.t(qf1.f.TRAVEL_ASFT.getId());
                    if (!zA) {
                        tVar2 = null;
                    }
                    this.f135572w = null;
                    this.v = 1;
                    if (flowCollector3.emit(tVar2, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a aVar25 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) this.f135572w;
                fu6.q qVar2 = new fu6.q(aVar25, obj3, , i2);
                this.v = 1;
                Object objB6 = pu7.a.B(aVar25.k, "cancel_order", qVar2, this);
                return objB6 == aVar24 ? aVar24 : objB6;
            case 19:
                List list = (List) this.f135572w;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    qtc.e eVar = qtc.e.REVIEW_CARD_SECURITY;
                    if (!list.contains(eVar)) {
                        wtc.u uVar = ((fuc.h) obj3).f138177q;
                        this.f135572w = null;
                        this.v = 1;
                        if (uVar.a(eVar, this) == aVar26) {
                            return aVar26;
                        }
                    }
                } else {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    BrebQrService brebQrService = (BrebQrService) ((r10.r) this.f135572w).f250851a;
                    ApmBreb.f61810c.getClass();
                    kv1.e eVar2 = new kv1.e((String) obj3);
                    this.v = 1;
                    objDecode = brebQrService.decode(eVar2, this);
                    if (objDecode == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objDecode = obj2;
                }
                kv1.f fVar = (kv1.f) objDecode;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                jo3.a amount = fVar.getAmount();
                dj0.d dVarO = amount != null ? mo3.a.o(amount) : null;
                AliasType.Companion companion4 = AliasType.INSTANCE;
                String type = fVar.getAlias().getType();
                companion4.getClass();
                AliasType aliasTypeA = AliasType.Companion.a(type);
                if (aliasTypeA != null) {
                    return new av1.g(dVarO, new Alias(aliasTypeA, fVar.getAlias().getValue(), AliasStatus.ACTIVE.f61885b), new av1.f(fVar.getCreditor().getLegalName(), fVar.getCreditor().getIdentification()), new av1.e(fVar.getCreditorAgent().getInstitutionName()), fVar.getTransactionId());
                }
                throw new IllegalStateException("Unsupported alias type from decoded qr code");
            case 21:
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar7 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) obj3;
                cli.y yVar2 = bVar7.f73736s;
                fv6.a aVar28 = bVar7.f73733p;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    String str3 = (String) this.f135572w;
                    if (Intrinsics.f(str3, "ERROR_STATE_ID")) {
                        AcquiringPaymentsQuery acquiringPaymentsQuery = ((fv6.g) ((j2) yVar2.f22677a).getValue()).f138360b;
                        this.v = 1;
                        if (aVar28.m(acquiringPaymentsQuery, this) == aVar29) {
                            return aVar29;
                        }
                    } else if (Intrinsics.f(str3, "LIST_ID_FULL_STATE_NO_RESULTS")) {
                        AcquiringPaymentsQuery acquiringPaymentsQuery2 = new AcquiringPaymentsQuery((String) null, (LocalDateTime) null, (LocalDateTime) null, (Set) null, (Set) null, (Set) null, CertificateBody.profileType);
                        Boolean bool2 = Boolean.FALSE;
                        this.v = 2;
                        bVar7.H2(yVar2, new fpk.b(acquiringPaymentsQuery2, bool2, 13));
                        Object objL = aVar28.l(acquiringPaymentsQuery2, this);
                        if (objL != aVar29) {
                            objL = Unit.f186387a;
                        }
                        if (objL == aVar29) {
                            return aVar29;
                        }
                    }
                } else {
                    if (i107 != 1 && i107 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    RevertTransferService.Companion companion5 = RevertTransferService.INSTANCE;
                    objRevertTransfer = ((fve.a) this.f135572w).f138419a.revertTransfer((String) obj3, Unit.f186387a, new wj0.b("IDEMPOTENCY_TAG_REVERT_TRANSFER"), this);
                    if (objRevertTransfer == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objRevertTransfer = obj2;
                }
                return ((vue.a) objRevertTransfer).getTransactionId();
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 != 0) {
                    if (i109 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar32 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) this.f135572w;
                eg4.b bVar8 = new eg4.b(aVar32, (String) obj3, , 26);
                this.v = 1;
                Object objB7 = pu7.a.B(aVar32.k, "TransactionsLimitsDeeplink", bVar8, this);
                return objB7 == aVar31 ? aVar31 : objB7;
            case 24:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 != 0) {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fxc.u uVar2 = (fxc.u) this.f135572w;
                fxc.t tVar3 = new fxc.t(uVar2, (t61.g) obj3, null);
                this.v = 1;
                Object objB8 = pu7.a.B(uVar2.k, "Verify card", tVar3, this);
                return objB8 == aVar33 ? aVar33 : objB8;
            case 25:
                svi.t tVar4 = (svi.t) this.f135572w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 != 0) {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.f135572w = null;
                this.v = 1;
                Serializable serializableA = fyi.d.a((fyi.d) obj3, tVar4, this);
                return serializableA == aVar34 ? aVar34 : serializableA;
            case 26:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                fz4.l lVar = (fz4.l) this.f135572w;
                eg4.b bVar9 = new eg4.b(lVar, (ty0.a) obj3, , 27);
                this.v = 1;
                Object objB9 = pu7.a.B(lVar.k, "new account deeplink", bVar9, this);
                return objB9 == aVar35 ? aVar35 : objB9;
            case 27:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar10 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b) this.f135572w;
                    boe.k kVar2 = new boe.k(2, null, (gim.i) obj3);
                    this.v = 1;
                    if (bVar10.p2(this, kVar2) == aVar36) {
                        return aVar36;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                g17.h hVar3 = (g17.h) this.f135572w;
                eg4.b bVar11 = new eg4.b(hVar3, (wi0.b) obj3, , 28);
                this.v = 1;
                Object objP2 = hVar3.p2(this, bVar11);
                return objP2 == aVar37 ? aVar37 : objP2;
            default:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a aVar39 = (com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.a) this.f135572w;
                    eg4.b bVar12 = new eg4.b(aVar39, (zm3.a) obj3, , 29);
                    this.v = 1;
                    if (aVar39.p2(this, bVar12) == aVar38) {
                        return aVar38;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135572w = obj2;
        this.f135573x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135573x = obj2;
    }
}
