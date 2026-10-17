package pka;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsReceiptDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.ui.receipts.TransactionDetailsReceiptsActivity;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreen;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pne.y;
import qlm.d1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236958a;

    public /* synthetic */ c(int i) {
        this.f236958a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f236958a) {
            case 0:
                return new qlm.e(g.f236964a);
            case 1:
                return new qlm.e(t.f236993a);
            case 2:
                t0 t0Var = t0.INSTANCE;
                Intrinsics.checkNotNullParameter("type", "discriminator");
                return new d1("com.revolut.feature.product_article.impl.model.item.ProductArticleUnknownItemDto", t0Var, new Annotation[]{new hi9.g(24, false)});
            case 3:
                return zhm.f0.f322471a;
            case 4:
                return zhm.f0.f322471a;
            case 5:
                return zhm.f0.f322471a;
            case 6:
                return zhm.f0.f322471a;
            case 7:
                return zhm.f0.f322471a;
            case 8:
                return zhm.f0.f322471a;
            case 9:
                return zhm.f0.f322471a;
            case 10:
                return zhm.f0.f322471a;
            case 11:
                return zhm.f0.f322471a;
            case 12:
                return zhm.f0.f322471a;
            case 13:
                String[] elements = {"DISCLOSURES_LINK_ID", "RETAIL_REVX_DIFFERENCE_LINK_ID"};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.y0(elements);
            case 14:
                return zhm.f0.f322471a;
            case 15:
                KProperty[] kPropertyArr = EsimMobilePlanNumberTransferScreen.S;
                return new PhoneEditorDelegate();
            case 16:
                KProperty[] kPropertyArr2 = EsimMobilePlanNumberTransferScreen.S;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr3 = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                return new InputTextDelegate(null);
            case 18:
                return new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            case 19:
                KProperty[] kPropertyArr4 = EsimMobilePlanSummaryScreen.T;
                return new CellDetailsDelegate();
            case 20:
                KProperty[] kPropertyArr5 = EsimMobilePlanSummaryScreen.T;
                return new CellDetailsActionDelegate();
            case 21:
                KProperty[] kPropertyArr6 = EsimMobilePlanSummaryScreen.T;
                return new ListSubheaderDelegate();
            case 22:
                return new qlm.e(pne.p.f237731a);
            case 23:
                return new qlm.e(pne.j.f237724a);
            case 24:
                y.Companion bVar = pne.y.INSTANCE;
                return new qlm.e(pne.m.f237727a);
            case 25:
                y.Companion bVar2 = pne.y.INSTANCE;
                return new qlm.e(pne.g.f237719a);
            case 26:
                return new qlm.e(pne.b0.f237705a);
            case 27:
                int i = TransactionDetailsReceiptsActivity.f92080w0;
                return new CellDetailsReceiptDelegate();
            case 28:
                return new nii.z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
            default:
                return new CellDetailsActionDelegate.Model("TRADE_CONFIRMATION_ID", new TextLocalisedClause(com.revolut.feature.wealth.ui.impl.R$string.trading_trade_confirmation_title, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.wealth.ui.impl.R$string.trading_download_title, null, null, 14), false, false, null, null, 0, 0, 32736);
        }
    }
}
