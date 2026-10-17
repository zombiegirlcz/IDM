package ip0;

import android.graphics.drawable.GradientDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.internal.delegates.SuggestionDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreen;
import com.revolut.feature.credit.card.impl.ui.additional_cards.cardholder_details.AdditionalCardsCardholderDetailsScreen;
import is7.a;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164030a;

    public /* synthetic */ e70(int i) {
        this.f164030a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f164030a) {
            case 0:
                QRCodeDelegate.Companion aVar = QRCodeDelegate.INSTANCE;
                return new ihm.f();
            case 1:
                return new ihm.f();
            case 2:
                return new ihm.f();
            case 3:
                return new ihm.f();
            case 4:
                return new ihm.f();
            case 5:
                return new aw0.x6(zhm.u.c(new aw0.w6(R$attr.uikit_colorGreyTone50, R$attr.uikit_colorGreyTone20_20, R$attr.uikit_colorTransparent, BitmapDescriptorFactory.HUE_RED, 1000.0f, true, aw0.v6.SQUARE)));
            case 6:
                return zhm.v.k(new aw0.y6(BitmapDescriptorFactory.HUE_RED, 100.0f), new aw0.y6(1000.0f, 100.0f));
            case 7:
                return new ihm.f();
            case 8:
                return new ihm.f();
            case 9:
                SingleChoiceDelegate.Companion companion = SingleChoiceDelegate.INSTANCE;
                return new ihm.f();
            case 10:
                return LayeredImage.INSTANCE.j(R$drawable.uikit_icn_24_check, new Color.SolidInt(-16777216), new Color.SolidInt(-1));
            case 11:
                return new SuggestionDelegate(true);
            case 12:
                return new SuggestionDelegate(false);
            case 13:
                SwipeToActionDelegate.Companion companion2 = SwipeToActionDelegate.INSTANCE;
                return new ihm.f();
            case 14:
                return new ihm.f();
            case 15:
                return new int[]{0, 0, io0.a.b(0.2f, -1), io0.a.b(0.75f, -1)};
            case 16:
                return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, 0});
            case 17:
                return new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, 0});
            case 18:
                return new SuggestionDelegate(false);
            case 19:
                KProperty[] kPropertyArr = CorporateEventsTypeFilterScreen.i0;
                return new ListSubheaderDelegate();
            case 20:
                KProperty[] kPropertyArr2 = CorporateEventsTypeFilterScreen.i0;
                return new CellDetailsDelegate();
            case 21:
                KProperty[] kPropertyArr3 = CorporateEventsTypeFilterScreen.i0;
                return new LargeActionButtonDelegate();
            case 22:
                KProperty[] kPropertyArr4 = CorporateEventsTypeFilterScreen.i0;
                return new TwinHorizontalButtonDelegate();
            case 23:
                KProperty[] kPropertyArr5 = CorporateEventsTypeFilterScreen.i0;
                return new DatePickerDelegate();
            case 24:
                KProperty[] kPropertyArr6 = CorporateEventsTypeFilterScreen.i0;
                return new ProgressStepVerticalDelegate();
            case 25:
                KProperty[] kPropertyArr7 = CorporateEventsTypeFilterScreen.i0;
                return new InputChecklistDelegate();
            case 26:
                KProperty[] kPropertyArr8 = AdditionalCardsCardholderDetailsScreen.T;
                return new RowDelegate(null, null, 7);
            case 27:
                return jr.e0.Companion.serializer();
            case 28:
                return new qlm.e(jr.e1.d);
            default:
                a.Companion companion3 = is7.a.INSTANCE;
                return new qlm.e(is7.c.f168155a);
        }
    }
}
