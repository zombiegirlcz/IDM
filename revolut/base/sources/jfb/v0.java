package jfb;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173843a;

    public /* synthetic */ v0(int i) {
        this.f173843a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f173843a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return com.revolut.feature.retail.reverywhere.impl.web_app.e.a("REVERYWHERE_APP_TOKEN_ERROR_STATE_ID");
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 3:
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                return e;
            case 4:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (obj3 == null) {
                    return error;
                }
                return null;
            case 5:
                Throwable error2 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pricingPlanSubscription == null) {
                    return error2;
                }
                return null;
            case 6:
                Throwable error3 = (Throwable) obj2;
                hha.d dVar = (hha.d) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (dVar == null) {
                    return error3;
                }
                return null;
            case 7:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Boolean bool = Boolean.FALSE;
                if (zBooleanValue) {
                    return null;
                }
                return bool;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 9:
                Throwable error4 = (Throwable) obj2;
                yh5.a aVar = (yh5.a) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (aVar == null) {
                    return error4;
                }
                return null;
            case 10:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(6, fi7.g.f135320a, true, false, null));
            case 11:
                Boolean fineLocation = (Boolean) obj2;
                Boolean coarseLocation = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(fineLocation, "fineLocation");
                Intrinsics.checkNotNullParameter(coarseLocation, "coarseLocation");
                return Boolean.valueOf(fineLocation.booleanValue() || coarseLocation.booleanValue());
            case 12:
                Throwable error5 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list == null) {
                    return error5;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 14:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return (List) errorItems.invoke(new iii.d(12, null, true, true, null));
            case 15:
                Throwable error6 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription2 = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (pricingPlanSubscription2 == null) {
                    return error6;
                }
                return null;
            case 16:
                Throwable error7 = (Throwable) obj2;
                ggk.a aVar2 = (ggk.a) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (aVar2 == null) {
                    return error7;
                }
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return jj9.e.f174787a;
            case 18:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, false, true, null));
            case 19:
                Throwable error8 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (model == null) {
                    return error8;
                }
                return null;
            case 20:
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke(new iii.d(14, null, false, false, null));
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new lw0.a(new TextLocalisedClause(R$string.wealth_invest_currency_changer_title, null, null, 14), null, null, null, false, 30);
            case 22:
                Throwable error9 = (Throwable) obj2;
                CardOwner cardOwner = (CardOwner) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (cardOwner == null) {
                    return error9;
                }
                return null;
            case 23:
                ((Boolean) obj2).booleanValue();
                return Unit.f186387a;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                int iIntValue = ((Integer) obj2).intValue();
                char cCharValue = ((Character) obj3).charValue();
                return Character.valueOf(iIntValue == 0 ? Character.toUpperCase(cCharValue) : Character.toLowerCase(cCharValue));
            case 26:
                Throwable error10 = (Throwable) obj2;
                alc.n nVar = (alc.n) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (nVar == null) {
                    return error10;
                }
                return null;
            case 27:
                Throwable error11 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error11, "error");
                if (list2 == null) {
                    return error11;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new jme.b(new com.revolut.core.ui_kit.views.navbar.w(zhm.f0.f322471a));
            default:
                Throwable illegalStateException = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                if (illegalStateException == null) {
                    illegalStateException = new IllegalStateException("mapState error");
                }
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "MediaHeaderPlacementStateMapper", null, illegalStateException, h0Var);
                return new com.revolut.core.ui_kit.views.navbar.w(zhm.f0.f322471a);
        }
    }
}
