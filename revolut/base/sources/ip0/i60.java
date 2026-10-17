package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f164644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms0.h4 f164645b;

    public i60(Clause text, ms0.h4 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f164644a = text;
        this.f164645b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i60)) {
            return false;
        }
        i60 i60Var = (i60) obj2;
        return this.f164644a.equals(i60Var.f164644a) && this.f164645b == i60Var.f164645b;
    }

    public final int hashCode() {
        return this.f164645b.hashCode() + (this.f164644a.hashCode() * 31);
    }
}
