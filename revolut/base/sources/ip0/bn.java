package ip0;

import com.revolut.core.ui_kit.gradients.UiKitGradient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bn implements dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiKitGradient f163631a;

    public bn(UiKitGradient gradient) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.f163631a = gradient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bn) && Intrinsics.f(this.f163631a, ((bn) obj2).f163631a);
    }

    public final int hashCode() {
        return this.f163631a.hashCode();
    }
}
