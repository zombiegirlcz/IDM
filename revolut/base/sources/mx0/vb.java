package mx0;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit.views.LabelButtonView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class vb extends LinearLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f210057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f210058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f210059c;
    public final LabelButtonView d;
    public final fp0.p e;
    public com.revolut.core.ui_kit.models.s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProfileCardModel f210060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v9 f210061h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vb(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vb(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb(@NotNull Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null, R$attr.internal_textAppearanceBody2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = kli.a.k(context, 8.0f);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        appCompatTextView.setGravity(1);
        appCompatTextView.setMaxLines(2);
        appCompatTextView.setVisibility(8);
        ix0.c0 c0Var = ix0.c0.f169220a;
        appCompatTextView.setMovementMethod(c0Var);
        this.f210057a = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null, R$attr.internal_textAppearanceLargeSubheader);
        appCompatTextView2.setId(R$id.profileCardSmallContent_title);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = kli.a.k(context, 8.0f);
        appCompatTextView2.setLayoutParams(layoutParams2);
        appCompatTextView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setLines(1);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(appCompatTextView2, 1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatTextView2, 12, 24, 1, 2);
        this.f210058b = appCompatTextView2;
        fp0.p.Companion.getClass();
        this.e = fp0.m.a(appCompatTextView2, gp0.b.f145198a);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context, null, R$attr.internal_textAppearanceBody2);
        appCompatTextView3.setId(R$id.profileCardSmallContent_subtitle);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = kli.a.k(context, 8.0f);
        appCompatTextView3.setLayoutParams(layoutParams3);
        appCompatTextView3.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        appCompatTextView3.setGravity(1);
        appCompatTextView3.setMaxLines(3);
        appCompatTextView3.setMovementMethod(c0Var);
        this.f210059c = appCompatTextView3;
        LabelButtonView labelButtonView = new LabelButtonView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = kli.a.k(context, 8.0f);
        labelButtonView.setLayoutParams(layoutParams4);
        labelButtonView.setGravity(1);
        this.d = labelButtonView;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatTextView3);
        addView(labelButtonView);
    }

    public /* synthetic */ vb(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
