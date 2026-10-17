package ms0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatTextView f208234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedNumbersView f208235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f208236c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void setHeader(@NotNull aw0.y2 header) {
        Intrinsics.checkNotNullParameter(header, "header");
        kli.a.b(this.f208234a, header.f10620a, ty0.f.f275450a);
        this.f208235b.setCurrentClause(header.f10621b);
        kli.a.b(this.f208236c, header.f10622c, ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(8388659);
        ColorStateList colorStateListU = kli.a.u(R$attr.uikit_colorForeground, context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null, R$attr.internal_textAppearanceEmphasis2);
        appCompatTextView.setId(R$id.internal_contextualHeader_top);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = kli.a.k(context, 8.0f);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextColor(colorStateListU);
        this.f208234a = appCompatTextView;
        AnimatedNumbersView animatedNumbersView = new AnimatedNumbersView(context, null, 6, 0);
        animatedNumbersView.setId(R$id.internal_contextualHeader_title);
        animatedNumbersView.setTextAppearance(R$attr.internal_textAppearanceHeading1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = kli.a.k(context, 4.0f);
        animatedNumbersView.setLayoutParams(layoutParams2);
        animatedNumbersView.setAnimateSpin(true);
        animatedNumbersView.setAutoSize(true);
        animatedNumbersView.setAnimationDuration(600L);
        animatedNumbersView.setTextColor(colorStateListU.getDefaultColor());
        this.f208235b = animatedNumbersView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null, R$attr.internal_textAppearanceBody2);
        appCompatTextView2.setId(R$id.internal_contextualHeader_subtitle);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = kli.a.k(context, 4.0f);
        appCompatTextView2.setLayoutParams(layoutParams3);
        appCompatTextView2.setTextAlignment(5);
        appCompatTextView2.setGravity(8388611);
        appCompatTextView2.setMaxLines(2);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextColor(kli.a.u(R$attr.uikit_colorGreyTone50, context));
        this.f208236c = appCompatTextView2;
        addView(appCompatTextView);
        addView(animatedNumbersView);
        addView(appCompatTextView2);
    }

    public /* synthetic */ e0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
