package ip0;

import com.revolut.core.ui_kit.gradients.UiKitGradient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class lm implements tm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UiKitGradient f165225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UiKitGradient f165226b;

    public lm(UiKitGradient stroke, UiKitGradient background) {
        Intrinsics.checkNotNullParameter(stroke, "stroke");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f165225a = stroke;
        this.f165226b = background;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lm)) {
            return false;
        }
        lm lmVar = (lm) obj2;
        return Intrinsics.f(this.f165225a, lmVar.f165225a) && Intrinsics.f(this.f165226b, lmVar.f165226b);
    }

    public final int hashCode() {
        return this.f165226b.hashCode() + (this.f165225a.hashCode() * 31);
    }
}
