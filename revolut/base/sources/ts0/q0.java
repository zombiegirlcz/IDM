package ts0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import aw0.p6;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8.q f273902b;
    public final e8.q f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIconView() {
        return (ImageView) this.f273902b.f();
    }

    private final TextView getTitleView() {
        return (TextView) this.f.f();
    }

    public final void setIcon(p6 p6Var) {
        if (p6Var == null) {
            getIconView().setVisibility(8);
            return;
        }
        Integer num = p6Var.f10467b;
        getIconView().setVisibility(0);
        if (num != null) {
            ImageView iconView = getIconView();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageViewCompat.setImageTintList(iconView, kli.a.u(num.intValue(), context));
            getIconView().setImageResource(R$drawable.internal_histogram_legend_icon_outline);
        } else {
            getIconView().setImageDrawable(null);
        }
        ImageView iconView2 = getIconView();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewCompat.setBackgroundTintList(iconView2, kli.a.u(p6Var.f10466a, context2));
    }

    public final void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        ty0.c.b(or0.u.k(getTitleView()).b0(), title, getTitleView(), null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f273902b = kli.a.J(R$id.histogramLegend_icon, this);
        this.f = kli.a.J(R$id.histogramLegend_title, this);
        View.inflate(context, R$layout.internal_delegate_historam_vertical_legend, this);
        getIconView().setBackground(ContextCompat.getDrawable(context, R$drawable.internal_histogram_legend_icon_background));
    }

    public /* synthetic */ q0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
