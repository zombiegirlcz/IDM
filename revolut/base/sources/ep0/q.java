package ep0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import com.revolut.core.ui_kit.R$dimen;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends m implements t {

    @NotNull
    private static final p Companion = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f128046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128047c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f128048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f128049h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f128050j;

    public q(Context context, int i, int i2, int i3, int i5, int i6) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128046b = i;
        this.f128047c = i2;
        this.d = i3;
        this.e = i5;
        this.f = i6;
        this.f128048g = i == -1 || i2 == -1 || i3 == -1 || i5 == -1 || i6 == -1;
        this.f128049h = context.getResources().getDimensionPixelSize(R$dimen.internal_html_bullet_radius);
        this.i = context.getResources().getDimensionPixelSize(R$dimen.internal_html_bullet_gap);
        this.f128050j = d.a(context);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas c2, Paint p2, int i, int i2, int i3, int i5, int i6, CharSequence text, int i21, int i22, boolean z, Layout l2) {
        int leadingMargin;
        float fMax;
        int leadingMargin2;
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(p2, "p");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(l2, "l");
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if ((spanned != null ? spanned.getSpanStart(this) : -1) != i21) {
            return;
        }
        boolean z3 = this.f128048g;
        if (z3) {
            int lineCount = l2.getLineCount();
            int i32 = 0;
            while (true) {
                if (i32 >= lineCount) {
                    leadingMargin2 = getLeadingMargin(false);
                    break;
                } else {
                    if (l2.getLineStart(i32) == i21) {
                        leadingMargin2 = l2.getParagraphLeft(i32);
                        break;
                    }
                    i32++;
                }
            }
            leadingMargin = leadingMargin2 / getLeadingMargin(false);
        } else {
            leadingMargin = this.f128047c;
        }
        Paint.Style style = p2.getStyle();
        float strokeWidth = p2.getStrokeWidth();
        int i33 = this.f128050j;
        int i43 = this.f128049h;
        if (z3) {
            fMax = i43;
        } else {
            float f = i43;
            fMax = Math.max(f, (this.f128042a * f) / i33);
        }
        float f4 = i;
        float leadingMargin3 = (getLeadingMargin(true) * i2) + f4;
        p2.setStyle(leadingMargin <= 1 ? Paint.Style.FILL : Paint.Style.STROKE);
        p2.setStrokeWidth(0.4f * fMax);
        float strokeWidth2 = leadingMargin <= 1 ? fMax : fMax - (p2.getStrokeWidth() * 0.5f);
        float fMax2 = z3 ? this.i : this.f + Math.max(12.0f, (this.f128042a * 12.0f) / i33);
        c2.drawCircle(i2 > 0 ? Math.max(f4 + strokeWidth2, (leadingMargin3 - strokeWidth2) - fMax2) : Math.min(f4 - strokeWidth2, leadingMargin3 + strokeWidth2 + fMax2), l2.getLineBaseline(l2.getLineForOffset(i21)) - (fMax * 2.0f), strokeWidth2, p2);
        p2.setStyle(style);
        p2.setStrokeWidth(strokeWidth);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!q.class.equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.clause.spans.HtmlBulletSpan");
        q qVar = (q) obj2;
        return this.f128046b == qVar.f128046b && this.f128047c == qVar.f128047c && this.d == qVar.d && this.e == qVar.e && this.f == qVar.f;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        if (this.f128048g) {
            return (this.f128049h * 2) + this.i;
        }
        return a(this.d, this.e, this.f128050j, this.f128046b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f128046b), Integer.valueOf(this.f128047c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public /* synthetic */ q(Context context) {
        this(context, -1, -1, -1, -1, -1);
    }
}
