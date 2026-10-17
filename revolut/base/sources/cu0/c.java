package cu0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import ihm.f;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import or0.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f108710b;
    public final ProgressBar f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressBar f108711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f108712h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f108713j;
    public final TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f108714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f108715m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setData$default(c cVar, Clause clause, Clause clause2, int i, Clause clause3, Clause clause4, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            clause = null;
        }
        if ((i3 & 2) != 0) {
            clause2 = null;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            clause3 = null;
        }
        if ((i3 & 16) != 0) {
            clause4 = null;
        }
        if ((i3 & 32) != 0) {
            i2 = 0;
        }
        cVar.setData(clause, clause2, i, clause3, clause4, i2);
    }

    public final ScaleDrawable f0(Integer num) {
        GradientDrawable gradientDrawableK = v7.k(0);
        gradientDrawableK.setCornerRadius(this.f108710b);
        gradientDrawableK.setColor(io0.a.d(0.1f, num.intValue()));
        return new ScaleDrawable(gradientDrawableK, 8388611, 1.0f, -1.0f);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f.setClickable(z);
        this.f108711g.setClickable(z);
    }

    public final void setData(Clause clause, Clause clause2, int i, Clause clause3, Clause clause4, int i2) {
        kli.a.b(this.f108712h, clause, ty0.f.f275450a);
        kli.a.b(this.f108713j, clause2, ty0.f.f275450a);
        ProgressBar progressBar = this.f;
        progressBar.setProgress(i);
        kli.a.b(this.i, clause3, ty0.f.f275450a);
        kli.a.b(this.k, clause4, ty0.f.f275450a);
        ProgressBar progressBar2 = this.f108711g;
        progressBar2.setProgress(i2);
        TrackableItem.INSTANCE.getClass();
        CustomTrackableComponent customTrackableComponentA = TrackableItem.Companion.a(this, null);
        py0.c cVar = clause2 != null ? new py0.c(clause2) : null;
        m.a(progressBar);
        progressBar.setOnClickListener(new b(customTrackableComponentA, cVar, this, 0));
        CustomTrackableComponent customTrackableComponentA2 = TrackableItem.Companion.a(this, null);
        py0.c cVar2 = clause4 != null ? new py0.c(clause4) : null;
        m.a(progressBar2);
        progressBar2.setOnClickListener(new b(customTrackableComponentA2, cVar2, this, 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        float fL = kli.a.l(context, 4.0f);
        this.f108710b = fL;
        int iS = kli.a.s(R$attr.uikit_colorActionBackgroundNeutral, context);
        this.f108714l = v0.a.d("create(...)");
        this.f108715m = v0.a.d("create(...)");
        int iS2 = kli.a.s(R$attr.uikit_colorPerformancePositive, context);
        int iS3 = kli.a.s(R$attr.uikit_colorPerformanceNegative, context);
        View.inflate(context, R$layout.internal_order_book_price_row, this);
        View viewFindViewById = findViewById(R$id.progress_left);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ProgressBar progressBar = (ProgressBar) viewFindViewById;
        this.f = progressBar;
        View viewFindViewById2 = findViewById(R$id.progress_right);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        ProgressBar progressBar2 = (ProgressBar) viewFindViewById2;
        this.f108711g = progressBar2;
        View viewFindViewById3 = findViewById(R$id.priceRow_bidAmountText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f108712h = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.priceRow_askAmountText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.i = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.priceRow_bidPriceText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f108713j = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.priceRow_askPriceText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.k = (TextView) viewFindViewById6;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(iS), f0(Integer.valueOf(iS2)), dr0.b.h(fL, 0, 0, 0, 0));
        RippleDrawable rippleDrawable2 = new RippleDrawable(ColorStateList.valueOf(iS), f0(Integer.valueOf(iS3)), dr0.b.h(fL, 0, 0, 0, 0));
        progressBar.setProgressTintList(ColorStateList.valueOf(iS2));
        progressBar.setProgressDrawable(rippleDrawable);
        progressBar2.setProgressTintList(ColorStateList.valueOf(iS3));
        progressBar2.setProgressDrawable(rippleDrawable2);
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
