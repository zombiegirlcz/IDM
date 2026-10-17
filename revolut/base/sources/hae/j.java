package hae;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f150494a;

    public j(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f150494a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f150494a, ((j) obj2).f150494a);
    }

    public final int hashCode() {
        return this.f150494a.hashCode();
    }
}
