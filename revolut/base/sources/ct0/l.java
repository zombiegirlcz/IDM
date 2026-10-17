package ct0;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    @NotNull
    private static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr0.e f108597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f108598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f108599c;
    public final float d;
    public final TextPaint e;
    public final Paint f;

    public l(Context context, nr0.e textLayoutCache) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textLayoutCache, "textLayoutCache");
        this.f108597a = textLayoutCache;
        this.f108598b = kli.a.l(context, 8.0f);
        this.f108599c = kli.a.l(context, 6.0f);
        this.d = kli.a.l(context, 4.0f);
        TextPaint textPaint = new TextPaint(1);
        jb3.l.d(textPaint, context, R$attr.internal_textAppearanceEmphasis4);
        textPaint.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        textPaint.setTextAlign(Paint.Align.LEFT);
        this.e = textPaint;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(kli.a.s(R$attr.uikit_colorPopoverBackground, context));
        this.f = paint;
    }
}
