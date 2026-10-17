package at0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import e8.q;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends FrameLayout {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8979c;
    public final Lazy d;
    public final q e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean getClippingDisabled() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    private final TextView getLabel() {
        return (TextView) this.e.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setEntry(@org.jetbrains.annotations.NotNull xs0.b r2, @org.jetbrains.annotations.NotNull xs0.e r3, @org.jetbrains.annotations.NotNull android.graphics.RectF r4) {
        /*
            r1 = this;
            java.lang.String r0 = "position"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "bounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.widget.TextView r0 = r1.getLabel()
            r3.getClass()
            r3 = 0
            kli.a.c(r0, r3)
            int r3 = r1.getWidth()
            if (r3 != 0) goto L44
            android.widget.TextView r3 = r1.getLabel()
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r0 = "getText(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            int r3 = r3.length()
            if (r3 <= 0) goto L44
            android.widget.TextView r3 = r1.getLabel()
            r0 = 0
            r3.measure(r0, r0)
            android.widget.TextView r3 = r1.getLabel()
            int r3 = r3.getMeasuredWidth()
            goto L48
        L44:
            int r3 = r1.getWidth()
        L48:
            float r0 = r2.f308382a
            int r3 = r3 / 2
            float r3 = (float) r3
            float r0 = r0 - r3
            float r2 = r2.f308383b
            int r3 = r1.f8977a
            float r3 = (float) r3
            float r2 = r2 - r3
            int r3 = r1.getHeight()
            float r3 = (float) r3
            float r2 = r2 - r3
            boolean r3 = r1.getClippingDisabled()
            if (r3 == 0) goto L69
            int r3 = r1.f8979c
            float r3 = (float) r3
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 >= 0) goto L74
            r2 = r3
            goto L74
        L69:
            float r3 = r4.bottom
            int r4 = r1.f8978b
            float r4 = (float) r4
            float r3 = r3 - r4
            r4 = 0
            float r2 = kotlin.ranges.f.f(r2, r4, r3)
        L74:
            r1.setX(r0)
            r1.setY(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: at0.a.setEntry(xs0.b, xs0.e, android.graphics.RectF):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8977a = kli.a.k(context, 16.0f);
        this.f8978b = kli.a.k(context, 2.0f);
        this.f8979c = -kli.a.k(context, 56.0f);
        this.d = j.b(new aqe.a(this, 7));
        this.e = kli.a.J(R$id.stepChartTooltip_label, this);
        View.inflate(context, R$layout.internal_view_step_chart_tooltip, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = kli.a.k(context, 8.0f);
        marginLayoutParams.rightMargin = kli.a.k(context, 8.0f);
        setLayoutParams(marginLayoutParams);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
