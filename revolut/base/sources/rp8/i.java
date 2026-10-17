package rp8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputTextDelegate.TextData f256278a;

    public i(InputTextDelegate.TextData model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f256278a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f256278a, ((i) obj2).f256278a);
    }

    public final int hashCode() {
        return this.f256278a.hashCode();
    }
}
