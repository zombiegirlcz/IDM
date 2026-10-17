package lu0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends AppCompatImageView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f200011r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f200011r = 1.0d;
    }

    public final double getRatio() {
        return this.f200011r;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((double) View.MeasureSpec.getSize(i)) * this.f200011r), i2), 1073741824));
    }

    public final void setRatio(double d) {
        this.f200011r = d;
        requestLayout();
    }
}
