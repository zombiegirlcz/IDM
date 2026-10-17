package tp8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputTextDelegate.Model f273315a;

    public f(InputTextDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f273315a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f273315a, ((f) obj2).f273315a);
    }

    public final int hashCode() {
        return this.f273315a.hashCode();
    }
}
