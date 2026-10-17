package v78;

import aw0.n6;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_tax_rate.NewTaxRateScreen;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import do3.n;
import ip0.zj;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ms0.h4;
import nel.o;
import od0.i;
import v7f.f;
import vch.x;
import ve4.p;
import ve4.r;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286572a;

    public /* synthetic */ d(int i) {
        this.f286572a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f286572a) {
            case 0:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 1:
                Function1 getErrorItems = (Function1) obj3;
                f.a aVar = v7f.f.Companion;
                Intrinsics.checkNotNullParameter(getErrorItems, "getErrorItems");
                return (List) getErrorItems.invoke(new iii.d(2, "DrawdownControllerExtensionContract", true, false, "DrawdownControllerExtensionContract"));
            case 2:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "e");
                return null;
            case 3:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 5:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                    return error2;
                }
                return null;
            case 6:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
            case 7:
                Throwable error3 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (bool == null) {
                    return error3;
                }
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new n6(new TextLocalisedClause(R$string.subscriptions_payment_balance_picker_cta, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 988);
            case 9:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 10:
                Throwable error4 = (Throwable) obj2;
                wbc.a aVar2 = (wbc.a) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (aVar2 == null) {
                    return error4;
                }
                return null;
            case 11:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return new vc2.c((List) getDefaultErrorItems5.invoke(new iii.d(14, null, true, false, null)), f0.f322471a);
            case 12:
                Throwable error5 = (Throwable) obj2;
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (pricingPlanSubscription == null) {
                    return error5;
                }
                return null;
            case 13:
                Throwable error6 = (Throwable) obj2;
                Boolean bool2 = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (bool2 == null) {
                    return error6;
                }
                return null;
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return x.f287741a;
            case 17:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Unit.f186387a;
            case 20:
                ((Boolean) obj2).booleanValue();
                i.Companion.getClass();
                return i.f224256b;
            case 21:
                Throwable th10 = (Throwable) obj2;
                if (((Set) obj3) == null) {
                    return th10;
                }
                return null;
            case 22:
                Throwable error7 = (Throwable) obj2;
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (nVar == null) {
                    return error7;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_ITEM_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1860);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return u.c(model);
            case 24:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                o drawdown = (o) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(drawdown, "drawdown");
                throw null;
            case 25:
                Throwable error8 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (list3 == null) {
                    return error8;
                }
                return null;
            case 26:
                Throwable error9 = (Throwable) obj2;
                List list4 = (List) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (list4 == null) {
                    return error9;
                }
                return null;
            case 27:
                Throwable e = (Throwable) obj2;
                List list5 = (List) obj3;
                Intrinsics.checkNotNullParameter(e, "e");
                if (list5 != null || (e instanceof IllegalArgumentException)) {
                    return null;
                }
                return e;
            case 28:
                InputTextDelegate.Model model2 = (InputTextDelegate.Model) obj2;
                InputText field = (InputText) obj3;
                KProperty[] kPropertyArr = NewTaxRateScreen.f60815b0;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj4 = model2.P;
                if (!(obj4 instanceof od1.a)) {
                    return null;
                }
                od1.a aVar3 = (od1.a) obj4;
                return new zp0.d(field.getInnerEditText(), aVar3.f224260b, new u80.d(aVar3.f224259a), null, null, false, false, 0, false, null, 1848);
            default:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new r((List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null)), p.a.f288124a, null);
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f286572a = i;
    }
}
