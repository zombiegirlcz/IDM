package ts0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import aw0.n1;
import aw0.p1;
import aw0.p6;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f273915b;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f273916g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f273917h;
    public final e8.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e8.q f273918j;
    public final e8.q k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LinearLayout getIconsView() {
        return (LinearLayout) this.i.f();
    }

    private final TextView getSubTitleView() {
        return (TextView) this.k.f();
    }

    private final TextView getTitleView() {
        return (TextView) this.f273918j.f();
    }

    private final void setIcons(List<p6> list) {
        int size = list.size();
        if (getIconsView().getChildCount() != size) {
            int childCount = size - getIconsView().getChildCount();
            if (getIconsView().getChildCount() > size) {
                getIconsView().removeViews(size, getIconsView().getChildCount() - size);
            } else {
                for (int i = 0; i < childCount; i++) {
                    LinearLayout iconsView = getIconsView();
                    ImageView imageView = new ImageView(getContext());
                    int i2 = this.f273915b;
                    imageView.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
                    imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), R$drawable.internal_histogram_legend_icon_background));
                    iconsView.addView(imageView);
                }
            }
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            p6 p6Var = list.get(i3);
            Integer num = p6Var.f10467b;
            int i5 = p6Var.f10466a;
            int size3 = list.size();
            View childAt = getIconsView().getChildAt(i3);
            Intrinsics.i(childAt, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) childAt;
            if (num != null) {
                Context context = getIconsView().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ImageViewCompat.setImageTintList(imageView2, kli.a.u(num.intValue(), context));
                imageView2.setImageResource(R$drawable.internal_histogram_legend_icon_outline);
            } else {
                imageView2.setImageDrawable(null);
            }
            Context context2 = getIconsView().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ViewCompat.setBackgroundTintList(imageView2, kli.a.u(i5, context2));
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int i6 = this.f273917h;
            if (i3 == 0) {
                layoutParams2.setMargins(0, 0, i6, 0);
            } else if (i3 == size3 - 1) {
                layoutParams2.setMargins(i6, 0, 0, 0);
            } else {
                layoutParams2.setMargins(i6, 0, i6, 0);
            }
        }
    }

    private final void setStyle(n1 n1Var) {
        int i = w.f273914a[n1Var.ordinal()];
        int i2 = this.f;
        int i3 = this.f273916g;
        if (i == 1) {
            getTitleView().setTextColor(i2);
            jb3.l.e(getSubTitleView(), R$attr.internal_textAppearanceBody3);
            getSubTitleView().setTextColor(i3);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getTitleView().setTextColor(i3);
            jb3.l.e(getSubTitleView(), R$attr.internal_textAppearanceEmphasis1);
            getSubTitleView().setTextColor(i2);
        }
    }

    private final void setSubTitle(Clause clause) {
        if (clause == null) {
            getSubTitleView().setVisibility(8);
        } else {
            ty0.c.b(or0.u.k(getSubTitleView()).b0(), clause, getSubTitleView(), null, ty0.d.f275448a, 4);
            getSubTitleView().setVisibility(0);
        }
    }

    private final void setTitle(Clause clause) {
        ty0.c.b(or0.u.k(getTitleView()).b0(), clause, getTitleView(), null, null, 12);
    }

    public final void setModel(@NotNull v model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setIcons(model.f273911a);
        p1 p1Var = model.f273912b;
        setTitle(p1Var.f10457a);
        setSubTitle(p1Var.f10458b);
        setStyle(model.f273913c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f273915b = kli.a.w(R$attr.uikit_dp8, context);
        this.f = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f273916g = kli.a.s(R$attr.uikit_colorGreyTone50, context);
        this.f273917h = kli.a.k(context, 2.0f);
        this.i = kli.a.J(R$id.histogramLegend_icons, this);
        this.f273918j = kli.a.J(R$id.histogramLegend_title, this);
        this.k = kli.a.J(R$id.histogramLegend_subtitle, this);
        View.inflate(context, R$layout.internal_delegate_historam_horizontal_legend, this);
    }

    public /* synthetic */ x(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
