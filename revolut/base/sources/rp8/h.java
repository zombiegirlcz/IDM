package rp8;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectableDelegate.Model f256277a;

    public h(SelectableDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f256277a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f256277a, ((h) obj2).f256277a);
    }

    public final int hashCode() {
        return this.f256277a.hashCode();
    }
}
