package vdl;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import com.revolut.feature.apm.core.models.recipients.WeroContact;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$InputData;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanContextualSelectionLayoutParams;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.PlanContextualSelectionScreenContract$InputData;
import com.revolut.shared.feature.wealth.domain.api.WealthDomainApi$Toggles$ChartsCachingImprovements;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import q97.g3;
import tof.a3;
import tof.v5;
import yhm.m;

/* JADX INFO: loaded from: classes12.dex */
public final class c1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f287945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f287946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f287947y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(b80.c cVar, d1 d1Var, Continuation continuation) {
        super(3, continuation);
        this.u = 0;
        this.f287946x = cVar;
        this.f287947y = d1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                c1 c1Var = new c1((b80.c) this.f287946x, (d1) this.f287947y, (Continuation) obj4);
                c1Var.f287945w = (z0) obj3;
                return c1Var.invokeSuspend(Unit.f186387a);
            case 1:
                c1 c1Var2 = new c1((Continuation) obj4, (vge.x) this.f287947y, 1);
                c1Var2.f287945w = (FlowCollector) obj2;
                c1Var2.f287946x = obj3;
                return c1Var2.invokeSuspend(Unit.f186387a);
            case 2:
                c1 c1Var3 = new c1((Continuation) obj4, (vge.b1) this.f287947y, 2);
                c1Var3.f287945w = (FlowCollector) obj2;
                c1Var3.f287946x = obj3;
                return c1Var3.invokeSuspend(Unit.f186387a);
            case 3:
                c1 c1Var4 = new c1((Continuation) obj4, (vgf.z) this.f287947y, 3);
                c1Var4.f287945w = (FlowCollector) obj2;
                c1Var4.f287946x = obj3;
                return c1Var4.invokeSuspend(Unit.f186387a);
            case 4:
                c1 c1Var5 = new c1((Continuation) obj4, (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) this.f287947y, 4);
                c1Var5.f287945w = (FlowCollector) obj2;
                c1Var5.f287946x = obj3;
                return c1Var5.invokeSuspend(Unit.f186387a);
            case 5:
                c1 c1Var6 = new c1((Continuation) obj4, (vh2.n) this.f287947y, 5);
                c1Var6.f287945w = (FlowCollector) obj2;
                c1Var6.f287946x = obj3;
                return c1Var6.invokeSuspend(Unit.f186387a);
            case 6:
                c1 c1Var7 = new c1((Continuation) obj4, (vha.s) this.f287947y, 6);
                c1Var7.f287945w = (FlowCollector) obj2;
                c1Var7.f287946x = obj3;
                return c1Var7.invokeSuspend(Unit.f186387a);
            case 7:
                c1 c1Var8 = new c1((Continuation) obj4, (vha.y0) this.f287947y, 7);
                c1Var8.f287945w = (FlowCollector) obj2;
                c1Var8.f287946x = obj3;
                return c1Var8.invokeSuspend(Unit.f186387a);
            case 8:
                c1 c1Var9 = new c1((Continuation) obj4, (vi1.o) this.f287947y, 8);
                c1Var9.f287945w = (FlowCollector) obj2;
                c1Var9.f287946x = obj3;
                return c1Var9.invokeSuspend(Unit.f186387a);
            case 9:
                c1 c1Var10 = new c1((Continuation) obj4, (vie.j) this.f287947y, 9);
                c1Var10.f287945w = (FlowCollector) obj2;
                c1Var10.f287946x = obj3;
                return c1Var10.invokeSuspend(Unit.f186387a);
            case 10:
                c1 c1Var11 = new c1((Continuation) obj4, (vkf.f) this.f287947y, 10);
                c1Var11.f287945w = (FlowCollector) obj2;
                c1Var11.f287946x = obj3;
                return c1Var11.invokeSuspend(Unit.f186387a);
            case 11:
                c1 c1Var12 = new c1((Continuation) obj4, (vkf.j) this.f287947y, 11);
                c1Var12.f287945w = (FlowCollector) obj2;
                c1Var12.f287946x = obj3;
                return c1Var12.invokeSuspend(Unit.f186387a);
            case 12:
                c1 c1Var13 = new c1((Continuation) obj4, (oim.n) this.f287947y, 12);
                c1Var13.f287945w = (FlowCollector) obj2;
                c1Var13.f287946x = (Object[]) obj3;
                return c1Var13.invokeSuspend(Unit.f186387a);
            case 13:
                c1 c1Var14 = new c1((Continuation) obj4, (oim.o) this.f287947y, 13);
                c1Var14.f287945w = (FlowCollector) obj2;
                c1Var14.f287946x = (Object[]) obj3;
                return c1Var14.invokeSuspend(Unit.f186387a);
            case 14:
                c1 c1Var15 = new c1((Continuation) obj4, this.f287947y, 14);
                c1Var15.f287945w = (FlowCollector) obj2;
                c1Var15.f287946x = (Object[]) obj3;
                return c1Var15.invokeSuspend(Unit.f186387a);
            case 15:
                c1 c1Var16 = new c1((Function3) this.f287947y, (Continuation) obj4, 15);
                c1Var16.f287945w = (FlowCollector) obj2;
                c1Var16.f287946x = (Object[]) obj3;
                return c1Var16.invokeSuspend(Unit.f186387a);
            case 16:
                c1 c1Var17 = new c1((Continuation) obj4, (vlk.s) this.f287947y, 16);
                c1Var17.f287945w = (FlowCollector) obj2;
                c1Var17.f287946x = obj3;
                return c1Var17.invokeSuspend(Unit.f186387a);
            case 17:
                c1 c1Var18 = new c1((Continuation) obj4, (vmj.j) this.f287947y, 17);
                c1Var18.f287945w = (FlowCollector) obj2;
                c1Var18.f287946x = obj3;
                return c1Var18.invokeSuspend(Unit.f186387a);
            case 18:
                c1 c1Var19 = new c1((Continuation) obj4, (vnb.h) this.f287947y, 18);
                c1Var19.f287945w = (FlowCollector) obj2;
                c1Var19.f287946x = obj3;
                return c1Var19.invokeSuspend(Unit.f186387a);
            case 19:
                c1 c1Var20 = new c1((Continuation) obj4, (vne.i) this.f287947y, 19);
                c1Var20.f287945w = (FlowCollector) obj2;
                c1Var20.f287946x = obj3;
                return c1Var20.invokeSuspend(Unit.f186387a);
            case 20:
                c1 c1Var21 = new c1((Continuation) obj4, (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) this.f287947y, 20);
                c1Var21.f287945w = (FlowCollector) obj2;
                c1Var21.f287946x = obj3;
                return c1Var21.invokeSuspend(Unit.f186387a);
            case 21:
                c1 c1Var22 = new c1((Continuation) obj4, (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f287947y, 21);
                c1Var22.f287945w = (FlowCollector) obj2;
                c1Var22.f287946x = obj3;
                return c1Var22.invokeSuspend(Unit.f186387a);
            case 22:
                c1 c1Var23 = new c1((Continuation) obj4, (com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a) this.f287947y, 22);
                c1Var23.f287945w = (FlowCollector) obj2;
                c1Var23.f287946x = obj3;
                return c1Var23.invokeSuspend(Unit.f186387a);
            case 23:
                c1 c1Var24 = new c1((Continuation) obj4, (vv.d) this.f287947y, 23);
                c1Var24.f287945w = (FlowCollector) obj2;
                c1Var24.f287946x = obj3;
                return c1Var24.invokeSuspend(Unit.f186387a);
            case 24:
                c1 c1Var25 = new c1((Continuation) obj4, (vvh.l) this.f287947y, 24);
                c1Var25.f287945w = (FlowCollector) obj2;
                c1Var25.f287946x = obj3;
                return c1Var25.invokeSuspend(Unit.f186387a);
            case 25:
                c1 c1Var26 = new c1((Function3) this.f287947y, (Continuation) obj4, 25);
                c1Var26.f287945w = (FlowCollector) obj2;
                c1Var26.f287946x = (Throwable) obj3;
                return c1Var26.invokeSuspend(Unit.f186387a);
            case 26:
                c1 c1Var27 = new c1((Continuation) obj4, (vy5.i0) this.f287947y, 26);
                c1Var27.f287945w = (FlowCollector) obj2;
                c1Var27.f287946x = obj3;
                return c1Var27.invokeSuspend(Unit.f186387a);
            case 27:
                c1 c1Var28 = new c1((Continuation) obj4, (vy5.s0) this.f287947y, 27);
                c1Var28.f287945w = (FlowCollector) obj2;
                c1Var28.f287946x = obj3;
                return c1Var28.invokeSuspend(Unit.f186387a);
            case 28:
                c1 c1Var29 = new c1((Continuation) obj4, (vyi.r) this.f287947y, 28);
                c1Var29.f287945w = (FlowCollector) obj2;
                c1Var29.f287946x = obj3;
                return c1Var29.invokeSuspend(Unit.f186387a);
            default:
                c1 c1Var30 = new c1((Continuation) obj4, (vzh.h) this.f287947y, 29);
                c1Var30.f287945w = (FlowCollector) obj2;
                c1Var30.f287946x = obj3;
                return c1Var30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, oim.p] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
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
        eel.b bVar;
        Object objM0;
        Flow gVar;
        efm.r rVarJ;
        Flow eVar;
        efm.r rVarJ2;
        FlowCollector flowCollector;
        Object objInvoke;
        FlowCollector flowCollector2;
        Object objInvoke2;
        FlowCollector flowCollector3;
        Object objInvoke3;
        FlowCollector flowCollector4;
        Object objInvoke4;
        c1 c1Var = this;
        int i = c1Var.u;
        kof.d dVar = kof.d.f186342a;
        int i2 = 13;
        int i3 = 22;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i5 = 0;
        int i6 = 6;
        int i21 = 3;
        Object obj3 = c1Var.f287947y;
        Long lValueOf = 0;
        lValueOf = 0;
        switch (i) {
            case 0:
                d1 d1Var = (d1) obj3;
                qe0.s sVar = d1Var.f;
                z0 z0Var = (z0) c1Var.f287945w;
                Object objA = fim.a.COROUTINE_SUSPENDED;
                int i22 = c1Var.v;
                try {
                } catch (Throwable th10) {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    b80.c cVar = (b80.c) c1Var.f287946x;
                    m.Companion companion2 = yhm.m.INSTANCE;
                    vc2.s sVar2 = new vc2.s(d1Var, z0Var, lValueOf, i6);
                    c1Var.f287945w = z0Var;
                    c1Var.v = 1;
                    objM0 = te0.w.m0(cVar, sVar2, c1Var);
                    if (objM0 == objA) {
                        return objA;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objM0 = obj2;
                }
                eel.a aVar = (eel.a) objM0;
                m.Companion companion3 = yhm.m.INSTANCE;
                objA = aVar;
                if (!(objA instanceof yhm.n)) {
                    eel.a aVar2 = (eel.a) objA;
                    Object objC = d1.c(z0Var);
                    if (((jte.d) d1Var.f287957g).c(WealthDomainApi$Toggles$ChartsCachingImprovements.f105071c) && (bVar = (eel.b) zhm.d0.d0(aVar2.f125219c)) != null) {
                        lValueOf = Long.valueOf(bVar.f125223g - bVar.f);
                    }
                    sVar.g(objC, lValueOf);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null && !(thA instanceof CancellationException)) {
                    sVar.e(d1.c(z0Var));
                }
                yhm.o.b(objA);
                return objA;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = c1Var.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = (FlowCollector) c1Var.f287945w;
                    List<SubSpaceAccountItem> list = (List) c1Var.f287946x;
                    ArrayList<Pair> arrayList = new ArrayList();
                    for (SubSpaceAccountItem subSpaceAccountItem : list) {
                        ProductAccount productAccount = subSpaceAccountItem.f89560b;
                        ProductAccount.ValueItem valueItem = productAccount instanceof ProductAccount.ValueItem ? (ProductAccount.ValueItem) productAccount : null;
                        Pair pair = valueItem != null ? new Pair(subSpaceAccountItem.f89559a.f89553a, valueItem) : null;
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    vge.x xVar = (vge.x) obj3;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Pair pair2 : arrayList) {
                        ProductId productId = (ProductId) pair2.f186385a;
                        ProductAccount.ValueItem valueItem2 = (ProductAccount.ValueItem) pair2.f186386b;
                        linkedHashSet.add(age.b.e(com.revolut.feature.tab.accounts.api.model.a.c(valueItem2, productId, valueItem2.getF89504c()), valueItem2.getF89505g()));
                    }
                    jhi.k kVarU = nim.a.u(new vge.v(arrayList, xVar, null), xVar.e.h(linkedHashSet));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector5, kVarU, c1Var) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i33 = c1Var.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = (FlowCollector) c1Var.f287945w;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) c1Var.f287946x;
                    Flow bVar2 = productAccountDescriptor$Value != null ? new v0b.b(rd0.e.e(mo3.a.g(nim.a.v(((vge.x) ((vge.b1) obj3).f288874c).e(productAccountDescriptor$Value), vge.y0.f289062a), null, vge.z0.f289067a, 1), zhm.h0.f322473a, new tc6.d(i21, 28, lValueOf)), productAccountDescriptor$Value, 5) : new go.g(null, 2);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector6, bVar2, c1Var) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i43 = c1Var.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = (FlowCollector) c1Var.f287945w;
                    AccountId.Joint joint = (AccountId.Joint) c1Var.f287946x;
                    if (joint != null) {
                        gVar = vgf.z.a(rd0.e.b(((anf.r) ((vgf.z) obj3).f289148a).b(joint)));
                    } else {
                        k71.q.Companion.getClass();
                        gVar = new go.g(new Data(k71.p.a(), null, false, 6, null), 2);
                    }
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector7, gVar, c1Var) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i59 = c1Var.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = (FlowCollector) c1Var.f287945w;
                    com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar3 = (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) obj3;
                    akg.n nVarA = vfg.e.a(bVar3.f94272p, bVar3.o.f94265a);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector8, nVarA, c1Var) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i66 = c1Var.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = (FlowCollector) c1Var.f287945w;
                    uh2.g gVar2 = ((vh2.n) obj3).o;
                    gVar2.getClass();
                    h12.h hVar = gVar2.f280059b;
                    vkm.v1 a7 = new vkm.v1(new twb.b0(gVar2, (Continuation) lValueOf, 16));
                    u12.c cVar2 = (u12.c) hVar;
                    vkm.d b4 = cVar2.c(WeroContact.class);
                    vkm.d c2 = cVar2.f(MoneyRequestChannel.Wero.f60336b);
                    vkm.d d = h12.h.a(hVar, tof.n.WERO, tof.l.WERO, v5.WERO, null, 8);
                    vkm.d e = ((qh2.h) gVar2.f280058a).a();
                    akg.n f = gVar2.f280060c.c();
                    vkm.v1 g3 = new vkm.v1(new u2i.g(gVar2, lValueOf, 19));
                    Intrinsics.checkNotNullParameter(a7, "a");
                    Intrinsics.checkNotNullParameter(b4, "b");
                    Intrinsics.checkNotNullParameter(c2, "c");
                    Intrinsics.checkNotNullParameter(d, "d");
                    Intrinsics.checkNotNullParameter(e, "e");
                    Intrinsics.checkNotNullParameter(f, "f");
                    Intrinsics.checkNotNullParameter(g3, "g");
                    vkm.y yVarE = rd0.e.e(new rv6.e(new uf0.b(new Flow[]{a7, b4, c2, d, e, f, g3}, 3), 20), zhm.h0.f322473a, new pc2.d(i21, 26, lValueOf));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector9, yVarE, c1Var) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i74 = c1Var.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = (FlowCollector) c1Var.f287945w;
                    int i92 = 7;
                    vkm.y yVarE2 = rd0.e.e(new g3(mo3.a.g(((et6.g) ((vha.s) obj3).f289431h).d(c8g.c.C((sfe.a) c1Var.f287946x)), null, new vgg.a0(i92), 1), 27), zhm.h0.f322473a, new vge.f1(i21, i92, lValueOf));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector10, yVarE2, c1Var) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i96 = c1Var.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = (FlowCollector) c1Var.f287945w;
                    Flow l1Var = ((Boolean) c1Var.f287946x).booleanValue() ? new okl.l1(rd0.e.n(((et6.g) ((vha.y0) obj3).f289455a).e(loadingStrategy), zhm.h0.f322473a), 14) : new go.g(Boolean.FALSE, 2);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector11, l1Var, c1Var) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i99 = c1Var.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = (FlowCollector) c1Var.f287945w;
                    vi1.l lVar = (vi1.l) c1Var.f287946x;
                    wi0.b country = lVar.f289507a;
                    String query = lVar.f289508b;
                    lj1.a aVar11 = (lj1.a) ((vi1.o) obj3).f289511a;
                    Intrinsics.checkNotNullParameter(country, "country");
                    Intrinsics.checkNotNullParameter(query, "query");
                    akg.n nVarV = nim.a.v(rd0.e.e(nim.a.A(aVar11.d.a(query, country), new vgk.g(12)), zhm.h0.f322473a, new vge.f1(i21, 10, lValueOf)), new vgk.g(i2));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector12, nVarV, c1Var) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i100 = c1Var.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = (FlowCollector) c1Var.f287945w;
                    Flow flowB = ((Boolean) c1Var.f287946x).booleanValue() ? ((vie.j) obj3).f289585b.f289583a.b() : new go.g(Boolean.FALSE, 2);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector13, flowB, c1Var) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                vkf.f fVar = (vkf.f) obj3;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i101 = c1Var.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = (FlowCollector) c1Var.f287945w;
                    Pair pair3 = (Pair) c1Var.f287946x;
                    a3 transaction = (a3) pair3.f186385a;
                    if (((klf.j1) pair3.f186386b).c()) {
                        eVar = new go.g(zhm.f0.f322471a, 2);
                    } else {
                        kof.j jVar = (kof.j) fVar.f289932n;
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(transaction, "transaction");
                        if (((etj.o) jVar.f186348a).i()) {
                            ne0.p pVar = jVar.f186351g;
                            pVar.getClass();
                            rVarJ = efm.r.defer(new m1i.t(pVar, transaction, 9));
                            Intrinsics.checkNotNullExpressionValue(rVarJ, "defer(...)");
                        } else {
                            rVarJ = zi0.c.j(dVar);
                        }
                        eVar = new t38.e(mo3.a.g(rd0.e.b(rVarJ), null, vkf.a.f289924a, 1), i3, fVar, transaction);
                    }
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector14, eVar, c1Var) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i102 = c1Var.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = (FlowCollector) c1Var.f287945w;
                    a3 transaction2 = (a3) c1Var.f287946x;
                    kof.j jVar2 = (kof.j) ((vkf.j) obj3).f289938n;
                    jVar2.getClass();
                    Intrinsics.checkNotNullParameter(transaction2, "transaction");
                    if (((etj.o) jVar2.f186348a).i()) {
                        ne0.p pVar2 = jVar2.f186351g;
                        pVar2.getClass();
                        rVarJ2 = efm.r.defer(new m1i.t(pVar2, transaction2, 9));
                        Intrinsics.checkNotNullExpressionValue(rVarJ2, "defer(...)");
                    } else {
                        rVarJ2 = zi0.c.j(dVar);
                    }
                    jhi.b bVarG = mo3.a.g(rd0.e.b(rVarJ2), null, vkf.h.f289934a, 1);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    vkm.q.w(flowCollector15);
                    Object objCollect = bVarG.collect(new klf.w0(flowCollector15, transaction2, 1), c1Var);
                    if (objCollect != aVar14) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar14) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i103 = c1Var.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    flowCollector = (FlowCollector) c1Var.f287945w;
                    Object[] objArr = (Object[]) c1Var.f287946x;
                    Object obj4 = objArr[0];
                    Object obj5 = objArr[1];
                    Object obj6 = objArr[2];
                    c1Var.f287945w = flowCollector;
                    c1Var.v = 1;
                    objInvoke = ((oim.n) obj3).invoke(obj4, obj5, obj6, c1Var);
                    if (objInvoke == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i103 != 1) {
                        if (i103 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector = (FlowCollector) c1Var.f287945w;
                    yhm.o.b(obj2);
                    objInvoke = obj2;
                }
                c1Var.f287945w = null;
                c1Var.v = 2;
                if (flowCollector.emit(objInvoke, c1Var) == aVar15) {
                    return aVar15;
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i104 = c1Var.v;
                if (i104 == 0) {
                    yhm.o.b(obj2);
                    flowCollector2 = (FlowCollector) c1Var.f287945w;
                    Object[] objArr2 = (Object[]) c1Var.f287946x;
                    Object obj7 = objArr2[0];
                    Object obj8 = objArr2[1];
                    Object obj9 = objArr2[2];
                    Object obj10 = objArr2[3];
                    c1Var.f287945w = flowCollector2;
                    c1Var.v = 1;
                    objInvoke2 = ((oim.o) obj3).invoke(obj7, obj8, obj9, obj10, c1Var);
                    if (objInvoke2 == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i104 != 1) {
                        if (i104 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    FlowCollector flowCollector16 = (FlowCollector) c1Var.f287945w;
                    yhm.o.b(obj2);
                    flowCollector2 = flowCollector16;
                    objInvoke2 = obj2;
                }
                c1Var.f287945w = null;
                c1Var.v = 2;
                if (flowCollector2.emit(objInvoke2, c1Var) == aVar16) {
                    return aVar16;
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i105 = c1Var.v;
                if (i105 == 0) {
                    yhm.o.b(obj2);
                    flowCollector3 = (FlowCollector) c1Var.f287945w;
                    Object[] objArr3 = (Object[]) c1Var.f287946x;
                    Object obj11 = objArr3[0];
                    Object obj12 = objArr3[1];
                    Object obj13 = objArr3[2];
                    Object obj14 = objArr3[3];
                    Object obj15 = objArr3[4];
                    c1Var.f287945w = flowCollector3;
                    c1Var.v = 1;
                    objInvoke3 = c1Var.f287947y.invoke(obj11, obj12, obj13, obj14, obj15, c1Var);
                    c1Var = c1Var;
                    if (objInvoke3 == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i105 != 1) {
                        if (i105 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    FlowCollector flowCollector17 = (FlowCollector) c1Var.f287945w;
                    yhm.o.b(obj2);
                    flowCollector3 = flowCollector17;
                    objInvoke3 = obj2;
                }
                c1Var.f287945w = null;
                c1Var.v = 2;
                if (flowCollector3.emit(objInvoke3, c1Var) == aVar17) {
                    return aVar17;
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i106 = c1Var.v;
                if (i106 == 0) {
                    yhm.o.b(obj2);
                    flowCollector4 = (FlowCollector) c1Var.f287945w;
                    Object[] objArr4 = (Object[]) c1Var.f287946x;
                    Object obj16 = objArr4[0];
                    Object obj17 = objArr4[1];
                    c1Var.f287945w = flowCollector4;
                    c1Var.v = 1;
                    objInvoke4 = ((Function3) obj3).invoke(obj16, obj17, c1Var);
                    if (objInvoke4 == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i106 != 1) {
                        if (i106 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    flowCollector4 = (FlowCollector) c1Var.f287945w;
                    yhm.o.b(obj2);
                    objInvoke4 = obj2;
                }
                c1Var.f287945w = null;
                c1Var.v = 2;
                if (flowCollector4.emit(objInvoke4, c1Var) == aVar18) {
                    return aVar18;
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                int i107 = c1Var.v;
                if (i107 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = (FlowCollector) c1Var.f287945w;
                    w4l.k loadingStrategy2 = (w4l.k) c1Var.f287946x;
                    vlk.s sVar3 = (vlk.s) obj3;
                    wik.m mVar = sVar3.f290495p;
                    PlanContextualSelectionScreenContract$InputData planContextualSelectionScreenContract$InputData = sVar3.o;
                    String promptType = planContextualSelectionScreenContract$InputData.f103518b;
                    hha.w0 w0Var = planContextualSelectionScreenContract$InputData.f103519c;
                    PricingPlanContextualSelectionLayoutParams pricingPlanContextualSelectionLayoutParams = planContextualSelectionScreenContract$InputData.d;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(promptType, "promptType");
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    vkm.v1 v1VarD = c8g.a.D(boh.f.e(vkm.q.r(new wf0.b(14), nim.a.v(rd0.e.b(mVar.f297923a.v(loadingStrategy)), new wgk.f(11))), new ryd.f((Object) mVar, promptType, (Object) w0Var, (Object) loadingStrategy2, (Object) pricingPlanContextualSelectionLayoutParams, 13)));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector18, v1VarD, c1Var) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i107 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                int i108 = c1Var.v;
                if (i108 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = (FlowCollector) c1Var.f287945w;
                    w4l.k loadingStrategy3 = (w4l.k) c1Var.f287946x;
                    vmj.j jVar3 = (vmj.j) obj3;
                    dfj.g3 g3Var = jVar3.f290610p;
                    String profileId = jVar3.o.f101417a;
                    g3Var.getClass();
                    Intrinsics.checkNotNullParameter(profileId, "profileId");
                    Intrinsics.checkNotNullParameter(loadingStrategy3, "loadingStrategy");
                    int i109 = 17;
                    akg.n nVarV2 = nim.a.v(zh9.u0.m(boh.f.e(g3Var.f113980b.e(profileId, loadingStrategy3), new dcl.m0(g3Var, loadingStrategy3, i109)), g3Var.f113979a.b(loadingStrategy3)), new d7a.p(profileId, i109));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector19, nVarV2, c1Var) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i108 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                int i110 = c1Var.v;
                if (i110 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector20 = (FlowCollector) c1Var.f287945w;
                    Flow flowQ = ((Boolean) c1Var.f287946x).booleanValue() ? vkm.q.q(new hy9.b(zi0.c.w(((vnb.h) obj3).f290784b.a(new pcd.e(0), loadingStrategy)), 5)) : new go.g(Boolean.FALSE, 2);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector20, flowQ, c1Var) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i110 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                int i111 = c1Var.v;
                if (i111 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector21 = (FlowCollector) c1Var.f287945w;
                    vne.i iVar = (vne.i) obj3;
                    nne.b bVar4 = iVar.f290802p;
                    String str = iVar.o.f89994a;
                    bVar4.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    sne.g gVar3 = bVar4.f217614a;
                    gVar3.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = gVar3.d.b(new sne.d(str), loadingStrategy);
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV3 = nim.a.v(zh9.u0.m(dVarB, gVar3.e.b(Unit.f186387a, loadingStrategy)), new nn3.z(bVar4, 9));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector21, nVarV3, c1Var) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i111 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                int i112 = c1Var.v;
                if (i112 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector22 = (FlowCollector) c1Var.f287945w;
                    com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a aVar24 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.destinations.ui.a) obj3;
                    Flow flowE = boh.f.e(zh9.u0.m(((tpd.f) aVar24.f87732p).b(null), cj9.c.y(aVar24.f87734r.a())), new vpd.a0(aVar24, i5));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector22, flowE, c1Var) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i112 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar25 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) obj3;
                CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData = aVar25.B;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                int i113 = c1Var.v;
                if (i113 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector23 = (FlowCollector) c1Var.f287945w;
                    no5.b bVar5 = aVar25.o;
                    dj0.d dVar2 = cryptoSendConfirmationControllerContract$InputData.f.f71113b;
                    String strH = x5d.b.h(cryptoSendConfirmationControllerContract$InputData.d);
                    CryptoAddress cryptoAddress = cryptoSendConfirmationControllerContract$InputData.f71313a;
                    ko5.k request = new ko5.k(dVar2, strH, cryptoAddress.f71059a, cryptoAddress.f71063h);
                    hp5.o oVar = (hp5.o) bVar5;
                    oVar.getClass();
                    Intrinsics.checkNotNullParameter(request, "request");
                    Flow flowE2 = com.google.crypto.tink.shaded.protobuf.t1.E(new vkm.v1(new g0a.e(oVar, request, lValueOf, i3)));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector23, flowE2, c1Var) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i113 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                int i114 = c1Var.v;
                if (i114 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector24 = (FlowCollector) c1Var.f287945w;
                    v60.g gVar4 = ((com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a) obj3).f85618q;
                    akg.n nVarV4 = nim.a.v(zh9.u0.m(((wtc.h) gVar4.f286251b).f299872a.e.b(Unit.f186387a, w4l.i.f294643c), rd0.e.b(l93.f.d((l93.f) gVar4.d, null, true, 5))), new wpj.b(gVar4, 11));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector24, nVarV4, c1Var) == aVar27) {
                        return aVar27;
                    }
                } else {
                    if (i114 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                int i115 = c1Var.v;
                if (i115 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector25 = (FlowCollector) c1Var.f287945w;
                    vv.d dVar3 = (vv.d) obj3;
                    vkm.y yVarD = dVar3.d.d(dVar3.e, null);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector25, yVarD, c1Var) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i115 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 24:
                vvh.l lVar2 = (vvh.l) obj3;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                int i116 = c1Var.v;
                if (i116 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector26 = (FlowCollector) c1Var.f287945w;
                    dj0.d dVar4 = (dj0.d) c1Var.f287946x;
                    jhi.b bVarB = vvh.l.b(lVar2, "PocketsSummary", dVar4.f115083b);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    vkm.q.w(flowCollector26);
                    Object objCollect2 = bVarB.collect(new vkf.d(flowCollector26, i21, dVar4, lVar2), c1Var);
                    if (objCollect2 != aVar29) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 != aVar29) {
                        objCollect2 = Unit.f186387a;
                    }
                    if (objCollect2 == aVar29) {
                        return aVar29;
                    }
                } else {
                    if (i116 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 25:
                FlowCollector flowCollector27 = (FlowCollector) c1Var.f287945w;
                Throwable th11 = (Throwable) c1Var.f287946x;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                int i117 = c1Var.v;
                if (i117 == 0) {
                    yhm.o.b(obj2);
                    if (th11 instanceof WidgetNotAvailableException) {
                        throw th11;
                    }
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (((vw4.d) obj3).invoke(flowCollector27, th11, c1Var) == aVar30) {
                        return aVar30;
                    }
                } else {
                    if (i117 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                int i118 = c1Var.v;
                if (i118 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector28 = (FlowCollector) c1Var.f287945w;
                    vkm.d dVarB2 = rd0.e.b(((oqk.g0) ((vy5.i0) obj3).d).d((Data) c1Var.f287946x, false));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector28, dVarB2, c1Var) == aVar31) {
                        return aVar31;
                    }
                } else {
                    if (i118 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                int i119 = c1Var.v;
                if (i119 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector29 = (FlowCollector) c1Var.f287945w;
                    Flow qVar = ((Boolean) c1Var.f287946x).booleanValue() ? new q87.q(nim.a.v(rd0.e.n(rd0.e.b(((vy5.s0) obj3).f293212b.d()), zhm.h0.f322473a), new vw4.j(i3)), i2) : new go.g(Boolean.FALSE, 2);
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector29, qVar, c1Var) == aVar32) {
                        return aVar32;
                    }
                } else {
                    if (i119 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                int i120 = c1Var.v;
                if (i120 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector30 = (FlowCollector) c1Var.f287945w;
                    vkm.d dVarB3 = rd0.e.b(mo3.a.n(((w4l.f) ((hwi.c1) ((vyi.r) obj3).f293344p.f120411c).e.getValue()).f(Unit.f186387a, false)));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector30, dVarB3, c1Var) == aVar33) {
                        return aVar33;
                    }
                } else {
                    if (i120 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                int i121 = c1Var.v;
                if (i121 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector31 = (FlowCollector) c1Var.f287945w;
                    vkm.d dVarB4 = rd0.e.b(nim.a.w(((vzh.h) obj3).f293535l.a(false), new vz1.h(i21)));
                    c1Var.f287945w = null;
                    c1Var.f287946x = null;
                    c1Var.v = 1;
                    if (vkm.q.u(flowCollector31, dVarB4, c1Var) == aVar34) {
                        return aVar34;
                    }
                } else {
                    if (i121 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f287947y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(Function3 function3, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f287947y = function3;
    }
}
