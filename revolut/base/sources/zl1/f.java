package zl1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RowDelegate.Model f323162a;

    public f(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f323162a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f323162a, ((f) obj2).f323162a);
    }

    public final int hashCode() {
        return this.f323162a.hashCode();
    }
}
