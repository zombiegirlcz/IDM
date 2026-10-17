package au0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintHeaderLayout f9330b;

    public /* synthetic */ r(ConstraintHeaderLayout constraintHeaderLayout, int i) {
        this.f9329a = i;
        this.f9330b = constraintHeaderLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9329a;
        ConstraintHeaderLayout constraintHeaderLayout = this.f9330b;
        switch (i) {
            case 0:
                AppCompatTextView headerLayout_titleTopDescription = constraintHeaderLayout.f57254t;
                Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopDescription, "headerLayout_titleTopDescription");
                constraintHeaderLayout.j0(headerLayout_titleTopDescription);
                constraintHeaderLayout.f57244g.onNext(Unit.f186387a);
                break;
            case 1:
                AppCompatTextView headerLayout_titleTopNote = constraintHeaderLayout.v;
                Intrinsics.checkNotNullExpressionValue(headerLayout_titleTopNote, "headerLayout_titleTopNote");
                constraintHeaderLayout.j0(headerLayout_titleTopNote);
                constraintHeaderLayout.f57244g.onNext(Unit.f186387a);
                break;
            case 2:
                TextView headerLayout_descriptionText = constraintHeaderLayout.C;
                Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
                constraintHeaderLayout.j0(headerLayout_descriptionText);
                constraintHeaderLayout.f57245h.onNext(constraintHeaderLayout.f57251q);
                break;
            case 3:
                ConstraintHeaderLayout.a aVar = ConstraintHeaderLayout.Companion;
                constraintHeaderLayout.l0();
                constraintHeaderLayout.f57243b.onNext(Unit.f186387a);
                break;
            default:
                ConstraintHeaderLayout.a aVar2 = ConstraintHeaderLayout.Companion;
                constraintHeaderLayout.l0();
                constraintHeaderLayout.f57243b.onNext(Unit.f186387a);
                break;
        }
    }
}
