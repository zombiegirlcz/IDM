package iu0;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Paint f168449a;

    public m(Paint dotPaint) {
        Intrinsics.checkNotNullParameter(dotPaint, "dotPaint");
        this.f168449a = dotPaint;
    }

    public final Paint a() {
        return this.f168449a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f168449a, ((m) obj2).f168449a);
    }

    public final int hashCode() {
        return this.f168449a.hashCode();
    }
}
