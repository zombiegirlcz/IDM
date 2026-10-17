package bkd;

import bqc.h;
import bqc.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsBarRatingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.c;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.details.CreditCardDetailsScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreen;
import com.revolut.feature.insurance.impl.ui.documents.local.InsuranceDocumentHardCopyScreen;
import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderAsset;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderProgress;
import com.revolut.feature.slot_manager.api.model.checklist.b;
import com.revolut.feature.slot_manager.api.model.checklist.f;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_cancellation_preview.EsimMobilePlanPhoneNumberCancellationPreviewScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.e;
import qlm.h0;
import qlm.j1;
import qlm.v1;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16356a;

    public /* synthetic */ a(int i) {
        this.f16356a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16356a) {
            case 0:
                SlotChecklist.Meta.Companion companion = SlotChecklist.Meta.INSTANCE;
                v1 v1Var = v1.f247718a;
                return new h0(v1Var, v1Var, 1);
            case 1:
                SlotChecklist.Step.Companion companion2 = SlotChecklist.Step.INSTANCE;
                return j1.b("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklist.Step.Variant", b.values());
            case 2:
                SlotChecklist.Step.Companion companion3 = SlotChecklist.Step.INSTANCE;
                return SlotChecklist.Step.Asset.INSTANCE.serializer();
            case 3:
                SlotChecklist.Terms.Companion companion4 = SlotChecklist.Terms.INSTANCE;
                return new e(SlotChecklist.Terms.TextArgument.a.f87291a);
            case 4:
                SlotChecklistHeaderAsset.Asset.b bVar = SlotChecklistHeaderAsset.Asset.Companion;
                return SlotIconAsset.INSTANCE.serializer();
            case 5:
                SlotChecklistHeaderAsset.Asset.b bVar2 = SlotChecklistHeaderAsset.Asset.Companion;
                return SlotIconAsset.INSTANCE.serializer();
            case 6:
                SlotChecklistHeaderProgress.Progress.b bVar3 = SlotChecklistHeaderProgress.Progress.Companion;
                return j1.b("com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistHeaderProgress.Progress.Variant", f.values());
            case 7:
                KProperty[] kPropertyArr = InsuranceDocumentHardCopyScreen.R;
                return new ListCellDelegate();
            case 8:
                return f0.f322471a;
            case 9:
                return f0.f322471a;
            case 10:
                return f0.f322471a;
            case 11:
                return f0.f322471a;
            case 12:
                KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberCancellationPreviewScreen.V;
                return new FullScreenStateDelegate();
            case 13:
                return Unit.f186387a;
            case 14:
                return Unit.f186387a;
            case 15:
                return new TwinHorizontalButtonDelegate();
            case 16:
                KProperty[] kPropertyArr3 = LinkedTransactionScreen.W;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr4 = LinkedTransactionScreen.W;
                return new HighlightTileDelegate();
            case 18:
                int i = R$drawable.uikit_icn_circle_background;
                List listK = v.k(new LayeredImage.Layer.Drawable(i, new Color.Solid(R$attr.uikit_colorWidgetBackground), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (c) null, 124), new LayeredImage.Layer.Drawable(i, new Color.Solid(R$attr.uikit_colorDeepGrey), 2.0f, 2.0f, 2.0f, 2.0f, (c) null, 64), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_24_reverted, Integer.valueOf(R$attr.uikit_colorWhite), 4.0f, 4.0f, 4.0f, 4.0f, (c) null, 64));
                Float fValueOf = Float.valueOf(20.0f);
                return new LayeredImage(listK, fValueOf, fValueOf, 8);
            case 19:
                return LayeredImage.Companion.c(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_time, Integer.valueOf(R$attr.uikit_colorAccentNeutral), new Color.Solid(R$attr.uikit_colorPopoverBackground), 1.0f, Float.valueOf(18.0f), 32);
            case 20:
                LayeredImage.Companion companion5 = LayeredImage.INSTANCE;
                int i2 = R$drawable.uikit_icn_24_wallet;
                int i3 = R$attr.uikit_colorPopoverBackground;
                return LayeredImage.Companion.f(companion5, i2, R$attr.uikit_colorAccentNeutral, i3, Integer.valueOf(i3), 7.2f, 4.8f, null, 64);
            case 21:
                KProperty[] kPropertyArr5 = CryptoCreateBeneficiaryScreen.T;
                return new FixedTabsDelegate();
            case 22:
                KProperty[] kPropertyArr6 = CryptoCreateBeneficiaryScreen.T;
                return new InputTextDelegate(null);
            case 23:
                KProperty[] kPropertyArr7 = CryptoCreateBeneficiaryScreen.T;
                return new ListSubheaderDelegate();
            case 24:
                return j1.b("com.revolut.feature.salary_switch.impl.models.SalarySwitchStatusDetails.AccountType", h.values());
            case 25:
                return j1.b("com.revolut.feature.salary_switch.impl.models.SalarySwitchStatusState", k.values());
            case 26:
                return j1.b("com.revolut.feature.salary_switch.impl.models.SalarySwitchStatusState", k.values());
            case 27:
                KProperty[] kPropertyArr8 = CreditCardDetailsScreen.Z;
                return new RowDelegate(null, null, 7);
            case 28:
                KProperty[] kPropertyArr9 = CreditCardDetailsScreen.Z;
                return new CellDetailsDelegate();
            default:
                KProperty[] kPropertyArr10 = CreditCardDetailsScreen.Z;
                return new CellDetailsBarRatingDelegate();
        }
    }
}
