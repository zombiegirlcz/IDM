package zgj;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPrice;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.api.model.EsimProfileDetails;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.checkout.EsimCheckoutScreenContract$ModalStep;
import dfj.e5;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.checkout.a f322155w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(int i, com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f322155w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f0 f0Var = new f0(0, this.f322155w, continuation);
                f0Var.v = obj2;
                return f0Var;
            case 1:
                f0 f0Var2 = new f0(1, this.f322155w, continuation);
                f0Var2.v = obj2;
                return f0Var2;
            case 2:
                f0 f0Var3 = new f0(2, this.f322155w, continuation);
                f0Var3.v = obj2;
                return f0Var3;
            case 3:
                f0 f0Var4 = new f0(3, this.f322155w, continuation);
                f0Var4.v = obj2;
                return f0Var4;
            case 4:
                f0 f0Var5 = new f0(4, this.f322155w, continuation);
                f0Var5.v = obj2;
                return f0Var5;
            case 5:
                f0 f0Var6 = new f0(5, this.f322155w, continuation);
                f0Var6.v = obj2;
                return f0Var6;
            case 6:
                f0 f0Var7 = new f0(6, this.f322155w, continuation);
                f0Var7.v = obj2;
                return f0Var7;
            case 7:
                f0 f0Var8 = new f0(7, this.f322155w, continuation);
                f0Var8.v = obj2;
                return f0Var8;
            case 8:
                f0 f0Var9 = new f0(8, this.f322155w, continuation);
                f0Var9.v = obj2;
                return f0Var9;
            case 9:
                f0 f0Var10 = new f0(9, this.f322155w, continuation);
                f0Var10.v = obj2;
                return f0Var10;
            case 10:
                f0 f0Var11 = new f0(10, this.f322155w, continuation);
                f0Var11.v = obj2;
                return f0Var11;
            case 11:
                f0 f0Var12 = new f0(11, this.f322155w, continuation);
                f0Var12.v = obj2;
                return f0Var12;
            case 12:
                f0 f0Var13 = new f0(12, this.f322155w, continuation);
                f0Var13.v = obj2;
                return f0Var13;
            case 13:
                f0 f0Var14 = new f0(13, this.f322155w, continuation);
                f0Var14.v = obj2;
                return f0Var14;
            default:
                f0 f0Var15 = new f0(14, this.f322155w, continuation);
                f0Var15.v = obj2;
                return f0Var15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f0) create((EsimDataPlan) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f0) create((EsimDataPlan) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f0) create((wi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f0) create((dej.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f0) create((chj.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f0) create((chj.b0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

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
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 7;
        u uVar = u.f322185a;
        s sVar = s.f322183a;
        String strN = null;
        com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar = this.f322155w;
        switch (i) {
            case 0:
                EsimDataPlan esimDataPlan = (EsimDataPlan) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bej.o oVar = aVar.f100922r;
                dj0.d purchasePrice = esimDataPlan.e;
                e5 e5Var = (e5) oVar;
                e5Var.getClass();
                wsg.n nVar = e5Var.f113955a;
                Intrinsics.checkNotNullParameter(purchasePrice, "purchasePrice");
                boolean zC = ((jte.d) e5Var.f113956b).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c);
                w4l.i iVar = w4l.i.f294643c;
                if (!zC) {
                    if (zC) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return com.revolut.data.database.models.openbanking.d.x("EsimUserPocketInteractorImpl", "Failed to obtain default payment pocket via WalletInteractor", nim.a.v(nim.a.v(u0.m(rd0.e.b(osg.b.g(nVar, iVar, io3.l.CURRENT, null, null, null, null, null, 124)), rd0.e.b(nVar.J(AccountId.Personal.f51414a, w4l.j.f294644c))), new dee.x(28)), new dee.x(29)));
                }
                q7c.g gVar = e5Var.f113957c;
                u6c.n nVar2 = new u6c.n(null, null, u6c.t.ESIM, Long.valueOf(purchasePrice.f115082a), purchasePrice.f115083b, false, null, null, 995);
                k6c.a aVar3 = k6c.b.Companion;
                return com.revolut.data.database.models.openbanking.d.x("EsimUserPocketInteractorImpl", "Failed to obtain default payment pocket via PaymentMethodsInteractor", nim.a.v(gVar.b(nVar2, iVar), new dee.x(27)));
            case 1:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new zd3.h(data, 3));
                return Unit.f186387a;
            case 2:
                EsimDataPlan esimDataPlan2 = (EsimDataPlan) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bej.b bVar = aVar.B;
                String idempotencyKey = ((r) ((j2) aVar.H.f22677a).getValue()).f;
                EsimCheckoutScreenContract$InputData esimCheckoutScreenContract$InputData = aVar.f100920p;
                String planId = esimCheckoutScreenContract$InputData.f100907a;
                dj0.d dVar = esimDataPlan2.e;
                EsimDataPlanOfferInfo esimDataPlanOfferInfo = esimDataPlan2.f100224s;
                String str = esimCheckoutScreenContract$InputData.f100908b;
                EsimGiftRecipient esimGiftRecipient = esimCheckoutScreenContract$InputData.f100909c;
                if (esimGiftRecipient != null) {
                    aVar.G.getClass();
                    strN = ugc.a.n(esimGiftRecipient);
                }
                dfj.k kVar = (dfj.k) bVar;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
                Intrinsics.checkNotNullParameter(planId, "planId");
                return kVar.f114011b.c(idempotencyKey, planId, dVar, esimDataPlanOfferInfo, null, null, str, strN);
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new zd3.h(data2, 4));
                return Unit.f186387a;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new zd3.h(data3, 5));
                return Unit.f186387a;
            case 5:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data4 = (Data) rVar.f314201a;
                Data data5 = (Data) rVar.f314202b;
                Data data6 = (Data) rVar.f314203c;
                com.revolut.retail.feature.esim.impl.ui.screens.checkout.a aVar9 = this.f322155w;
                aVar9.H2(aVar9.H, new wg9.p(data6, data4, aVar9, data5, 15));
                return Unit.f186387a;
            case 6:
                Data data7 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new zd3.h(data7, aVar));
                return Unit.f186387a;
            case 7:
                Data data8 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new zd3.h(data8, 7));
                return Unit.f186387a;
            case 8:
                wi0.b bVar2 = (wi0.b) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new a3i.w(13, bVar2));
                return Unit.f186387a;
            case 9:
                Data data9 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new zd3.h(data9, 8));
                return Unit.f186387a;
            case 10:
                dej.a aVar14 = (dej.a) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(aVar.H.B(new zg6.c(i2)), new za9.c(aVar14, 23));
            case 11:
                yhm.r rVar2 = (yhm.r) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                EsimUserPocket userPocket = (EsimUserPocket) rVar2.f314201a;
                Optional optional = (Optional) rVar2.f314202b;
                dej.a esimCheckout = (dej.a) rVar2.f314203c;
                bej.b bVar3 = aVar.B;
                EsimMobilePlanPointsOption esimMobilePlanPointsOption = (EsimMobilePlanPointsOption) u1.l(optional);
                dfj.k kVar2 = (dfj.k) bVar3;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(userPocket, "userPocket");
                Intrinsics.checkNotNullParameter(esimCheckout, "esimCheckout");
                dj0.d dVar2 = esimMobilePlanPointsOption != null ? esimMobilePlanPointsOption.f100306c : esimCheckout.i.f100419a;
                if (!((jte.d) kVar2.f114012c).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c)) {
                    return hb9.b.j(new EsimCheckoutPrice(null, dVar2, dVar2));
                }
                xi0.b bVar4 = userPocket.f100533c.f115083b;
                xi0.b bVar5 = dVar2.f115083b;
                xi0.b bVar6 = dVar2.f115083b;
                long j2 = dVar2.f115082a;
                if (Intrinsics.f(bVar4, bVar5)) {
                    return hb9.b.j(new EsimCheckoutPrice(null, dVar2, dVar2));
                }
                akg.n nVarV = nim.a.v(kVar2.f114010a.a(j2, bVar4, bVar6), new ar3.a(3, dVar2));
                Pair[] elements = {new Pair("EsimCheckoutInteractorImpl", "Failed to retrieve converted price while polling quote"), new Pair("User pocket currency", bVar4.f306286a), new Pair("Original payment price", j2 + " " + bVar6.f306286a)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return rd0.e.n(nVarV, kotlin.collections.d.y0(elements));
            case 12:
                Data data10 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new zd3.h(data10, 9));
                return Unit.f186387a;
            case 13:
                chj.c cVar = (chj.c) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(cVar, chj.a.f24241a)) {
                    aVar.C2(uVar);
                } else {
                    if (!Intrinsics.f(cVar, chj.b.f24243a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.C2(sVar);
                }
                return Unit.f186387a;
            default:
                cli.y yVar = aVar.H;
                chj.b0 b0Var = (chj.b0) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (b0Var instanceof chj.w) {
                    aVar.C2(uVar);
                } else if (b0Var instanceof chj.y) {
                    aVar.C2(new v(((chj.y) b0Var).f24317a));
                } else if (!(b0Var instanceof chj.z)) {
                    if (b0Var instanceof chj.r) {
                        aVar.C2(sVar);
                    } else if (b0Var instanceof chj.t) {
                        aVar.C2(new w(((chj.t) b0Var).f24303a));
                    } else if (b0Var instanceof chj.a0) {
                        EsimProfile esimProfile = ((chj.a0) b0Var).f24242a;
                        boolean zJ = pd.b.j((Boolean) ((r) ((j2) yVar.f22677a).getValue()).f322182n.getContent());
                        if (((jte.d) aVar.z).c(EsimApi$Toggles.EsimMobilePlanFlexibleStart.f100177c)) {
                            oki.h.v2(aVar.J, new EsimCheckoutScreenContract$ModalStep.EsimInstallation(esimProfile, zJ), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        } else if (zJ) {
                            aVar.C2(sVar);
                        } else {
                            chj.d dVar3 = aVar.f100925w;
                            String str2 = esimProfile.f100423a;
                            EsimProfileDetails esimProfileDetails = esimProfile.f100426g;
                            dVar3.b3(str2, esimProfileDetails != null ? esimProfileDetails.a() : null);
                        }
                    } else if (Intrinsics.f(b0Var, chj.v.f24314a)) {
                        aVar.l2(new yzb.c(aVar, null, 16), new yi5.b(26));
                    } else if (Intrinsics.f(b0Var, chj.x.f24316a)) {
                        aVar.H2(yVar, new b0(aVar, 2));
                        aVar.l2(new yzb.c(aVar, null, 16), new yi5.b(26));
                    } else if (!Intrinsics.f(b0Var, chj.u.f24307a)) {
                        if (!(b0Var instanceof chj.s)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "EsimCheckoutScreenModel", "NavigateToPhoneNumberPorting purchase result should not occur for data plan checkout", null, h0Var);
                    }
                }
                return Unit.f186387a;
        }
    }
}
