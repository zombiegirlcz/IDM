package n09;

import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallCardDelegate.Model f210968a;

    public t(SmallCardDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f210968a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f210968a, ((t) obj2).f210968a);
    }

    public final int hashCode() {
        return this.f210968a.hashCode();
    }
}
