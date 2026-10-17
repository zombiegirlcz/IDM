package qu4;

import ael.t0;
import android.view.View;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.apm.core.impl.money_requests.data.network.ApmMoneyRequestsService;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.models.recipients.AaniContact;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.apm.core.models.recipients.BrebContact;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.core.models.recipients.PixContact;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.money_requests.BizumMoneyRequestInfo;
import com.revolut.feature.apm.core.models.transfers.money_requests.CoralMoneyRequestInfo;
import com.revolut.feature.contacts_chooser.api.context.ContextAction;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$MortgageOfferV5;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.payments.messaging.data.api.model.Mention;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.SplitBillLinkAction;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import ft3.h1;
import ip0.x10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import r0a.y;
import r7i.a0;
import skm.e0;
import skm.k0;
import skm.p0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f249238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f249239x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 14;
        this.f249239x = aVar;
        this.f249238w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s((u) this.f249239x, continuation, 0);
                sVar.f249238w = obj2;
                return sVar;
            case 1:
                return new s((qu9.b) this.f249238w, (Mention) this.f249239x, continuation, 1);
            case 2:
                s sVar2 = new s((quc.g) this.f249239x, continuation, 2);
                sVar2.f249238w = obj2;
                return sVar2;
            case 3:
                s sVar3 = new s((vrl.d) this.f249239x, continuation, 3);
                sVar3.f249238w = obj2;
                return sVar3;
            case 4:
                return new s((qw1.g) this.f249238w, (Alias) this.f249239x, continuation, 4);
            case 5:
                s sVar4 = new s((qw1.g) this.f249239x, continuation, 5);
                sVar4.f249238w = obj2;
                return sVar4;
            case 6:
                return new s((com.revolut.feature.staking.impl.stake.v2.b) this.f249238w, (xi0.b) this.f249239x, continuation, 6);
            case 7:
                return new s((com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f249238w, (xi0.b) this.f249239x, continuation, 7);
            case 8:
                return new s((com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f249238w, (cxe.n) this.f249239x, continuation, 8);
            case 9:
                return new s((com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f249238w, (lxe.e) this.f249239x, continuation, 9);
            case 10:
                return new s((com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) this.f249238w, (w4l.k) this.f249239x, continuation, 10);
            case 11:
                return new s((com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) this.f249238w, (String) this.f249239x, continuation, 11);
            case 12:
                return new s((qz1.c) this.f249238w, (s02.c) this.f249239x, continuation, 12);
            case 13:
                return new s((qz1.c) this.f249238w, (MoneyRequestChannel) this.f249239x, continuation, 13);
            case 14:
                return new s((com.revolut.feature.rev_points.impl.ui.opt_in.screen.a) this.f249239x, this.f249238w, continuation);
            case 15:
                return new s((y) this.f249238w, (String) this.f249239x, continuation, 15);
            case 16:
                return new s((r0f.k) this.f249238w, (String) this.f249239x, continuation, 16);
            case 17:
                return new s((r15.n) this.f249238w, (x10) this.f249239x, continuation, 17);
            case 18:
                return new s((r1a.d) this.f249238w, (ContextAction) this.f249239x, continuation, 18);
            case 19:
                s sVar5 = new s((r25.d) this.f249239x, continuation, 19);
                sVar5.f249238w = obj2;
                return sVar5;
            case 20:
                return new s((com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a) this.f249238w, (t27.m) this.f249239x, continuation, 20);
            case 21:
                return new s((r34.b) this.f249238w, (h1) this.f249239x, continuation, 21);
            case 22:
                return new s((com.revolut.feature.retail.cfd.impl.screens.home.a) this.f249238w, (WealthAction) this.f249239x, continuation, 22);
            case 23:
                return new s((View) this.f249238w, (StoreSearchScreen) this.f249239x, continuation, 23);
            case 24:
                return new s((com.revolut.feature.store.impl.ui.search.a) this.f249238w, (String) this.f249239x, continuation, 24);
            case 25:
                s sVar6 = new s((cpc.c) this.f249239x, continuation, 25);
                sVar6.f249238w = obj2;
                return sVar6;
            case 26:
                return new s((r7b.l) this.f249238w, (String) this.f249239x, continuation, 26);
            case 27:
                return new s((r7i.s) this.f249238w, (SavingsAccountDetails) this.f249239x, continuation, 27);
            case 28:
                return new s((r7i.s) this.f249238w, (pcd.s) this.f249239x, continuation, 28);
            default:
                return new s((a0) this.f249238w, (pcd.s) this.f249239x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v21 */
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
        Object objB;
        Object objZ;
        Object objY;
        String f62102a;
        String f62112a;
        String str;
        String str2;
        Object objCreateMoneyRequest;
        String beneficiaryName;
        ApmContact apmContactA;
        ApmContact spinContact;
        Object quote;
        Object next;
        Object mortgageOfferV4;
        Object mortgageOfferV5;
        o14.b bVar;
        Object objB2;
        int i = this.u;
        int i2 = 3;
        int i3 = 2;
        xi0.b bVar2 = 0;
        s02.b bVar3 = null;
        Object obj3 = this.f249239x;
        switch (i) {
            case 0:
                String str3 = (String) this.f249238w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.f249238w = null;
                this.v = 1;
                Object objI2 = u.I2((u) obj3, str3, this);
                return objI2 == aVar ? aVar : objI2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                qu9.b bVar4 = (qu9.b) this.f249238w;
                pmk.t tVar = new pmk.t(bVar4, (Mention) obj3, bVar2, 23);
                this.v = 1;
                Object objY2 = bVar4.Y2(this, tVar);
                return objY2 == aVar2 ? aVar2 : objY2;
            case 2:
                List list = (List) this.f249238w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    qtc.e eVar = qtc.e.SET_LEARN_ABOUT_SECURITY;
                    if (!list.contains(eVar)) {
                        wtc.u uVar = ((quc.g) obj3).o;
                        this.f249238w = null;
                        this.v = 1;
                        if (uVar.a(eVar, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                IndexedValue indexedValue = (IndexedValue) this.f249238w;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    int i32 = indexedValue.f186391a;
                    Object obj4 = indexedValue.f186392b;
                    if (i32 == 0) {
                        this.f249238w = null;
                        this.v = 1;
                        if (((vrl.d) obj3).invoke(obj4, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                Alias alias = (Alias) obj3;
                qw1.g gVar = (qw1.g) this.f249238w;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vw1.b bVar5 = gVar.f249741q;
                zz1.i iVar = new zz1.i(new RegisterAlias$Alias(alias.f61878a, alias.f61879b), null);
                wj0.b bVarI2 = qw1.g.I2(gVar, alias);
                this.v = 1;
                uy1.j jVar = (uy1.j) bVar5;
                jVar.getClass();
                uvf.b bVar6 = new uvf.b(jVar, iVar, bVarI2, (Continuation) null, 2);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, bVar6, this);
                return objJ == aVar5 ? aVar5 : objJ;
            case 5:
                CoroutineScope coroutineScope = (CoroutineScope) this.f249238w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    qw1.g gVar2 = (qw1.g) obj3;
                    pmk.t tVar2 = new pmk.t(gVar2, coroutineScope, bVar2, 25);
                    this.f249238w = null;
                    this.v = 1;
                    if (u0.b0(gVar2.X(), "ADD_KEYS_BUTTON_LOADING_TAG", tVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.staking.impl.stake.v2.b bVar7 = (com.revolut.feature.staking.impl.stake.v2.b) this.f249238w;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarA = bVar7.f88154w.a();
                    this.v = 1;
                    objB = nim.a.b(iVarA, this);
                    if (objB == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i59 != 1) {
                        if (i59 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objZ = obj2;
                        bVar2 = (xi0.b) objZ;
                        return bVar7.C1(bVar7.D.a(bVar2, (xi0.b) obj3));
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                Intrinsics.checkNotNullExpressionValue(objB, "await(...)");
                if (!((Boolean) objB).booleanValue()) {
                    vkm.d dVarB = rd0.e.b(xv5.c.b(bVar7.f88151r));
                    this.v = 2;
                    objZ = vkm.q.z(dVarB, this);
                    if (objZ == aVar7) {
                        return aVar7;
                    }
                    bVar2 = (xi0.b) objZ;
                }
                return bVar7.C1(bVar7.D.a(bVar2, (xi0.b) obj3));
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar2 = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f249238w;
                    com.revolut.feature.topup_screen.impl.flows.checkout.flow.a aVar9 = new com.revolut.feature.topup_screen.impl.flows.checkout.flow.a(eVar2, (xi0.b) obj3, null);
                    this.v = 1;
                    if (eVar2.p2(this, aVar9) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar3 = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f249238w;
                pmk.t tVar3 = new pmk.t(eVar3, (cxe.n) obj3, bVar2, 26);
                this.v = 1;
                Set set = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.Q;
                Object objB3 = pu7.a.B(eVar3.k, "pay click", tVar3, this);
                return objB3 == aVar10 ? aVar10 : objB3;
            case 9:
                com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar4 = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f249238w;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    rwe.a aVar12 = eVar4.f90702p;
                    dj0.d dVar = ((lxe.e) obj3).f200561a;
                    this.v = 1;
                    aVar12.f257893a.setValue(dVar);
                    if (Unit.f186387a == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                eVar4.B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                try {
                    if (i96 == 0) {
                        yhm.o.b(obj2);
                        dwi.a aVar14 = ((com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) this.f249238w).f99015q;
                        w4l.k loadingStrategy = (w4l.k) obj3;
                        aVar14.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        hwi.c cVar = aVar14.f120405a;
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        vkm.d dVarB2 = cVar.d.b(Unit.f186387a, loadingStrategy);
                        qkg.a aVar15 = new qkg.a(i3, i3, bVar2);
                        this.v = 1;
                        objY = vkm.q.y(dVarB2, aVar15, this);
                        if (objY == aVar13) {
                            return aVar13;
                        }
                    } else {
                        if (i96 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objY = obj2;
                    }
                    List list2 = (List) ((Data) objY).getContent();
                    if (list2 == null) {
                        return null;
                    }
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((svi.r) it8.next()).f265969a);
                        break;
                    }
                    return arrayList;
                } catch (Exception e) {
                    e0.p(getContext());
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    return null;
                }
            case 11:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 != 0) {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar17 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX1 = lg0.b.x1(((com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e) this.f249238w).f99021y, (String) obj3, aVar17, null, this, 4);
                return objX1 == aVar16 ? aVar16 : objX1;
            case 12:
                s02.c cVar2 = (s02.c) obj3;
                ApmContact apmContact = cVar2.f258818c;
                qz1.c cVar3 = (qz1.c) this.f249238w;
                Object coralMoneyRequestInfo = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    ApmMoneyRequestsService apmMoneyRequestsService = cVar3.f250339a;
                    Intrinsics.checkNotNullParameter(cVar2, "<this>");
                    ApmDescriptor f62148b = apmContact.getF62148b();
                    if (f62148b instanceof ApmDescriptor.BankAccount) {
                        f62112a = f62148b.getF62112a();
                        str = null;
                        f62102a = null;
                    } else {
                        String f62112a2 = f62148b.getF62112a();
                        f62102a = f62148b.getF62102a();
                        f62112a = null;
                        str = f62112a2;
                    }
                    String str4 = cVar2.f258816a.f60328a;
                    ApmTransferDestination apmTransferDestination = cVar2.f258817b;
                    ApmIdentifier f62147a = apmContact.getF62134a();
                    if (!(f62147a instanceof ApmIdentifier.Uuid)) {
                        f62147a = null;
                    }
                    String str5 = f62147a != null ? ((ApmIdentifier.Uuid) f62147a).f62112a : null;
                    String displayName = apmContact.getDisplayName();
                    jo3.a aVarP = mo3.a.p(cVar2.d);
                    String str6 = cVar2.e;
                    if (str6 != null) {
                        if (d0.W(str6)) {
                            str6 = null;
                        }
                        str2 = str6;
                    } else {
                        str2 = null;
                    }
                    Long l2 = cVar2.f;
                    ApmDescriptor f62148b2 = apmContact.getF62148b();
                    if (!(f62148b2 instanceof ApmDescriptor.Phone)) {
                        f62148b2 = null;
                    }
                    rz1.e eVar5 = new rz1.e(str4, apmTransferDestination, str5, str, f62102a, f62112a, displayName, f62148b2 != null ? ((ApmDescriptor.Phone) f62148b2).f62110b : null, aVarP, str2, l2);
                    wj0.b bVar8 = new wj0.b("payments_apm_transfer");
                    this.v = 1;
                    objCreateMoneyRequest = apmMoneyRequestsService.createMoneyRequest(eVar5, bVar8, this);
                    if (objCreateMoneyRequest != coralMoneyRequestInfo) {
                    }
                    return coralMoneyRequestInfo;
                }
                if (i100 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objCreateMoneyRequest = obj2;
                rz1.f fVar = (rz1.f) objCreateMoneyRequest;
                Intrinsics.checkNotNullParameter(fVar, "<this>");
                Intrinsics.checkNotNullParameter(apmContact, "apmContact");
                if (fVar.getBizumContact() != null) {
                    String moneyRequestId = fVar.getMoneyRequestId();
                    jy1.c cVarA = jy1.b.a(fVar.getBizumContact());
                    if (cVarA == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    coralMoneyRequestInfo = new BizumMoneyRequestInfo(moneyRequestId, mx1.e.a(cVarA, apmContact.getDisplayName()));
                } else {
                    ApmIdentifier.Uuid id10 = new ApmIdentifier.Uuid(fVar.getContactId());
                    String moneyRequestId2 = fVar.getMoneyRequestId();
                    if (apmContact instanceof AaniContact) {
                        apmContactA = AaniContact.a((AaniContact) apmContact, id10, null, 126);
                    } else {
                        if (apmContact instanceof BizumContact) {
                            BizumContact bizumContact = (BizumContact) apmContact;
                            ApmDescriptor descriptor = bizumContact.f62117b;
                            String str7 = bizumContact.f62118c;
                            String str8 = bizumContact.d;
                            String str9 = bizumContact.e;
                            ApmContact.State state = bizumContact.f;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                            Intrinsics.checkNotNullParameter(state, "state");
                            spinContact = new BizumContact(id10, descriptor, str7, str8, str9, state);
                        } else if (apmContact instanceof BlikContact) {
                            apmContactA = BlikContact.a((BlikContact) apmContact, id10, null, 62);
                        } else if (apmContact instanceof BrebContact) {
                            apmContactA = BrebContact.a((BrebContact) apmContact, id10, null, 254);
                        } else if (apmContact instanceof IrisContact) {
                            apmContactA = IrisContact.a((IrisContact) apmContact, id10, null, 126);
                        } else if (apmContact instanceof MultibancoContact) {
                            apmContactA = MultibancoContact.a((MultibancoContact) apmContact, id10, null, 62);
                        } else if (apmContact instanceof PixContact) {
                            apmContactA = PixContact.a((PixContact) apmContact, id10, null, 4094);
                        } else if (apmContact instanceof QvikContact) {
                            apmContactA = QvikContact.a((QvikContact) apmContact, id10, null, null, null, 1022);
                        } else if (apmContact instanceof SpinContact) {
                            SpinContact spinContact2 = (SpinContact) apmContact;
                            ApmDescriptor descriptor2 = spinContact2.f62154b;
                            String str10 = spinContact2.f62155c;
                            String str11 = spinContact2.d;
                            String str12 = spinContact2.e;
                            ApmContact.SimpleState state2 = spinContact2.f;
                            f5j.a aVar18 = spinContact2.f62156g;
                            Intrinsics.checkNotNullParameter(id10, "id");
                            Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
                            Intrinsics.checkNotNullParameter(state2, "state");
                            spinContact = new SpinContact(id10, descriptor2, str10, str11, str12, state2, aVar18);
                        } else {
                            if (!(apmContact instanceof WeroContact)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            WeroContact weroContact = (WeroContact) apmContact;
                            rz1.g wero = fVar.getWero();
                            if (wero == null || (beneficiaryName = wero.getBeneficiaryName()) == null) {
                                beneficiaryName = weroContact.d;
                            }
                            apmContactA = WeroContact.a(weroContact, id10, beneficiaryName, null, 246);
                        }
                        apmContactA = spinContact;
                    }
                    coralMoneyRequestInfo = new CoralMoneyRequestInfo(moneyRequestId2, apmContactA);
                }
                return coralMoneyRequestInfo;
            case 13:
                Object aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    ApmMoneyRequestsService apmMoneyRequestsService2 = ((qz1.c) this.f249238w).f250339a;
                    String str13 = ((MoneyRequestChannel) obj3).f60328a;
                    this.v = 1;
                    quote = apmMoneyRequestsService2.getQuote(str13, this);
                    if (quote != aVar19) {
                    }
                    return aVar19;
                }
                if (i101 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                quote = obj2;
                rz1.c cVar4 = (rz1.c) quote;
                Intrinsics.checkNotNullParameter(cVar4, "<this>");
                rz1.d limits = cVar4.getLimits();
                if (limits != null) {
                    Intrinsics.checkNotNullParameter(limits, "<this>");
                    jo3.a lower = limits.getLower();
                    dj0.d dVarO = lower != null ? mo3.a.o(lower) : null;
                    jo3.a upper = limits.getUpper();
                    bVar3 = new s02.b(dVarO, upper != null ? mo3.a.o(upper) : null);
                }
                Boolean isDecimalsAllowed = cVar4.getIsDecimalsAllowed();
                aVar19 = new s02.a(bVar3, isDecimalsAllowed != null ? isDecimalsAllowed.booleanValue() : true);
                return aVar19;
            case 14:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarC = ((s06.j) ((com.revolut.feature.rev_points.impl.ui.opt_in.screen.a) obj3).f83822r).c(((fub.b) this.f249238w).f138164a, false, lg0.a.IGNORE);
                this.v = 1;
                Object objB4 = nim.a.b(d0VarC, this);
                return objB4 == aVar20 ? aVar20 : objB4;
            case 15:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = ((y) this.f249238w).u.b((String) obj3);
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i104 = this.v;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r0f.k kVar = (r0f.k) this.f249238w;
                pmk.t tVar4 = new pmk.t(kVar, (String) obj3, bVar2, 28);
                this.v = 1;
                Object objP2 = kVar.p2(this, tVar4);
                return objP2 == aVar22 ? aVar22 : objP2;
            case 17:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i105 = this.v;
                if (i105 != 0) {
                    if (i105 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r15.n nVar = (r15.n) this.f249238w;
                r15.l lVar = new r15.l((x10) obj3, nVar, null);
                this.v = 1;
                Object objB5 = pu7.a.B(nVar.k, "handle action click", lVar, this);
                return objB5 == aVar23 ? aVar23 : objB5;
            case 18:
                ContextAction contextAction = (ContextAction) obj3;
                r1a.d dVar2 = (r1a.d) this.f249238w;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                int i106 = this.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    tji.f fVarQ2 = dVar2.q2();
                    String tag2 = ((SplitBillLinkAction) contextAction).getTag();
                    pmk.t tVar5 = new pmk.t(dVar2, contextAction, bVar2, 29);
                    this.v = 1;
                    if (u0.b0(fVarQ2, tag2, tVar5, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i106 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                r25.d dVar3 = (r25.d) obj3;
                Object obj5 = this.f249238w;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                int i107 = this.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    qv0.p pVar = (qv0.p) obj5;
                    Object f52715m = pVar.getF55158j();
                    if (!(f52715m instanceof uhf.i)) {
                        Iterator it9 = dVar3.f251055m.values().iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (((r25.b) next).d3(obj5)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (((r25.b) next) == null) {
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.c cVar5 = rd0.c.ERROR;
                            String f52708a = ((koi.j) obj5).getF55154b();
                            Object f52715m2 = pVar.getF55158j();
                            rd0.d.a(cVar5, "CreditAccountsEventHandler", a0.d.s("No credit event handler found for item: id: ", f52708a, ", parcel: ", f52715m2 != null ? f52715m2.getClass().getSimpleName() : null), null, h0Var2);
                            Unit unit = Unit.f186387a;
                        }
                        return Unit.f186387a;
                    }
                    ssi.m mVar = dVar3.o;
                    this.f249238w = null;
                    this.v = 1;
                    if (mVar.b3(f52715m, this) == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Unit unit2 = Unit.f186387a;
                return Unit.f186387a;
            case 20:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i108 = this.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a aVar27 = (com.revolut.feature.freelancer.impl.ui.subaccount.create.flow.a) this.f249238w;
                    oqk.h hVar = new oqk.h(aVar27, (t27.m) obj3, (Continuation) bVar2, 21);
                    this.v = 1;
                    if (aVar27.p2(this, hVar) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                h1 h1Var = (h1) obj3;
                r34.b bVar9 = (r34.b) this.f249238w;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i109 = this.v;
                if (i109 == 0) {
                    yhm.o.b(obj2);
                    gte.a aVar29 = bVar9.e;
                    CreditPluginsService creditPluginsService = bVar9.f251149c;
                    if (((jte.d) aVar29).c(CreditApplicationPluginsApi$Toggles$MortgageOfferV5.f66280c)) {
                        String str14 = h1Var.f137835a;
                        this.v = 1;
                        mortgageOfferV5 = creditPluginsService.getMortgageOfferV5(str14, this);
                        if (mortgageOfferV5 == aVar28) {
                            return aVar28;
                        }
                        bVar = (o14.b) mortgageOfferV5;
                    } else {
                        String str15 = h1Var.f137835a;
                        this.v = 2;
                        mortgageOfferV4 = creditPluginsService.getMortgageOfferV4(str15, this);
                        if (mortgageOfferV4 == aVar28) {
                            return aVar28;
                        }
                        bVar = (o14.b) mortgageOfferV4;
                    }
                } else if (i109 == 1) {
                    yhm.o.b(obj2);
                    mortgageOfferV5 = obj2;
                    bVar = (o14.b) mortgageOfferV5;
                } else {
                    if (i109 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    mortgageOfferV4 = obj2;
                    bVar = (o14.b) mortgageOfferV4;
                }
                return o14.c.a(bVar, bVar9.d);
            case 22:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i110 = this.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.feature.retail.cfd.impl.screens.home.a) this.f249238w).v.a((WealthAction) obj3, this) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i111 = this.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    kli.c.c((View) this.f249238w, false);
                    this.v = 1;
                    if (k0.b(500L, this) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                ((com.revolut.feature.store.impl.ui.search.a) ((StoreSearchScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 24:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i112 = this.v;
                if (i112 != 0) {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                lg0.a aVar33 = lg0.a.OPEN_BROWSER;
                this.v = 1;
                Object objX12 = lg0.b.x1(((com.revolut.feature.store.impl.ui.search.a) this.f249238w).f88736q, (String) obj3, aVar33, null, this, 4);
                return objX12 == aVar32 ? aVar32 : objX12;
            case 25:
                FlowCollector flowCollector = (FlowCollector) this.f249238w;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i113 = this.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarE = ((t0) ((ybl.l) ((cpc.c) obj3).f107926b)).e();
                    this.f249238w = flowCollector;
                    this.v = 1;
                    objB2 = nim.a.b(iVarE, this);
                    if (objB2 == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i113 != 1) {
                        if (i113 != 2 && i113 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB2 = obj2;
                }
                hel.a aVar35 = (hel.a) objB2;
                switch (r4f.h.f251448a[aVar35.d.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        Data dataP = zi0.c.P(new r4f.a(aVar35.d), false, null, 3);
                        this.f249238w = null;
                        this.v = 2;
                        if (flowCollector.emit(dataP, this) == aVar34) {
                            return aVar34;
                        }
                        break;
                    case 7:
                        Data dataP2 = zi0.c.P(r4f.b.f251446a, false, null, 3);
                        this.f249238w = null;
                        this.v = 3;
                        if (flowCollector.emit(dataP2, this) == aVar34) {
                            return aVar34;
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                int i114 = this.v;
                if (i114 != 0) {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                r7b.l lVar2 = (r7b.l) this.f249238w;
                r25.a aVar37 = new r25.a(lVar2, (String) obj3, bVar2, i2);
                this.v = 1;
                Object objP22 = lVar2.p2(this, aVar37);
                return objP22 == aVar36 ? aVar36 : objP22;
            case 27:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                int i115 = this.v;
                if (i115 != 0) {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jpc.e eVar6 = ((r7i.s) this.f249238w).e;
                String str16 = ((SavingsAccountDetails) obj3).f86460a.f;
                this.v = 1;
                Object objD = eVar6.d(str16, this);
                return objD == aVar38 ? aVar38 : objD;
            case 28:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                int i116 = this.v;
                if (i116 != 0) {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jpc.e eVar7 = ((r7i.s) this.f249238w).e;
                String str17 = ((pcd.s) obj3).f;
                this.v = 1;
                Object objD2 = eVar7.d(str17, this);
                return objD2 == aVar39 ? aVar39 : objD2;
            default:
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                int i117 = this.v;
                if (i117 != 0) {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                kbb.c cVar6 = ((a0) this.f249238w).f;
                String str18 = ((pcd.s) obj3).f;
                this.v = 1;
                Object objA = !((cw9.d) cVar6.f182549b).a() ? cVar6.A(str18, this) : Boolean.TRUE;
                return objA == aVar40 ? aVar40 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249238w = obj2;
        this.f249239x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249239x = obj2;
    }
}
