package m9d;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_core.models.configuration.Links;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.TransferInPriceUpdateFlowContract$Step;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_price_update.screens.assets_price_update.AssetsPriceUpdateScreenContract$InputData;
import com.revolut.kompot.common.R$string;
import com.revolut.retail.feature.api.AnalyticsAccount;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203719a;

    public /* synthetic */ j1(int i) {
        this.f203719a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f203719a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 1:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, false, true, null));
            case 2:
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return new ma.n((List) errorItems.invoke(new iii.d(14, null, true, false, null)), new ma.m(), null);
            case 3:
                fa1.x first = (fa1.x) obj2;
                fa1.x second = (fa1.x) obj3;
                Intrinsics.checkNotNullParameter(first, "first");
                Intrinsics.checkNotNullParameter(second, "second");
                return Boolean.valueOf(Intrinsics.f(first.b(), second.b()));
            case 4:
                Throwable throwable = (Throwable) obj2;
                Integer retryCount = (Integer) obj3;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Intrinsics.checkNotNullParameter(retryCount, "retryCount");
                return new Pair(throwable, retryCount);
            case 5:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 6:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke(new iii.d(14, null, true, false, null));
            case 7:
                yki.l FlowCoordinator = (yki.l) obj2;
                TransferInPriceUpdateFlowContract$Step step = (TransferInPriceUpdateFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TransferInPriceUpdateFlowContract$Step.AssetPriceUpdate) {
                    return new AssetsPriceUpdateScreen(new AssetsPriceUpdateScreenContract$InputData(((TransferInPriceUpdateFlowContract$Step.AssetPriceUpdate) step).f91609a));
                }
                throw new NoWhenBranchMatchedException();
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((String) obj3, "<unused var>");
                return Unit.f186387a;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new mc6.i(null, zhm.f0.f322471a);
            case 12:
                Throwable error = (Throwable) obj2;
                AnalyticsAccount analyticsAccount = (AnalyticsAccount) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (analyticsAccount == null) {
                    return error;
                }
                return null;
            case 13:
                Throwable error2 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (model == null) {
                    return error2;
                }
                return null;
            case 14:
                ((Boolean) obj2).booleanValue();
                return zhm.f0.f322471a;
            case 15:
                Throwable error3 = (Throwable) obj2;
                i7 i7Var = (i7) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (i7Var == null) {
                    return error3;
                }
                return null;
            case 16:
                Throwable error4 = (Throwable) obj2;
                String str = (String) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (str == null) {
                    return error4;
                }
                return null;
            case 17:
                Function1 mapError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(mapError, "mapError");
                return (List) mapError.invoke(new iii.d(8, null, true, true, "FAVORITE_ERROR_STATE_LIST_ID"));
            case 18:
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                return (List) defaultItems.invoke(new iii.d(14, null, true, false, null));
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 20:
                Throwable th10 = (Throwable) obj2;
                if (((lf8.b) obj3) == null) {
                    return th10;
                }
                return null;
            case 21:
                Throwable th11 = (Throwable) obj2;
                if (((Links) obj3) == null) {
                    return th11;
                }
                return null;
            case 22:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                List list = (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
                yp0.b.k(list, R$attr.uikit_dp72, 0, 0, 0, 30);
                return list;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model2 = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, true, 0, 0, 31684);
                yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model2);
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List listB = iii.c.b(null, null, 6, false);
                yp0.b.k(listB, R$attr.uikit_dp72, 0, 0, 0, 30);
                return listB;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 27:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            default:
                Throwable error5 = (Throwable) obj2;
                String str2 = (String) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (str2 == null) {
                    return error5;
                }
                return null;
        }
    }
}
