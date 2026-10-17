package nr0;

import android.graphics.Paint;
import android.text.StaticLayout;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f218508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StaticLayout f218509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f218510c;

    public d(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        this.f218508a = paint;
        this.f218509b = null;
        this.f218510c = 0;
    }
}
