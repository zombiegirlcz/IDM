package au0;

import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class s implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintHeaderLayout f9346b;

    public /* synthetic */ s(ConstraintHeaderLayout constraintHeaderLayout, int i) {
        this.f9345a = i;
        this.f9346b = constraintHeaderLayout;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.f9345a;
        ConstraintHeaderLayout constraintHeaderLayout = this.f9346b;
        switch (i) {
            case 0:
                TextView headerLayout_descriptionText = constraintHeaderLayout.C;
                Intrinsics.checkNotNullExpressionValue(headerLayout_descriptionText, "headerLayout_descriptionText");
                constraintHeaderLayout.j0(headerLayout_descriptionText);
                constraintHeaderLayout.i.onNext(Unit.f186387a);
                break;
            case 1:
                ConstraintHeaderLayout.a aVar = ConstraintHeaderLayout.Companion;
                constraintHeaderLayout.l0();
                constraintHeaderLayout.f.onNext(Unit.f186387a);
                break;
            default:
                ConstraintHeaderLayout.a aVar2 = ConstraintHeaderLayout.Companion;
                constraintHeaderLayout.l0();
                constraintHeaderLayout.f.onNext(Unit.f186387a);
                break;
        }
        return true;
    }
}
