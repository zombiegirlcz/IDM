package ob1;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreen;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.ProductDetailsWidget;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreen;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.details.DetailsStepFragment;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Regex;
import odi.b;
import qlm.j1;
import yhm.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223846a;

    public /* synthetic */ e(int i) {
        this.f223846a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        switch (this.f223846a) {
            case 0:
                KProperty[] kPropertyArr = CardReaderProductDetailsScreen.f60604e0;
                CardReaderProductDetailsScreenContract$ProductDetailsWidgetType[] cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArrValues = CardReaderProductDetailsScreenContract$ProductDetailsWidgetType.values();
                ArrayList arrayList = new ArrayList(cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArrValues.length);
                for (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType widgetType : cardReaderProductDetailsScreenContract$ProductDetailsWidgetTypeArrValues) {
                    Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                    arrayList.add(new ProductDetailsWidget(widgetType));
                }
                return arrayList;
            case 1:
                KProperty[] kPropertyArr2 = CardReaderProductDetailsScreen.f60604e0;
                return new FullScreenStateDelegate();
            case 2:
                KProperty[] kPropertyArr3 = PixQrCodeAddressScreen.S;
                return new CellDetailsNoteDelegate();
            case 3:
                KProperty[] kPropertyArr4 = PixQrCodeAddressScreen.S;
                return new LargeActionButtonDelegate();
            case 4:
                QesTermsScreen.Companion aVar = QesTermsScreen.INSTANCE;
                return new ListCellDelegate();
            case 5:
                QesTermsScreen.Companion aVar2 = QesTermsScreen.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 6:
                QesTermsScreen.Companion aVar3 = QesTermsScreen.INSTANCE;
                return new FullScreenStateDelegate();
            case 7:
                QesTermsScreen.Companion aVar4 = QesTermsScreen.INSTANCE;
                return new RowLoadingDelegate();
            case 8:
                QesTermsScreen.Companion aVar5 = QesTermsScreen.INSTANCE;
                return new InputChecklistDelegate();
            case 9:
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = Class.forName("com.revolut.instrumentation_test_core.libs.mock.network.aclient.InstrumentationTestInterceptor");
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                boolean z = objA instanceof yhm.n;
                boolean z3 = !z;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "ByClassTestEnvironmentDetector", "Test environment marker 'com.revolut.instrumentation_test_core.libs.mock.network.aclient.InstrumentationTestInterceptor' ".concat(!z ? "found" : "not found"), null, null, 16);
                return Boolean.valueOf(z3);
            case 10:
                KProperty[] kPropertyArr5 = CashbackProductScreen.i0;
                return new ListSubheaderDelegate();
            case 11:
                KProperty[] kPropertyArr6 = CashbackProductScreen.i0;
                return new VaultsProgressDelegate();
            case 12:
                KProperty[] kPropertyArr7 = CashbackProductScreen.i0;
                return new CellDetailsChevronDelegate();
            case 13:
                KProperty[] kPropertyArr8 = CashbackProductScreen.i0;
                return new CellDetailsDelegate();
            case 14:
                KProperty[] kPropertyArr9 = CashbackProductScreen.i0;
                return new LargeActionButtonDelegate();
            case 15:
                KProperty[] kPropertyArr10 = CashbackProductScreen.i0;
                return new PlainTextWarningDelegate();
            case 16:
                KProperty[] kPropertyArr11 = CashbackProductScreen.i0;
                return new TextDelegate();
            case 17:
                KProperty[] kPropertyArr12 = CashbackProductScreen.i0;
                return new RowDelegate(null, null, 7);
            case 18:
                b.a.Companion c1247b = b.a.INSTANCE;
                return ddi.e.Companion.serializer();
            case 19:
                b.C1248b.Companion c1249b = b.C1248b.INSTANCE;
                return ddi.e.Companion.serializer();
            case 20:
                KProperty[] kPropertyArr13 = DetailsStepFragment.j0;
                return new ListCellDelegate();
            case 21:
                KProperty[] kPropertyArr14 = DetailsStepFragment.j0;
                return new RowDelegate(null, null, 7);
            case 22:
                KProperty[] kPropertyArr15 = DetailsStepFragment.j0;
                return new LargeActionButtonDelegate();
            case 23:
                KProperty[] kPropertyArr16 = DetailsStepFragment.j0;
                return new RowDelegate(null, null, 7);
            case 24:
                KProperty[] kPropertyArr17 = DetailsStepFragment.j0;
                return new CellDetailsChevronDelegate();
            case 25:
                return new Regex("\\[.*?]|[{}]");
            case 26:
                return j1.b("com.revolut.feature.post_activation.impl.model.PostActivationFlow", ofa.b.values());
            case 27:
                return ofa.b.Companion.serializer();
            case 28:
                return ofa.j.Companion.serializer();
            default:
                return j1.b("com.revolut.feature.post_activation.impl.model.PostActivationStep.Card.Params.CardType", ofa.j.values());
        }
    }
}
