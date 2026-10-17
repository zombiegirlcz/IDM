package mx0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class w9 extends LinearLayout {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f210077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f210078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f210079c;
    public final AppCompatTextView d;
    public final UIKitTextView e;
    public com.revolut.core.ui_kit.models.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProfileCardModel f210080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v9 f210081h;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w9(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w9(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
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
        this.f210077a = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null, R$attr.internal_textAppearanceHeading1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = kli.a.k(context, 8.0f);
        appCompatTextView2.setLayoutParams(layoutParams2);
        appCompatTextView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLines(1);
        TextViewCompat.setAutoSizeTextTypeWithDefaults(appCompatTextView2, 1);
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(appCompatTextView2, 12, 200, 1, 2);
        this.f210078b = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(context, null, R$attr.internal_textAppearanceEmphasis1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = kli.a.k(context, 8.0f);
        appCompatTextView3.setLayoutParams(layoutParams3);
        appCompatTextView3.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        appCompatTextView3.setGravity(1);
        appCompatTextView3.setLines(1);
        this.f210079c = appCompatTextView3;
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(context, null, R$attr.internal_textAppearanceBody2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = kli.a.k(context, 8.0f);
        appCompatTextView4.setLayoutParams(layoutParams4);
        appCompatTextView4.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        appCompatTextView4.setGravity(1);
        appCompatTextView4.setMaxLines(3);
        appCompatTextView4.setVisibility(8);
        ix0.c0 c0Var = ix0.c0.f169220a;
        kli.a.f(appCompatTextView4, c0Var);
        this.d = appCompatTextView4;
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceBody2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = kli.a.k(context, 16.0f);
        uIKitTextView.setLayoutParams(layoutParams5);
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        uIKitTextView.setGravity(1);
        uIKitTextView.setMaxLines(3);
        uIKitTextView.setVisibility(8);
        kli.a.f(uIKitTextView, c0Var);
        this.e = uIKitTextView;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatTextView3);
        addView(appCompatTextView4);
        addView(uIKitTextView);
    }

    public /* synthetic */ w9(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
