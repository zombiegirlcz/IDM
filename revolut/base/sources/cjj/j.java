package cjj;

import alc.k;
import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.impl.ui.cfac.claim.reason_group.CFACInsuranceReasonGroupScreen;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.robo.api.navigation.RoboFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.features.PlanFeatureResource;
import ip0.fm;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.x10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qv0.p;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24697a;

    public /* synthetic */ j(int i) {
        this.f24697a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f24697a;
        cmc.j jVar = cmc.j.f25211a;
        int i2 = 0;
        switch (i) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                pb0 pb0VarA = nb0.a(pb0.Companion, "ID_RANDOM_OPTION_LOADING", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                List listK = v.k(pb0VarA, new gu("ID_PLAN_FEATURES_LOADING", 0, 0, 30));
                List listK2 = v.k(new s7("ID_INCOMING_CALLS_LOADING", 0, 0, 0, 0, false, null, 126), new s7("ID_INCOMING_TEXTS_LOADING", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                ArrayList arrayListE0 = d0.E0(listK2, listK);
                s7 s7Var = new s7("ID_ADDON_PRICE_LOADING", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return new h(d0.F0(s7Var, arrayListE0), false);
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new lw0.h(lw0.i.TITLE_SUBTITLE);
            case 2:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ck2.h.a();
            case 3:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                n6.Companion.getClass();
                return new aw0.e(false, null, null, m6.a(), null, null, 55);
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 5:
                CellDetailsChevronDelegate.Model it12 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr = CFACInsuranceReasonGroupScreen.c0;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj3 = it12.e;
                if (obj3 instanceof CFACCancellationReason) {
                    return (CFACCancellationReason) obj3;
                }
                return null;
            case 6:
                PlanFeatureResource resource = (PlanFeatureResource) obj2;
                Intrinsics.checkNotNullParameter(resource, "resource");
                return resource;
            case 7:
                cld.a update = (cld.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return cld.a.a(update, null, 1);
            case 8:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return f0.f322471a;
            case 9:
                Object f52946g = ((p) obj2).getF55862c();
                if (f52946g instanceof vke.c) {
                    return (vke.c) f52946g;
                }
                return null;
            case 10:
                BannerDelegate.Model it14 = (BannerDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj4 = it14.k;
                if (obj4 instanceof vke.c) {
                    return (vke.c) obj4;
                }
                return null;
            case 11:
                x10 it15 = (x10) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj5 = it15.f167082b.f58324n;
                if (obj5 instanceof cle.e) {
                    return (cle.e) obj5;
                }
                return null;
            case 12:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Data(f0.f322471a, null, true, 2, null);
            case 13:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new Data(f0.f322471a, null, true, 2, null);
            case 14:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new Data(f0.f322471a, null, true, 2, null);
            case 15:
                iha.c it19 = (iha.c) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(it19.f161316a.contains(iha.a.UNHAPPY_WITH_PLAN_CHANGES));
            case 16:
                PricingPlanSubscription subscription = (PricingPlanSubscription) obj2;
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                String str = subscription.f81131c;
                if (str != null) {
                    return str;
                }
                throw new IllegalStateException("billing cycle id not found");
            case 17:
                return cll.e.a((cll.e) obj2, false, null, 2);
            case 18:
                return cll.e.a((cll.e) obj2, true, null, 2);
            case 19:
                Unit it20 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.TRUE;
            case 20:
                Function0 it21 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                fm fmVar = new fm("ID_ENABLE_PAY_WITH_SMILE_BANNER_LOADING");
                yp0.b.l(fmVar, 0, 0, 0, 0, null, false, 63);
                return fmVar;
            case 21:
                Function0 it22 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                pb0 pb0Var = new pb0("ID_PAY_WITH_SMILE_SETTINGS_ROW_LOADING");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                return pb0Var;
            case 22:
                NaviCommand it23 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return new cmc.i(it23);
            case 23:
                FeatureCommand it24 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return new cmc.i(it24);
            case 24:
                FeatureCommand it25 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return new cmc.i(it25);
            case 25:
                k onboardingStatus = (k) obj2;
                Intrinsics.checkNotNullParameter(onboardingStatus, "onboardingStatus");
                k kVar = k.FAILED;
                if (onboardingStatus != kVar) {
                    return efm.d0.m(jVar);
                }
                Intrinsics.checkNotNullParameter(onboardingStatus, "onboardingStatus");
                ufm.b bVarM = efm.d0.m(onboardingStatus == kVar ? vhi.c.c(RoboFeatureConfig.OnboardingFailedPromptDestination.f85058a, yhi.b.POPUP, null, false, 12) : new FeatureCommand(gmc.a.a()));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return new ufm.i(bVarM, new cmc.d(new cmc.c(i2), 1), 1);
            case 26:
                k onboardingStatus2 = (k) obj2;
                Intrinsics.checkNotNullParameter(onboardingStatus2, "onboardingStatus");
                k kVar2 = k.PENDING;
                if (onboardingStatus2 != kVar2) {
                    return efm.d0.m(jVar);
                }
                Intrinsics.checkNotNullParameter(onboardingStatus2, "onboardingStatus");
                ufm.b bVarM2 = efm.d0.m(onboardingStatus2 == kVar2 ? vhi.c.c(RoboFeatureConfig.PreonboardingTopupCancelledPromptDestination.f85061a, yhi.b.POPUP, null, false, 12) : gc0.c.f(gmc.a.a()));
                Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
                int i3 = 29;
                return new ufm.i(bVarM2, new ch6.d(new j(i3), i3), 1);
            case 27:
                FeatureCommand it26 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return new cmc.i(it26);
            case 28:
                FeatureCommand it27 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return new cmc.i(it27);
            default:
                NaviCommand it28 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                return new cmc.i(it28);
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f24697a = i;
    }
}
