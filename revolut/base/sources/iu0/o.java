package iu0;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Paint f168453b;

    public o(Paint blinkingDotPaint) {
        Intrinsics.checkNotNullParameter(blinkingDotPaint, "blinkingDotPaint");
        this.f168452a = 0;
        this.f168453b = blinkingDotPaint;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f168452a == oVar.f168452a && Intrinsics.f(this.f168453b, oVar.f168453b);
    }

    public final int hashCode() {
        return this.f168453b.hashCode() + (Integer.hashCode(this.f168452a) * 31);
    }
}
