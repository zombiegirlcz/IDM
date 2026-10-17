package y7k;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.payid.impl.screen.send.input.InputScreen;
import com.revolut.feature.pix.impl.flow.automatico.screens.recurring_payments.PixAutomaticoRecurringPaymentsScreen;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset.SharedFavouritesAddAssetScreen;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreen;
import java.lang.annotation.Annotation;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.d1;
import qlm.v1;
import ybd.a0;
import ybd.f0;
import ye6.a;
import ye6.c;
import ye6.d;
import ye6.f;
import ye6.g;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311553a;

    public /* synthetic */ h(int i) {
        this.f311553a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f311553a) {
            case 0:
                KProperty[] kPropertyArr = PaymentLinksAmountScreen.f0;
                return new RowDelegate(null, null, 7);
            case 1:
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 2:
                PixAutomaticoRecurringPaymentsScreen.a aVar = PixAutomaticoRecurringPaymentsScreen.Companion;
                return new FullScreenStateDelegate();
            case 3:
                PixAutomaticoRecurringPaymentsScreen.a aVar2 = PixAutomaticoRecurringPaymentsScreen.Companion;
                return new CellDetailsChevronDelegate();
            case 4:
                PixAutomaticoRecurringPaymentsScreen.a aVar3 = PixAutomaticoRecurringPaymentsScreen.Companion;
                return new SmallActionButtonDelegate();
            case 5:
                PixAutomaticoRecurringPaymentsScreen.a aVar4 = PixAutomaticoRecurringPaymentsScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr2 = InputScreen.R;
                return new InputTextDelegate(null);
            case 7:
                KProperty[] kPropertyArr3 = EmailScreen.X;
                return new InputTextDelegate(null);
            case 8:
                KProperty[] kPropertyArr4 = EmailScreen.X;
                return new InputChecklistDelegate();
            case 9:
                KProperty[] kPropertyArr5 = EmailScreen.X;
                return new CellDetailsChevronDelegate();
            case 10:
                KProperty[] kPropertyArr6 = EmailScreen.X;
                return new RowDelegate(null, null, 7);
            case 11:
                KProperty[] kPropertyArr7 = EmailScreen.X;
                return new TextDelegate();
            case 12:
                return new qlm.e(ybd.i.f312239a);
            case 13:
                return new qlm.e(ybd.e.f312227a);
            case 14:
                return new qlm.e(ybd.z.Companion.serializer());
            case 15:
                a0.Companion bVar = ybd.a0.INSTANCE;
                return new qlm.e(ybd.b0.f312220a);
            case 16:
                f0.Companion bVar2 = ybd.f0.INSTANCE;
                return ybd.n0.Companion.serializer();
            case 17:
                return new d1("com.revolut.feature.shared.savings.impl.info_sheets.data.dto.InfoSheetDto.SectionDto.RowDto.ValueDto.UnknownValueDto", ybd.m0.INSTANCE, new Annotation[0]);
            case 18:
                return new d1("com.revolut.feature.shared.savings.impl.info_sheets.data.dto.InfoSheetDto.SectionDto.UnknownItemDto", ybd.o0.INSTANCE, new Annotation[0]);
            case 19:
                return new PromptMarketingContentDelegate();
            case 20:
                KProperty[] kPropertyArr8 = PixTransferInputKeyScreen.W;
                return new TextDelegate();
            case 21:
                d.b bVar3 = ye6.d.Companion;
                return new qlm.e(v1.f247718a);
            case 22:
                f.b bVar4 = ye6.f.Companion;
                return new qlm.e(a.C1739a.f312779a);
            case 23:
                g.b bVar5 = ye6.g.Companion;
                return new qlm.e(c.a.f312787a);
            case 24:
                yed.k kVar = yed.k.f312866a;
                return BigDecimal.ONE;
            case 25:
                return zhm.v.k(-5, -3, 3, 5);
            case 26:
                return zhm.v.k(3, 5, 7, 10);
            case 27:
                KProperty[] kPropertyArr9 = SharedFavouritesAddAssetScreen.f86802h0;
                return new RowDelegate(null, null, 7);
            case 28:
                KProperty[] kPropertyArr10 = SharedFavouritesAddAssetScreen.f86802h0;
                return new RowLoadingDelegate();
            default:
                KProperty[] kPropertyArr11 = SharedFavouritesAddAssetScreen.f86802h0;
                return new SelectableDelegate(new RowDelegate(null, null, 7));
        }
    }
}
