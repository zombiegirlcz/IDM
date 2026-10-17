package me4;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import ip0.kr;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyInputControllerContract$InputData f204614a;

    public q(MoneyInputControllerContract$InputData inputData, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f204614a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        MoneyInputControllerContract$InputData moneyInputControllerContract$InputData = this.f204614a;
        ResourceImage resourceImageA = q74.b.a(moneyInputControllerContract$InputData.f68024a);
        int i = R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_money_input_title;
        xy3.h hVar = moneyInputControllerContract$InputData.f68025b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(hVar.f309576b), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_money_input_second_description, u.c(hVar.f309577c), null, 12);
        dj0.d dVar = domainState.f204602a;
        dj0.d dVar2 = dVar.f115082a != 0 ? dVar : null;
        InputTextDelegate.Model model = new InputTextDelegate.Model("money-input", dVar2 != null ? new MoneyClause(dVar2, new MoneyClause.Format.Editable(), null, null, 12) : null, new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_money_input_input_label, u.c(hVar.d), null, 12), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, kr.f165065a, 6, null, null, false, true, null, null, true, null, false, false, null, false, false, 0, false, false, null, hVar.e, null, null, 0, 0, 0, 0, -610271240, 65023);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new o(u.c(model), resourceImageA, textLocalisedClause, textLocalisedClause2, domainState.f204602a.f115082a > 0, new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_money_input_button, u.c(hVar.f), null, 12));
    }
}
