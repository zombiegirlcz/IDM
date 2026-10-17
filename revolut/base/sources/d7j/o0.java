package d7j;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsWidget;
import com.revolut.feature.revolutpay.order_tracking.impl.R$string;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.zj;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112033a;

    public /* synthetic */ o0(int i) {
        this.f112033a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f112033a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Pair pair = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (pair == null) {
                    return error;
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 2:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Boolean bool = Boolean.FALSE;
                if (zBooleanValue) {
                    return null;
                }
                return bool;
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 4:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 5:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var);
                return null;
            case 6:
                Throwable error3 = (Throwable) obj2;
                CobrandedCardsWidget cobrandedCardsWidget = (CobrandedCardsWidget) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cobrandedCardsWidget == null) {
                    return error3;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 9:
                Throwable error4 = (Throwable) obj2;
                Subaccount subaccount = (Subaccount) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (subaccount != null) {
                    return error4;
                }
                return null;
            case 10:
                Throwable error5 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (list != null) {
                    return error5;
                }
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 12:
                Throwable error6 = (Throwable) obj2;
                Pair pair2 = (Pair) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (pair2 == null) {
                    return error6;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 14:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new da8.j((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_CONTENT_ID", new TextLocalisedClause(R.string.user_details_screen_error_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.SMALL, new TextLocalisedClause(R.string.user_details_screen_error_button, null, null, 14), false, null, null, false, 0, 0, 32708);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model);
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return db.r.f112629a;
            case 18:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, true, false, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("DELIVERIES_ERROR_LIST_ID", new TextLocalisedClause(R$string.revolut_pay_deliveries_error_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_deliveries_error_subtitle, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.revolut_pay_deliveries_error_button, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1856);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model2);
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 22:
                Throwable error7 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list2 == null) {
                    return error7;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return dca.t.a();
            case 24:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(8, null, true, true, "SUBSCRIPTION_DETAILS_ERROR_LIST_ID"));
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            default:
                Throwable th10 = (Throwable) obj2;
                if (((Pair) obj3) == null) {
                    return th10;
                }
                return null;
        }
    }

    public /* synthetic */ o0(cli.n nVar, int i) {
        this.f112033a = i;
    }
}
