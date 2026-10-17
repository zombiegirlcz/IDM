package pch;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.g1;
import ms0.h4;
import od0.i;
import pgb.s;
import pig.p;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234913a;

    public /* synthetic */ f(int i) {
        this.f234913a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f234913a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, false, false, null));
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 2:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (th10 != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return f0.f322471a;
            case 3:
                ((Boolean) obj2).booleanValue();
                i.Companion.getClass();
                return i.f224256b;
            case 4:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return f0.f322471a;
            case 5:
                Function1 defaultErrorItemsProvider2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider2, "defaultErrorItemsProvider");
                return f0.f322471a;
            case 6:
                Function1 defaultErrorItemsProvider3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider3, "defaultErrorItemsProvider");
                return f0.f322471a;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return a.C0570a.f93984a;
            case 8:
                Function1 defaultErrorItemsProvider4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider4, "defaultErrorItemsProvider");
                return f0.f322471a;
            case 9:
                Function1 defaultErrorItemsProvider5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider5, "defaultErrorItemsProvider");
                return f0.f322471a;
            case 10:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                return (List) defaultErrorItem.invoke(new iii.d(14, null, true, false, null));
            case 11:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 12:
                Function1 defaultError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError, "defaultError");
                pf9.g.Companion.getClass();
                f0 menuItems = f0.f322471a;
                int i = R$string.pay_bills_taxes_title;
                Intrinsics.checkNotNullParameter(menuItems, "items");
                Intrinsics.checkNotNullParameter(menuItems, "menuItems");
                List items = (List) defaultError.invoke(new iii.d(12, null, false, true, null));
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(menuItems, "menuItems");
                return new xf9.b(i, items, menuItems, false);
            case 13:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                kha.b domainModel = (kha.b) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(domainModel, "domainModel");
                throw null;
            case 14:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 15:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 16:
                Throwable error3 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (pricingPlanSubscription == null) {
                    return error3;
                }
                return null;
            case 17:
                Throwable th11 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th11;
                }
                return null;
            case 18:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                boolean zA = tj0.a.a((Throwable) obj2);
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("SALARY_HUB_ERROR", new TextLocalisedClause(zA ? com.revolut.kompot.common.R$string.common_offline_state_title : com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_error_generic_title, null, null, 14), zA ? new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14) : null, new ComplexImage.Regular(new GlyphImage(zA ? R$drawable.uikit_icn_24_communication : R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), new l6(12, new TextLocalisedClause(zA ? com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_error_network_primary_cta : com.revolut.feature.retail.salary_account.impl.R$string.salary_account_bottom_sheet_error_generic_primary_cta, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return new s(null, null, u.c(model), 7);
            case 20:
                Throwable error4 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription2 = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (pricingPlanSubscription2 == null) {
                    return error4;
                }
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 22:
                Throwable error5 = (Throwable) obj2;
                g1 g1Var = (g1) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (g1Var == null) {
                    return error5;
                }
                return null;
            case 23:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new p(null, (List) getDefaultErrorItems4.invoke(new iii.d(12, null, true, true, null)), false);
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.TRUE;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 27:
                Function1 defaultError2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultError2, "defaultError");
                return (List) defaultError2.invoke(new iii.d(12, null, true, true, null));
            case 28:
                Throwable th12 = (Throwable) obj2;
                if (((PricingPlanSubscription) obj3) == null) {
                    return th12;
                }
                return null;
            default:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new pj4.i((List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)), null, null);
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f234913a = i;
    }
}
