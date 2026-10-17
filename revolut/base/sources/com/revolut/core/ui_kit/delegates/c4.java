package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ComparisonCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c4 extends ComparisonCellDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ip0.hb f53743b;

    public c4(Clause text, ip0.hb gravity, int i) {
        gravity = (i & 4) != 0 ? ip0.hb.CENTER_HORIZONTAL : gravity;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        this.f53742a = text;
        this.f53743b = gravity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj2;
        return Intrinsics.f(this.f53742a, c4Var.f53742a) && this.f53743b == c4Var.f53743b;
    }

    public final int hashCode() {
        return this.f53743b.hashCode() + (this.f53742a.hashCode() * 961);
    }
}
