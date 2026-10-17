package com.revolut.core.ui_kit.internal.views.revpoints;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import aw0.o9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mu0.a;
import mu0.b;
import org.jetbrains.annotations.NotNull;
import ty0.f;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0011R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/revpoints/RevPointsPriceView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lnw0/a;", "content", "", "setContent", "(Lnw0/a;)V", "", "getPriceText", "()Ljava/lang/CharSequence;", "getPointsText", "Lmu0/a;", "value", "c", "Lmu0/a;", "getStyle", "()Lmu0/a;", "setStyle", "(Lmu0/a;)V", "style", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevPointsPriceView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f57507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f57508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RevPointsPriceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final CharSequence getPointsText() {
        return this.f57508b.getText();
    }

    public final CharSequence getPriceText() {
        return this.f57507a.getText();
    }

    @NotNull
    public final a getStyle() {
        return this.style;
    }

    public final void setContent(@NotNull nw0.a content) {
        Float fValueOf = Float.valueOf(14.0f);
        Intrinsics.checkNotNullParameter(content, "content");
        kli.a.b(this.f57507a, content.f219752b, f.f275450a);
        kli.a.b(this.f57508b, content.f219751a != null ? new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_24_rev_points, (Integer) null, fValueOf, fValueOf, 18), new NumberClause(content.f219751a, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), null, 10), new TextClause(" + ", (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorForeground), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, null, null, 14) : null, f.f275450a);
    }

    public final void setStyle(@NotNull a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.style != value) {
            int i = b.f208942a[value.ordinal()];
            TextView textView = this.f57507a;
            TextView textView2 = this.f57508b;
            if (i == 1) {
                l.e(textView2, R$attr.internal_textAppearanceEmphasis2);
                l.e(textView, R$attr.internal_textAppearanceEmphasis2);
            } else if (i == 2) {
                l.e(textView2, R$attr.internal_textAppearanceEmphasis1);
                l.e(textView, R$attr.internal_textAppearanceEmphasis1);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                l.e(textView2, R$attr.internal_textAppearanceEmphasis1);
                l.e(textView, R$attr.internal_textAppearanceHeading3);
            }
            this.style = value;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RevPointsPriceView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevPointsPriceView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.style = a.LARGE;
        setOrientation(0);
        View.inflate(context, R$layout.internal_view_rev_point_price, this);
        View viewFindViewById = findViewById(R$id.revPointsPrice_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f57507a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.revPointsPrice_points);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f57508b = (TextView) viewFindViewById2;
    }

    public /* synthetic */ RevPointsPriceView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
