package nr0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f218505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f218507c;
    public final TextDirectionHeuristic d;
    public final Integer e;
    public final TextUtils.TruncateAt f;

    public static final class a {
        private a() {
        }
    }

    public c(int i, int i2, Integer num, TextUtils.TruncateAt truncateAt, int i3) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
        alignment = (i3 & 4) != 0 ? Layout.Alignment.ALIGN_NORMAL : alignment;
        textDirectionHeuristic = (i3 & 8) != 0 ? null : textDirectionHeuristic;
        num = (i3 & 16) != 0 ? null : num;
        truncateAt = (i3 & 32) != 0 ? null : truncateAt;
        this.f218505a = i;
        this.f218506b = i2;
        this.f218507c = alignment;
        this.d = textDirectionHeuristic;
        this.e = num;
        this.f = truncateAt;
    }

    public final StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i) {
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(this.f218507c).setIncludePad(false);
        Integer num = this.e;
        if (num != null) {
            Intrinsics.h(includePad);
            includePad.setMaxLines(num.intValue());
        }
        TextUtils.TruncateAt truncateAt = this.f;
        if (truncateAt != null) {
            Intrinsics.h(includePad);
            includePad.setEllipsize(truncateAt);
        }
        TextDirectionHeuristic textDirectionHeuristic = this.d;
        if (textDirectionHeuristic != null) {
            includePad.setTextDirection(textDirectionHeuristic);
        }
        StaticLayout staticLayoutBuild = includePad.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild;
    }

    public c() {
        this(-1, -1, null, null, 60);
    }
}
