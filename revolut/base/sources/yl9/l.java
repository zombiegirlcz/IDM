package yl9;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import aw0.u0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_with_smile.api.domain.model.PaymentConfirmationChallenge;
import com.revolut.feature.pay_with_smile.impl.R$string;
import com.revolut.feature.pay_with_smile.impl.ui.fallback_confirmation.FallbackConfirmationScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FallbackConfirmationScreenContract$InputData f314678a;

    public l(FallbackConfirmationScreenContract$InputData inputData, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f314678a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        PaymentConfirmationChallenge paymentConfirmationChallenge = this.f314678a.f78958a;
        long jCurrentTimeMillis = paymentConfirmationChallenge.e - System.currentTimeMillis();
        aim.e eVarB = u.b();
        eVarB.add(new np0.b("timer_delegate_id", paymentConfirmationChallenge.e - System.currentTimeMillis(), paymentConfirmationChallenge.e, new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_title, null, null, 14)));
        aim.e eVarB2 = u.b();
        TextClause textClause = new TextClause(paymentConfirmationChallenge.f78951b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_with_app, u.c(paymentConfirmationChallenge.i), null, 12);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(paymentConfirmationChallenge.f78955j, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new RoundedRectTransformation(11.0f), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), null, null, false, null, false, 60);
        long j2 = paymentConfirmationChallenge.f78952c;
        xi0.a aVar = xi0.b.Companion;
        String str = paymentConfirmationChallenge.d;
        aVar.getClass();
        eVarB2.add(new RowDelegate.Model("client_id", image40, textClause, null, 0, textLocalisedClause, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(j2, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_when, null, null, 14), (Image) null, 0, false, 30);
        u0 u0Var = u0.LARGE;
        eVarB2.add(new CellDetailsDelegate.Model("details_date_item_id", t0Var, new TimeClause(paymentConfirmationChallenge.f, new TimeClause.Format.Pretty(q0.DATETIME), null, null, 12), null, null, null, u0Var, Integer.MAX_VALUE, null, false, false, null, null, 31992));
        eVarB2.add(new CellDetailsDelegate.Model("details_where_item_id", new t0((Clause) new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_where, null, null, 14), (Image) null, 0, false, 30), new TextClause(paymentConfirmationChallenge.f78954h, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, u0Var, Integer.MAX_VALUE, null, false, false, null, null, 31992));
        eVarB2.add(new CellDetailsDelegate.Model("details_device_item_id", new t0((Clause) new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_device, null, null, 14), (Image) null, 0, false, 30), new TextClause(paymentConfirmationChallenge.f78953g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, u0Var, Integer.MAX_VALUE, null, false, false, null, null, 31992));
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA);
        aim.e eVarB3 = u.b();
        eVarB3.add(new RowDelegate.Model("no_call_id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_no_call, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_no_call, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        eVarB3.add(new RowDelegate.Model("description_id", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_exclamation_mark, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_description, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904));
        aim.e eVarA2 = u.a(eVarB3);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA2);
        return new g(u.a(eVarB), new aw0.g(new n6(new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_reject, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, jCurrentTimeMillis > 0, null, null, 988), (Clause) null, (aw0.f) null, 25));
    }
}
