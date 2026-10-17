package pdg;

import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.ReviewCardDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.apm.upi.impl.flow.area.screen.UpiAreaScreen;
import com.revolut.feature.pockets.impl.details_v2.qr.AccountQrCodeScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreen;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.root.PriceTargetsFaqRootScreen;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235181a;

    public /* synthetic */ d(int i) {
        this.f235181a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f235181a) {
            case 0:
                KProperty[] kPropertyArr = TravelHotelsPropertyDetailsScreen.i0;
                return new CellDetailsActionDelegate();
            case 1:
                KProperty[] kPropertyArr2 = TravelHotelsPropertyDetailsScreen.i0;
                return new ActionCardDelegate();
            case 2:
                KProperty[] kPropertyArr3 = TravelHotelsPropertyDetailsScreen.i0;
                return new CellDetailsChevronDelegate();
            case 3:
                KProperty[] kPropertyArr4 = TravelHotelsPropertyDetailsScreen.i0;
                return new CellDetailsBadgeDelegate();
            case 4:
                KProperty[] kPropertyArr5 = TravelHotelsPropertyDetailsScreen.i0;
                return new MapDelegate();
            case 5:
                KProperty[] kPropertyArr6 = TravelHotelsPropertyDetailsScreen.i0;
                return new TextDelegate();
            case 6:
                KProperty[] kPropertyArr7 = TravelHotelsPropertyDetailsScreen.i0;
                return new CellDetailsPriceDelegate();
            case 7:
                KProperty[] kPropertyArr8 = TravelHotelsPropertyDetailsScreen.i0;
                return new ReviewCardDelegate();
            case 8:
                KProperty[] kPropertyArr9 = TravelHotelsPropertyDetailsScreen.i0;
                return new LargeActionButtonDelegate();
            case 9:
                KProperty[] kPropertyArr10 = TravelHotelsPropertyDetailsScreen.i0;
                return new CellDetailsDelegate();
            case 10:
                KProperty[] kPropertyArr11 = TravelHotelsPropertyDetailsScreen.i0;
                return new RewardsGridDelegate();
            case 11:
                KProperty[] kPropertyArr12 = TravelHotelsPropertyDetailsScreen.i0;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr13 = TravelHotelsPropertyDetailsScreen.i0;
                return new ListCellDelegate();
            case 13:
                KProperty[] kPropertyArr14 = PriceTargetsFaqRootScreen.c0;
                return new CellDetailsChevronDelegate();
            case 14:
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.core.data.offline_queue.OfflineQueueEntry", p0Var.b(pe0.f.class), new KClass[]{p0Var.b(pe0.e.class)}, new KSerializer[]{pe0.b.f235280a}, new Annotation[0]);
            case 15:
                return j1.b("com.revolut.core.data.offline_queue.OfflineQueueEntry.UpdateCategory.Type", pe0.d.values());
            case 16:
                return new qlm.e(v1.f247718a);
            case 17:
                KProperty[] kPropertyArr15 = AccountQrCodeScreen.f80879e0;
                return new TextDelegate();
            case 18:
                KProperty[] kPropertyArr16 = AccountQrCodeScreen.f80879e0;
                return new SmallActionButtonDelegate();
            case 19:
                KProperty[] kPropertyArr17 = UpiAreaScreen.X;
                return new FullScreenStateDelegate();
            case 20:
                KProperty[] kPropertyArr18 = UpiAreaScreen.X;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr19 = UpiAreaScreen.X;
                return new ActionsDelegate();
            case 22:
                KProperty[] kPropertyArr20 = UpiAreaScreen.X;
                return new RowsWidgetDelegate();
            case 23:
                KProperty[] kPropertyArr21 = UpiAreaScreen.X;
                return new PaymentLinkWidgetDelegate();
            case 24:
                KProperty[] kPropertyArr22 = UpiAreaScreen.X;
                return new ContactsWidgetDelegate();
            case 25:
                return new qlm.e(qo6.j.f248062a);
            case 26:
                return new qlm.e(v1.f247718a);
            case 27:
                return new qlm.e(pf6.t.f235496a);
            case 28:
                return new qlm.e(pf6.w.f235499a);
            default:
                return new qlm.e(v1.f247718a);
        }
    }
}
