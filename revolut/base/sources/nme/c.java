package nme;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FeedCollectionDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.IconLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import com.revolut.feature.insurance_common.data.model.Banner;
import com.revolut.feature.retail.savings.impl.documents.presentation.statements.account_selection.SavingsSelectionScreen;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import com.revolut.otp.input.flow.common.bottom_dialog.OtpResendMethodsBottomSheet;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreen;
import com.revolut.sso.impl.ui.country_selection.CountrySelectionScreen;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217289a;

    public /* synthetic */ c(int i) {
        this.f217289a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f217289a) {
            case 0:
                KProperty[] kPropertyArr = TabLifestyleScreen.f89903w0;
                return new HybridTileDelegate();
            case 1:
                KProperty[] kPropertyArr2 = TabLifestyleScreen.f89903w0;
                return new FeedCollectionDelegate();
            case 2:
                KProperty[] kPropertyArr3 = TabLifestyleScreen.f89903w0;
                return new IconDelegate();
            case 3:
                KProperty[] kPropertyArr4 = TabLifestyleScreen.f89903w0;
                return new IconLoadingDelegate();
            case 4:
                KProperty[] kPropertyArr5 = TabLifestyleScreen.f89903w0;
                return new LargeActionButtonDelegate();
            case 5:
                KProperty[] kPropertyArr6 = TabLifestyleScreen.f89903w0;
                return new RowDelegate(null, null, 7);
            case 6:
                KProperty[] kPropertyArr7 = TabLifestyleScreen.f89903w0;
                return new RowLoadingDelegate();
            case 7:
                KProperty[] kPropertyArr8 = TabLifestyleScreen.f89903w0;
                return new HeroBannerLoadingDelegate();
            case 8:
                KProperty[] kPropertyArr9 = CountrySelectionScreen.U;
                return new InputTextDelegate(null);
            case 9:
                KProperty[] kPropertyArr10 = CountrySelectionScreen.U;
                return new ListCellDelegate();
            case 10:
                KProperty[] kPropertyArr11 = CountrySelectionScreen.U;
                return new TextDelegate();
            case 11:
                KProperty[] kPropertyArr12 = CountrySelectionScreen.U;
                return new InputChecklistDelegate();
            case 12:
                return j1.b("com.revolut.feature.bank_account_switching.api.domain.ServiceType", mn2.a.values());
            case 13:
                return LayeredImage.Companion.f(LayeredImage.INSTANCE, R$drawable.uikit_icn_16_cross_small, R$attr.uikit_colorRed, R$attr.uikit_colorBackground, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, SyslogConstants.LOG_CLOCK);
            case 14:
                ContactsChooserScreen.Companion aVar = ContactsChooserScreen.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 15:
                KProperty[] kPropertyArr13 = SavingsSelectionScreen.U;
                return new RowDelegate(null, null, 7);
            case 16:
                KProperty[] kPropertyArr14 = SavingsSelectionScreen.U;
                return new FullScreenStateDelegate();
            case 17:
                int i = OtpResendMethodsBottomSheet.V;
                return new RowDelegate(null, null, 7);
            case 18:
                KProperty[] kPropertyArr15 = EsimRefundReasonScreen.S;
                return new InputChecklistDelegate();
            case 19:
                KProperty[] kPropertyArr16 = EsimRefundReasonScreen.S;
                return new FullScreenStateDelegate();
            case 20:
                no.r rVar = no.z.Companion;
                return "recordEvent[network]";
            case 21:
                return new AnalyticsContext(m72.b.h("keypad_mode", com.bumptech.glide.c.g(new nnf.h(6)), AnalyticsContext.INSTANCE));
            case 22:
                return new AnalyticsContext(m72.b.h("oem_unlock", com.bumptech.glide.c.g(new nnf.h(5)), AnalyticsContext.INSTANCE));
            case 23:
                return new FullScreenStateDelegate();
            case 24:
                return Unit.f186387a;
            case 25:
                Banner.Companion companion = Banner.INSTANCE;
                return Banner.Action.INSTANCE.serializer();
            case 26:
                Banner.Action.Companion companion2 = Banner.Action.INSTANCE;
                kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                return new mlm.f("com.revolut.feature.insurance_common.data.model.Banner.Action", p0Var.b(Banner.Action.class), new KClass[]{p0Var.b(Banner.Action.Deeplink.class), p0Var.b(Banner.Action.Faq.class), p0Var.b(Banner.Action.Upgrade.class)}, new KSerializer[]{Banner.Action.Deeplink.a.f75702a, Banner.Action.Faq.a.f75704a, Banner.Action.Upgrade.a.f75707a}, new Annotation[]{new com.revolut.feature.insurance_common.data.model.a()});
            case 27:
                Banner.Action.Upgrade.Companion companion3 = Banner.Action.Upgrade.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 28:
                Banner.Button.Companion companion4 = Banner.Button.INSTANCE;
                return Banner.Action.INSTANCE.serializer();
            default:
                Lazy lazy = nrl.d.f218675a;
                kg.p pVarA = ged.a.a();
                he0.m mVarB = he0.m.b(orl.r.class, "type");
                mVarB.c(orl.a.class, "AMOUNT");
                mVarB.c(orl.i0.class, "QUANTITY");
                ArrayList arrayList = pVarA.e;
                arrayList.add(mVarB);
                he0.m mVar = new he0.m("type", orl.s0.class, false, true);
                mVar.c(orl.r0.class, "POCKET");
                mVar.c(orl.q0.class, "HOLDING");
                mVar.c(orl.o0.class, "COMBINED_BUYING_POWER");
                arrayList.add(mVar);
                pVarA.c(new nrl.c(), orl.o.class);
                pVarA.c(new nrl.b(), orl.o.class);
                he0.m mVarB2 = he0.m.b(orl.e0.class, "type");
                mVarB2.c(orl.b0.class, "CURRENCIES");
                mVarB2.c(orl.y.class, "BALANCE");
                mVarB2.c(orl.c0.class, "POCKET_IDS");
                mVarB2.c(orl.z.class, "COMBINED_POCKET");
                mVarB2.c(orl.d0.class, "FALLBACK_SUBTYPE_LABEL");
                arrayList.add(mVarB2);
                return pVarA.b();
        }
    }
}
