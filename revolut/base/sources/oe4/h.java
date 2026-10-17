package oe4;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputDisclosureDelegate.Model f224525a;

    public h(InputDisclosureDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f224525a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f224525a, ((h) obj2).f224525a);
    }

    public final int hashCode() {
        return this.f224525a.hashCode();
    }
}
