package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Benefit;
import com.revolut.feature.insurance_car.impl.data.model.Contact;
import com.revolut.feature.insurance_car.impl.data.model.Descriptor;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.MotorPlanSelectorScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection.a;
import com.revolut.feature.insurance_common.data.model.Document;
import java.io.IOException;
import java.time.YearMonth;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jki.g;
import jki.p;
import k7c.l0;
import kl7.g1;
import kl7.k1;
import kl7.p0;
import kl7.t0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kp7.j;
import kp7.n;
import kp7.w;
import ll7.u;
import sl7.h;
import w4l.i;
import w4l.k;
import yji.l;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends g implements n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MotorPlanSelectorScreenContract$InputData f75613p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f75614q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f75615r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f75616s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vn7.a f75617t;
    public final l80.e u;
    public final j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p stateMapper, MotorPlanSelectorScreenContract$InputData inputData, u planRepository, w premiumUpgradeHelper, j60.a bottomExpandableDialogExtension, vn7.a hintPopupFactory, l80.e dateProvider) {
        boolean z;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planRepository, "planRepository");
        Intrinsics.checkNotNullParameter(premiumUpgradeHelper, "premiumUpgradeHelper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f75613p = inputData;
        this.f75614q = planRepository;
        this.f75615r = premiumUpgradeHelper;
        this.f75616s = bottomExpandableDialogExtension;
        this.f75617t = hintPopupFactory;
        this.u = dateProvider;
        Data data = new Data(null, null, true, 3, null);
        Map mapG = r0.g();
        Map mapG2 = r0.g();
        YearMonth yearMonthFrom = YearMonth.from(((l80.f) dateProvider).e().plusMonths(1L));
        Intrinsics.checkNotNullExpressionValue(yearMonthFrom, "from(...)");
        boolean z3 = inputData instanceof MotorPlanSelectorScreenContract$InputData.RenewalPolicy;
        if (inputData instanceof MotorPlanSelectorScreenContract$InputData.Application) {
            z = ((MotorPlanSelectorScreenContract$InputData.Application) inputData).f75608c;
        } else {
            if (!z3) {
                throw new NoWhenBranchMatchedException();
            }
            z = ((MotorPlanSelectorScreenContract$InputData.RenewalPolicy) inputData).f75610b.f75171j;
        }
        this.v = new j(data, null, mapG, mapG2, yearMonthFrom, z3, z);
    }

    public final void A2(k loadingStrategy) {
        vkm.d dVarB;
        MotorPlanSelectorScreenContract$InputData motorPlanSelectorScreenContract$InputData = this.f75613p;
        boolean z = motorPlanSelectorScreenContract$InputData instanceof MotorPlanSelectorScreenContract$InputData.Application;
        u uVar = this.f75614q;
        if (z) {
            String applicationFormId = ((MotorPlanSelectorScreenContract$InputData.Application) motorPlanSelectorScreenContract$InputData).f75606a;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            dVarB = uVar.d.b(applicationFormId, loadingStrategy);
        } else {
            if (!(motorPlanSelectorScreenContract$InputData instanceof MotorPlanSelectorScreenContract$InputData.RenewalPolicy)) {
                throw new NoWhenBranchMatchedException();
            }
            String applicationFormId2 = ((MotorPlanSelectorScreenContract$InputData.RenewalPolicy) motorPlanSelectorScreenContract$InputData).f75610b.f75166a;
            uVar.getClass();
            Intrinsics.checkNotNullParameter(applicationFormId2, "applicationFormId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            dVarB = uVar.d.b(applicationFormId2, loadingStrategy);
        }
        l.a1(this, dVarB, null, null, new kae.d(this, null, 23), 3);
    }

    public final g1 B2() throws IOException {
        List list;
        List list2;
        Object next;
        k1 k1Var = (k1) ((j) t2()).f188177a.getContent();
        String strK0 = null;
        if (k1Var != null && (list2 = k1Var.f185350b) != null) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((g1) next).f185319a, ((j) t2()).f188178b)) {
                    break;
                }
            }
            g1 g1Var = (g1) next;
            if (g1Var != null) {
                return g1Var;
            }
        }
        String str = ((j) t2()).f188178b;
        k1 k1Var2 = (k1) ((j) t2()).f188177a.getContent();
        if (k1Var2 != null && (list = k1Var2.f185350b) != null) {
            strK0 = d0.k0(list, null, null, null, 0, new knd.a(26), 31);
        }
        throw new IllegalStateException(a0.d.s("plan ", str, " not found, plans: ", strK0).toString());
    }

    @Override // yji.l
    public final void I1() {
        A2(i.f294643c);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.v;
    }

    public final void y2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj2 instanceof Contact) {
            C1(sl7.b.c((Contact) obj2));
            return;
        }
        if (!(obj2 instanceof Document)) {
            if (Intrinsics.f(id10, "start_date_in_past")) {
                v2(a.C0505a.f75611a);
                return;
            } else {
                if (((j) t2()).f188177a.getLoading()) {
                    return;
                }
                A2(i.f294643c);
                return;
            }
        }
        rr7.c cVarA = rr7.e.a((Document) obj2);
        if (cVarA instanceof rr7.a) {
            C1(((rr7.a) cVarA).f256732a);
        } else {
            if (!(cVarA instanceof rr7.b)) {
                throw new NoWhenBranchMatchedException();
            }
            A1(new kb7.c(this, (rr7.b) cVarA, null, 29), new yi5.b(25));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void z2(Object obj2, String id10) throws IOException {
        Intrinsics.checkNotNullParameter(id10, "id");
        if (obj2 instanceof p0) {
            C1(sl7.c.a(((p0) obj2).f185371a));
        }
        if (obj2 instanceof Benefit) {
            v2(new kp7.k((Benefit) obj2));
            return;
        }
        boolean z = obj2 instanceof Descriptor.Details;
        vn7.a aVar = this.f75617t;
        j60.a aVar2 = this.f75616s;
        if (z) {
            Descriptor.Details details = (Descriptor.Details) obj2;
            aVar2.x(vn7.a.e(aVar, details.f75203a, details.f75204b));
            return;
        }
        if (obj2 instanceof t0) {
            t0 t0Var = (t0) obj2;
            aVar2.x(vn7.a.e(aVar, t0Var.f185388a, t0Var.f185389b));
            return;
        }
        if (obj2 == null) {
            switch (id10.hashCode()) {
                case -1881000884:
                    if (id10.equals("monthly_payment_unavailable_button")) {
                        aVar2.x(vn7.a.d(this.f75617t, R$string.car_insurance_plan_detail_popup_monthly_payment_disabled_title, R$string.car_insurance_plan_detail_popup_monthly_payment_disabled_description, null, null, null, 124));
                        break;
                    }
                    break;
                case -1161055319:
                    if (id10.equals("PRIVACY_POLICY_ITEM")) {
                        C1(h.a.f264158a.b());
                        break;
                    }
                    break;
                case -873354782:
                    if (id10.equals("key_smart_driving_toggle")) {
                        g1 g1VarB2 = B2();
                        if (g1VarB2.e == null) {
                            aVar2.x(vn7.a.d(this.f75617t, R$string.car_insurance_plan_detail_popup_smart_driving_missing_title, R$string.car_insurance_plan_detail_popup_smart_driving_missing_description, null, null, null, 124));
                        } else if (g1VarB2.d == null) {
                            aVar2.x(vn7.a.d(this.f75617t, R$string.car_insurance_plan_detail_popup_smart_driving_required_title, R$string.car_insurance_plan_detail_popup_smart_driving_required_description, null, null, null, 124));
                        }
                        break;
                    }
                    break;
                case -81087357:
                    if (id10.equals("PREMIUM_UPGRADE_BANNER_ID")) {
                        w wVar = this.f75615r;
                        wVar.getClass();
                        wVar.T2(new l0(wVar, null, 23), new yi5.b(27));
                        break;
                    }
                    break;
                case 568448930:
                    if (id10.equals("TERMS_OF_BUSINESS_ITEM")) {
                        C1(h.c.f264160a.b());
                        break;
                    }
                    break;
                case 835927866:
                    if (id10.equals("annual_payment_unavailable_button")) {
                        aVar2.x(vn7.a.d(this.f75617t, R$string.car_insurance_plan_detail_popup_annual_payment_disabled_title, R$string.car_insurance_plan_detail_popup_annual_payment_disabled_description, null, null, null, 124));
                        break;
                    }
                    break;
                case 1627420809:
                    if (id10.equals("AIG_PRIVACY_POLICY_ITEM")) {
                        C1(h.b.f264159a.b());
                        break;
                    }
                    break;
                case 1845683841:
                    if (id10.equals("monthly_payment_radio_button")) {
                        x2(new gae.a((Object) this, false, 27));
                        break;
                    }
                    break;
                case 1889156079:
                    if (id10.equals("annual_payment_radio_button")) {
                        x2(new gae.a((Object) this, true, 27));
                        break;
                    }
                    break;
            }
        }
    }
}
