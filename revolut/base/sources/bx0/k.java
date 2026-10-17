package bx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f19424a;

    public k(Clause text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f19424a = text;
    }

    public final Clause a() {
        return this.f19424a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f19424a, ((k) obj2).f19424a);
    }

    public final int hashCode() {
        return this.f19424a.hashCode();
    }
}
