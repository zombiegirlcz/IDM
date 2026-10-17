package bt0;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import aw0.r1;
import ht0.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr0.e f18228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f18229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f18230c;
    public final b0 d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f18231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f18232h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f18233j;
    public r1 k;

    public g(Context context, nr0.e textLayoutCache, TextPaint textPaint, Paint backgroundPaint, b0 invalidationCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textLayoutCache, "textLayoutCache");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(backgroundPaint, "backgroundPaint");
        Intrinsics.checkNotNullParameter(invalidationCallback, "invalidationCallback");
        this.f18228a = textLayoutCache;
        this.f18229b = textPaint;
        this.f18230c = backgroundPaint;
        this.d = invalidationCallback;
        this.e = kli.a.l(context, 12.0f);
        this.f = kli.a.l(context, 12.0f);
        this.f18231g = kli.a.l(context, 16.0f);
        this.f18232h = kli.a.l(context, 4.0f);
        this.i = kli.a.l(context, 24.0f);
        this.f18233j = new e(this);
    }
}
