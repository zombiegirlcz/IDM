package ft3;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.QrCodePlainDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.credit.card.impl.ui.instalment.transactions.InstalmentTransactionsScreen;
import com.revolut.feature.freelancer.impl.ui.inbound_volume.AnnualInboundVolumeScreen;
import com.revolut.feature.kyc.impl.choosedocument.ChooseDocumentKycFragment;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen;
import com.revolut.feature.rating.shared.impl.screen.AppRatingController;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137834a;

    public /* synthetic */ h0(int i) {
        this.f137834a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f137834a) {
            case 0:
                return qlm.j1.b("com.revolut.feature.credit.application.models.products.ProductType", j1.values());
            case 1:
                return new mlm.d(kotlin.jvm.internal.o0.f186429a.b(gt3.f.class), new Annotation[0]);
            case 2:
                return qlm.j1.b("com.revolut.feature.credit.application.models.status.ProductMetadataType", it3.k.values());
            case 3:
                return qlm.j1.b("com.revolut.feature.credit.application.models.products.ProductType", j1.values());
            case 4:
                return new mlm.d(kotlin.jvm.internal.o0.f186429a.b(gt3.f.class), new Annotation[0]);
            case 5:
                return qlm.j1.b("com.revolut.feature.credit.application.models.status.ProductMetadataType", it3.k.values());
            case 6:
                return new qlm.d1("refinancingLoan", o0.INSTANCE, new Annotation[]{new v("application_type")});
            case 7:
                return new qlm.d1("refinancingMortgage", p0.INSTANCE, new Annotation[]{new v("application_type")});
            case 8:
                KProperty[] kPropertyArr = InstalmentTransactionsScreen.X;
                return new LargeActionButtonDelegate();
            case 9:
                KProperty[] kPropertyArr2 = InstalmentTransactionsScreen.X;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr3 = InstalmentTransactionsScreen.X;
                return new FullScreenStateDelegate();
            case 11:
                KProperty[] kPropertyArr4 = InstalmentTransactionsScreen.X;
                return new TabsDelegate();
            case 12:
                KProperty[] kPropertyArr5 = GroupDetailsSettlementScreen.f0;
                return new CellDetailsChevronDelegate();
            case 13:
                Lazy lazy = fta.i.f138007a;
                return ue0.e.b(Json.d, new ft4.w(3));
            case 14:
                int i = ChooseDocumentKycFragment.f77588n0;
                return new RowDelegate(null, null, 7);
            case 15:
                int i2 = ChooseDocumentKycFragment.f77588n0;
                return new CellDetailsListDelegate();
            case 16:
                int i3 = ChooseDocumentKycFragment.f77588n0;
                return new PromptMarketingContentDelegate();
            case 17:
                int i5 = AppRatingController.U;
                return new IconSelectorDelegate();
            case 18:
                KProperty[] kPropertyArr6 = TransportHubTicketsScreen.f0;
                return new QRCodeDelegate();
            case 19:
                KProperty[] kPropertyArr7 = TransportHubTicketsScreen.f0;
                return new FullScreenStateDelegate();
            case 20:
                KProperty[] kPropertyArr8 = TransportHubTicketsScreen.f0;
                return new LargeActionButtonDelegate();
            case 21:
                KProperty[] kPropertyArr9 = TransportHubTicketsScreen.f0;
                return new CellDetailsChevronDelegate();
            case 22:
                KProperty[] kPropertyArr10 = TransportHubTicketsScreen.f0;
                return new RowDelegate(null, null, 7);
            case 23:
                KProperty[] kPropertyArr11 = TransportHubTicketsScreen.f0;
                return new QrCodePlainDelegate();
            case 24:
                do3.s[] elements = {do3.s.ACTIVE, do3.s.LOCKED, do3.s.TERMINATED};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.y0(elements);
            case 25:
                KProperty[] kPropertyArr12 = AnnualInboundVolumeScreen.S;
                return new InputChecklistDelegate();
            case 26:
                KProperty[] kPropertyArr13 = CryptoOrderDetailsController.X;
                return new TextDelegate();
            case 27:
                KProperty[] kPropertyArr14 = CryptoOrderDetailsController.X;
                return new CellDetailsChevronDelegate();
            case 28:
                KProperty[] kPropertyArr15 = CryptoOrderDetailsController.X;
                return new LargeActionButtonDelegate();
            default:
                KProperty[] kPropertyArr16 = CryptoOrderDetailsController.X;
                return new RowDelegate(null, null, 7);
        }
    }
}
