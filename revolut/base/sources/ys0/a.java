package ys0;

import android.graphics.Paint;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f316372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f316373b;

    public a(Paint linePaint, TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(linePaint, "linePaint");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.f316372a = linePaint;
        this.f316373b = textPaint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f316372a, aVar.f316372a) && Intrinsics.f(this.f316373b, aVar.f316373b);
    }

    public final int hashCode() {
        return this.f316373b.hashCode() + (this.f316372a.hashCode() * 31);
    }
}
