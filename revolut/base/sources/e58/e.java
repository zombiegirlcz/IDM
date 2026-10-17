package e58;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreen;
import com.revolut.feature.contacts_chooser.impl.bridge.ContactsChooserFlow;
import com.revolut.feature.credit.autopay.ui.screen.account_selection.flow.AutoPayExternalAccountFlow;
import com.revolut.feature.external_accounts.api.ExternalAccountsApi$FeatureToggle;
import com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.SmartDrivingFlow;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreen;
import com.revolut.feature.joint.impl.ui.limits.JointLimitsFlow;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.shops.impl.ui.fullscreen_opt_in.ShopsPromptScreen;
import com.revolut.feature.subaccount.impl.ui.edit.billl.screen.edit.BillSelectorScreen;
import com.revolut.feature.subscriptions.impl.history.SubscriptionHistoryActivity;
import com.revolut.feature.transfer.core.impl.ui.additional_information.flow.AdditionalInformationFlow;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreen;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import did.o;
import e48.n;
import e60.s;
import e8e.p;
import efm.r;
import eh9.z;
import ei3.n;
import elf.c1;
import emk.k;
import igk.m;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mif.e0;
import q06.l;
import ql7.h1;
import ql7.y1;
import r10.t;
import r6e.y;
import vkm.q;
import vkm.z1;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f122782b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f122781a = i;
        this.f122782b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f122781a;
        int i2 = 17;
        boolean z = false;
        Object obj2 = this.f122782b;
        switch (i) {
            case 0:
                return (f) ((n) ((f58.a) ((JointLimitsFlow) obj2).P.getValue())).d.get();
            case 1:
                s sVar = (s) obj2;
                return v.k(sVar.i, sVar.f122869h);
            case 2:
                e61.a aVar = (e61.a) obj2;
                wsg.n nVar = aVar.f122882b;
                fo3.d dVar = fo3.d.PERSONAL;
                fo3.e eVar = fo3.e.ACTIVE;
                fo3.e eVar2 = fo3.e.LOCKED;
                fo3.e[] elements = {eVar, eVar2};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Set setY0 = kotlin.collections.d.y0(elements);
                w4l.j jVar = w4l.j.f294644c;
                r rVarG0 = nVar.g0(dVar, jVar, setY0);
                fo3.d dVar2 = fo3.d.PERSONAL_JOINT;
                fo3.e[] elements2 = {eVar, eVar2};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                r rVarG02 = nVar.g0(dVar2, jVar, kotlin.collections.d.y0(elements2));
                fo3.d dVar3 = fo3.d.TEEN;
                fo3.e[] elements3 = {eVar, eVar2};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                return pd.b.r(e0.h(mif.a.e(rVarG0, rVarG02, nVar.g0(dVar3, jVar, kotlin.collections.d.y0(elements3)))), new a6j.a(aVar, z, i2)).replay(1).e();
            case 3:
                oki.h.D2(((com.revolut.feature.apm.iris.impl.ui.a) obj2).u);
                return Unit.f186387a;
            case 4:
                return ((Context) ((t) obj2).f250857a).getPackageManager();
            case 5:
                KProperty[] kPropertyArr = BillSelectorScreen.i0;
                y yVar = (y) ((BillSelectorScreen) obj2).Y.getValue();
                switch (yVar.f251819a) {
                    case 0:
                        return (p) yVar.k.get();
                    default:
                        return (p) yVar.k.get();
                }
            case 6:
                int i3 = SubscriptionHistoryActivity.f89194x0;
                return new z4l.j(4, v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new SwipeToActionDelegate((RowDelegate) ((SubscriptionHistoryActivity) obj2).u0.getValue(), false)), true);
            case 7:
                ScheduleScreen scheduleScreen = (ScheduleScreen) obj2;
                KProperty[] kPropertyArr2 = ScheduleScreen.f95597b0;
                qji.b bVarQ2 = scheduleScreen.Q2();
                h9h.a aVar2 = bVarQ2 instanceof h9h.a ? (h9h.a) bVarQ2 : null;
                if (aVar2 == null) {
                    phm.a aVar3 = (phm.a) ue0.e.j(scheduleScreen.m2()).a().get(h9h.a.class);
                    b60.a aVar4 = aVar3 != null ? (b60.a) aVar3.get() : null;
                    if (aVar4 == null) {
                        throw new IllegalStateException(a0.d.q("Api ", h9h.a.class, " is not found"));
                    }
                    Object objB = aVar4.b();
                    Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenInjector");
                    aVar2 = (h9h.a) objB;
                }
                h9h.a aVar5 = aVar2.D;
                ScheduleScreenContract$Input scheduleScreenContract$Input = (ScheduleScreenContract$Input) scheduleScreen.G;
                scheduleScreenContract$Input.getClass();
                return new h9h.g(aVar5, scheduleScreen, scheduleScreenContract$Input);
            case 8:
                KProperty[] kPropertyArr3 = AddNoteScreen.f60767b0;
                return (ee1.i) ((ld1.b) ((AddNoteScreen) obj2).Z.getValue()).d.get();
            case 9:
                ((z) obj2).v.f194072c = false;
                return Unit.f186387a;
            case 10:
                return n.a.a((n.a) obj2);
            case 11:
                return Boolean.valueOf(((jte.d) ((com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.d) obj2).A).c(ExternalAccountsApi$FeatureToggle.OutboundPaymentBreakdownApi.f72204c));
            case 12:
                ej8.f fVar = (ej8.f) obj2;
                return new PaymentLinkCustomAmountBundle(fVar.f126779a, fVar.f126780b);
            case 13:
                KProperty[] kPropertyArr4 = ShopsPromptScreen.c0;
                return (ejd.f) ((o) ((ShopsPromptScreen) obj2).X.getValue()).e.get();
            case 14:
                return (ek4.a) ((yj4.a) ((AutoPayExternalAccountFlow) obj2).P.getValue()).f314409c.get();
            case 15:
                z1 z1VarA = q.a(1, 15, ukm.f.DROP_OLDEST);
                fki.b bVarQ22 = ((eki.g) obj2).q2();
                Intrinsics.checkNotNullParameter(bVarQ22, "<this>");
                z1VarA.k(new fki.c(bVarQ22.f135842a, bVarQ22.f135843b, false));
                return z1VarA;
            case 16:
                ((elf.p) obj2).L2(new mii.i("ID_SHOT_DIALOG_COPIED", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, 28));
                return Unit.f186387a;
            case 17:
                c1 c1Var = (c1) obj2;
                yji.n.j2(c1Var, c1Var.L2(new mii.i("COPIED_DIALOG_ID", new TextLocalisedClause(R$string.common_action_copied_to_clipboard, null, null, 14), null, null, 28)), null, null, 7);
                return Unit.f186387a;
            case 18:
                return (cmi.n) obj2;
            case 19:
                return (lg0.b) obj2;
            case 20:
                return (l) obj2;
            case 21:
                k kVar = (k) obj2;
                PlanGiftingRefund planGiftingRefund = kVar.o.f103528b;
                if (planGiftingRefund != null) {
                    kVar.f127690s.x(((qbk.c) kVar.f127691t).a(planGiftingRefund));
                } else {
                    kVar.C2(m.a.f161259a);
                }
                return Unit.f186387a;
            case 22:
                return (en3.a) ((in3.f) ((ContactsChooserFlow) obj2).P.getValue()).f162627b.get();
            case 23:
                return (en7.a) ((h1) ((SmartDrivingFlow) obj2).Q.getValue()).d.get();
            case 24:
                com.revolut.feature.tax_residency.impl.flows.submit.a aVar6 = (com.revolut.feature.tax_residency.impl.flows.submit.a) obj2;
                aVar6.l2(new eif.j(aVar6, Boolean.valueOf(aVar6.O2()), null == true ? 1 : 0, i2), new ei8.d(aVar6, 24));
                return Unit.f186387a;
            case 25:
                KProperty[] kPropertyArr5 = EligibilityScreen.f75585e0;
                y1 y1Var = (y1) ((EligibilityScreen) obj2).Y.getValue();
                switch (y1Var.f247538a) {
                    case 0:
                        return (ep7.h) y1Var.f247543j.get();
                    default:
                        return (ep7.h) y1Var.f247543j.get();
                }
            case 26:
                return (eqf.a) ((lpf.b) ((AdditionalInformationFlow) obj2).P.getValue()).d.get();
            case 27:
                eql.j jVar2 = (eql.j) obj2;
                Intent signInIntent = ((GoogleSignInClient) jVar2.f128506m.f236195b.getValue()).getSignInIntent();
                Intrinsics.checkNotNullExpressionValue(signInIntent, "getSignInIntent(...)");
                jVar2.A2(new ExternalDestination.ByIntent(signInIntent, 1998));
                return Unit.f186387a;
            case 28:
                yki.i iVar = ((com.revolut.feature.salary_switch.impl.ui.flow.a) obj2).f85318t;
                if (iVar.d() == null) {
                    oki.h.D2(iVar);
                }
                return Unit.f186387a;
            default:
                V v = ((ip.a) ue0.e.j(((z70.a) ((t) obj2).f250857a).getContext())).b().k.f197513b.q().get(arl.a.class);
                if (v == 0) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Object objB2 = ((b60.a) ((phm.a) v).get()).b();
                Intrinsics.i(objB2, "null cannot be cast to non-null type com.revolut.testing.recorder.TestRecorderApi");
                return (arl.a) objB2;
        }
    }
}
