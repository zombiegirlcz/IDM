package vb4;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectableDelegate.Model f287408a;

    public j(SelectableDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f287408a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f287408a, ((j) obj2).f287408a);
    }

    public final int hashCode() {
        return this.f287408a.hashCode();
    }
}
