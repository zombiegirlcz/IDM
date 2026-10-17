package au0;

import android.widget.TextView;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintHeaderLayout f9317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Clause f9318c;

    public /* synthetic */ q(ConstraintHeaderLayout constraintHeaderLayout, Clause clause, int i) {
        this.f9316a = i;
        this.f9317b = constraintHeaderLayout;
        this.f9318c = clause;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f9316a;
        Clause clause = this.f9318c;
        ConstraintHeaderLayout constraintHeaderLayout = this.f9317b;
        ty0.a it8 = (ty0.a) obj2;
        switch (i) {
            case 0:
                ConstraintHeaderLayout.Companion companion = ConstraintHeaderLayout.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                py0.f fVarN0 = or0.u.k(constraintHeaderLayout).n0();
                TextView headerLayout_descriptionText = constraintHeaderLayout.C;
                Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
                fVarN0.a(headerLayout_descriptionText, constraintHeaderLayout, clause != null ? new py0.c(clause) : null);
                constraintHeaderLayout.f57247l.onNext(it8);
                break;
            default:
                ConstraintHeaderLayout.Companion companion2 = ConstraintHeaderLayout.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                py0.f fVarN02 = or0.u.k(constraintHeaderLayout).n0();
                TextView headerLayout_secondDescriptionText = constraintHeaderLayout.D;
                Intrinsics.checkNotNullExpressionValue(headerLayout_secondDescriptionText, "headerLayout_secondDescriptionText");
                fVarN02.a(headerLayout_secondDescriptionText, constraintHeaderLayout, clause != null ? new py0.c(clause) : null);
                constraintHeaderLayout.f57249n.onNext(it8);
                break;
        }
        return Unit.f186387a;
    }
}
