package aw0;

import com.revolut.core.ui_kit.models.TimeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeClause f10515b;

    public r7(float f, TimeClause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f10514a = f;
        this.f10515b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj2;
        return Float.compare(this.f10514a, r7Var.f10514a) == 0 && this.f10515b.equals(r7Var.f10515b);
    }

    public final int hashCode() {
        return this.f10515b.hashCode() + (Float.hashCode(this.f10514a) * 31);
    }
}
