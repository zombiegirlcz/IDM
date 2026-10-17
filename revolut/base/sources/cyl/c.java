package cyl;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.StaticLayout;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f110120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f110121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f110122c;
    public final float d;
    public final float e;
    public final StaticLayout f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f110123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextPaint f110124h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f110125j;

    public c(Rect bubblePositionRect, Path backgroundPath, Paint backgroundPathPaint, float f, float f4, StaticLayout messageTextStaticLayout, String timestampText, TextPaint timestampPaint, float f5, float f6) {
        Intrinsics.checkNotNullParameter(bubblePositionRect, "bubblePositionRect");
        Intrinsics.checkNotNullParameter(backgroundPath, "backgroundPath");
        Intrinsics.checkNotNullParameter(backgroundPathPaint, "backgroundPathPaint");
        Intrinsics.checkNotNullParameter(messageTextStaticLayout, "messageTextStaticLayout");
        Intrinsics.checkNotNullParameter(timestampText, "timestampText");
        Intrinsics.checkNotNullParameter(timestampPaint, "timestampPaint");
        this.f110120a = bubblePositionRect;
        this.f110121b = backgroundPath;
        this.f110122c = backgroundPathPaint;
        this.d = f;
        this.e = f4;
        this.f = messageTextStaticLayout;
        this.f110123g = timestampText;
        this.f110124h = timestampPaint;
        this.i = f5;
        this.f110125j = f6;
    }
}
