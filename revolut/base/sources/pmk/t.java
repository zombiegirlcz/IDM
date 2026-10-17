package pmk;

import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.contacts_chooser.api.context.ContextAction;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.messaging.data.api.model.Mention;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$State;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutTarget;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import fmb.a1;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import qh4.b0;
import r0a.y;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f237630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f237631x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f237631x = obj2;
        this.f237630w = obj3;
    }

    private final Object b(Object obj2) {
        Object objM2;
        CheckoutOrder checkoutOrder;
        pi3.e eVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar2 = (com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f237631x;
            cxe.l lVar = (cxe.l) ((cxe.n) this.f237630w);
            this.v = 1;
            qki.d dVar = eVar2.L;
            eVar2.H2(dVar, new qpb.a(lVar, eVar2, 20));
            jxe.m mVar = lVar.f109954g;
            CheckoutScreenContract$CheckoutContent$Order checkoutScreenContract$CheckoutContent$Order = lVar.f109956j;
            SelectedMethod selectedMethod = mVar.f179188a;
            ph3.b bVar = eVar2.v;
            boolean z = ((CheckoutFlowContract$State) ((j2) dVar.f22677a).getValue()).f90671a == null;
            yt8.i iVar = lVar.e;
            boolean z3 = lVar.f109953c;
            boolean z4 = lVar.d;
            jxe.l lVar2 = lVar.f;
            CheckoutScreenContract$CheckoutTarget checkoutScreenContract$CheckoutTarget = lVar.i;
            Continuation continuation = null;
            if (checkoutScreenContract$CheckoutTarget instanceof CheckoutScreenContract$CheckoutTarget.Junior) {
                String str = ((CheckoutScreenContract$CheckoutTarget.Junior) checkoutScreenContract$CheckoutTarget).f90716a;
                if (lVar2 instanceof jxe.f) {
                    objM2 = u0.b0(eVar2.X(), "CHECKOUT_SCREEN_CTA_TAG", new a1(lVar, eVar2, str, null), this);
                    if (objM2 != aVar) {
                        objM2 = Unit.f186387a;
                    }
                } else {
                    if (lVar2 instanceof jxe.g) {
                        jxe.g gVar = (jxe.g) lVar2;
                        dj0.d dVar2 = gVar.f179174b;
                        cxe.d dVar3 = gVar.d;
                        if (dVar3 == null) {
                            dVar3 = gVar.f179173a;
                        }
                        eVar2.P2(pyd.c.H(dVar3.f109938a, dVar2), dVar2);
                    } else if (lVar2 instanceof jxe.j) {
                        jxe.j jVar = (jxe.j) lVar2;
                        eVar2.P2(jVar.d, jVar.f179183b);
                    } else if (lVar2 instanceof jxe.h) {
                        objM2 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(eVar2, null, false, this, 3);
                        if (objM2 != aVar) {
                            objM2 = Unit.f186387a;
                        }
                    } else if ((lVar2 instanceof jxe.e) || (lVar2 instanceof jxe.i) || (lVar2 instanceof jxe.k)) {
                        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Selected checkout payment kind=", lVar2.getClass().getSimpleName(), " is not allowed in Junior checkout flow"));
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        if (lVar2 != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM2 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(eVar2, null, false, this, 3);
                        if (objM2 != aVar) {
                            objM2 = Unit.f186387a;
                        }
                    }
                    objM2 = Unit.f186387a;
                }
                if (objM2 != aVar) {
                    objM2 = Unit.f186387a;
                }
            } else if (selectedMethod != null && (selectedMethod instanceof vye.d) && ((vye.d) selectedMethod).e == vye.c.CHECKOUT_PREORDER) {
                objM2 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(eVar2, null, false, this, 3);
                if (objM2 != aVar) {
                    objM2 = Unit.f186387a;
                }
            } else if (selectedMethod == null || !((z4 && z3) || (checkoutScreenContract$CheckoutContent$Order instanceof CheckoutScreenContract$CheckoutContent$Order.ThreeDs))) {
                CheckoutScreenContract$CheckoutContent$Order.Checkout checkout = checkoutScreenContract$CheckoutContent$Order instanceof CheckoutScreenContract$CheckoutContent$Order.Checkout ? (CheckoutScreenContract$CheckoutContent$Order.Checkout) checkoutScreenContract$CheckoutContent$Order : null;
                if (checkout == null || (checkoutOrder = checkout.f90710a) == null || (eVar = checkoutOrder.e) == null || !eVar.i) {
                    int i2 = 13;
                    if ((lVar2 instanceof jxe.e) && ngm.n.r(iVar) && !lVar.f109952b) {
                        vh3.c cVar = (vh3.c) bVar;
                        eVar2.C1(u0.b(new FeatureCommand(new KycFeatureConfig.InitKyc(cVar.a(), ((pt8.a) cVar.d).a(), i2))));
                    } else if (z) {
                        if (ngm.n.r(iVar)) {
                            vh3.c cVar2 = (vh3.c) bVar;
                            eVar2.C1(u0.b(new FeatureCommand(new KycFeatureConfig.InitKyc(cVar2.a(), ((pt8.a) cVar2.d).a(), i2))));
                        } else {
                            eVar2.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)))));
                        }
                    } else if (eVar2.o.f90670c instanceof TopUpTarget.Pro) {
                        objM2 = eVar2.p2(this, new oqk.h(eVar2, lVar.f109955h.f115083b, checkoutScreenContract$CheckoutContent$Order, continuation, 16));
                        if (objM2 != aVar) {
                            objM2 = Unit.f186387a;
                        }
                        if (objM2 != aVar) {
                            objM2 = Unit.f186387a;
                        }
                    } else if (selectedMethod == null && ((z4 && z3) || (checkoutScreenContract$CheckoutContent$Order instanceof CheckoutScreenContract$CheckoutContent$Order.ThreeDs))) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Selected method shouldn't be null when need to top-up or context is 3DS");
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                        objM2 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(eVar2, null, false, this, 3);
                        if (objM2 != aVar) {
                            objM2 = Unit.f186387a;
                        }
                    } else {
                        objM2 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(eVar2, null, false, this, 3);
                        if (objM2 != aVar) {
                            objM2 = Unit.f186387a;
                        }
                    }
                    objM2 = Unit.f186387a;
                } else {
                    objM2 = com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.M2(eVar2, null, false, this, 3);
                    if (objM2 != aVar) {
                        objM2 = Unit.f186387a;
                    }
                }
            } else {
                objM2 = eVar2.A.Z2(((checkoutScreenContract$CheckoutContent$Order instanceof CheckoutScreenContract$CheckoutContent$Order.Checkout) && ((CheckoutScreenContract$CheckoutContent$Order.Checkout) checkoutScreenContract$CheckoutContent$Order).f90710a.f65847a == pi3.s.PLAN) || (checkoutScreenContract$CheckoutContent$Order instanceof CheckoutScreenContract$CheckoutContent$Order.ThreeDs), new qg7.k(lVar, 2, eVar2, selectedMethod), this);
                if (objM2 != aVar) {
                    objM2 = Unit.f186387a;
                }
            }
            if (objM2 != aVar) {
                objM2 = Unit.f186387a;
            }
            if (objM2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t((v) this.f237631x, (String) this.f237630w, continuation, 0);
            case 1:
                return new t((pn6.l) this.f237631x, (String) this.f237630w, continuation, 1);
            case 2:
                return new t((com.revolut.feature.payments.groups.impl.ui_chat.settings.d) this.f237631x, (File) this.f237630w, continuation, 2);
            case 3:
                return new t((pt4.h) this.f237631x, (xp3.d) this.f237630w, continuation, 3);
            case 4:
                return new t((ptf.l) this.f237631x, (String) this.f237630w, continuation, 4);
            case 5:
                return new t((com.revolut.feature.kyc.impl.flow.kyc.a) this.f237631x, (ht8.a) this.f237630w, continuation, 5);
            case 6:
                return new t((com.revolut.feature.security_hub.impl.ui.street_mode.flow.b) this.f237631x, (th1.d) this.f237630w, continuation, 6);
            case 7:
                return new t((com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) this.f237631x, (dj0.d) this.f237630w, continuation, 7);
            case 8:
                return new t((com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a) this.f237630w, continuation, 8);
            case 9:
                return new t((com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f237631x, (String) this.f237630w, continuation, 9);
            case 10:
                return new t((com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f237631x, (nii.b) this.f237630w, continuation, 10);
            case 11:
                return new t((com.revolut.feature.card_order_new.impl.newcard.experiment_onboarding_physical_card.b) this.f237630w, continuation, 11);
            case 12:
                return new t(this.f237631x, (com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a) this.f237630w, continuation, 12);
            case 13:
                return new t((com.revolut.feature.credit.application.plugins.impl.ui.debts.c) this.f237631x, (x84.l) this.f237630w, continuation, 13);
            case 14:
                return new t((com.revolut.feature.cash_topup.impl.ui.amount.c) this.f237631x, (qb3.h) this.f237630w, continuation, 14);
            case 15:
                return new t((qca.q) this.f237631x, (ApmDescriptor) this.f237630w, continuation, 15);
            case 16:
                return new t((dt3.b) this.f237631x, (com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a) this.f237630w, continuation, 16);
            case 17:
                return new t((qg5.c) this.f237631x, (ArrayList) this.f237630w, continuation, 17);
            case 18:
                return new t((b0) this.f237631x, (String) this.f237630w, continuation, 18);
            case 19:
                return new t((com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a) this.f237631x, (ri4.h) this.f237630w, continuation, 19);
            case 20:
                return new t((com.revolut.feature.profile.impl.ui.details.address.flow.c) this.f237630w, continuation, 20);
            case 21:
                return new t((com.revolut.feature.payments.air.widget.impl.ui.flow.a) this.f237631x, (String) this.f237630w, continuation, 21);
            case 22:
                return new t((com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b) this.f237631x, (BizumTransferData) this.f237630w, continuation, 22);
            case 23:
                return new t((qu9.b) this.f237631x, (Mention) this.f237630w, continuation, 23);
            case 24:
                return new t((qvh.g) this.f237631x, (String) this.f237630w, continuation, 24);
            case 25:
                return new t((qw1.g) this.f237631x, (CoroutineScope) this.f237630w, continuation, 25);
            case 26:
                return new t((com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f237631x, (cxe.n) this.f237630w, continuation, 26);
            case 27:
                return new t((y) this.f237631x, this.f237630w, continuation, 27);
            case 28:
                return new t((r0f.k) this.f237631x, (String) this.f237630w, continuation, 28);
            default:
                return new t((r1a.d) this.f237631x, (ContextAction) this.f237630w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0274  */
    /* JADX WARN: Type inference failed for: r11v0, types: [it3.k, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.String] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pmk.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f237630w = hVar;
    }
}
