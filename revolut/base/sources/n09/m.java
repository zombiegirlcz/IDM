package n09;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigTileDelegate.Model f210956a;

    public m(BigTileDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f210956a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f210956a, ((m) obj2).f210956a);
    }

    public final int hashCode() {
        return this.f210956a.hashCode();
    }
}
