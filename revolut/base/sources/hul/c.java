package hul;

import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.impl.ui.new_contact.BrebNewContactScreen;
import com.revolut.feature.card_management.impl.cardagreements.screens.overview.CardIssuanceAgreementsScreen;
import com.revolut.feature.credit.direct.debit.set_account.DirectDebitSetAccountScreen;
import com.revolut.feature.insurance_pet.impl.ui.common.document.TextDocumentActivity;
import com.revolut.feature.transport.impl.ui.hub.tickets.expired.ExpiredTicketsListScreen;
import com.revolut.trading.orders.ui.invest.placement.screens.review.InvestOrderReviewScreen;
import hx5.b;
import hxi.a;
import hyd.t0;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155711a;

    public /* synthetic */ c(int i) {
        this.f155711a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 7;
        boolean z = false;
        switch (this.f155711a) {
            case 0:
                KProperty[] kPropertyArr = InvestOrderReviewScreen.l0;
                return new PlainTextDelegate();
            case 1:
                KProperty[] kPropertyArr2 = InvestOrderReviewScreen.l0;
                return new CellDetailsActionDelegate();
            case 2:
                KProperty[] kPropertyArr3 = InvestOrderReviewScreen.l0;
                return new CellDetailsActionableIconDelegate();
            case 3:
                KProperty[] kPropertyArr4 = InvestOrderReviewScreen.l0;
                return new ActionWidgetDelegate();
            case 4:
                KProperty[] kPropertyArr5 = InvestOrderReviewScreen.l0;
                return new LargeActionButtonDelegate();
            case 5:
                KProperty[] kPropertyArr6 = InvestOrderReviewScreen.l0;
                return new CellDetailsLoadingDelegate();
            case 6:
                KProperty[] kPropertyArr7 = InvestOrderReviewScreen.l0;
                return new FullScreenStateDelegate();
            case 7:
                KProperty[] kPropertyArr8 = InvestOrderReviewScreen.l0;
                return new ExpandableCellDelegate();
            case 8:
                Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
                paintC.setStyle(Paint.Style.STROKE);
                paintC.setStrokeCap(Paint.Cap.ROUND);
                paintC.setStrokeJoin(Paint.Join.ROUND);
                paintC.setPathEffect(new CornerPathEffect(2.0f));
                return paintC;
            case 9:
                return com.google.android.gms.internal.mlkit_vision_face.a.c(true);
            case 10:
                return new qlm.e(v1.f247718a);
            case 11:
                KProperty[] kPropertyArr9 = BrebNewContactScreen.Q;
                return new InputTextDelegate(null);
            case 12:
                KProperty[] kPropertyArr10 = ExpiredTicketsListScreen.Q;
                return new RowDelegate(null, null, 7);
            case 13:
                return Unit.f186387a;
            case 14:
                b.a aVar = hx5.b.Companion;
                qta.f[] elements = {qta.f.DAY, qta.f.WEEK, qta.f.MONTH, qta.f.SIX_MONTH, qta.f.YEAR, qta.f.FIVE_YEARS, qta.f.ALL};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return (qta.f[]) kotlin.collections.d.L(elements).toArray(new qta.f[0]);
            case 15:
                throw new IllegalStateException("Campaign without reward should be filtered out by isAvailable()");
            case 16:
                a.C0897a c0897a = hxi.a.Companion;
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_travel, R$attr.uikit_colorAccent, R$attr.uikit_colorBackground, null, 4.0f, 4.0f, null, 72);
            case 17:
                int i2 = TextDocumentActivity.f76259v0;
                return new z4l.j(i, zhm.u.c(new ListCellDelegate()), z);
            case 18:
                return new qlm.e(v1.f247718a);
            case 19:
                return new qlm.e(v1.f247718a);
            case 20:
                return new qlm.e(hyd.y.f156841a);
            case 21:
                return new qlm.e(hyd.v.f156834a);
            case 22:
                return new qlm.e(hyd.b0.f156789a);
            case 23:
                return new qlm.e(hyd.k0.f156809a);
            case 24:
                return new qlm.e(t0.f156831a);
            case 25:
                return new qlm.e(hyd.e0.f156796a);
            case 26:
                return j1.a("com.revolut.ui_kit_globe_view.models.GlobeLoadParams.EdgeFade", hyl.j.values(), new String[]{"top", "bottom", "left", "right"}, new Annotation[][]{null, null, null, null});
            case 27:
                return j1.a("com.revolut.ui_kit_globe_view.models.GlobeLoadParams.Quality", hyl.l.values(), new String[]{"high", "medium", "low"}, new Annotation[][]{null, null, null});
            case 28:
                KProperty[] kPropertyArr11 = CardIssuanceAgreementsScreen.S;
                return new FullScreenStateDelegate();
            default:
                KProperty[] kPropertyArr12 = DirectDebitSetAccountScreen.R;
                return new InputTextDelegate(null);
        }
    }
}
