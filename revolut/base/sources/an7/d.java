package an7;

import amh.j;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionInfo;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.LinkedHashMap;
import java.util.List;
import kl7.p1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Answer.PenaltyPoints p0 = (Answer.PenaltyPoints) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.a aVar = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.a) this.receiver;
        aVar.getClass();
        if (jl7.b.a(p0)) {
            boolean z = p0 != Answer.PenaltyPoints.ONE_POINT;
            aVar.Y1(new BinaryQuestionsScreen(new BinaryQuestionsScreenContract$InputData(R$string.car_insurance_question_penalty_details_title, (Integer) null, v.k(new BinaryQuestionInfo(p1.PENALTY_BY_JUDGE, new TextLocalisedClause(z ? R$string.car_insurance_question_penalty_details_by_judge_subheader : R$string.car_insurance_question_penalty_details_by_judge_subheader_singular, null, null, 14), null), new BinaryQuestionInfo(p1.PENALTY_FOR_SPECIFIC_REASONS, new TextLocalisedClause(z ? R$string.car_insurance_question_penalty_details_for_specific_reasons_subheader : R$string.car_insurance_question_penalty_details_for_specific_reasons_subheader_singular, null, null, 14), new TextLocalisedClause(R$string.car_insurance_question_penalty_details_for_specific_reasons_text, null, null, 14))), (LinkedHashMap) null, (List) null, 58)), ModalDestination.Style.POPUP.f98311a, new j(p0, aVar, 4));
        } else {
            aVar.G2(new c(new Survey.LicencePenalties(p0, null, null)));
        }
        return Unit.f186387a;
    }
}
