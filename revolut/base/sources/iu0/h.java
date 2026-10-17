package iu0;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f168440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f168441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Paint f168442c;
    public final com.revolut.core.ui_kit.internal.views.pincode.a d;

    public h(float f, float f4, Paint lastDotPaint, com.revolut.core.ui_kit.internal.views.pincode.a operation) {
        Intrinsics.checkNotNullParameter(lastDotPaint, "lastDotPaint");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f168440a = f;
        this.f168441b = f4;
        this.f168442c = lastDotPaint;
        this.d = operation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Float.compare(this.f168440a, hVar.f168440a) == 0 && Float.compare(this.f168441b, hVar.f168441b) == 0 && Intrinsics.f(this.f168442c, hVar.f168442c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f168442c.hashCode() + m72.b.b(this.f168441b, Float.hashCode(this.f168440a) * 31, 31)) * 31);
    }
}
