package y13;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanAdditionalValue;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanDashboard;
import ip0.pb0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import q35.z;
import rd0.d;
import x15.q;
import y2e.t;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310281a;

    public /* synthetic */ a(int i) {
        this.f310281a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        switch (this.f310281a) {
            case 0:
                Throwable th10 = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                if (th10 != null) {
                    throw th10;
                }
                throw new IllegalArgumentException("Card requests not found");
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 2:
                Throwable error = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (pricingPlanSubscription == null) {
                    return error;
                }
                return null;
            case 3:
                Throwable error2 = (Throwable) obj2;
                q qVar = (q) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (qVar == null) {
                    return error2;
                }
                return null;
            case 4:
                Throwable error3 = (Throwable) obj2;
                q qVar2 = (q) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (qVar2 == null) {
                    return error3;
                }
                return null;
            case 5:
                Throwable error4 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error4, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                d.a(rd0.c.ERROR, null, null, error4, h0Var);
                return null;
            case 6:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 9:
                Throwable illegalStateException = (Throwable) obj2;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                if (illegalStateException == null) {
                    illegalStateException = new IllegalStateException("Error object was null when mapping error state");
                }
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 10:
                ImageTransformations imageTransformations = t.f310660a;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model modelB = t.b("ERROR_STATE_GENERAL_ITEM_ID");
                yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
                return u.c(modelB);
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listK = v.k(y43.b.c(), new pb0("LIST_ID_CARD_PAYMENT_METHOD_WIDGET_LOADING"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 14:
                Throwable error6 = (Throwable) obj2;
                z zVar = (z) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (zVar == null) {
                    return error6;
                }
                return null;
            case 15:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, false, false, null));
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 17:
                Function1 defaultErrorItemsAccessor = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsAccessor, "defaultErrorItemsAccessor");
                return (List) defaultErrorItemsAccessor.invoke(new iii.d(14, null, false, false, null));
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, true);
            case 20:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(10, null, false, false, "RATINGS_CONTENT_ERROR"));
            case 21:
                Throwable error7 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (model == null) {
                    return error7;
                }
                return null;
            case 22:
                Throwable error8 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (model2 == null) {
                    return error8;
                }
                return null;
            case 23:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Pair) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((CobrandedCardsPlanAdditionalValue) obj3, "<unused var>");
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((CobrandedCardsPlanAdditionalValue) obj3, "<unused var>");
                return Unit.f186387a;
            case 27:
                Intrinsics.checkNotNullParameter((i) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((CobrandedCardsPlanDashboard) obj3, "<unused var>");
                return Unit.f186387a;
            case 28:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((CobrandedCardsPlanDashboard) obj3, "<unused var>");
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f310281a = i;
    }
}
