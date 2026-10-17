package ix0;

import android.text.TextPaint;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f169205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextPaint f169206c;
    public final ArrayList d;
    public final int e;

    public a(int i, int i2, TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.f169204a = i;
        this.f169205b = i2;
        this.f169206c = textPaint;
        this.d = new ArrayList();
        this.e = 255;
    }
}
