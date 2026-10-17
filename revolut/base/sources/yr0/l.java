package yr0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f316074a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f316074a = kli.a.k(context, 512.0f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.f316074a, rim.d.c(View.MeasureSpec.getSize(i2) * 0.75f)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
