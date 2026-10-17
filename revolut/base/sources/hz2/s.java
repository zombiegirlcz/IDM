package hz2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f157004a;

    public s(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f157004a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f157004a, ((s) obj2).f157004a);
    }

    public final int hashCode() {
        return this.f157004a.hashCode();
    }
}
