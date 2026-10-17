package ep0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i extends m {

    @NotNull
    private static final h Companion = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f128030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128031c;
    public final int d;
    public final int e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f128032g;

    public i(Drawable icon, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f128030b = icon;
        this.f128031c = i;
        this.d = i2;
        this.e = i3;
        this.f = new g();
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas c2, Paint p2, int i, int i2, int i3, int i5, int i6, CharSequence text, int i21, int i22, boolean z, Layout l2) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(p2, "p");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(l2, "l");
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if ((spanned != null ? spanned.getSpanStart(this) : -1) != i21) {
            return;
        }
        int lineBaseline = l2.getLineBaseline(l2.getLineForOffset(i21));
        float textSize = p2.getTextSize();
        int i32 = (int) (((double) textSize) * 0.9d);
        int leadingMargin = (getLeadingMargin(true) * i2) + i;
        int i33 = this.d;
        int iMax = i2 > 0 ? Math.max(i, (leadingMargin - i33) - i32) : Math.min(i - i32, leadingMargin + i33);
        c2.save();
        c2.translate(iMax, lineBaseline - textSize);
        Drawable drawable = this.f128030b;
        drawable.setBounds(0, 0, i32, i32);
        Paint paintA = this.f.a(p2, text, i21, i22);
        if (paintA.getColor() != this.f128032g) {
            int color = paintA.getColor();
            this.f128032g = color;
            drawable.setTint(color);
        }
        drawable.draw(c2);
        c2.restore();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f128030b.getConstantState() == iVar.f128030b.getConstantState() && this.f128031c == iVar.f128031c && this.d == iVar.d && this.e == iVar.e;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return a(this.f128031c, 0, this.e, 1);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f128030b, Integer.valueOf(this.f128031c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }
}
