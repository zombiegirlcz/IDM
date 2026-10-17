package kul;

import android.net.Uri;
import android.view.View;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.adapter.SessionConfigAdapter;
import androidx.camera.camera2.config.UseCaseCameraConfig;
import androidx.camera.camera2.impl.CameraGraphConfigProvider;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_payment_links.impl.R$string;
import com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.JuniorCardProfileFlowContract$Step;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.tracking.v3.SettingsDeeplinkContext;
import d9.e1;
import dfl.r;
import grl.za;
import hha.u;
import java.math.BigDecimal;
import k4l.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mif.o;
import nel.v0;
import nel.z;
import nii.g0;
import nii.y0;
import pfm.t;
import tif.q;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f189844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f189845c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(com.revolut.analytics.tracking.v3.c cVar, String str, String str2, za zaVar, boolean z) {
        this.f189843a = 2;
        this.f189845c = str;
        this.d = str2;
        this.e = zaVar;
        this.f189844b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        bfl.g gVar;
        int i = this.f189843a;
        int i2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z = false;
        Object[] objArr3 = 0;
        boolean z3 = this.f189844b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f189845c;
        switch (i) {
            case 0:
                k kVar = (k) obj3;
                Integer num = (Integer) obj2;
                xul.l lVar = ((d) obj4).f189850b;
                OrderQuote orderQuote = kVar.f;
                dj0.d displayTotalMoney = kVar.f189868h;
                nel.n instrument = kVar.f189873p;
                e0 orderLimits = kVar.d;
                wul.m mVar = (wul.m) lVar;
                Intrinsics.checkNotNullParameter(orderQuote, "orderQuote");
                Intrinsics.checkNotNullParameter(displayTotalMoney, "displayTotalMoney");
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
                f8l.b bVar = orderQuote.f104753b;
                Charges charges = orderQuote.f104755g;
                int i3 = wul.l.f300240a[bVar.ordinal()];
                if (i3 == 1) {
                    gVar = bfl.g.SELL;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = bfl.g.BUY;
                }
                bfl.g gVar2 = gVar;
                r rVar = orderQuote.f104752a == orderQuote.f104753b ? r.STOCK_QUANTITY : r.MONEY_AMOUNT;
                Amount amount = new Amount(orderQuote.f104757j.f104792a, e1.u(orderQuote).f104718b);
                dj0.d dVarB = l4i.a.b(e1.v(orderQuote));
                xul.k iVar = !Intrinsics.f(dVarB.f115083b, displayTotalMoney.f115083b) ? new xul.i(dVarB, displayTotalMoney) : new xul.j(dVarB);
                Amount amountL = e1.l(orderQuote);
                ChargeBreakdown chargeBreakdown = charges.f104731a;
                dj0.d dVarB2 = l4i.a.b(amount);
                BigDecimal bigDecimal = orderQuote.f104758l;
                dj0.d dVarB3 = bigDecimal != null ? l4i.a.b(new Amount(bigDecimal, e1.u(orderQuote).f104718b)) : null;
                f8l.e eVar = orderQuote.k;
                xul.c cVar = xul.c.PENDING;
                z zVar = instrument.f214597c;
                return wul.m.p(mVar, iVar, amountL, chargeBreakdown, dVarB2, amount, dVarB3, gVar2, eVar, cVar, rVar, this.f189844b, zVar, io3.h.i(zVar) && orderLimits.a(), orderLimits.i, null, null, charges.f104733c, orderLimits, num, 49152);
            case 1:
                ((ldh.m) obj4).e3((bfl.g) obj2, (v0) obj3, z3);
                return Unit.f186387a;
            case 2:
                Uri uri2 = Uri.parse((String) obj3);
                AnalyticsContext.Companion bVar2 = AnalyticsContext.INSTANCE;
                SettingsDeeplinkContext.a aVarNewBuilder = SettingsDeeplinkContext.newBuilder();
                aVarNewBuilder.h((String) obj4);
                aVarNewBuilder.c();
                ((SettingsDeeplinkContext) aVarNewBuilder.f49761b).setAction((za) obj2);
                String queryParameter = uri2.getQueryParameter("tracking_id");
                if (queryParameter != null) {
                    aVarNewBuilder.c();
                    ((SettingsDeeplinkContext) aVarNewBuilder.f49761b).setIdentifier(queryParameter);
                }
                String queryParameter2 = uri2.getQueryParameter("utm_campaign");
                if (queryParameter2 != null) {
                    aVarNewBuilder.c();
                    ((SettingsDeeplinkContext) aVarNewBuilder.f49761b).setUtmCampaign(queryParameter2);
                }
                String queryParameter3 = uri2.getQueryParameter("utm_content");
                if (queryParameter3 != null) {
                    aVarNewBuilder.c();
                    ((SettingsDeeplinkContext) aVarNewBuilder.f49761b).setUtmContent(queryParameter3);
                }
                String queryParameter4 = uri2.getQueryParameter("utm_medium");
                if (queryParameter4 != null) {
                    aVarNewBuilder.c();
                    ((SettingsDeeplinkContext) aVarNewBuilder.f49761b).setUtmMedium(queryParameter4);
                }
                String queryParameter5 = uri2.getQueryParameter("utm_source");
                if (queryParameter5 != null) {
                    aVarNewBuilder.c();
                    ((SettingsDeeplinkContext) aVarNewBuilder.f49761b).setUtmSource(queryParameter5);
                }
                String scheme = uri2.getScheme();
                if (scheme != null) {
                    aVarNewBuilder.c();
                    ((SettingsDeeplinkContext) aVarNewBuilder.f49761b).setScheme(scheme);
                }
                aVarNewBuilder.c();
                ((SettingsDeeplinkContext) aVarNewBuilder.f49761b).setIsUnified(z3);
                w0 w0VarA = aVarNewBuilder.a();
                bVar2.getClass();
                return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
            case 3:
                View view = (View) obj4;
                vp0.h hVar = wp0.h.f299001a;
                wp0.h.a(view, new oii.b((os2.g) obj3, objArr3 == true ? 1 : 0), new o10.c((hli.a) obj2, 19), z3 ? wp0.f.AFTER_TRANSITION : wp0.f.DEFAULT);
                return Unit.f186387a;
            case 4:
                return new FeatureCommand(new PricingPlanFeatureConfig.DashboardByFeature((u) obj3, (xfa.b) obj2, new PlanChangeSuccessActionStrategy.CardOrderIfNeeded(((pgk.k) obj4).e.d()), this.f189844b, 464));
            case 5:
                return UseCaseCameraConfig.Companion.create$lambda$0((SessionConfigAdapter) obj4, z3, null, (CameraGraphConfigProvider) obj3, (GraphStateToCameraStateAdapter) obj2);
            case 6:
                q qVar = (q) obj4;
                String legId = (String) obj3;
                o oVar = qVar.f271519c;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(legId, "legId");
                pfm.h hVar2 = new pfm.h(new br6.a(oVar, legId, z3, 4), i2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                t tVarW = oVar.w(hVar2);
                Intrinsics.checkNotNullExpressionValue(tVarW, "triggerUpdate(...)");
                return qVar.f(tVarW, (BreadcrumbException) obj2);
            default:
                com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a aVar = (com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile.a) obj4;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) obj2;
                if (ta6.a.A((psg.a) obj3)) {
                    yki.i iVar2 = aVar.u;
                    String str = juniorBankingProfile.f77099b;
                    String str2 = juniorBankingProfile.f77102h;
                    if (str2 == null) {
                        throw new IllegalStateException("JuniorCardProfileFlowModel::onCreateEmpty requires JuniorBankingProfile::username not to be null");
                    }
                    oki.h.w2(iVar2, new JuniorCardProfileFlowContract$Step.PaymentLinksConsent(z3, str, str2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    yji.l.b1(aVar, aVar.X1(new y0(objArr2 == true ? 1 : 0, new g0(new TextLocalisedClause(R$string.junior_payment_links_qr_screen_payment_links_disabled_status_view_title, null, null, 14), new TextLocalisedClause(R$string.junior_payment_links_qr_screen_payment_links_disabled_status_view_description, zhm.u.c(juniorBankingProfile.f77099b), null, 12), null, new TextLocalisedClause(R$string.junior_payment_links_qr_screen_payment_links_disabled_status_view_primary_button_text, null, null, 14), null, null, null, null, false, null, false, null, 16372), z, 5)), null, new y5g.d(aVar, objArr == true ? 1 : 0, 25), 3);
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, Enum r3, boolean z, int i) {
        this.f189843a = i;
        this.f189845c = obj2;
        this.d = obj3;
        this.e = r3;
        this.f189844b = z;
    }

    public /* synthetic */ b(Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.f189843a = i;
        this.f189845c = obj2;
        this.d = obj3;
        this.f189844b = z;
        this.e = obj4;
    }

    public /* synthetic */ b(Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.f189843a = i;
        this.f189845c = obj2;
        this.f189844b = z;
        this.d = obj3;
        this.e = obj4;
    }
}
