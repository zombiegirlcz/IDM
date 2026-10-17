package dv9;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmAani;
import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.overduepayment.OverduePaymentActivity;
import com.revolut.feature.kyc.impl.screens.incode_consent.IncodeDocumentProcessingConsentScreen;
import com.revolut.feature.payments.messaging.data.api.model.Mention;
import com.revolut.feature.payments.messaging.data.api.model.MentionsData;
import com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen.TransactionsDayNightLimitsScreen;
import com.revolut.feature.selfserve.sow.impl.ui.note.SowNoteFragment;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import com.youTransactor.uCube.rpc.Constants;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import org.jmrtd.cbeff.ISO781611;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118080a;

    public /* synthetic */ r(int i) {
        this.f118080a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 15;
        Float f = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i2 = 8;
        boolean z = false;
        switch (this.f118080a) {
            case 0:
                MentionsData.b bVar = MentionsData.Companion;
                return new qlm.e(Mention.a.f79525a);
            case 1:
                KProperty[] kPropertyArr = TransactionsDayNightLimitsScreen.S;
                return new RowDelegate(null, null, 7);
            case 2:
                KProperty[] kPropertyArr2 = TransactionsDayNightLimitsScreen.S;
                return new ListSubheaderDelegate();
            case 3:
                KProperty[] kPropertyArr3 = TicketDetailsScreen.U;
                return new CellDetailsActionDelegate();
            case 4:
                KProperty[] kPropertyArr4 = TicketDetailsScreen.U;
                return new CellDetailsChevronDelegate();
            case 5:
                KProperty[] kPropertyArr5 = TicketDetailsScreen.U;
                return new ActionsDelegate();
            case 6:
                KProperty[] kPropertyArr6 = TicketDetailsScreen.U;
                return new RowDelegate(null, null, 7);
            case 7:
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                ApmAani.f61807c.getClass();
                int i3 = R$drawable.uikit_icn_24_aani;
                int i5 = R$attr.uikit_colorBackground;
                return LayeredImage.Companion.g(companion, i3, new Color.Solid(R$attr.uikit_colorForeground), new Color.Solid(i5), new Color.Solid(i5), null, 2.0f, 2.0f, Float.valueOf(12.0f), SyslogConstants.LOG_LOCAL2);
            case 8:
                ApmBizum apmBizum = ApmBizum.f61808c;
                return new CdnImage("logo", "mobile/payments/bizum", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 9:
                ApmBizum apmBizum2 = ApmBizum.f61808c;
                return new CdnImage("logo", "mobile/payments/bizum", null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), z, i2), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4);
            case 10:
                ApmBlik apmBlik = ApmBlik.f61809c;
                return new CdnImage("logo", "mobile/payments/blik", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 11:
                ApmBreb apmBreb = ApmBreb.f61810c;
                return new CdnImage("logo_full", "mobile/payments/bre_b", null, new ImageTransformations(null, new CircleTransformation((Float) (objArr2 == true ? 1 : 0), (Integer) (objArr == true ? 1 : 0), z, i), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4);
            case 12:
                ApmIris apmIris = ApmIris.f61811c;
                return new CdnImage("logo", "mobile/payments/iris", null, new ImageTransformations(null, new CircleTransformation(f, (Integer) (objArr3 == true ? 1 : 0), z, i), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4);
            case 13:
                ApmIris apmIris2 = ApmIris.f61811c;
                return new CdnImage("logo_light", "mobile/payments/iris", null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), z, i2), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4);
            case 14:
                ApmMultibanco apmMultibanco = ApmMultibanco.f61815c;
                return new CdnImage("logo", "mobile/payments/multibanco", null, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 15:
                ApmMultibanco apmMultibanco2 = ApmMultibanco.f61815c;
                return new CdnImage("logo", "mobile/payments/multibanco", null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), z, i2), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4);
            case 16:
                ApmQvik.f61823c.getClass();
                return new ResourceImage(R$drawable.uikit_icn_24_qvik, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), z, i2), null, null, null, null, null, ISO781611.SMT_TAG), (Clause) null, 190);
            case 17:
                ApmSpin apmSpin = ApmSpin.f61827c;
                return new CdnImage("logo_full", "mobile/payments/spin", null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), z, i2), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4);
            case 18:
                return new ResourceImage(dx1.g.f120518b, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(12.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), z, i2), null, null, null, null, null, ISO781611.SMT_TAG), (Clause) null, 190);
            case 19:
                ApmWero apmWero = ApmWero.f61829c;
                return new CdnImage("logo_full", "mobile/payments/wero", null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), z, i2), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4);
            case 20:
                ApmWero apmWero2 = ApmWero.f61829c;
                return new CdnImage("logo", "mobile/payments/wero", null, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), z, i2), null, null, null, null, null, ISO781611.SMT_TAG), null, null, Constants.TAG_F4);
            case 21:
                KProperty[] kPropertyArr7 = IncodeDocumentProcessingConsentScreen.S;
                return new ListCellDelegate();
            case 22:
                int i6 = OverduePaymentActivity.f76323w0;
                return new RowDelegate(null, null, 7);
            case 23:
                int i21 = SowNoteFragment.g0;
                return new InputTextDelegate(null);
            case 24:
                return Unit.f186387a;
            case 25:
                return Unit.f186387a;
            case 26:
                return DefaultDebugIndication.INSTANCE;
            case 27:
                return OverscrollConfiguration_androidKt.LocalOverscrollConfiguration$lambda$0();
            case 28:
                return j1.b("com.revolut.feature.invest.smart_notifications.impl.data.database.model.FeedElementAssetFilterTypeEntity", e18.b.values());
            default:
                return j1.a("com.revolut.feature.invest.smart_notifications.impl.data.database.model.PriceAttributionStatusEntity", e18.h.values(), new String[]{"PENDING", "ATTRIBUTED"}, new Annotation[][]{null, null});
        }
    }
}
