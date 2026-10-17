package ht1;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.apm.bizum.impl.ui.settings.BizumSettingsScreen;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreen;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreen;
import htj.c0;
import htj.p;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155210a;

    public /* synthetic */ e(int i) {
        this.f155210a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f155210a) {
            case 0:
                KProperty[] kPropertyArr = BizumSettingsScreen.f0;
                return new LargeActionButtonDelegate();
            case 1:
                return new qlm.e(htj.d.f155402a);
            case 2:
                return new qlm.e(htj.d.f155402a);
            case 3:
                return new qlm.e(htj.g.f155412a);
            case 4:
                return new qlm.e(htj.m.f155430a);
            case 5:
                return new qlm.e(p.f155434a);
            case 6:
                return c0.Companion.serializer();
            case 7:
                return j1.a("com.revolut.retail.feature.impl.income_sorter.network.dto.IncomeSorterTransferReasonTypeDto", c0.values(), new String[]{"PREDEFINED", "CUSTOM"}, new Annotation[][]{null, null});
            case 8:
                return new qlm.e(htj.d.f155402a);
            case 9:
                return new qlm.e(htj.d.f155402a);
            case 10:
                KProperty[] kPropertyArr2 = BlikCodeScreen.f61658n0;
                return new FullScreenStateDelegate();
            case 11:
                KProperty[] kPropertyArr3 = BlikCodeScreen.f61658n0;
                return new ActionWidgetDelegate();
            case 12:
                KProperty[] kPropertyArr4 = BlikCodeScreen.f61658n0;
                return new ContactsWidgetDelegate();
            case 13:
                KProperty[] kPropertyArr5 = BlikCodeScreen.f61658n0;
                return new RowsWidgetDelegate();
            case 14:
                KProperty[] kPropertyArr6 = BlikCodeScreen.f61658n0;
                return new RowDelegate(null, null, 7);
            case 15:
                KProperty[] kPropertyArr7 = BlikCodeScreen.f61658n0;
                return new LargeActionButtonDelegate();
            case 16:
                KProperty[] kPropertyArr8 = BlikCodeScreen.f61658n0;
                return new ReferralContactDelegate();
            case 17:
                KProperty[] kPropertyArr9 = BlikCodeScreen.f61658n0;
                return new ListSubheaderDelegate();
            case 18:
                KProperty[] kPropertyArr10 = AsftHomeScreen.W;
                return new EsimDelegate();
            case 19:
                KProperty[] kPropertyArr11 = AsftHomeScreen.W;
                return new ReferralContactDelegate();
            case 20:
                KProperty[] kPropertyArr12 = AsftHomeScreen.W;
                return new FullScreenStateDelegate();
            case 21:
                KProperty[] kPropertyArr13 = AsftHomeScreen.W;
                return new ListSubheaderDelegate();
            case 22:
                KProperty[] kPropertyArr14 = AsftHomeScreen.W;
                return new RowDelegate(null, null, 7);
            case 23:
                KProperty[] kPropertyArr15 = InvestOrderReviewScreen.l0;
                return new RowDelegate(null, null, 7);
            case 24:
                KProperty[] kPropertyArr16 = InvestOrderReviewScreen.l0;
                return new HighlightTileDelegate();
            case 25:
                KProperty[] kPropertyArr17 = InvestOrderReviewScreen.l0;
                return new BannerDelegate();
            case 26:
                KProperty[] kPropertyArr18 = InvestOrderReviewScreen.l0;
                return new CellDetailsDelegate();
            case 27:
                KProperty[] kPropertyArr19 = InvestOrderReviewScreen.l0;
                return new CellDetailsNoteDelegate();
            case 28:
                KProperty[] kPropertyArr20 = InvestOrderReviewScreen.l0;
                return new PlainTextWarningDelegate();
            default:
                KProperty[] kPropertyArr21 = InvestOrderReviewScreen.l0;
                return new TextDelegate();
        }
    }
}
