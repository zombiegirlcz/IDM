package ise;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f168198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168199b;

    public h0(Clause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f168198a = text;
        this.f168199b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f168198a, h0Var.f168198a) && this.f168199b == h0Var.f168199b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168199b) + (this.f168198a.hashCode() * 31);
    }
}
