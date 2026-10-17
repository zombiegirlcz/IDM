package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10543b;

    public t6(float f, Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f10542a = f;
        this.f10543b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj2;
        return Float.compare(this.f10542a, t6Var.f10542a) == 0 && this.f10543b.equals(t6Var.f10543b);
    }

    public final int hashCode() {
        return this.f10543b.hashCode() + (Float.hashCode(this.f10542a) * 31);
    }
}
