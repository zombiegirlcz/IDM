package bmk;

import bmk.b;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import y7a.t;
import y7a.v;
import y7a.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16861a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f16862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f16863c;

    public /* synthetic */ e(Function0 function0, Function1 function1) {
        this.f16863c = function0;
        this.f16862b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 function0;
        switch (this.f16861a) {
            case 0:
                b.AbstractC0116b result = (b.AbstractC0116b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                this.f16863c.invoke();
                this.f16862b.invoke(result);
                break;
            default:
                v outputData = (v) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                w wVar = outputData.f311454a;
                if (wVar instanceof sp7.a) {
                    Answer answer = ((sp7.a) wVar).f264901a;
                    Intrinsics.i(answer, "null cannot be cast to non-null type T of com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.answer_picker.AnswerPickerInteractorKt.showAnswerPickerScreen");
                    this.f16862b.invoke(answer);
                } else if ((wVar instanceof t) && (function0 = this.f16863c) != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ e(Function1 function1, Function0 function0) {
        this.f16862b = function1;
        this.f16863c = function0;
    }
}
