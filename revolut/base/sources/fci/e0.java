package fci;

import bfh.e;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.pricingplans.models.family.FamilyPlanState;
import com.revolut.feature_travel_hotels_models.amenity.HotelsAmenity;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133773a;

    public /* synthetic */ e0(int i) {
        this.f133773a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f133773a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                StaggeredGridItemDelegate.Companion aVar = StaggeredGridItemDelegate.INSTANCE;
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                aVar.getClass();
                return new x0(StaggeredGridItemDelegate.Companion.b(list), false, null, null);
            case 1:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 2:
                oei.b category = (oei.b) obj3;
                Intrinsics.checkNotNullParameter((HotelsAmenity) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(category, "category");
                return Boolean.valueOf(category == oei.b.FOOD_AND_DRINK);
            case 3:
                oei.b category2 = (oei.b) obj3;
                Intrinsics.checkNotNullParameter((HotelsAmenity) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(category2, "category");
                return Boolean.valueOf(category2 != oei.b.FOOD_AND_DRINK);
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return new ff4.s(zhm.u.c(new FullScreenStateDelegate.Model("ID_ERROR_ITEM", new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32596)), ff4.e0.a(""), null, null, null, null, null, null, null, false, false, null, null, 6684);
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return e.b.f14988a;
            case 6:
                Throwable error = (Throwable) obj2;
                FamilyPlanState familyPlanState = (FamilyPlanState) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (familyPlanState == null) {
                    return error;
                }
                return null;
            case 7:
                Throwable error2 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pricingPlanSubscription == null) {
                    return error2;
                }
                return null;
            case 8:
                Throwable error3 = (Throwable) obj2;
                hha.d dVar = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar == null) {
                    return error3;
                }
                return null;
            case 9:
                Throwable error4 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription2 = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (pricingPlanSubscription2 == null) {
                    return error4;
                }
                return null;
            case 10:
                Throwable error5 = (Throwable) obj2;
                hha.d dVar2 = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (dVar2 == null) {
                    return error5;
                }
                return null;
            case 11:
                Throwable error6 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list2 == null) {
                    return error6;
                }
                return null;
            case 12:
                Throwable error7 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list3 == null) {
                    return error7;
                }
                return null;
            case 13:
                Throwable error8 = (Throwable) obj2;
                hha.d dVar3 = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (dVar3 == null) {
                    return error8;
                }
                return null;
            case 14:
                Throwable error9 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription3 = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (pricingPlanSubscription3 == null) {
                    return error9;
                }
                return null;
            case 15:
                Throwable error10 = (Throwable) obj2;
                Optional optional = (Optional) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (optional == null) {
                    return error10;
                }
                return null;
            case 16:
                Throwable error11 = (Throwable) obj2;
                psg.a aVar2 = (psg.a) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (aVar2 == null) {
                    return error11;
                }
                return null;
            case 17:
                Throwable error12 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error12, "error");
                if (cVar == null) {
                    return error12;
                }
                return null;
            case 18:
                Throwable error13 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error13, "error");
                if (list4 == null) {
                    return error13;
                }
                return null;
            case 19:
                Throwable error14 = (Throwable) obj2;
                fo3.c cVar2 = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error14, "error");
                if (cVar2 == null) {
                    return error14;
                }
                return null;
            case 20:
                Throwable error15 = (Throwable) obj2;
                lf8.c cVar3 = (lf8.c) obj3;
                Intrinsics.checkNotNullParameter(error15, "error");
                if (cVar3 == null) {
                    return error15;
                }
                return null;
            case 21:
                Throwable error16 = (Throwable) obj2;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj3;
                Intrinsics.checkNotNullParameter(error16, "error");
                if (juniorBankingProfile == null) {
                    return error16;
                }
                return null;
            case 22:
                Throwable error17 = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(error17, "error");
                if (list5 == null) {
                    return error17;
                }
                return null;
            case 23:
                Throwable error18 = (Throwable) obj2;
                od0.i iVar = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(error18, "error");
                if (iVar == null) {
                    return error18;
                }
                return null;
            case 24:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return "";
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Throwable th10 = (Throwable) obj2;
                if (((Map) obj3) == null) {
                    return th10;
                }
                return null;
            case 27:
                Throwable error19 = (Throwable) obj2;
                List list6 = (List) obj3;
                Intrinsics.checkNotNullParameter(error19, "error");
                if (list6 == null) {
                    return error19;
                }
                return null;
            case 28:
                Throwable error20 = (Throwable) obj2;
                of8.b bVar = (of8.b) obj3;
                Intrinsics.checkNotNullParameter(error20, "error");
                if (bVar == null) {
                    return error20;
                }
                return null;
            default:
                Throwable error21 = (Throwable) obj2;
                List list7 = (List) obj3;
                Intrinsics.checkNotNullParameter(error21, "error");
                if (list7 == null) {
                    return error21;
                }
                return null;
        }
    }

    public /* synthetic */ e0(ff4.e0 e0Var) {
        this.f133773a = 4;
    }
}
