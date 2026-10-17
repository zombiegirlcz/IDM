package jld;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.product.lifecycle.flow.ProductLifecycleFlowContract$Step;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$InputData;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.feature.travel.miles.api.model.TravelMilesRate;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.domain.models.Claim;
import com.revolut.sso.impl.ui.auth.n;
import e0f.r1;
import efm.d0;
import efm.r;
import h93.f0;
import ha3.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import k3k.t0;
import k50.j4;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import ks9.b0;
import kye.k3;
import le3.w;
import okl.q;
import ood.g0;
import ood.o0;
import ood.q0;
import org.joda.time.Instant;
import ot1.p;
import skm.e0;
import skm.p0;
import yhm.m;
import yhm.o;
import yji.l;
import zh9.u0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f175719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f175720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f175721y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f175719w = obj2;
        this.f175720x = obj3;
        this.f175721y = obj4;
        this.z = obj5;
    }

    private final Object b(Object obj2) {
        String str = (String) this.f175721y;
        l93.f fVar = ((com.revolut.feature.card_design.impl.card_design.d) this.f175720x).B;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarG = m70.a.g(((x) fVar).v(str), null, new nsl.d(15), 1);
            this.v = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f0 f0Var = (f0) this.f175719w;
            o.b(obj2);
            return f0Var;
        }
        o.b(obj2);
        f0 f0Var2 = (f0) obj2;
        String str2 = (String) this.z;
        this.f175719w = f0Var2;
        this.v = 2;
        Object objI = ((x) fVar).f.I(str, str2, this);
        if (objI != aVar) {
            objI = Unit.f186387a;
        }
        return objI == aVar ? aVar : f0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r8 == r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f175721y
            com.revolut.feature.onboarding.impl.qes_terms.h r0 = (com.revolut.feature.onboarding.impl.qes_terms.h) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            java.lang.Object r1 = r7.f175719w
            com.revolut.retail.core.navigation.NaviCommand r1 = (com.revolut.retail.core.navigation.NaviCommand) r1
            yhm.o.b(r8)
            goto L57
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            yhm.o.b(r8)
            goto L43
        L24:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.f175720x
            com.revolut.retail.core.navigation.FeatureCommand r8 = (com.revolut.retail.core.navigation.FeatureCommand) r8
            if (r8 == 0) goto L2e
            goto L45
        L2e:
            com.revolut.retail.feature.api.userauth.navigation.a r8 = r0.f78569y
            java.lang.Object r2 = r7.z
            com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase r2 = (com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase) r2
            r5 = 3
            r6 = 0
            ufm.i r8 = com.revolut.retail.feature.api.userauth.navigation.a.a(r8, r6, r2, r5)
            r7.v = r4
            java.lang.Object r8 = nim.a.b(r8, r7)
            if (r8 != r1) goto L43
            goto L55
        L43:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
        L45:
            mli.e r2 = r0.f78568x
            efm.b r2 = mli.e.b(r2)
            r7.f175719w = r8
            r7.v = r3
            java.lang.Object r2 = nim.a.a(r2, r7)
            if (r2 != r1) goto L56
        L55:
            return r1
        L56:
            r1 = r8
        L57:
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r1)
            r8.<init>(r1)
            aii.n r8 = r0.C1(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jld.h.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        n nVar = (n) this.f175719w;
        gu2.e eVar = nVar.v;
        q qVar = new q(nVar, (Claim) this.f175720x, (Evidence) this.f175721y, (Set) this.z, null);
        this.v = 1;
        Object objB = fkl.c.b(eVar, qVar, this);
        return objB == aVar ? aVar : objB;
    }

    private final Object o(Object obj2) {
        Object objA;
        Flow flowV;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        try {
            if (i == 0) {
                o.b(obj2);
                q0 q0Var = (q0) this.f175720x;
                TripsMapBitmapConfig tripsMapBitmapConfig = (TripsMapBitmapConfig) this.f175721y;
                ood.h hVar = (ood.h) this.z;
                m.Companion companion = m.INSTANCE;
                Flow flowC = q0Var.A.c(tripsMapBitmapConfig, w4l.h.f294642c);
                Long l2 = hVar.f227043b.f227033c.f116418q;
                int i2 = 2;
                int i3 = 0;
                if (l2 != null) {
                    flowV = new go.g(zi0.c.P(pu7.a.M(l2.longValue(), g0m.a.f139502a), false, null, 3), 2);
                } else {
                    flowV = nim.a.v(((w) q0Var.v).b(u.c(q0Var.D)), new o0(i3));
                }
                jhi.b bVarG = mo3.a.g(zi0.c.k(flowC, flowV), null, new g0(i2), 1);
                this.v = 1;
                obj2 = vkm.q.x(bVarG, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
            }
            objA = (Pair) obj2;
            m.Companion companion2 = m.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion3 = m.INSTANCE;
            objA = o.a(th10);
        }
        return new m(objA);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r7 == r2) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f175721y
            ot1.p r0 = (ot1.p) r0
            java.lang.Object r1 = r6.f175719w
            com.revolut.feature.apm.breb.impl.flow.a r1 = (com.revolut.feature.apm.breb.impl.flow.a) r1
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            yhm.o.b(r7)
            goto L53
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            yhm.o.b(r7)
            goto L36
        L24:
            yhm.o.b(r7)
            rv1.t r7 = r1.f61720q
            java.lang.Object r3 = r6.f175720x
            java.util.List r3 = (java.util.List) r3
            r6.v = r5
            java.lang.Object r7 = r7.a(r3, r6)
            if (r7 != r2) goto L36
            goto L52
        L36:
            gte.a r7 = r1.f61719p
            com.revolut.feature.apm.core.api.ApmToggles$BrebSkipOnboardingKeysRegistration r3 = com.revolut.feature.apm.core.api.ApmToggles$BrebSkipOnboardingKeysRegistration.f61795c
            jte.d r7 = (jte.d) r7
            boolean r7 = r7.c(r3)
            if (r7 == 0) goto L46
            r0.invoke()
            goto L66
        L46:
            zu1.a r7 = r1.f61722s
            r6.v = r4
            rv1.r r7 = (rv1.r) r7
            java.io.Serializable r7 = r7.h(r6)
            if (r7 != r2) goto L53
        L52:
            return r2
        L53:
            java.util.List r7 = (java.util.List) r7
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L5f
            r0.invoke()
            goto L66
        L5f:
            java.lang.Object r0 = r6.z
            ov1.f r0 = (ov1.f) r0
            r0.invoke(r7)
        L66:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jld.h.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(8:6|36|7|8|9|24|29|30)(2:13|14))(1:15))(3:16|(0)|22)|19|38|20|(5:23|9|24|29|30)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        r8 = r14;
        r14 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jld.h.s(java.lang.Object):java.lang.Object");
    }

    private final Object t(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a aVar = (com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) this.f175719w;
            jpe.d dVar = aVar.f90232p;
            TaxResidencyDeclarationFlowContract$InputData taxResidencyDeclarationFlowContract$InputData = aVar.o;
            wi0.b bVar = taxResidencyDeclarationFlowContract$InputData.f90216a;
            Boolean bool = (Boolean) this.f175720x;
            String str = (String) this.f175721y;
            ExemptionReason exemptionReason = (ExemptionReason) this.z;
            String str2 = taxResidencyDeclarationFlowContract$InputData.f;
            String str3 = taxResidencyDeclarationFlowContract$InputData.f90219g;
            this.v = 1;
            joe.o oVar = (joe.o) dVar.f177266a;
            oVar.getClass();
            ac8.h hVar = new ac8.h(bVar, bool, str, exemptionReason, oVar, str2, str3, null, 12);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, hVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object u(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jld.h.u(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj2) {
        hha.d dVar = (hha.d) this.f175720x;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f175719w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarE = bVar.f103135s.e();
            this.v = 1;
            obj2 = nim.a.b(d0VarE, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        hha.d dVar2 = (hha.d) obj2;
        zfk.c cVar = bVar.f103133q;
        String str = dVar.f152287a;
        hha.i iVar = (hha.i) this.f175721y;
        PricingPlanOffer pricingPlanOffer = (PricingPlanOffer) this.z;
        return l.a1(bVar, cVar.b3(str, iVar, pricingPlanOffer != null ? pricingPlanOffer.f81123a : null, new zfk.k(null)), null, null, new rhk.g(bVar, dVar2, dVar, null), 3);
    }

    private final Object w(Object obj2) {
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b bVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f175719w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarF = bVar.f103135s.f((String) this.f175720x);
            this.v = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        hha.d dVar = (hha.d) ((od0.i) obj2).f224257a;
        if (dVar == null) {
            return Unit.f186387a;
        }
        bVar.K2(dVar, (hha.i) this.z, null);
        return Unit.f186387a;
    }

    private final Object x(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b bVar = (com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) this.f175719w;
            u51.a aVar = bVar.f90798r;
            String str = (String) this.f175720x;
            yte.m mVar = (yte.m) this.f175721y;
            TopUpMethodsContext topUpMethodsContext = bVar.o.d;
            if (topUpMethodsContext == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Top-up methods context should present while remove stored method if BE driven methods enabled");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return Unit.f186387a;
            }
            this.v = 1;
            hve.o oVar = (hve.o) ((r1) aVar).f121679a;
            oVar.getClass();
            g0a.e eVar = new g0a.e(23, oVar, str, mVar, topUpMethodsContext, null);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, eVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    private final Object y(Object obj2) {
        com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a aVar3 = (com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a) this.f175720x;
            q0a.b bVar = aVar3.f79809p;
            ChatTransferRecipient chatTransferRecipient = (ChatTransferRecipient) this.f175721y;
            ChatItem chatItem = ((kz9.d) this.z).f191078b;
            this.f175719w = aVar3;
            this.v = 1;
            Object objB = bVar.b(chatTransferRecipient, chatItem, this);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a) this.f175719w;
            o.b(obj2);
        }
        return aVar.C1(u0.b((NaviCommand) obj2));
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(0, (k) this.f175719w, (fkd.x) this.f175720x, (SlotContext) this.f175721y, (yo6.e) this.z, continuation);
            case 1:
                return new h(1, continuation, (t0) this.z);
            case 2:
                return new h((j4) this.f175720x, (Instant) this.f175721y, (v20.n) this.z, continuation, 2);
            case 3:
                return new h(3, (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b) this.f175719w, (Long) this.f175720x, (Long) this.f175721y, (fu3.a) this.z, continuation);
            case 4:
                return new h(4, (com.revolut.feature.product.lifecycle.flow.a) this.f175719w, (ProductLifecycleFlowContract$Step) this.f175720x, (jja.a) this.f175721y, (Ref$BooleanRef) this.z, continuation);
            case 5:
                return new h(5, (ks9.b) this.f175719w, (List) this.f175720x, (qq9.d) this.f175721y, (PaymentGroup) this.z, continuation);
            case 6:
                return new h(6, (qq9.d) this.f175719w, (List) this.f175720x, (b0) this.f175721y, (PaymentGroup) this.z, continuation);
            case 7:
                return new h(7, (b0) this.f175719w, (PaymentGroup) this.f175720x, (GroupMemberSettleInfo) this.f175721y, (krf.c) this.z, continuation);
            case 8:
                return new h(8, (k3) this.f175719w, (SelectedMethod) this.f175720x, (dj0.d) this.f175721y, (l71.d) this.z, continuation);
            case 9:
                return new h(9, (ldh.m) this.f175719w, (nel.u0) this.f175720x, (bfl.g) this.f175721y, (ArrayList) this.z, continuation);
            case 10:
                return new h(10, (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) this.f175719w, (OfferV2FlowContract$OfferUpdateContext) this.f175720x, (hu3.a) this.f175721y, (yf4.f) this.z, continuation);
            case 11:
                return new h(11, (mp6.n) this.f175719w, (yo6.d) this.f175720x, (String) this.f175721y, (yo6.c) this.z, continuation);
            case 12:
                return new h(12, (n8a.o) this.f175719w, (AccountId) this.f175720x, (String) this.f175721y, (String) this.z, continuation);
            case 13:
                return new h(13, continuation, (com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) this.z);
            case 14:
                return new h((nii.b) this.f175720x, (Throwable) this.f175721y, (tji.f) this.z, continuation, 14);
            case 15:
                return new h(15, (com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) this.f175719w, (nt9.g) this.f175720x, (Image) this.f175721y, (xi0.b) this.z, continuation);
            case 16:
                return new h(16, (com.revolut.feature.card_design.impl.card_design.d) this.f175719w, (e93.d) this.f175720x, (pi3.h) this.f175721y, (hha.d) this.z, continuation);
            case 17:
                return new h((com.revolut.feature.card_design.impl.card_design.d) this.f175720x, (String) this.f175721y, (String) this.z, continuation, 17);
            case 18:
                return new h((FeatureCommand) this.f175720x, (com.revolut.feature.onboarding.impl.qes_terms.h) this.f175721y, (UserOnboardingNavigationProvider$UseCase) this.z, continuation, 18);
            case 19:
                return new h(19, (n) this.f175719w, (Claim) this.f175720x, (Evidence) this.f175721y, (Set) this.z, continuation);
            case 20:
                return new h(20, (CoroutineScope) this.f175719w, (q0) this.f175720x, (TripsMapBitmapConfig) this.f175721y, (ood.h) this.z, continuation);
            case 21:
                return new h(21, (com.revolut.feature.apm.breb.impl.flow.a) this.f175719w, (List) this.f175720x, (p) this.f175721y, (ov1.f) this.z, continuation);
            case 22:
                return new h((com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) this.f175721y, (TravelMilesRate) this.z, continuation);
            case 23:
                return new h(23, (com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.a) this.f175719w, (Boolean) this.f175720x, (String) this.f175721y, (ExemptionReason) this.z, continuation);
            case 24:
                return new h((com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b) this.f175720x, (Ref$ObjectRef) this.f175721y, (String) this.z, continuation, 24);
            case 25:
                return new h(25, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f175719w, (hha.d) this.f175720x, (hha.i) this.f175721y, (PricingPlanOffer) this.z, continuation);
            case 26:
                return new h(26, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f175719w, (String) this.f175720x, (CoroutineScope) this.f175721y, (hha.i) this.z, continuation);
            case 27:
                return new h(27, (com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b) this.f175719w, (String) this.f175720x, (yte.m) this.f175721y, (CoroutineScope) this.z, continuation);
            case 28:
                return new h((com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.a) this.f175720x, (ChatTransferRecipient) this.f175721y, (kz9.d) this.z, continuation, 28);
            default:
                return new h(29, (u8c.e) this.f175719w, (dj0.d) this.f175720x, (xi0.b) this.f175721y, (xi0.b) this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:518:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.revolut.core.ui_kit.models.Style, java.lang.Integer, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v20 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jld.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, Continuation continuation, l lVar) {
        super(1, continuation);
        this.u = i;
        this.z = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar, TravelMilesRate travelMilesRate, Continuation continuation) {
        super(1, continuation);
        this.u = 22;
        this.f175721y = aVar;
        this.z = travelMilesRate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f175720x = obj2;
        this.f175721y = obj3;
        this.z = obj4;
    }
}
