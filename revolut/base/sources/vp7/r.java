package vp7;

import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.claims_details.ClaimsDetailsScreenContract$InputData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kl7.n1;
import kl7.p1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends jki.g implements k {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l80.e f291133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tl7.f f291134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f291135r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jki.p stateMapper, ClaimsDetailsScreenContract$InputData inputData, l80.e dateProvider, tl7.f bottomDialog) {
        ArrayList arrayList;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f291133p = dateProvider;
        this.f291134q = bottomDialog;
        List list = inputData.f75640b;
        int size = list.size();
        int i = inputData.f75639a;
        if (size == i) {
            List<Survey.Claims.Details> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (Survey.Claims.Details details : list2) {
                Intrinsics.checkNotNullParameter(details, "<this>");
                arrayList.add(new b(details.f75319a, details.f75320b, details.f75321c, details.d));
            }
        } else {
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(new b(null, null, null, null));
            }
            arrayList = arrayList2;
        }
        this.f291135r = new i(arrayList);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f291135r;
    }

    public final void y2(Object obj2) {
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.insurance_car.impl.data.model.PositionalQuestion");
        n1 n1Var = (n1) obj2;
        final int i = n1Var.f185362a;
        p1 p1Var = n1Var.f185363b;
        int i2 = q.f291132a[p1Var.ordinal()];
        if (i2 != 3) {
            if (i2 == 4) {
                final int i3 = 1;
                this.f291134q.Q(R$string.car_insurance_question_claim_details_claim_type, zhm.p.c(Answer.ClaimType.values()), ((b) ((i) t2()).f291116a.get(i)).f291114b, new Function1(this) { // from class: vp7.n

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ r f291124b;

                    {
                        this.f291124b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                            case 0:
                                LocalDate answer = (LocalDate) obj3;
                                Intrinsics.checkNotNullParameter(answer, "answer");
                                this.f291124b.x2(new p(i, 0, answer));
                                break;
                            default:
                                Answer.ClaimType answer2 = (Answer.ClaimType) obj3;
                                Intrinsics.checkNotNullParameter(answer2, "answer");
                                this.f291124b.x2(new o(i, answer2, 0));
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return;
            } else {
                throw new IllegalStateException(("unexpected question " + p1Var).toString());
            }
        }
        LocalDate localDateE = ((l80.f) this.f291133p).e();
        int i5 = R$string.car_insurance_question_claim_details_claim_date;
        LocalDate localDateMinusYears = localDateE.minusYears(5L);
        Intrinsics.checkNotNullExpressionValue(localDateMinusYears, "minusYears(...)");
        LocalDate localDate = ((b) ((i) t2()).f291116a.get(i)).f291113a;
        LocalDate localDate2 = localDate == null ? localDateE : localDate;
        final int i6 = 0;
        this.f291134q.T(i5, localDateMinusYears, localDateE, localDate2, new Function1(this) { // from class: vp7.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f291124b;

            {
                this.f291124b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i6) {
                    case 0:
                        LocalDate answer = (LocalDate) obj3;
                        Intrinsics.checkNotNullParameter(answer, "answer");
                        this.f291124b.x2(new p(i, 0, answer));
                        break;
                    default:
                        Answer.ClaimType answer2 = (Answer.ClaimType) obj3;
                        Intrinsics.checkNotNullParameter(answer2, "answer");
                        this.f291124b.x2(new o(i, answer2, 0));
                        break;
                }
                return Unit.f186387a;
            }
        });
    }
}
