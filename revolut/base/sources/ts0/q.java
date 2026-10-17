package ts0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import aw0.c1;
import aw0.d1;
import com.revolut.core.ui_kit.internal.views.LabelView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends LinearLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f273899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LabelView f273900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fp0.p f273901c;
    public final ihm.f d;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setSecondaryDescription(c1 c1Var) {
        LabelView labelView = this.f273900b;
        labelView.setVisibility(8);
        labelView.setEndIcon(null);
        a();
    }

    public final void a() {
        isEnabled();
        fp0.p pVar = this.f273901c;
        fp0.p.b(pVar, false);
        View view = pVar.f137029a;
        or0.m.a(view);
        or0.u.o(view);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        a();
    }

    public final void setModel(@NotNull d1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        kli.a.b(this.f273899a, model.f10276a, ty0.f.f275450a);
        setSecondaryDescription(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        TrackableItem.INSTANCE.getClass();
        TrackableItem.Companion.a(this, null);
        this.d = v0.a.d("create(...)");
        setOrientation(1);
        setGravity(17);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody2);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setMaxLines(1);
        Context context2 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
        this.f273899a = appCompatTextView;
        addView(appCompatTextView);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        LabelView labelView = new LabelView(context3, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        Context context4 = labelView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        layoutParams.topMargin = kli.a.k(context4, 24.0f);
        Context context5 = labelView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        int iK = kli.a.k(context5, 16.0f);
        layoutParams.setMarginStart(iK);
        layoutParams.setMarginEnd(iK);
        labelView.setLayoutParams(layoutParams);
        labelView.setGravity(8388627);
        Context context6 = labelView.getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        labelView.setEndIconPadding(kli.a.k(context6, 4.0f));
        labelView.setTextAppearance(R$attr.internal_textAppearanceEmphasis2);
        Context context7 = labelView.getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        labelView.setTextColor(kli.a.u(R$attr.uikit_colorGreyTone50, context7));
        labelView.setMaxLines(1);
        this.f273900b = labelView;
        addView(labelView);
        this.f273901c = labelView.getClickHandler();
    }

    public /* synthetic */ q(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
