package com.revolut.crypto.challenge.impl.dialog.conditions;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.c7;
import aw0.d7;
import aw0.e;
import aw0.n6;
import aw0.o9;
import c11.a;
import c11.c;
import c11.d;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.k;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.crypto.challenge.api.R$string;
import com.revolut.crypto.challenge.impl.model.ChallengeStatusDetails;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.v5;
import pki.b;
import vc.s;
import z4l.j;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/crypto/challenge/impl/dialog/conditions/ConditionsBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Laii/q;", "Companion", "a", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConditionsBottomSheetController extends SimpleViewController<q> {
    public final ConditionsBottomSheetContract$InputData N;
    public final int O;
    public final d P;
    public final c Q;
    public final h R;
    public final j S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ConditionsBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};

    public ConditionsBottomSheetController(ConditionsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_recycler_navbar_action_footer;
        this.P = new d();
        this.Q = c.f20318a;
        this.R = s.t(this, a.f);
        this.S = new j(7, u.c(new PlainTextDelegate()), false);
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_subtitle, u.c(new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_subtitle_faq, null, new Click(30, (Integer) null, (Object) null, "FAQ_LINK_ID", false), 10)), null, 12));
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        j jVar = this.S;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.setVisibility(0);
        screenContentRecyclerView.addItemDecoration(new o31.b());
        this.Q.getClass();
        ConditionsBottomSheetContract$InputData inputData = this.N;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        int i = R$string.crypto_challenge_progress_conditions_dialog_explanation;
        com.revolut.core.ui_kit.models.j jVar2 = c7.Companion;
        LocalDate localDate = inputData.f60104a.f60109b.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        TimeClause timeClauseB = com.revolut.core.ui_kit.models.j.b(jVar2, localDate, new LocalDateClause$DateFormat.DayAndMonth(0));
        k kVar = d7.Companion;
        ChallengeStatusDetails challengeStatusDetails = inputData.f60104a;
        LocalTime localTime = challengeStatusDetails.f60109b.toLocalTime();
        Intrinsics.checkNotNullExpressionValue(localTime, "toLocalTime(...)");
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("EXPLANATION_SECTION_ID", (Clause) null, (Clause) new TextLocalisedClause(i, v.k(timeClauseB, k.a(kVar, localTime)), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_deposit_crypto_section_title, null, null, 14);
        int i2 = R$string.crypto_challenge_progress_conditions_dialog_deposit_crypto_section_message;
        LocalDate localDate2 = challengeStatusDetails.f60108a.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate2, "toLocalDate(...)");
        TimeClause timeClauseA = com.revolut.core.ui_kit.models.j.a(localDate2, new LocalDateClause$DateFormat.DayAndMonth(0), null);
        LocalDateTime localDateTime = challengeStatusDetails.f60109b;
        LocalDate localDate3 = localDateTime.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate3, "toLocalDate(...)");
        List listK = v.k(model, new PlainTextDelegate.Model("DEPOSIT_CRYPTO_SECTION_ID", (UrlImage) null, textLocalisedClause, new TextLocalisedClause(i2, v.k(timeClauseA, com.revolut.core.ui_kit.models.j.a(localDate3, new LocalDateClause$DateFormat.DayAndMonth(0), null), c.a(inputData, f11.c.PREMIUM), c.a(inputData, f11.c.METAL), c.a(inputData, f11.c.ULTRA), new CurrencyClause(challengeStatusDetails.f60110c.f60107a.f115083b, null, null, 6)), null, 12), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("ELIGIBLE_SECTION_ID", (UrlImage) null, new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_eligible_cryptos_section_title, null, null, 14), new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_eligible_cryptos_section_message, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model2);
        PlainTextDelegate.Model model3 = new PlainTextDelegate.Model("PLAN_ACTIVATION_SECTION_ID", (UrlImage) null, new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_plan_activation_section_title, null, null, 14), new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_plan_activation_section_message, null, null, 14), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        List listC2 = u.c(model3);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_withdrawals_section_title, null, null, 14);
        int i3 = R$string.crypto_challenge_progress_conditions_dialog_withdrawals_section_message;
        LocalDate localDate4 = localDateTime.toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate4, "toLocalDate(...)");
        PlainTextDelegate.Model model4 = new PlainTextDelegate.Model("WITHDRAWALS_SECTION_ID", (UrlImage) null, textLocalisedClause2, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(i3, u.c(com.revolut.core.ui_kit.models.j.a(localDate4, new LocalDateClause$DateFormat.DayAndMonth(0), null)), null, 12), new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_withdrawals_section_message_learn_more, null, new Click(30, (Integer) null, (Object) null, "LEARN_MORE_ID", false), 10))), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        jVar.c(w.u(v.k(listK, listC, listC2, u.c(model4))));
        d3().f174533b.setModel(new e(true, null, null, new n6(new TextLocalisedClause(R$string.crypto_challenge_progress_conditions_dialog_cta_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 54));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c11.b(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c11.b(this, null, 1), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }
}
