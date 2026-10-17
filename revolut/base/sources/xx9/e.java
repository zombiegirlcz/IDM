package xx9;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature_crypto_order_flow.api.R$string;
import com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.OrderTypeDialogContract$TpslInfoStep;
import grl.k9;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pzd.x;
import vf0.y;
import zw7.d0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309415a;

    public /* synthetic */ e(int i) {
        this.f309415a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f309415a) {
            case 0:
                ((Boolean) obj2).booleanValue();
                break;
            case 1:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                }
                break;
            case 2:
                ((Boolean) obj2).booleanValue();
                break;
            case 3:
                ((Boolean) obj2).booleanValue();
                break;
            case 4:
                ((Boolean) obj2).getClass();
                mq9.e.Companion.getClass();
                break;
            case 5:
                ((Boolean) obj2).booleanValue();
                break;
            case 6:
                ((Boolean) obj2).booleanValue();
                break;
            case 7:
                Throwable error2 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list2 == null) {
                }
                break;
            case 8:
                ((Boolean) obj2).booleanValue();
                break;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                break;
            case 10:
                ((Boolean) obj2).booleanValue();
                break;
            case 11:
                ((Boolean) obj2).booleanValue();
                break;
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                break;
            case 13:
                Throwable error3 = (Throwable) obj2;
                y yVar = (y) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (yVar == null) {
                }
                break;
            case 14:
                Throwable error4 = (Throwable) obj2;
                y yVar2 = (y) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (yVar2 == null) {
                }
                break;
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 16:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                break;
            case 17:
                Throwable error5 = (Throwable) obj2;
                d0 d0Var = (d0) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (d0Var == null) {
                }
                break;
            case 18:
                Throwable error6 = (Throwable) obj2;
                xy7.d dVar = (xy7.d) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (dVar == null) {
                }
                break;
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            case 23:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                OrderTypeDialogContract$TpslInfoStep it8 = (OrderTypeDialogContract$TpslInfoStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.cryptobuysell_orders_tpsl_buy, null, null, 14), new TextLocalisedClause(R$string.fx_orders_take_profit_stop_loss_chart_info_subtitle, null, null, 14), null, null, false, 28);
                aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.cryptobuysell_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
                k9 k9Var = k9.Crypto;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                break;
            case 24:
                Throwable error7 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (list3 == null) {
                }
                break;
            case 25:
                Throwable th10 = (Throwable) obj2;
                if (((x) obj3) == null) {
                }
                break;
            case 26:
                Function1 defaultErrorItem = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItem, "defaultErrorItem");
                break;
            case 27:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                break;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                break;
        }
        return null;
    }

    public /* synthetic */ e(cli.n nVar, int i) {
        this.f309415a = i;
    }
}
