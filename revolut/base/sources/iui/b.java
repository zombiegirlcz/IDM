package iui;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.freelancer.common.models.FreelancerProfileSettings;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import fvb.e;
import fvb.f;
import ip0.zj;
import iuj.q;
import iv7.j;
import iw4.o;
import iw4.p;
import iw6.h;
import iw6.k;
import ix6.e0;
import java.util.List;
import java.util.Optional;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import t02.g;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168618a;

    public /* synthetic */ b(int i) {
        this.f168618a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f168618a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return yp0.b.g((List) getDefaultErrorItems.invoke(ivi.a.f168867a), d.b(), null, 0, 0, 126);
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new TextLocalisedClause(R$string.asft_home_button_buy_pass, null, null, 14);
            case 2:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return yp0.b.g((List) getDefaultErrorItems2.invoke(ivi.a.f168867a), d.a(0), null, 0, 0, 126);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return u.c(new FullScreenStateDelegate.Model("ERROR_STATE_ITEM_ID", new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_exclamation_triangle, null, null, 6)), new l6(12, new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1988));
            case 4:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return q.a.f168642a;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 6:
                Throwable th10 = (Throwable) obj2;
                Function1 errorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems, "errorItems");
                return th10 == null ? f0.f322471a : (List) errorItems.invoke(new iii.d(14, null, true, false, null));
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 10:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                j.a aVar = j.Companion;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 11:
                j.a aVar2 = j.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 12:
                ((Integer) obj3).intValue();
                return Boolean.valueOf(((f) obj2).f138415b == e.PENDING);
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 14:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(6, ivk.j.f168877a, true, false, null));
            case 15:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(14, null, false, false, null));
            case 16:
                Function1 errorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems2, "errorItems");
                return new p((List) errorItems2.invoke(new iii.d(14, null, true, false, null)), new o(null, false), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_title, null, null, 14));
            case 17:
                Function1 errorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorItems3, "errorItems");
                return new p((List) errorItems3.invoke(new iii.d(14, null, true, false, null)), new o(null, false), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_statement_financing_setup_screen_title, null, null, 14));
            case 18:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new k(h.f168974a, (List) getDefaultErrorItems6.invoke(new iii.d(12, null, true, true, null)));
            case 19:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 20:
                Throwable error = (Throwable) obj2;
                FreelancerProfileSettings freelancerProfileSettings = (FreelancerProfileSettings) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (freelancerProfileSettings == null) {
                    return error;
                }
                return null;
            case 21:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return new e0(null, (List) getDefaultErrorItems7.invoke(new iii.d(12, null, true, true, null)), null);
            case 22:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                return r0j.a.TWO_BUTTONS_UI;
            case 23:
                Throwable error2 = (Throwable) obj2;
                WidgetisedAnalyticsType widgetisedAnalyticsType = (WidgetisedAnalyticsType) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (widgetisedAnalyticsType == null) {
                    return error2;
                }
                return null;
            case 24:
                Throwable error3 = (Throwable) obj2;
                Optional optional = (Optional) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (optional == null) {
                    return error3;
                }
                return null;
            case 25:
                Throwable error4 = (Throwable) obj2;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (tradingLegalEntityInformation == null) {
                    return error4;
                }
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((iz1.d) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((ApmOnboardingStatus) obj3, "<unused var>");
                return Unit.f186387a;
            case 27:
                Intrinsics.checkNotNullParameter((g) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((ApmQuote) obj3, "<unused var>");
                return Unit.f186387a;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_total_value_title, null, null, 14);
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                TextClause textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new gzg.o(textLocalisedClause, textClause, textClause2, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null);
            default:
                Throwable error5 = (Throwable) obj2;
                iyf.c cVar = (iyf.c) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (cVar == null) {
                    return error5;
                }
                return null;
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f168618a = i;
    }
}
