package wz0;

import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t implements gz0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageTransformations f301338a;

    public t(ImageTransformations transformations) {
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        this.f301338a = transformations;
    }

    @Override // gz0.c
    /* JADX INFO: renamed from: b */
    public final ImageTransformations getD() {
        return this.f301338a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f301338a, ((t) obj2).f301338a);
    }

    public final int hashCode() {
        return this.f301338a.hashCode();
    }
}
