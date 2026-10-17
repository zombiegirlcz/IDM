package ts0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import aw0.c6;
import aw0.p6;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class a0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f273854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f273855b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setIcon(p6 p6Var) {
        Integer num = p6Var.f10467b;
        ImageView imageView = this.f273854a;
        if (num != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ImageViewCompat.setImageTintList(imageView, kli.a.u(p6Var.f10467b.intValue(), context));
            imageView.setImageResource(R$drawable.internal_histogram_legend_icon_outline);
        } else {
            imageView.setImageDrawable(null);
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewCompat.setBackgroundTintList(imageView, kli.a.u(p6Var.f10466a, context2));
    }

    private final void setTitle(Clause clause) {
        AppCompatTextView appCompatTextView = this.f273855b;
        ty0.c.b(or0.u.k(appCompatTextView).b0(), clause, appCompatTextView, null, null, 12);
    }

    public final void setModel(@NotNull c6 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setIcon(model.f10259a);
        setTitle(model.f10260b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        setGravity(16);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R$drawable.internal_histogram_legend_icon_outline);
        imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), R$drawable.internal_histogram_legend_icon_background));
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 8.0f);
        Context context3 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iK, kli.a.k(context3, 8.0f));
        Context context4 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        layoutParams.setMarginEnd(kli.a.k(context4, 4.0f));
        imageView.setLayoutParams(layoutParams);
        this.f273854a = imageView;
        addView(imageView);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        jb3.l.e(appCompatTextView, R$attr.internal_textAppearanceBody3);
        Context context5 = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        appCompatTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context5));
        this.f273855b = appCompatTextView;
        addView(appCompatTextView);
    }

    public /* synthetic */ a0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
