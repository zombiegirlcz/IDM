package dr0;

import com.revolut.core.ui_kit.gradients.UiKitGradient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiKitGradient f117046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f117047b;

    public c(UiKitGradient gradient, float f) {
        Intrinsics.checkNotNullParameter(gradient, "gradient");
        this.f117046a = gradient;
        this.f117047b = f;
    }

    @Override // dr0.e
    public final float a() {
        return 2.0f;
    }

    @Override // dr0.e
    public final float b() {
        return this.f117047b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f117046a, cVar.f117046a) && Float.compare(this.f117047b, cVar.f117047b) == 0 && Float.compare(2.0f, 2.0f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(2.0f) + m72.b.b(this.f117047b, this.f117046a.hashCode() * 31, 31);
    }
}
