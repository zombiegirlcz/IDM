package com.trustdockekyc.core.backend.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ksj.b;
import org.jetbrains.annotations.NotNull;
import u2m.e;
import u2m.h;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/trustdockekyc/core/backend/presentation/view/TutorialView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "b", "Landroid/view/View$OnClickListener;", "getButtonClickListener", "()Landroid/view/View$OnClickListener;", "setButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "buttonClickListener", "f", "I", "getButtonViewId", "()I", "buttonViewId", "u2m/e", "u2m/h", "backend_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TutorialView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener buttonClickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int buttonViewId;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f107541g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TutorialView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void f0(h tutorial) {
        Intrinsics.checkNotNullParameter(tutorial, "tutorial");
        e eVar = this.f107541g;
        ImageView imageView = eVar.f276716a;
        View view = eVar.f276722l;
        View view2 = eVar.f276721j;
        int i = tutorial.f276727a;
        Integer num = tutorial.o;
        Integer num2 = tutorial.f276734m;
        imageView.setImageResource(i);
        TextView textView = eVar.f276717b;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        textView.setText(h.a(context, Integer.valueOf(tutorial.f276728b)));
        TextView textView2 = eVar.f276718c;
        textView2.setVisibility(tutorial.f276731h);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.checkNotNullParameter(context2, "context");
        textView2.setText(h.a(context2, tutorial.f276729c));
        TextView textView3 = eVar.d;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        Intrinsics.checkNotNullParameter(context3, "context");
        textView3.setText(h.a(context3, tutorial.d));
        textView3.setVisibility(tutorial.i);
        TextView textView4 = eVar.e;
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        Intrinsics.checkNotNullParameter(context4, "context");
        textView4.setText(h.a(context4, tutorial.e));
        int i2 = tutorial.f276732j;
        textView4.setVisibility(i2);
        eVar.f.setVisibility(i2);
        eVar.f276719g.setVisibility(i2);
        View view3 = eVar.f276720h;
        Integer num3 = tutorial.k;
        view3.setVisibility(num3 != null ? 0 : 8);
        view3.setBackgroundResource(num3 != null ? num3.intValue() : 0);
        TextView textView5 = eVar.i;
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        Intrinsics.checkNotNullParameter(context5, "context");
        textView5.setText(h.a(context5, tutorial.f276733l));
        view2.setVisibility(num2 != null ? 0 : 8);
        view2.setBackgroundResource(num2 != null ? num2.intValue() : 0);
        TextView textView6 = eVar.k;
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        Intrinsics.checkNotNullParameter(context6, "context");
        textView6.setText(h.a(context6, tutorial.f276735n));
        view.setVisibility(num != null ? 0 : 8);
        view.setBackgroundResource(num != null ? num.intValue() : 0);
        TextView textView7 = eVar.f276723m;
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        Intrinsics.checkNotNullParameter(context7, "context");
        textView7.setText(h.a(context7, tutorial.f276736p));
        Button button = eVar.f276724n;
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
        Intrinsics.checkNotNullParameter(context8, "context");
        button.setText(h.a(context8, Integer.valueOf(tutorial.f276730g)));
        invalidate();
        requestLayout();
    }

    public final View.OnClickListener getButtonClickListener() {
        return this.buttonClickListener;
    }

    public final int getButtonViewId() {
        return this.buttonViewId;
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        this.buttonClickListener = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TutorialView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TutorialView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TutorialView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.buttonViewId = R.id.startRecordingButton;
        LayoutInflater.from(context).inflate(R.layout.tdcoreekyc__view_tutorial, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.imageView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.descriptionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.subDescriptionText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.remarkText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.warningText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.lineView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        View viewFindViewById7 = findViewById(R.id.unauthorizedPatternView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        View viewFindViewById8 = findViewById(R.id.ngLeftImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        View viewFindViewById9 = findViewById(R.id.ngLeftText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById9, "findViewById(...)");
        TextView textView5 = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R.id.ngCenterImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById10, "findViewById(...)");
        View viewFindViewById11 = findViewById(R.id.ngCenterText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById11, "findViewById(...)");
        TextView textView6 = (TextView) viewFindViewById11;
        View viewFindViewById12 = findViewById(R.id.ngRightImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById12, "findViewById(...)");
        View viewFindViewById13 = findViewById(R.id.ngRightText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById13, "findViewById(...)");
        View viewFindViewById14 = findViewById(R.id.startRecordingButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById14, "findViewById(...)");
        Button button = (Button) viewFindViewById14;
        this.f107541g = new e(imageView, textView, textView2, textView3, textView4, viewFindViewById6, viewFindViewById7, viewFindViewById8, textView5, viewFindViewById10, textView6, viewFindViewById12, (TextView) viewFindViewById13, button);
        b.u(button, new c2m.b(this, 7));
    }
}
