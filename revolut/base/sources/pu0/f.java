package pu0;

import android.text.TextPaint;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr0.e f239795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f239796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rzl.c f239797c;
    public final TextPaint d;

    public f(nr0.e textCache, int i) {
        rzl.c position = new rzl.c(0);
        Intrinsics.checkNotNullParameter(textCache, "textCache");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f239795a = textCache;
        this.f239796b = i;
        this.f239797c = position;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i);
        this.d = textPaint;
        textCache.f(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textPaint);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f239795a, fVar.f239795a) && this.f239796b == fVar.f239796b && this.f239797c.equals(fVar.f239797c);
    }

    public final int hashCode() {
        return (this.f239797c.hashCode() + j6.a.b(this.f239796b, this.f239795a.hashCode() * 31, 31)) * 31;
    }
}
