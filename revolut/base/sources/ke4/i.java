package ke4;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectableDelegate.Model f182991a;

    public i(SelectableDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f182991a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f182991a, ((i) obj2).f182991a);
    }

    public final int hashCode() {
        return this.f182991a.hashCode();
    }
}
