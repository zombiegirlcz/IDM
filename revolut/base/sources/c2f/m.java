package c2f;

import aw0.n6;
import c7b.q;
import c7i.v;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.cash_topup.impl.ui.flow.delete_barcode.DeleteBarcodeConfirmationFlowContract$Step;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_move_money.impl.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.common.screens.layout_viewer.LayoutViewerScreen;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20780a;

    public /* synthetic */ m(int i) {
        this.f20780a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f20780a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new i((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), new lw0.h(lw0.i.AVATAR));
            case 1:
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(draft, "draft");
                return draft;
            case 2:
                ExchangeOrderDraft previousDraft = (ExchangeOrderDraft) obj2;
                ExchangeOrderDraft currentDraft = (ExchangeOrderDraft) obj3;
                Intrinsics.checkNotNullParameter(previousDraft, "previousDraft");
                Intrinsics.checkNotNullParameter(currentDraft, "currentDraft");
                return Boolean.valueOf(previousDraft.e == currentDraft.e && previousDraft.d == currentDraft.d);
            case 3:
                Boolean fineLocation = (Boolean) obj2;
                Boolean coarseLocation = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(fineLocation, "fineLocation");
                Intrinsics.checkNotNullParameter(coarseLocation, "coarseLocation");
                return Boolean.valueOf(fineLocation.booleanValue() || coarseLocation.booleanValue());
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 5:
                Throwable error = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (bool == null) {
                    return error;
                }
                return null;
            case 6:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 7:
                Throwable th10 = (Throwable) obj2;
                if (((NavBarWithContainerBackground) obj3) == null) {
                    return th10;
                }
                return null;
            case 8:
                Throwable th11 = (Throwable) obj2;
                if (((od0.i) obj3) == null) {
                    return th11;
                }
                return null;
            case 9:
                Throwable error2 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (model == null) {
                    return error2;
                }
                return null;
            case 10:
                Throwable error3 = (Throwable) obj2;
                BaseDraggableWidgetDelegate.Model model2 = (BaseDraggableWidgetDelegate.Model) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (model2 == null) {
                    return error3;
                }
                return null;
            case 11:
                Throwable error4 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (nVar == null) {
                    return error4;
                }
                return null;
            case 12:
                Throwable error5 = (Throwable) obj2;
                mf8.e eVar = (mf8.e) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (eVar == null) {
                    return error5;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 14:
                Data old2 = (Data) obj2;
                Data data = (Data) obj3;
                Intrinsics.checkNotNullParameter(old2, "old");
                Intrinsics.checkNotNullParameter(data, "new");
                Object content = data.getContent();
                Object content2 = old2;
                Object content3 = data;
                if (content != null) {
                    content2 = old2.getContent();
                    content3 = data.getContent();
                }
                return Boolean.valueOf(Intrinsics.f(content2, content3));
            case 15:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null));
            case 16:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new q(null, (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)));
            case 17:
                ((Boolean) obj2).booleanValue();
                Throwable th12 = (Throwable) obj3;
                f0 f0Var = f0.f322471a;
                if (th12 == null) {
                    return f0Var;
                }
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new v(iii.c.b(null, null, 6, false), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.move_money_automation_set_automation_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "MOVE_MONEY_AUTOMATION_CTA_BUTTON_TAG", false, null, null, 972), null, null, 55), null);
            case 19:
                Throwable error6 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (list == null) {
                    return error6;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return iii.c.b(null, null, 6, false);
            case 21:
                Throwable error7 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list2 != null) {
                    return error7;
                }
                return null;
            case 22:
                Throwable error8 = (Throwable) obj2;
                Map map = (Map) obj3;
                Intrinsics.checkNotNullParameter(error8, "error");
                if (map == null) {
                    return error8;
                }
                return null;
            case 23:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(null, "it");
                throw new IllegalStateException("There is no UI states in MetaSsoFlow");
            case 24:
                Throwable error9 = (Throwable) obj2;
                s sVar = (s) obj3;
                Intrinsics.checkNotNullParameter(error9, "error");
                if (sVar == null) {
                    return error9;
                }
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "getDefaultErrorItems");
                f0 f0Var2 = f0.f322471a;
                return new cab.h(f0Var2, cab.n.a(false, false), f0Var2);
            case 26:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 27:
                Throwable error10 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error10, "error");
                if (list3 == null) {
                    return error10;
                }
                return null;
            case 28:
                yki.l FlowCoordinator = (yki.l) obj2;
                DeleteBarcodeConfirmationFlowContract$Step it8 = (DeleteBarcodeConfirmationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                return new LayoutViewerScreen(R$layout.screen_transparent);
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
        }
    }
}
