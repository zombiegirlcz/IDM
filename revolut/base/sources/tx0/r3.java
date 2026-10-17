package tx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class r3 implements s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy0.l f275236a;

    public r3(yy0.l imageUiElement) {
        Intrinsics.checkNotNullParameter(imageUiElement, "imageUiElement");
        this.f275236a = imageUiElement;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r3) && Intrinsics.f(this.f275236a, ((r3) obj2).f275236a);
    }

    public final int hashCode() {
        return this.f275236a.hashCode();
    }
}
